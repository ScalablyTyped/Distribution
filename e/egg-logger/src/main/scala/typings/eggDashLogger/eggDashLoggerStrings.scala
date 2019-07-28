package typings.eggDashLogger

import typings.eggDashLogger.eggDashLoggerMod.LoggerLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eggDashLoggerStrings {
  @js.native
  sealed trait ALL extends LoggerLevel
  
  @js.native
  sealed trait DEBUG extends LoggerLevel
  
  @js.native
  sealed trait ERROR extends LoggerLevel
  
  @js.native
  sealed trait INFO extends LoggerLevel
  
  @js.native
  sealed trait NONE extends LoggerLevel
  
  @js.native
  sealed trait WARN extends LoggerLevel
  
  @js.native
  sealed trait duplicate extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
  
  @js.native
  sealed trait redirect extends js.Object
  
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
}

