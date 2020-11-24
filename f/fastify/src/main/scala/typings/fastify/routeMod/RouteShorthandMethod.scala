package typings.fastify.routeMod

import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteShorthandMethod[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] extends js.Object {
  
  def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
    path: String,
    handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
  def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
    path: String,
    opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
  def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
    path: String,
    opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
    handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
}
