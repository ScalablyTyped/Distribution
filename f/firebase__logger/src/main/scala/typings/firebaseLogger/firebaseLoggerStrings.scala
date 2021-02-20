package typings.firebaseLogger

import typings.firebaseLogger.loggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseLoggerStrings {
  
  @js.native
  sealed trait debug extends LogLevelString
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error extends LogLevelString
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info extends LogLevelString
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait silent extends LogLevelString
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait verbose extends LogLevelString
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn extends LogLevelString
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
