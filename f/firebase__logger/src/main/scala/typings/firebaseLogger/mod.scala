package typings.firebaseLogger

import typings.firebaseLogger.loggerMod.LogCallback
import typings.firebaseLogger.loggerMod.LogLevel
import typings.firebaseLogger.loggerMod.LogLevelString
import typings.firebaseLogger.loggerMod.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Logger protected ()
    extends typings.firebaseLogger.loggerMod.Logger {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
  }
  
  def setLogLevel(level: LogLevel): Unit = js.native
  def setLogLevel(level: LogLevelString): Unit = js.native
  def setUserLogHandler(): Unit = js.native
  def setUserLogHandler(logCallback: Null, options: LogOptions): Unit = js.native
  def setUserLogHandler(logCallback: LogCallback): Unit = js.native
  def setUserLogHandler(logCallback: LogCallback, options: LogOptions): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 0 */ val DEBUG: typings.firebaseLogger.loggerMod.LogLevel.DEBUG with Double = js.native
    /* 4 */ val ERROR: typings.firebaseLogger.loggerMod.LogLevel.ERROR with Double = js.native
    /* 2 */ val INFO: typings.firebaseLogger.loggerMod.LogLevel.INFO with Double = js.native
    /* 5 */ val SILENT: typings.firebaseLogger.loggerMod.LogLevel.SILENT with Double = js.native
    /* 1 */ val VERBOSE: typings.firebaseLogger.loggerMod.LogLevel.VERBOSE with Double = js.native
    /* 3 */ val WARN: typings.firebaseLogger.loggerMod.LogLevel.WARN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.firebaseLogger.loggerMod.LogLevel with Double] = js.native
  }
  
}

