package typings.firebaseLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
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
    /* 0 */ val DEBUG: typings.firebaseLogger.loggerMod.LogLevel.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 4 */ val ERROR: typings.firebaseLogger.loggerMod.LogLevel.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 2 */ val INFO: typings.firebaseLogger.loggerMod.LogLevel.INFO & Double = js.native
    
    @js.native
    sealed trait SILENT
      extends StObject
         with LogLevel
    /* 5 */ val SILENT: typings.firebaseLogger.loggerMod.LogLevel.SILENT & Double = js.native
    
    @js.native
    sealed trait VERBOSE
      extends StObject
         with LogLevel
    /* 1 */ val VERBOSE: typings.firebaseLogger.loggerMod.LogLevel.VERBOSE & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 3 */ val WARN: typings.firebaseLogger.loggerMod.LogLevel.WARN & Double = js.native
  }
  
  @JSImport("@firebase/logger/dist/src/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
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
    var _logHandler: js.Any = js.native
    
    /**
      * The log level of the given Logger instance.
      */
    var _logLevel: js.Any = js.native
    
    /**
      * The optional, additional, user-defined log handler for the Logger instance.
      */
    var _userLogHandler: js.Any = js.native
    
    /**
      * The functions below are all based on the `console` interface
      */
    def debug(args: js.Any*): Unit = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def info(args: js.Any*): Unit = js.native
    
    def log(args: js.Any*): Unit = js.native
    
    def logHandler: LogHandler = js.native
    def logHandler_=(`val`: LogHandler): Unit = js.native
    
    def logLevel: LogLevel = js.native
    def logLevel_=(`val`: LogLevel): Unit = js.native
    
    var name: String = js.native
    
    def setLogLevel(`val`: LogLevel): Unit = js.native
    def setLogLevel(`val`: LogLevelString): Unit = js.native
    
    def userLogHandler: LogHandler | Null = js.native
    def userLogHandler_=(`val`: LogHandler | Null): Unit = js.native
    
    def warn(args: js.Any*): Unit = js.native
  }
  
  @JSImport("@firebase/logger/dist/src/logger", "instances")
  @js.native
  val instances: js.Array[Logger] = js.native
  
  @scala.inline
  def setLogLevel(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setLogLevel(level: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setUserLogHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")().asInstanceOf[Unit]
  @scala.inline
  def setUserLogHandler(logCallback: Null, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setUserLogHandler(logCallback: LogCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setUserLogHandler(logCallback: LogCallback, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type LogCallback = js.Function1[/* callbackParams */ LogCallbackParams, Unit]
  
  trait LogCallbackParams extends StObject {
    
    var args: js.Array[js.Any]
    
    var level: LogLevelString
    
    var message: String
    
    var `type`: String
  }
  object LogCallbackParams {
    
    @scala.inline
    def apply(args: js.Array[js.Any], level: LogLevelString, message: String, `type`: String): LogCallbackParams = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogCallbackParams]
    }
    
    @scala.inline
    implicit class LogCallbackParamsMutableBuilder[Self <: LogCallbackParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: LogLevelString): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogHandler extends StObject {
    
    def apply(loggerInstance: Logger, logType: LogLevel, args: js.Any*): Unit = js.native
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
    
    @scala.inline
    def debug: typings.firebaseLogger.firebaseLoggerStrings.debug = "debug".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.debug]
    
    @scala.inline
    def error: typings.firebaseLogger.firebaseLoggerStrings.error = "error".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.error]
    
    @scala.inline
    def info: typings.firebaseLogger.firebaseLoggerStrings.info = "info".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.info]
    
    @scala.inline
    def silent: typings.firebaseLogger.firebaseLoggerStrings.silent = "silent".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.silent]
    
    @scala.inline
    def verbose: typings.firebaseLogger.firebaseLoggerStrings.verbose = "verbose".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.verbose]
    
    @scala.inline
    def warn: typings.firebaseLogger.firebaseLoggerStrings.warn = "warn".asInstanceOf[typings.firebaseLogger.firebaseLoggerStrings.warn]
  }
  
  trait LogOptions extends StObject {
    
    var level: LogLevelString
  }
  object LogOptions {
    
    @scala.inline
    def apply(level: LogLevelString): LogOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogOptions]
    }
    
    @scala.inline
    implicit class LogOptionsMutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevelString): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
