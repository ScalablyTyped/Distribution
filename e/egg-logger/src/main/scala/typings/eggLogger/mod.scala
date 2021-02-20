package typings.eggLogger

import org.scalablytyped.runtime.StringDictionary
import typings.eggLogger.anon.Excludes
import typings.eggLogger.eggLoggerStrings.duplicate
import typings.eggLogger.eggLoggerStrings.ignore
import typings.eggLogger.eggLoggerStrings.redirect
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("egg-logger", "ConsoleTransport")
  @js.native
  class ConsoleTransport () extends Transport[ConsoleTransportOptions] {
    def this(options: ConsoleTransportOptions) = this()
  }
  
  @JSImport("egg-logger", "EggConsoleLogger")
  @js.native
  class EggConsoleLogger protected () extends Logger[LoggerOptions] {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("egg-logger", "EggContextLogger")
  @js.native
  class EggContextLogger protected () extends StObject {
    def this(ctx: js.Any, logger: Logger[LoggerOptions]) = this()
    
    def debug(msg: js.Any, args: js.Any*): Unit = js.native
    
    def error(msg: js.Any, args: js.Any*): Unit = js.native
    
    def info(msg: js.Any, args: js.Any*): Unit = js.native
    
    val paddingMessage: String = js.native
    
    def warn(msg: js.Any, args: js.Any*): Unit = js.native
    
    def write(msg: String): Unit = js.native
  }
  
  @JSImport("egg-logger", "EggCustomLogger")
  @js.native
  class EggCustomLogger protected () extends Logger[LoggerOptions] {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("egg-logger", "EggErrorLogger")
  @js.native
  class EggErrorLogger protected () extends Logger[LoggerOptions] {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("egg-logger", "EggLogger")
  @js.native
  class EggLogger protected () extends Logger[EggLoggerOptions] {
    def this(options: EggLoggerOptions) = this()
    
    var consoleLevel: LoggerLevel = js.native
    
    var level: LoggerLevel = js.native
  }
  
  @JSImport("egg-logger", "EggLoggers")
  @js.native
  class EggLoggers protected ()
    extends Map[String, Logger[LoggerOptions]]
       with /* key */ StringDictionary[js.Any] {
    def this(options: EggLoggersOptions) = this()
    
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
  class FileBufferTransport () extends Transport[FileBufferTransportOptions] {
    def this(options: FileBufferTransportOptions) = this()
    
    def flush(): Unit = js.native
  }
  
  @JSImport("egg-logger", "FileTransport")
  @js.native
  class FileTransport () extends Transport[FileTransportOptions] {
    def this(options: FileTransportOptions) = this()
  }
  
  @JSImport("egg-logger", "Logger")
  @js.native
  class Logger[T /* <: LoggerOptions */] protected () extends Map[String, Transport[TransportOptions]] {
    def this(options: T) = this()
    
    /**
      * End all transports
      */
    def close(): Unit = js.native
    
    def debug(msg: js.Any, args: js.Any*): Unit = js.native
    
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
    
    def error(msg: js.Any, args: js.Any*): Unit = js.native
    
    def info(msg: js.Any, args: js.Any*): Unit = js.native
    
    /**
      * Send log to all transports.
      * It's proxy to {@link Transport}'s log method.'
      * @param {String} level - log level
      * @param {Array} args - log arguments
      * @param {Object} meta - log meta
      */
    def log(level: LoggerLevel, args: js.Array[_], meta: js.Object): Unit = js.native
    
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
    
    def warn(msg: js.Any, args: js.Any*): Unit = js.native
    
    /**
      * write raw log to all transports
      * @param {String} msg - log message
      */
    def write(msg: String): Unit = js.native
  }
  
  @JSImport("egg-logger", "Transport")
  @js.native
  class Transport[T /* <: TransportOptions */] () extends StObject {
    def this(options: T) = this()
    
    def close(): Unit = js.native
    
    def enable(): Unit = js.native
    
    val enabled: Boolean = js.native
    
    def end(): Unit = js.native
    
    var level: LoggerLevel = js.native
    
    def log(level: LoggerLevel, args: js.Array[_], meta: js.Object): Unit = js.native
    
    def reload(): Unit = js.native
    
    def shouldLog(level: LoggerLevel): Boolean = js.native
  }
  
  @JSImport("egg-logger", "levels")
  @js.native
  val levels: ILoggerLevel = js.native
  
  @js.native
  trait ConsoleTransportOptions extends TransportOptions {
    
    var stderrLevel: js.UndefOr[String] = js.native
  }
  object ConsoleTransportOptions {
    
    @scala.inline
    def apply(): ConsoleTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleTransportOptions]
    }
    
    @scala.inline
    implicit class ConsoleTransportOptionsMutableBuilder[Self <: ConsoleTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderrLevel(value: String): Self = StObject.set(x, "stderrLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrLevelUndefined: Self = StObject.set(x, "stderrLevel", js.undefined)
    }
  }
  
  @js.native
  trait EggLoggerOptions extends LoggerOptions {
    
    var buffer: js.UndefOr[Boolean] = js.native
    
    var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
    
    var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var file: String = js.native
    
    var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
    
    var jsonFile: js.UndefOr[String] = js.native
    
    var outputJSON: js.UndefOr[Boolean] = js.native
  }
  object EggLoggerOptions {
    
    @scala.inline
    def apply(file: String): EggLoggerOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggLoggerOptions]
    }
    
    @scala.inline
    implicit class EggLoggerOptionsMutableBuilder[Self <: EggLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
      
      @scala.inline
      def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonFileUndefined: Self = StObject.set(x, "jsonFile", js.undefined)
      
      @scala.inline
      def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
    }
  }
  
  @js.native
  trait EggLoggersOptions extends StObject {
    
    var agentLogName: String = js.native
    
    var appLogName: String = js.native
    
    var buffer: js.UndefOr[Boolean] = js.native
    
    // whether write error logger to common-error.log, `duplicate` / `redirect` / `ignore`, default to `duplicate`
    var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
    
    var consoleLevel: js.UndefOr[LoggerLevel] = js.native
    
    var coreLogName: String = js.native
    
    var dir: String = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[String] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var errorLogName: String = js.native
    
    var level: js.UndefOr[LoggerLevel] = js.native
    
    var outputJSON: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
  }
  object EggLoggersOptions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EggLoggersOptionsMutableBuilder[Self <: EggLoggersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentLogName(value: String): Self = StObject.set(x, "agentLogName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppLogName(value: String): Self = StObject.set(x, "appLogName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
      
      @scala.inline
      def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
      
      @scala.inline
      def setCoreLogName(value: String): Self = StObject.set(x, "coreLogName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setErrorLogName(value: String): Self = StObject.set(x, "errorLogName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileBufferTransportOptions extends FileTransportOptions {
    
    var flushInterval: js.UndefOr[Double] = js.native
    
    var maxBufferLength: js.UndefOr[Double] = js.native
  }
  object FileBufferTransportOptions {
    
    @scala.inline
    def apply(file: String): FileBufferTransportOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileBufferTransportOptions]
    }
    
    @scala.inline
    implicit class FileBufferTransportOptionsMutableBuilder[Self <: FileBufferTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      @scala.inline
      def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
    }
  }
  
  @js.native
  trait FileTransportOptions extends TransportOptions {
    
    var file: String = js.native
  }
  object FileTransportOptions {
    
    @scala.inline
    def apply(file: String): FileTransportOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTransportOptions]
    }
    
    @scala.inline
    implicit class FileTransportOptionsMutableBuilder[Self <: FileTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILoggerLevel extends StObject {
    
    var ALL: Double = js.native
    
    var DEBUG: Double = js.native
    
    var ERROR: Double = js.native
    
    var INFO: Double = js.native
    
    var NONE: Double = js.native
    
    var WARN: Double = js.native
  }
  object ILoggerLevel {
    
    @scala.inline
    def apply(ALL: Double, DEBUG: Double, ERROR: Double, INFO: Double, NONE: Double, WARN: Double): ILoggerLevel = {
      val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoggerLevel]
    }
    
    @scala.inline
    implicit class ILoggerLevelMutableBuilder[Self <: ILoggerLevel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setALL(value: Double): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait LoggerOptions extends StObject {
    
    var allowDebugAtProd: js.UndefOr[Boolean] = js.native
    
    var consoleLevel: js.UndefOr[LoggerLevel] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var level: js.UndefOr[LoggerLevel] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
      
      @scala.inline
      def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  @js.native
  trait TransportOptions extends StObject {
    
    var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[LoggerLevel] = js.native
  }
  object TransportOptions {
    
    @scala.inline
    def apply(): TransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit class TransportOptionsMutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
