package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.buffer.mod.Buffer
import typings.fastify.contextMod.FastifyContext
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.schemaMod.FastifySchema
import typings.fastify.typeProviderMod.FastifyReplyType
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typeProviderMod.ResolveFastifyReplyType
import typings.fastify.typeProviderMod.ResolveFastifyRequestType
import typings.fastify.utilsMod.ContextConfigDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.fastify.utilsMod.ReplyDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replyMod {
  
  @js.native
  trait FastifyReply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, ReplyType /* <: FastifyReplyType[Any] */] extends StObject {
    
    def callNotFound(): Unit = js.native
    
    def code(statusCode: Double): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    def compileSerializationSchema(schema: StringDictionary[Any]): js.Function1[/* payload */ StringDictionary[Any], String] = js.native
    def compileSerializationSchema(schema: StringDictionary[Any], httpStatus: String): js.Function1[/* payload */ StringDictionary[Any], String] = js.native
    
    var context: FastifyContext[ContextConfig] = js.native
    
    def getHeader(key: String): js.UndefOr[Double | String | js.Array[String]] = js.native
    
    def getHeaders(): // Node's `getHeaders()` can return numbers and arrays, so they're included here as possible types.
    StringDictionary[js.UndefOr[Double | String | js.Array[String]]] = js.native
    
    def getResponseTime(): Double = js.native
    
    // Serialization Methods
    def getSerializationFunction(httpStatus: String): js.Function1[/* payload */ StringDictionary[Any], String] = js.native
    def getSerializationFunction(schema: StringDictionary[Any]): js.Function1[/* payload */ StringDictionary[Any], String] = js.native
    
    def hasHeader(key: String): Boolean = js.native
    
    def header(key: String, value: Any): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    def headers(values: StringDictionary[Any]): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    def hijack(): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    var log: FastifyBaseLogger = js.native
    
    var raw: RawReply = js.native
    
    // Note: should consider refactoring the argument order for redirect. statusCode is optional so it should be after the required url param
    def redirect(statusCode: Double, url: String): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    def redirect(url: String): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    def removeHeader(key: String): Unit = js.native
    
    var request: FastifyRequest[
        RouteGeneric, 
        RawServer, 
        RawRequest, 
        SchemaCompiler, 
        TypeProvider, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    def send(): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    def send(payload: ReplyType): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    var sent: Boolean = js.native
    
    def serialize(payload: Any): String | js.typedarray.ArrayBuffer | Buffer = js.native
    
    def serializeInput(input: StringDictionary[Any], httpStatus: String): Any = js.native
    def serializeInput(input: StringDictionary[Any], schema: StringDictionary[Any]): String = js.native
    def serializeInput(input: StringDictionary[Any], schema: StringDictionary[Any], httpStatus: String): String = js.native
    
    def serializer(fn: js.Function1[/* payload */ Any, String]): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    var server: FastifyInstance[
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault], 
        RawReplyDefaultExpression[RawServerDefault], 
        FastifyBaseLogger, 
        FastifyTypeProviderDefault
      ] = js.native
    
    def status(statusCode: Double): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
    
    var statusCode: Double = js.native
    
    def `then`(fulfilled: js.Function0[Unit], rejected: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def `type`(contentType: String): FastifyReply[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
      ] = js.native
  }
  
  trait ReplyGenericInterface extends StObject {
    
    var Reply: js.UndefOr[ReplyDefault] = js.undefined
  }
  object ReplyGenericInterface {
    
    inline def apply(): ReplyGenericInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplyGenericInterface]
    }
    
    extension [Self <: ReplyGenericInterface](x: Self) {
      
      inline def setReply(value: ReplyDefault): Self = StObject.set(x, "Reply", value.asInstanceOf[js.Any])
      
      inline def setReplyUndefined: Self = StObject.set(x, "Reply", js.undefined)
    }
  }
}
