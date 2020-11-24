package typings.fastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routeMod {
  
  type RouteHandler[RouteGeneric /* <: typings.fastify.routeMod.RouteGenericInterface */, RawServer /* <: typings.fastify.utilsMod.RawServerBase */, RawRequest /* <: typings.fastify.utilsMod.RawRequestDefaultExpression[RawServer] */, RawReply /* <: typings.fastify.utilsMod.RawReplyDefaultExpression[RawServer] */, ContextConfig] = js.ThisFunction2[
    /* this */ typings.fastify.instanceMod.FastifyInstance[RawServer, RawRequest, RawReply, typings.fastify.loggerMod.FastifyLoggerInstance], 
    /* request */ typings.fastify.requestMod.FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ typings.fastify.replyMod.FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    scala.Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | scala.Unit
    ])
  ]
  
  type RouteHandlerMethod[RawServer /* <: typings.fastify.utilsMod.RawServerBase */, RawRequest /* <: typings.fastify.utilsMod.RawRequestDefaultExpression[RawServer] */, RawReply /* <: typings.fastify.utilsMod.RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: typings.fastify.routeMod.RouteGenericInterface */, ContextConfig] = js.ThisFunction2[
    /* this */ typings.fastify.instanceMod.FastifyInstance[RawServer, RawRequest, RawReply, typings.fastify.loggerMod.FastifyLoggerInstance], 
    /* request */ typings.fastify.requestMod.FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ typings.fastify.replyMod.FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    scala.Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | scala.Unit
    ])
  ]
}
