package com.zxy.sample.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HttpAspect {

    public final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);


    public void log(){

    }
}