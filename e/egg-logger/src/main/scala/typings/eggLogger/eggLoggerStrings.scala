package typings.eggLogger

import typings.eggLogger.mod.LoggerLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eggLoggerStrings {
  
  @js.native
  sealed trait ALL
    extends StObject
       with LoggerLevel
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LoggerLevel
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LoggerLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO
    extends StObject
       with LoggerLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait NONE
    extends StObject
       with LoggerLevel
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait WARN
    extends StObject
       with LoggerLevel
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait duplicate extends StObject
  inline def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait redirect extends StObject
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
}
