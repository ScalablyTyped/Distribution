package typings.firebaseLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLoggerMod {
  
  @JSImport("@firebase/logger/dist/src/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@firebase/logger/dist/src/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogLevel
    /* 0 */ val DEBUG: typings.firebaseLogger.distSrcLoggerMod.LogLevel.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 4 */ val ERROR: typings.firebaseLogger.distSrcLoggerMod.LogLevel.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 2 */ val INFO: typings.firebaseLogger.distSrcLoggerMod.LogLevel.INFO & Double = js.native
    
    @js.native
    sealed trait SILENT
      extends StObject
         with LogLevel
    /* 5 */ val SILENT: typings.firebaseLogger.distSrcLoggerMod.LogLevel.SILENT & Double = js.native
    
    @js.native
    sealed trait VERBOSE
      extends StObject
         with LogLevel
    /* 1 */ val VERBOSE: typings.firebaseLogger.distSrcLoggerMod.LogLevel.VERBOSE & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 3 */ val WARN: typings.firebaseLogger.distSrcLoggerMod.LogLevel.WARN & Double = js.native
  }
  
  @JSImport("@firebase/logger/dist/src/logger", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
    
    /**
      * The main (internal) log handler for the Logger instance.
      * Can be set to a new function in internal package code but not by user.
      */
    /* private */ var _logHandler: Any = js.native
    
    /**
      * The log level of the given Logger instance.
      */
    /* private */ var _logLevel: Any = js.native
    
    /**
      * The optional, additional, user-defined log handler for the Logger instance.
      */
    /* private */ var _userLogHandler: Any = js.native
    
    /**
      * The functions below are all based on the `console` interface
      */
    def debug(args: Any*): Unit = js.native
    
    def error(args: Any*): Unit = js.native
    
    def info(args: Any*): Unit = js.native
    
    def log(args: Any*): Unit = js.native
    
    def logHandler: LogHandler = js.native
    def logHandler_=(`val`: LogHandler): Unit = js.native
    
    def logLevel: LogLevel = js.native
    def logLevel_=(`val`: LogLevel): Unit = js.native
    
    var name: String = js.native
    
    def setLogLevel(`val`: LogLevel): Unit = js.native
    def setLogLevel(`val`: LogLevelString): Unit = js.native
    
    def userLogHandler: LogHandler | Null = js.native
    def userLogHandler_=(`val`: LogHandler | Null): Unit = js.native
    
    def warn(args: Any*): Unit = js.native
  }
  
  @JSImport("@firebase/logger/dist/src/logger", "instances")
  @js.native
  val instances: js.Array[Logger] = js.native
  
  inline def setLogLevel(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setLogLevel(level: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserLogHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")().asInstanceOf[Unit]
  inline def setUserLogHandler(logCallback: Null, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserLogHandler(logCallback: LogCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUserLogHandler(logCallback: LogCallback, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type LogCallback = js.Function1[/* callbackParams */ LogCallbackParams, Unit]
  
  trait LogCallbackParams extends StObject {
    
    var args: js.Array[Any]
    
    var level: LogLevelString
    
    var message: String
    
    var `type`: String
  }
  object LogCallbackParams {
    
    inline def apply(args: js.Array[Any], level: LogLevelString, message: String, `type`: String): LogCallbackParams = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogCallbackParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogCallbackParams] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setLevel(value: LogLevelString): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogHandler extends StObject {
    
    def apply(loggerInstance: Logger, logType: LogLevel, args: Any*): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseLogger.firebaseLoggerStrings.debug
    - typings.firebaseLogger.firebaseLoggerStrings.verbose
    - typings.firebaseLogger.firebaseLoggerStrings.info
    - typings.firebaseLogger.firebaseLoggerStrings.warn
    - typings.firebaseLogger.firebaseLoggerStrings.error
    - typings.firebaseLogger.firebaseLoggerStrings.silent
  */
  trait LogLevelString extends StObject
  object LogLevelString {
    
    inline def debug: typings.firebaseLogger.firebaseLoggerStrings.debug = "debug".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.debug]
    
    inline def error: typings.firebaseLogger.firebaseLoggerStrings.error = "error".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.error]
    
    inline def info: typings.firebaseLogger.firebaseLoggerStrings.info = "info".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.info]
    
    inline def silent: typings.firebaseLogger.firebaseLoggerStrings.silent = "silent".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.silent]
    
    inline def verbose: typings.firebaseLogger.firebaseLoggerStrings.verbose = "verbose".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.verbose]
    
    inline def warn: typings.firebaseLogger.firebaseLoggerStrings.warn = "warn".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.warn]
  }
  
  trait LogOptions extends StObject {
    
    var level: LogLevelString
  }
  object LogOptions {
    
    inline def apply(level: LogLevelString): LogOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: LogLevelString): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
