package typings.fastify

import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverFactoryMod {
  
  type FastifyServerFactory[RawServer /* <: RawServerBase */] = js.Function2[
    /* handler */ FastifyServerFactoryHandler[
      RawServer, 
      RawRequestDefaultExpression[RawServer], 
      RawReplyDefaultExpression[RawServer]
    ], 
    /* opts */ Record[String, js.Any], 
    RawServer
  ]
  
  type FastifyServerFactoryHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] = js.Function2[
    (/* request */ Http2ServerRequest & RawRequest) | (/* request */ IncomingMessage & RawRequest), 
    (/* response */ Http2ServerResponse & RawReply) | (/* response */ ServerResponse & RawReply), 
    Unit
  ]
}
