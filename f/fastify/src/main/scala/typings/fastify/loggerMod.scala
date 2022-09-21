package typings.fastify

import typings.fastify.anon.Err
import typings.fastify.replyMod.FastifyReply
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.schemaMod.FastifySchema
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.typeProviderMod.ResolveFastifyReplyType
import typings.fastify.typeProviderMod.ResolveFastifyRequestType
import typings.fastify.utilsMod.ContextConfigDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.pino.mod.pino.BaseLogger
import typings.pino.mod.pino.Level
import typings.pino.mod.pino.LogFn
import typings.pino.mod.pino.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  type Bindings = typings.pino.mod.pino.Bindings
  
  type ChildLoggerOptions = typings.pino.mod.pino.ChildLoggerOptions
  
  @js.native
  trait FastifyBaseLogger
    extends StObject
       with BaseLogger {
    
    def child(bindings: Bindings): FastifyBaseLogger = js.native
    def child(bindings: Bindings, options: ChildLoggerOptions): FastifyBaseLogger = js.native
  }
  
  type FastifyLogFn = LogFn
  
  type FastifyLoggerInstance = FastifyBaseLogger
  
  trait FastifyLoggerOptions[RawServer /* <: RawServerBase */, RawRequest /* <: FastifyRequest[
    RouteGenericInterface, 
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    FastifySchema, 
    FastifyTypeProvider, 
    ContextConfigDefault, 
    FastifyBaseLogger, 
    ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */, RawReply /* <: FastifyReply[
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    RawReplyDefaultExpression[RawServer], 
    RouteGenericInterface, 
    ContextConfigDefault, 
    FastifySchema, 
    FastifyTypeProvider, 
    ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */] extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var genReqId: js.UndefOr[js.Function1[/* req */ RawRequest, String]] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var serializers: js.UndefOr[Err[RawRequest, RawReply, RawServer]] = js.undefined
    
    var stream: js.UndefOr[FastifyLoggerStreamDestination] = js.undefined
  }
  object FastifyLoggerOptions {
    
    inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: FastifyRequest[
        RouteGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProvider, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */, RawReply /* <: FastifyReply[
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        RawReplyDefaultExpression[RawServer], 
        RouteGenericInterface, 
        ContextConfigDefault, 
        FastifySchema, 
        FastifyTypeProvider, 
        ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */](): FastifyLoggerOptions[RawServer, RawRequest, RawReply] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyLoggerOptions[RawServer, RawRequest, RawReply]]
    }
    
    extension [Self <: FastifyLoggerOptions[?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: FastifyRequest[
        RouteGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProvider, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */, RawReply /* <: FastifyReply[
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        RawReplyDefaultExpression[RawServer], 
        RouteGenericInterface, 
        ContextConfigDefault, 
        FastifySchema, 
        FastifyTypeProvider, 
        ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */](x: Self & (FastifyLoggerOptions[RawServer, RawRequest, RawReply])) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setGenReqId(value: /* req */ RawRequest => String): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      inline def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSerializers(value: Err[RawRequest, RawReply, RawServer]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setStream(value: FastifyLoggerStreamDestination): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait FastifyLoggerStreamDestination extends StObject {
    
    def write(msg: String): Unit
  }
  object FastifyLoggerStreamDestination {
    
    inline def apply(write: String => Unit): FastifyLoggerStreamDestination = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[FastifyLoggerStreamDestination]
    }
    
    extension [Self <: FastifyLoggerStreamDestination](x: Self) {
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type LogLevel = Level
  
  type PinoLoggerOptions = LoggerOptions
}
