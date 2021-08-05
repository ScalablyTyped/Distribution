package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.fastify.anon.Err
import typings.fastify.fastifyBooleans.`false`
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.requestMod.RequestGenericInterface
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  trait Bindings
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var level: js.UndefOr[LogLevel | String] = js.undefined
    
    var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
  }
  object Bindings {
    
    inline def apply(): Bindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bindings]
    }
    
    extension [Self <: Bindings](x: Self) {
      
      inline def setLevel(value: LogLevel | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSerializers(value: StringDictionary[SerializerFn]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  @js.native
  trait FastifyLogFn extends StObject {
    
    def apply(msg: String, args: js.Any*): Unit = js.native
    def apply(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit = js.native
    def apply(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit = js.native
  }
  
  trait FastifyLoggerInstance extends StObject {
    
    def child(bindings: Bindings): FastifyLoggerInstance
    
    def debug(msg: String, args: js.Any*): Unit
    def debug(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit
    def debug(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit
    @JSName("debug")
    var debug_Original: FastifyLogFn
    
    def error(msg: String, args: js.Any*): Unit
    def error(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit
    def error(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit
    @JSName("error")
    var error_Original: FastifyLogFn
    
    def fatal(msg: String, args: js.Any*): Unit
    def fatal(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit
    def fatal(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit
    @JSName("fatal")
    var fatal_Original: FastifyLogFn
    
    def info(msg: String, args: js.Any*): Unit
    def info(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit
    def info(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit
    @JSName("info")
    var info_Original: FastifyLogFn
    
    def trace(msg: String, args: js.Any*): Unit
    def trace(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit
    def trace(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit
    @JSName("trace")
    var trace_Original: FastifyLogFn
    
    def warn(msg: String, args: js.Any*): Unit
    def warn(obj: Record[String, js.Any], msg: String, args: js.Any*): Unit
    def warn(obj: Record[String, js.Any], msg: Unit, args: js.Any*): Unit
    @JSName("warn")
    var warn_Original: FastifyLogFn
  }
  object FastifyLoggerInstance {
    
    inline def apply(
      child: Bindings => FastifyLoggerInstance,
      debug: FastifyLogFn,
      error: FastifyLogFn,
      fatal: FastifyLogFn,
      info: FastifyLogFn,
      trace: FastifyLogFn,
      warn: FastifyLogFn
    ): FastifyLoggerInstance = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyLoggerInstance]
    }
    
    extension [Self <: FastifyLoggerInstance](x: Self) {
      
      inline def setChild(value: Bindings => FastifyLoggerInstance): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      inline def setDebug(value: FastifyLogFn): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: FastifyLogFn): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: FastifyLogFn): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: FastifyLogFn): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: FastifyLogFn): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: FastifyLogFn): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifyLoggerOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] extends StObject {
    
    var genReqId: js.UndefOr[
        js.Function1[/* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequest], String]
      ] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
    
    var serializers: js.UndefOr[Err[RawRequest, RawReply, RawServer]] = js.undefined
  }
  object FastifyLoggerOptions {
    
    inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */](): FastifyLoggerOptions[RawServer, RawRequest, RawReply] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyLoggerOptions[RawServer, RawRequest, RawReply]]
    }
    
    extension [Self <: FastifyLoggerOptions[?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */](x: Self & (FastifyLoggerOptions[RawServer, RawRequest, RawReply])) {
      
      inline def setGenReqId(value: /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequest] => String): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      inline def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setPrettyPrint(value: Boolean | PrettyOptions): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setSerializers(value: Err[RawRequest, RawReply, RawServer]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastify.fastifyStrings.info
    - typings.fastify.fastifyStrings.error
    - typings.fastify.fastifyStrings.debug
    - typings.fastify.fastifyStrings.fatal
    - typings.fastify.fastifyStrings.warn
    - typings.fastify.fastifyStrings.trace
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.fastify.fastifyStrings.debug = "debug".asInstanceOf[typings.fastify.fastifyStrings.debug]
    
    inline def error: typings.fastify.fastifyStrings.error = "error".asInstanceOf[typings.fastify.fastifyStrings.error]
    
    inline def fatal: typings.fastify.fastifyStrings.fatal = "fatal".asInstanceOf[typings.fastify.fastifyStrings.fatal]
    
    inline def info: typings.fastify.fastifyStrings.info = "info".asInstanceOf[typings.fastify.fastifyStrings.info]
    
    inline def trace: typings.fastify.fastifyStrings.trace = "trace".asInstanceOf[typings.fastify.fastifyStrings.trace]
    
    inline def warn: typings.fastify.fastifyStrings.warn = "warn".asInstanceOf[typings.fastify.fastifyStrings.warn]
  }
  
  trait PrettyOptions extends StObject {
    
    /**
      * If set to true, will add color information to the formatted output message. Default: `false`.
      */
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
      */
    var crlf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the log keys that are associated with error like objects. Default: ["err", "error"]
      */
    var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  When formatting an error object, display this list of properties.
      *  The list should be a comma separated list of properties. Default: ''
      */
    var errorProps: js.UndefOr[String] = js.undefined
    
    /**
      * Ignore one or several keys. Example: "time,hostname"
      */
    var ignore: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
      */
    var levelFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123 Default: `false`.
      */
    var messageFormat: js.UndefOr[`false` | String] = js.undefined
    
    /**
      * The key in the JSON object to use as the highlighted message. Default: "msg".
      */
    var messageKey: js.UndefOr[String] = js.undefined
    
    /**
      * Specify a search pattern according to {@link http://jmespath.org|jmespath}
      */
    var search: js.UndefOr[String] = js.undefined
    
    /**
      * Suppress warning on first synchronous flushing.
      */
    var suppressFlushSyncWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key in the JSON object to use for timestamp display. Default: "time".
      */
    var timestampKey: js.UndefOr[String] = js.undefined
    
    /**
      * Translate the epoch time value into a human readable date and time string.
      * This flag also can set the format string to apply when translating the date to human readable format.
      * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
      * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
      */
    var translateTime: js.UndefOr[Boolean | String] = js.undefined
  }
  object PrettyOptions {
    
    inline def apply(): PrettyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyOptions]
    }
    
    extension [Self <: PrettyOptions](x: Self) {
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setCrlf(value: Boolean): Self = StObject.set(x, "crlf", value.asInstanceOf[js.Any])
      
      inline def setCrlfUndefined: Self = StObject.set(x, "crlf", js.undefined)
      
      inline def setErrorLikeObjectKeys(value: js.Array[String]): Self = StObject.set(x, "errorLikeObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setErrorLikeObjectKeysUndefined: Self = StObject.set(x, "errorLikeObjectKeys", js.undefined)
      
      inline def setErrorLikeObjectKeysVarargs(value: String*): Self = StObject.set(x, "errorLikeObjectKeys", js.Array(value :_*))
      
      inline def setErrorProps(value: String): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
      
      inline def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setLevelFirst(value: Boolean): Self = StObject.set(x, "levelFirst", value.asInstanceOf[js.Any])
      
      inline def setLevelFirstUndefined: Self = StObject.set(x, "levelFirst", js.undefined)
      
      inline def setMessageFormat(value: `false` | String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
      
      inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
      
      inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSuppressFlushSyncWarning(value: Boolean): Self = StObject.set(x, "suppressFlushSyncWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressFlushSyncWarningUndefined: Self = StObject.set(x, "suppressFlushSyncWarning", js.undefined)
      
      inline def setTimestampKey(value: String): Self = StObject.set(x, "timestampKey", value.asInstanceOf[js.Any])
      
      inline def setTimestampKeyUndefined: Self = StObject.set(x, "timestampKey", js.undefined)
      
      inline def setTranslateTime(value: Boolean | String): Self = StObject.set(x, "translateTime", value.asInstanceOf[js.Any])
      
      inline def setTranslateTimeUndefined: Self = StObject.set(x, "translateTime", js.undefined)
    }
  }
  
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
}
