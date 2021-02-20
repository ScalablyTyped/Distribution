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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @js.native
  trait Bindings
    extends /* key */ StringDictionary[js.Any] {
    
    var level: js.UndefOr[LogLevel | String] = js.native
    
    var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.native
  }
  object Bindings {
    
    @scala.inline
    def apply(): Bindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bindings]
    }
    
    @scala.inline
    implicit class BindingsMutableBuilder[Self <: Bindings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevel | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setSerializers(value: StringDictionary[SerializerFn]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  @js.native
  trait FastifyLogFn extends StObject {
    
    def apply(msg: String, args: js.Any*): Unit = js.native
    def apply(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def apply(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  }
  
  @js.native
  trait FastifyLoggerInstance extends StObject {
    
    def child(bindings: Bindings): FastifyLoggerInstance = js.native
    
    def debug(msg: String, args: js.Any*): Unit = js.native
    def debug(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def debug(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: FastifyLogFn = js.native
    
    def error(msg: String, args: js.Any*): Unit = js.native
    def error(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def error(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: FastifyLogFn = js.native
    
    def fatal(msg: String, args: js.Any*): Unit = js.native
    def fatal(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def fatal(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: FastifyLogFn = js.native
    
    def info(msg: String, args: js.Any*): Unit = js.native
    def info(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def info(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: FastifyLogFn = js.native
    
    def trace(msg: String, args: js.Any*): Unit = js.native
    def trace(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def trace(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
    @JSName("trace")
    var trace_Original: FastifyLogFn = js.native
    
    def warn(msg: String, args: js.Any*): Unit = js.native
    def warn(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def warn(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: FastifyLogFn = js.native
  }
  
  @js.native
  trait FastifyLoggerOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] extends StObject {
    
    var genReqId: js.UndefOr[
        js.Function1[/* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequest], String]
      ] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
    
    var serializers: js.UndefOr[Err[RawRequest, RawReply, RawServer]] = js.native
  }
  object FastifyLoggerOptions {
    
    @scala.inline
    def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */](): FastifyLoggerOptions[RawServer, RawRequest, RawReply] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyLoggerOptions[RawServer, RawRequest, RawReply]]
    }
    
    @scala.inline
    implicit class FastifyLoggerOptionsMutableBuilder[Self <: FastifyLoggerOptions[_, _, _], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] (val x: Self with (FastifyLoggerOptions[RawServer, RawRequest, RawReply])) extends AnyVal {
      
      @scala.inline
      def setGenReqId(value: /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequest] => String): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean | PrettyOptions): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setSerializers(value: Err[RawRequest, RawReply, RawServer]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
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
    
    @scala.inline
    def debug: typings.fastify.fastifyStrings.debug = "debug".asInstanceOf[typings.fastify.fastifyStrings.debug]
    
    @scala.inline
    def error: typings.fastify.fastifyStrings.error = "error".asInstanceOf[typings.fastify.fastifyStrings.error]
    
    @scala.inline
    def fatal: typings.fastify.fastifyStrings.fatal = "fatal".asInstanceOf[typings.fastify.fastifyStrings.fatal]
    
    @scala.inline
    def info: typings.fastify.fastifyStrings.info = "info".asInstanceOf[typings.fastify.fastifyStrings.info]
    
    @scala.inline
    def trace: typings.fastify.fastifyStrings.trace = "trace".asInstanceOf[typings.fastify.fastifyStrings.trace]
    
    @scala.inline
    def warn: typings.fastify.fastifyStrings.warn = "warn".asInstanceOf[typings.fastify.fastifyStrings.warn]
  }
  
  @js.native
  trait PrettyOptions extends StObject {
    
    /**
      * If set to true, will add color information to the formatted output message. Default: `false`.
      */
    var colorize: js.UndefOr[Boolean] = js.native
    
    /**
      * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
      */
    var crlf: js.UndefOr[Boolean] = js.native
    
    /**
      * Define the log keys that are associated with error like objects. Default: ["err", "error"]
      */
    var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.native
    
    /**
      *  When formatting an error object, display this list of properties.
      *  The list should be a comma separated list of properties. Default: ''
      */
    var errorProps: js.UndefOr[String] = js.native
    
    /**
      * Ignore one or several keys. Example: "time,hostname"
      */
    var ignore: js.UndefOr[String] = js.native
    
    /**
      * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
      */
    var levelFirst: js.UndefOr[Boolean] = js.native
    
    /**
      * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123 Default: `false`.
      */
    var messageFormat: js.UndefOr[`false` | String] = js.native
    
    /**
      * The key in the JSON object to use as the highlighted message. Default: "msg".
      */
    var messageKey: js.UndefOr[String] = js.native
    
    /**
      * Specify a search pattern according to {@link http://jmespath.org|jmespath}
      */
    var search: js.UndefOr[String] = js.native
    
    /**
      * Suppress warning on first synchronous flushing.
      */
    var suppressFlushSyncWarning: js.UndefOr[Boolean] = js.native
    
    /**
      * The key in the JSON object to use for timestamp display. Default: "time".
      */
    var timestampKey: js.UndefOr[String] = js.native
    
    /**
      * Translate the epoch time value into a human readable date and time string.
      * This flag also can set the format string to apply when translating the date to human readable format.
      * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
      * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
      */
    var translateTime: js.UndefOr[Boolean | String] = js.native
  }
  object PrettyOptions {
    
    @scala.inline
    def apply(): PrettyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyOptions]
    }
    
    @scala.inline
    implicit class PrettyOptionsMutableBuilder[Self <: PrettyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      @scala.inline
      def setCrlf(value: Boolean): Self = StObject.set(x, "crlf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlfUndefined: Self = StObject.set(x, "crlf", js.undefined)
      
      @scala.inline
      def setErrorLikeObjectKeys(value: js.Array[String]): Self = StObject.set(x, "errorLikeObjectKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLikeObjectKeysUndefined: Self = StObject.set(x, "errorLikeObjectKeys", js.undefined)
      
      @scala.inline
      def setErrorLikeObjectKeysVarargs(value: String*): Self = StObject.set(x, "errorLikeObjectKeys", js.Array(value :_*))
      
      @scala.inline
      def setErrorProps(value: String): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setLevelFirst(value: Boolean): Self = StObject.set(x, "levelFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelFirstUndefined: Self = StObject.set(x, "levelFirst", js.undefined)
      
      @scala.inline
      def setMessageFormat(value: `false` | String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
      
      @scala.inline
      def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSuppressFlushSyncWarning(value: Boolean): Self = StObject.set(x, "suppressFlushSyncWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressFlushSyncWarningUndefined: Self = StObject.set(x, "suppressFlushSyncWarning", js.undefined)
      
      @scala.inline
      def setTimestampKey(value: String): Self = StObject.set(x, "timestampKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampKeyUndefined: Self = StObject.set(x, "timestampKey", js.undefined)
      
      @scala.inline
      def setTranslateTime(value: Boolean | String): Self = StObject.set(x, "translateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateTimeUndefined: Self = StObject.set(x, "translateTime", js.undefined)
    }
  }
  
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
}
