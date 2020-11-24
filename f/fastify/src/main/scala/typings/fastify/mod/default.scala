package typings.fastify.mod

import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[Server /* <: typings.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  def apply[Server /* <: Http2Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2Options[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  /**
    * Fastify factor function for the standard fastify http, https, or http2 server instance.
    *
    * The default function utilizes http
    *
    * @param opts Fastify server options
    * @returns Fastify server instance
    */
  def apply[Server /* <: Http2SecureServer */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2SecureOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  def apply[Server /* <: typings.node.httpsMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttpsOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  def apply[Server /* <: typings.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyServerOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
}
