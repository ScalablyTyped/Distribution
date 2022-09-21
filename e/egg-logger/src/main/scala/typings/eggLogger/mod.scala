package typings.eggLogger

import org.scalablytyped.runtime.StringDictionary
import typings.eggLogger.anon.CustomLogger
import typings.eggLogger.anon.Excludes
import typings.eggLogger.eggLoggerStrings.duplicate
import typings.eggLogger.eggLoggerStrings.ignore
import typings.eggLogger.eggLoggerStrings.redirect
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("egg-logger", "ConsoleTransport")
  @js.native
  open class ConsoleTransport () extends Transport[ConsoleTransportOptions] {
    def this(options: ConsoleTransportOptions) = this()
  }
  
  @JSImport("egg-logger", "EggConsoleLogger")
  @js.native
  open class EggConsoleLogger protected () extends Logger[LoggerOptions] {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("egg-logger", "EggContextLogger")
  @js.native
  open class EggContextLogger protected () extends StObject {
    def this(ctx: Any, logger: Logger[LoggerOptions]) = this()
    
    def debug(msg: Any, args: Any*): Unit = js.native
    
    def error(msg: Any, args: Any*): Unit = js.native
    
    def info(msg: Any, args: Any*): Unit = js.native
    
    val paddingMessage: String = js.native
    
    def warn(msg: Any, args: Any*): Unit = js.native
    
    def write(msg: String): Unit = js.native
  }
  
  @JSImport("egg-logger", "EggCustomLogger")
  @js.native
  open class EggCustomLogger protected () extends Logger[LoggerOptions] {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("egg-logger", "EggErrorLogger")
  @js.native
  open class EggErrorLogger protected () extends Logger[LoggerOptions] {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("egg-logger", "EggLogger")
  @js.native
  open class EggLogger protected () extends Logger[EggLoggerOptions] {
    def this(options: EggLoggerOptions) = this()
    
    var consoleLevel: LoggerLevel = js.native
    
    var level: LoggerLevel = js.native
  }
  
  @JSImport("egg-logger", "EggLoggers")
  @js.native
  open class EggLoggers protected ()
    extends StObject
       with Map[String, Logger[LoggerOptions]]
       with /* key */ StringDictionary[Any] {
    def this(options: CustomLogger) = this()
    
    /**
      * Disable console logger
      */
    def disableConsole(): Unit = js.native
    
    /**
      * reload all logger
      */
    def reload(): Unit = js.native
  }
  
  @JSImport("egg-logger", "FileBufferTransport")
  @js.native
  open class FileBufferTransport () extends Transport[FileBufferTransportOptions] {
    def this(options: FileBufferTransportOptions) = this()
    
    def flush(): Unit = js.native
  }
  
  @JSImport("egg-logger", "FileTransport")
  @js.native
  open class FileTransport () extends Transport[FileTransportOptions] {
    def this(options: FileTransportOptions) = this()
  }
  
  @JSImport("egg-logger", "Logger")
  @js.native
  open class Logger[T /* <: LoggerOptions */] protected ()
    extends StObject
       with Map[String, Transport[TransportOptions]] {
    def this(options: T) = this()
    
    /**
      * End all transports
      */
    def close(): Unit = js.native
    
    def debug(msg: Any, args: Any*): Unit = js.native
    
    /**
      * disable a transport
      * @param {String} name - transport name
      */
    def disable(name: String): Unit = js.native
    
    /**
      * Duplicate specify level log to the other logger
      * @param {String} level - log level
      * @param {Logger} logger - target logger instance
      * @param {Object} [options] - { excludes: [] }
      */
    def duplicate(level: LoggerLevel, logger: Logger[LoggerOptions]): Unit = js.native
    def duplicate(level: LoggerLevel, logger: Logger[LoggerOptions], options: Excludes): Unit = js.native
    
    /**
      * enable a transport
      * @param {String} name - transport name
      */
    def enable(name: String): Unit = js.native
    
    def error(msg: Any, args: Any*): Unit = js.native
    
    def info(msg: Any, args: Any*): Unit = js.native
    
    /**
      * Send log to all transports.
      * It's proxy to {@link Transport}'s log method.'
      * @param {String} level - log level
      * @param {Array} args - log arguments
      * @param {Object} meta - log meta
      */
    def log(level: LoggerLevel, args: js.Array[Any], meta: js.Object): Unit = js.native
    
    /**
      * Redirect specify level log to the other logger
      * @param {String} level - log level
      * @param {Logger} logger - target logger instance
      */
    def redirect(level: LoggerLevel, logger: Logger[LoggerOptions]): Unit = js.native
    
    /**
      * Reload all transports
      */
    def reload(): Unit = js.native
    
    /**
      * Un-duplicate specify level log
      * @param {String} level - log level
      */
    def unduplicate(level: LoggerLevel): Unit = js.native
    
    /**
      * Un-redirect specify level log
      * @param {String} level - log level
      */
    def unredirect(level: LoggerLevel): Unit = js.native
    
    def warn(msg: Any, args: Any*): Unit = js.native
    
    /**
      * write raw log to all transports
      * @param {String} msg - log message
      */
    def write(msg: String): Unit = js.native
  }
  
  @JSImport("egg-logger", "Transport")
  @js.native
  open class Transport[T /* <: TransportOptions */] () extends StObject {
    def this(options: T) = this()
    
    def close(): Unit = js.native
    
    def enable(): Unit = js.native
    
    val enabled: Boolean = js.native
    
    def end(): Unit = js.native
    
    var level: LoggerLevel = js.native
    
    def log(level: LoggerLevel, args: js.Array[Any], meta: js.Object): Unit = js.native
    
    def reload(): Unit = js.native
    
    def shouldLog(level: LoggerLevel): Boolean = js.native
  }
  
  @JSImport("egg-logger", "levels")
  @js.native
  val levels: ILoggerLevel = js.native
  
  trait ConsoleTransportOptions
    extends StObject
       with TransportOptions {
    
    var stderrLevel: js.UndefOr[String] = js.undefined
  }
  object ConsoleTransportOptions {
    
    inline def apply(): ConsoleTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleTransportOptions]
    }
    
    extension [Self <: ConsoleTransportOptions](x: Self) {
      
      inline def setStderrLevel(value: String): Self = StObject.set(x, "stderrLevel", value.asInstanceOf[js.Any])
      
      inline def setStderrLevelUndefined: Self = StObject.set(x, "stderrLevel", js.undefined)
    }
  }
  
  type EggCustomLoggerOptions = // custom logger name
  StringDictionary[EggLoggerOptions]
  
  trait EggLoggerOptions
    extends StObject
       with LoggerOptions {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
    
    var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var file: String
    
    var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
    
    var jsonFile: js.UndefOr[String] = js.undefined
    
    var outputJSON: js.UndefOr[Boolean] = js.undefined
  }
  object EggLoggerOptions {
    
    inline def apply(file: String): EggLoggerOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggLoggerOptions]
    }
    
    extension [Self <: EggLoggerOptions](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
      
      inline def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
      
      inline def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
      
      inline def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
      
      inline def setJsonFileUndefined: Self = StObject.set(x, "jsonFile", js.undefined)
      
      inline def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
      
      inline def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
    }
  }
  
  trait EggLoggersOptions extends StObject {
    
    var agentLogName: String
    
    var appLogName: String
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    // whether write error logger to common-error.log, `duplicate` / `redirect` / `ignore`, default to `duplicate`
    var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
    
    var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
    
    var coreLogName: String
    
    var dir: String
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var errorLogName: String
    
    var level: js.UndefOr[LoggerLevel] = js.undefined
    
    var outputJSON: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object EggLoggersOptions {
    
    inline def apply(
      agentLogName: String,
      appLogName: String,
      coreLogName: String,
      dir: String,
      errorLogName: String,
      `type`: String
    ): EggLoggersOptions = {
      val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggLoggersOptions]
    }
    
    extension [Self <: EggLoggersOptions](x: Self) {
      
      inline def setAgentLogName(value: String): Self = StObject.set(x, "agentLogName", value.asInstanceOf[js.Any])
      
      inline def setAppLogName(value: String): Self = StObject.set(x, "appLogName", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
      
      inline def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
      
      inline def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
      
      inline def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
      
      inline def setCoreLogName(value: String): Self = StObject.set(x, "coreLogName", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setErrorLogName(value: String): Self = StObject.set(x, "errorLogName", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
      
      inline def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileBufferTransportOptions
    extends StObject
       with FileTransportOptions {
    
    var flushInterval: js.UndefOr[Double] = js.undefined
    
    var maxBufferLength: js.UndefOr[Double] = js.undefined
  }
  object FileBufferTransportOptions {
    
    inline def apply(file: String): FileBufferTransportOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileBufferTransportOptions]
    }
    
    extension [Self <: FileBufferTransportOptions](x: Self) {
      
      inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      inline def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
    }
  }
  
  trait FileTransportOptions
    extends StObject
       with TransportOptions {
    
    var file: String
  }
  object FileTransportOptions {
    
    inline def apply(file: String): FileTransportOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTransportOptions]
    }
    
    extension [Self <: FileTransportOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILoggerLevel extends StObject {
    
    var ALL: Double
    
    var DEBUG: Double
    
    var ERROR: Double
    
    var INFO: Double
    
    var NONE: Double
    
    var WARN: Double
  }
  object ILoggerLevel {
    
    inline def apply(ALL: Double, DEBUG: Double, ERROR: Double, INFO: Double, NONE: Double, WARN: Double): ILoggerLevel = {
      val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoggerLevel]
    }
    
    extension [Self <: ILoggerLevel](x: Self) {
      
      inline def setALL(value: Double): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.eggLogger.eggLoggerStrings.ALL
    - typings.eggLogger.eggLoggerStrings.DEBUG
    - typings.eggLogger.eggLoggerStrings.INFO
    - typings.eggLogger.eggLoggerStrings.WARN
    - typings.eggLogger.eggLoggerStrings.ERROR
    - typings.eggLogger.eggLoggerStrings.NONE
  */
  trait LoggerLevel extends StObject
  
  trait LoggerOptions extends StObject {
    
    var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
    
    var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[LoggerLevel] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
      
      inline def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
      
      inline def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
      
      inline def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  trait TransportOptions extends StObject {
    
    var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[LoggerLevel] = js.undefined
  }
  object TransportOptions {
    
    inline def apply(): TransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportOptions]
    }
    
    extension [Self <: TransportOptions](x: Self) {
      
      inline def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
      
      inline def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
