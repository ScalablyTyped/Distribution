package typings.atFirebaseLogger

import org.scalablytyped.runtime.TopLevel
import typings.atFirebaseLogger.distSrcLoggerMod.LogHandler
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.DEBUG
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.ERROR
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.INFO
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.SILENT
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.VERBOSE
import typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.WARN
import typings.atFirebaseLogger.distSrcLoggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger/dist/src/logger", JSImport.Namespace)
@js.native
object distSrcLoggerMod extends js.Object {
  @js.native
  sealed trait LogLevel extends js.Object
  
  @js.native
  class Logger protected () extends js.Object {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
    /**
      * The log handler for the Logger instance.
      */
    var _logHandler: js.Any = js.native
    /**
      * The log level of the given Logger instance.
      */
    var _logLevel: js.Any = js.native
    @JSName("logHandler")
    var logHandler_Original: LogHandler = js.native
    var logLevel: LogLevel = js.native
    var name: String = js.native
    /**
      * The functions below are all based on the `console` interface
      */
    def debug(args: js.Any*): Unit = js.native
    def error(args: js.Any*): Unit = js.native
    def info(args: js.Any*): Unit = js.native
    def log(args: js.Any*): Unit = js.native
    def logHandler(loggerInstance: Logger, logType: LogLevel, args: js.Any*): Unit = js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  val instances: js.Array[Logger] = js.native
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait DEBUG extends LogLevel
    
    @js.native
    sealed trait ERROR extends LogLevel
    
    @js.native
    sealed trait INFO extends LogLevel
    
    @js.native
    sealed trait SILENT extends LogLevel
    
    @js.native
    sealed trait VERBOSE extends LogLevel
    
    @js.native
    sealed trait WARN extends LogLevel
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    /* 0 */ @js.native
    object DEBUG extends TopLevel[DEBUG with Double]
    
    /* 4 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 2 */ @js.native
    object INFO extends TopLevel[INFO with Double]
    
    /* 5 */ @js.native
    object SILENT extends TopLevel[SILENT with Double]
    
    /* 1 */ @js.native
    object VERBOSE extends TopLevel[VERBOSE with Double]
    
    /* 3 */ @js.native
    object WARN extends TopLevel[WARN with Double]
    
  }
  
  type LogHandler = js.Function3[/* loggerInstance */ Logger, /* logType */ LogLevel, /* repeated */ js.Any, Unit]
}

