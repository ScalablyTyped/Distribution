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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Backlog extends StObject {
    
    var backlog: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: Double
  }
  object Backlog {
    
    inline def apply(port: Double): Backlog = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Backlog]
    }
    
    extension [Self <: Backlog](x: Self) {
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyLimit extends StObject {
    
    var bodyLimit: js.UndefOr[Double] = js.undefined
  }
  object BodyLimit {
    
    inline def apply(): BodyLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyLimit]
    }
    
    extension [Self <: BodyLimit](x: Self) {
      
      inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
    }
  }
  
  trait CustomOptions extends StObject {
    
    var customOptions: js.UndefOr[Options] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Function]] = js.undefined
  }
  object CustomOptions {
    
    inline def apply(): CustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomOptions]
    }
    
    extension [Self <: CustomOptions](x: Self) {
      
      inline def setCustomOptions(value: Options): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomOptionsUndefined: Self = StObject.set(x, "customOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Function]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Function*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
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
    ): Unit
    @JSName("default")
    var default_Original: FastifyPluginCallback[Options, RawServerDefault]
  }
  object Default {
    
    inline def apply[Options /* <: FastifyPluginOptions */](
      default: (/* instance */ FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyLoggerInstance
        ], Options, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
    ): Default[Options] = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction3(default))
      __obj.asInstanceOf[Default[Options]]
    }
    
    extension [Self <: Default[?], Options /* <: FastifyPluginOptions */](x: Self & Default[Options]) {
      
      inline def setDefault(
        value: (/* instance */ FastifyInstance[
              RawServerDefault, 
              RawRequestDefaultExpression[RawServerDefault], 
              RawReplyDefaultExpression[RawServerDefault], 
              FastifyLoggerInstance
            ], Options, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
      ): Self = StObject.set(x, "default", js.Any.fromFunction3(value))
    }
  }
  
  trait DefaultFastifyPluginAsync[Options /* <: FastifyPluginOptions */] extends StObject {
    
    def default(
      instance: FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyLoggerInstance
        ],
      opts: Options
    ): js.Promise[Unit]
    @JSName("default")
    var default_Original: FastifyPluginAsync[Options, RawServerDefault]
  }
  object DefaultFastifyPluginAsync {
    
    inline def apply[Options /* <: FastifyPluginOptions */](
      default: (/* instance */ FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyLoggerInstance
        ], Options) => js.Promise[Unit]
    ): DefaultFastifyPluginAsync[Options] = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction2(default))
      __obj.asInstanceOf[DefaultFastifyPluginAsync[Options]]
    }
    
    extension [Self <: DefaultFastifyPluginAsync[?], Options /* <: FastifyPluginOptions */](x: Self & DefaultFastifyPluginAsync[Options]) {
      
      inline def setDefault(
        value: (/* instance */ FastifyInstance[
              RawServerDefault, 
              RawRequestDefaultExpression[RawServerDefault], 
              RawReplyDefaultExpression[RawServerDefault], 
              FastifyLoggerInstance
            ], Options) => js.Promise[Unit]
      ): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
    }
  }
  
  trait Del extends StObject {
    
    def del(version: String): Unit
    
    def empty(): Unit
    
    def get(version: String): String | Null
    
    def set(version: String, store: js.Function): Unit
  }
  object Del {
    
    inline def apply(
      del: String => Unit,
      empty: () => Unit,
      get: String => String | Null,
      set: (String, js.Function) => Unit
    ): Del = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Del]
    }
    
    extension [Self <: Del](x: Self) {
      
      inline def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, js.Function) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DeriveVersion extends StObject {
    
    def deriveVersion[Context](req: js.Object): String = js.native
    def deriveVersion[Context](req: js.Object, ctx: Context): String = js.native
    
    def storage(): Del = js.native
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var remoteAddress: js.UndefOr[String] = js.undefined
    
    var remotePort: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Err[RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */] extends StObject {
    
    var err: js.UndefOr[js.Function1[/* err */ FastifyError, Message]] = js.undefined
    
    var req: js.UndefOr[js.Function1[/* req */ RawRequest, Dictkey]] = js.undefined
    
    var res: js.UndefOr[js.Function1[/* res */ RawReply, StatusCode]] = js.undefined
  }
  object Err {
    
    inline def apply[RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */](): Err[RawRequest, RawReply, RawServer] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Err[RawRequest, RawReply, RawServer]]
    }
    
    extension [Self <: Err[?, ?, ?], RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */](x: Self & (Err[RawRequest, RawReply, RawServer])) {
      
      inline def setErr(value: /* err */ FastifyError => Message): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setReq(value: /* req */ RawRequest => Dictkey): Self = StObject.set(x, "req", js.Any.fromFunction1(value))
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setRes(value: /* res */ RawReply => StatusCode): Self = StObject.set(x, "res", js.Any.fromFunction1(value))
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  /* Inlined std.Error & {  validation :any,   validationContext :string} */
  trait Errorvalidationanyvalidat extends StObject {
    
    var message: String
    
    var name: String
    
    var stack: js.UndefOr[String] = js.undefined
    
    var validation: js.Any
    
    var validationContext: String
  }
  object Errorvalidationanyvalidat {
    
    inline def apply(message: String, name: String, validation: js.Any, validationContext: String): Errorvalidationanyvalidat = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], validationContext = validationContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorvalidationanyvalidat]
    }
    
    extension [Self <: Errorvalidationanyvalidat](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setValidation(value: js.Any): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationContext(value: String): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var message: String
    
    var stack: String
    
    var `type`: String
  }
  object Message {
    
    inline def apply(message: String, stack: String, `type`: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseAs[parseAs /* <: String | Buffer */] extends StObject {
    
    var bodyLimit: js.UndefOr[Double] = js.undefined
    
    var parseAs: string | buffer
  }
  object ParseAs {
    
    inline def apply[parseAs /* <: String | Buffer */](parseAs: string | buffer): ParseAs[parseAs] = {
      val __obj = js.Dynamic.literal(parseAs = parseAs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseAs[parseAs]]
    }
    
    extension [Self <: ParseAs[?], parseAs /* <: String | Buffer */](x: Self & ParseAs[parseAs]) {
      
      inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
      
      inline def setParseAs(value: string | buffer): Self = StObject.set(x, "parseAs", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var prefix: String
    
    var routePath: String
  }
  object Path {
    
    inline def apply(path: String, prefix: String, routePath: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRoutePath(value: String): Self = StObject.set(x, "routePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusCode
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var statusCode: String | Double
  }
  object StatusCode {
    
    inline def apply(statusCode: String | Double): StatusCode = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusCode]
    }
    
    extension [Self <: StatusCode](x: Self) {
      
      inline def setStatusCode(value: String | Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
