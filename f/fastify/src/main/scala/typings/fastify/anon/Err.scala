package typings.fastify.anon

import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesReplyMod.FastifyReply
import typings.fastify.typesRequestMod.FastifyRequest
import typings.fastify.typesRouteMod.RouteGenericInterface
import typings.fastify.typesSchemaMod.FastifySchema
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typings.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typings.fastify.typesUtilsMod.ContextConfigDefault
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
import typings.fastifyError.mod.FastifyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Err[RawRequest /* <: FastifyRequest[
RouteGenericInterface, 
RawServer, 
RawRequestDefaultExpression[RawServer], 
FastifySchema, 
FastifyTypeProvider, 
ContextConfigDefault, 
FastifyBaseLogger, 
ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]] */, RawReply /* <: FastifyReply[
RawServer, 
RawRequestDefaultExpression[RawServer], 
RawReplyDefaultExpression[RawServer], 
RouteGenericInterface, 
ContextConfigDefault, 
FastifySchema, 
FastifyTypeProvider, 
ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]] */, RawServer /* <: RawServerBase */] extends StObject {
  
  var err: js.UndefOr[js.Function1[/* err */ FastifyError, Message]] = js.undefined
  
  var req: js.UndefOr[js.Function1[/* req */ RawRequest, Dictkey]] = js.undefined
  
  var res: js.UndefOr[js.Function1[/* res */ RawReply, StatusCode]] = js.undefined
}
object Err {
  
  inline def apply[RawRequest /* <: FastifyRequest[
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
  ] */, RawServer /* <: RawServerBase */](): Err[RawRequest, RawReply, RawServer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Err[RawRequest, RawReply, RawServer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Err[?, ?, ?], RawRequest /* <: FastifyRequest[
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
  ] */, RawServer /* <: RawServerBase */] (val x: Self & (Err[RawRequest, RawReply, RawServer])) extends AnyVal {
    
    inline def setErr(value: /* err */ FastifyError => Message): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setReq(value: /* req */ RawRequest => Dictkey): Self = StObject.set(x, "req", js.Any.fromFunction1(value))
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setRes(value: /* res */ RawReply => StatusCode): Self = StObject.set(x, "res", js.Any.fromFunction1(value))
    
    inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
