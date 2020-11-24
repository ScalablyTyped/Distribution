package typings.fastify.routeMod

import typings.fastify.replyMod.FastifyReply
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.utilsMod.HTTPMethods
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] extends RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] {
  
  def handler(
    request: FastifyRequest[RouteGeneric, RawServer, RawRequest],
    reply: FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): Unit | (js.Promise[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
  ]) = js.native
  @JSName("handler")
  var handler_Original: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  var method: HTTPMethods | js.Array[HTTPMethods] = js.native
  
  var url: String = js.native
}
