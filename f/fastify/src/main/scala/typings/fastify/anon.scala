package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.Options
import typings.fastify.fastifyStrings.buffer
import typings.fastify.fastifyStrings.string
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.pluginMod.FastifyPluginAsync
import typings.fastify.pluginMod.FastifyPluginCallback
import typings.fastify.pluginMod.FastifyPluginOptions
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.fastifyError.mod.FastifyError
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Backlog extends StObject {
    
    var backlog: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var port: Double = js.native
  }
  object Backlog {
    
    @scala.inline
    def apply(port: Double): Backlog = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Backlog]
    }
    
    @scala.inline
    implicit class BacklogMutableBuilder[Self <: Backlog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BodyLimit extends StObject {
    
    var bodyLimit: js.UndefOr[Double] = js.native
  }
  object BodyLimit {
    
    @scala.inline
    def apply(): BodyLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyLimit]
    }
    
    @scala.inline
    implicit class BodyLimitMutableBuilder[Self <: BodyLimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
    }
  }
  
  @js.native
  trait CustomOptions extends StObject {
    
    var customOptions: js.UndefOr[Options] = js.native
    
    var plugins: js.UndefOr[js.Array[js.Function]] = js.native
  }
  object CustomOptions {
    
    @scala.inline
    def apply(): CustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomOptions]
    }
    
    @scala.inline
    implicit class CustomOptionsMutableBuilder[Self <: CustomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomOptions(value: Options): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomOptionsUndefined: Self = StObject.set(x, "customOptions", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[js.Function]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Function*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Default[Options /* <: FastifyPluginOptions */] extends StObject {
    
    def default(
      instance: FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyLoggerInstance
        ],
      opts: Options,
      next: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSName("default")
    var default_Original: FastifyPluginCallback[Options, RawServerDefault] = js.native
  }
  
  @js.native
  trait DefaultFastifyPluginAsync[Options /* <: FastifyPluginOptions */] extends StObject {
    
    def default(
      instance: FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyLoggerInstance
        ],
      opts: Options
    ): js.Promise[Unit] = js.native
    @JSName("default")
    var default_Original: FastifyPluginAsync[Options, RawServerDefault] = js.native
  }
  
  @js.native
  trait Del extends StObject {
    
    def del(version: String): Unit = js.native
    
    def empty(): Unit = js.native
    
    def get(version: String): String | Null = js.native
    
    def set(version: String, store: js.Function): Unit = js.native
  }
  object Del {
    
    @scala.inline
    def apply(
      del: String => Unit,
      empty: () => Unit,
      get: String => String | Null,
      set: (String, js.Function) => Unit
    ): Del = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Del]
    }
    
    @scala.inline
    implicit class DelMutableBuilder[Self <: Del] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Function) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DeriveVersion extends StObject {
    
    def deriveVersion[Context](req: js.Object): String = js.native
    def deriveVersion[Context](req: js.Object, ctx: Context): String = js.native
    
    def storage(): Del = js.native
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var hostname: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var remoteAddress: js.UndefOr[String] = js.native
    
    var remotePort: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      @scala.inline
      def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Err[RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */] extends StObject {
    
    var err: js.UndefOr[js.Function1[/* err */ FastifyError, Message]] = js.native
    
    var req: js.UndefOr[js.Function1[/* req */ RawRequest, Dictkey]] = js.native
    
    var res: js.UndefOr[js.Function1[/* res */ RawReply, StatusCode]] = js.native
  }
  object Err {
    
    @scala.inline
    def apply[RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */](): Err[RawRequest, RawReply, RawServer] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Err[RawRequest, RawReply, RawServer]]
    }
    
    @scala.inline
    implicit class ErrMutableBuilder[Self <: Err[_, _, _], RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */] (val x: Self with (Err[RawRequest, RawReply, RawServer])) extends AnyVal {
      
      @scala.inline
      def setErr(value: /* err */ FastifyError => Message): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setReq(value: /* req */ RawRequest => Dictkey): Self = StObject.set(x, "req", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      @scala.inline
      def setRes(value: /* res */ RawReply => StatusCode): Self = StObject.set(x, "res", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  /* Inlined std.Error & {  validation :any,   validationContext :string} */
  @js.native
  trait Errorvalidationanyvalidat extends StObject {
    
    var message: String = js.native
    
    var name: String = js.native
    
    var stack: js.UndefOr[String] = js.native
    
    var validation: js.Any = js.native
    
    var validationContext: String = js.native
  }
  object Errorvalidationanyvalidat {
    
    @scala.inline
    def apply(message: String, name: String, validation: js.Any, validationContext: String): Errorvalidationanyvalidat = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], validationContext = validationContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorvalidationanyvalidat]
    }
    
    @scala.inline
    implicit class ErrorvalidationanyvalidatMutableBuilder[Self <: Errorvalidationanyvalidat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setValidation(value: js.Any): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationContext(value: String): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message
    extends /* key */ StringDictionary[js.Any] {
    
    var message: String = js.native
    
    var stack: String = js.native
    
    var `type`: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String, stack: String, `type`: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseAs[parseAs /* <: String | Buffer */] extends StObject {
    
    var bodyLimit: js.UndefOr[Double] = js.native
    
    var parseAs: string | buffer = js.native
  }
  object ParseAs {
    
    @scala.inline
    def apply[parseAs /* <: String | Buffer */](parseAs: string | buffer): ParseAs[parseAs] = {
      val __obj = js.Dynamic.literal(parseAs = parseAs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseAs[parseAs]]
    }
    
    @scala.inline
    implicit class ParseAsMutableBuilder[Self <: ParseAs[_], parseAs /* <: String | Buffer */] (val x: Self with ParseAs[parseAs]) extends AnyVal {
      
      @scala.inline
      def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
      
      @scala.inline
      def setParseAs(value: string | buffer): Self = StObject.set(x, "parseAs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var path: String = js.native
    
    var prefix: String = js.native
    
    var routePath: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: String, prefix: String, routePath: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutePath(value: String): Self = StObject.set(x, "routePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatusCode
    extends /* key */ StringDictionary[js.Any] {
    
    var statusCode: String | Double = js.native
  }
  object StatusCode {
    
    @scala.inline
    def apply(statusCode: String | Double): StatusCode = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusCode]
    }
    
    @scala.inline
    implicit class StatusCodeMutableBuilder[Self <: StatusCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatusCode(value: String | Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
