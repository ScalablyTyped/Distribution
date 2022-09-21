package typings.firebaseLogger

import typings.firebaseLogger.loggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseLoggerStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevelString
       with typings.firebaseLogger.srcLoggerMod.LogLevelString
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevelString
       with typings.firebaseLogger.srcLoggerMod.LogLevelString
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevelString
       with typings.firebaseLogger.srcLoggerMod.LogLevelString
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevelString
       with typings.firebaseLogger.srcLoggerMod.LogLevelString
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevelString
       with typings.firebaseLogger.srcLoggerMod.LogLevelString
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevelString
       with typings.firebaseLogger.srcLoggerMod.LogLevelString
  inline def warn: warn = "warn".asInstanceOf[warn]
}
