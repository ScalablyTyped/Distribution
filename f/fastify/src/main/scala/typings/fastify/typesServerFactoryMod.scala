package typings.fastify

import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServerFactoryMod {
  
  type FastifyServerFactory[RawServer /* <: RawServerBase */] = js.Function2[
    /* handler */ FastifyServerFactoryHandler[
      RawServer, 
      RawRequestDefaultExpression[RawServer], 
      RawReplyDefaultExpression[RawServer]
    ], 
    /* opts */ Record[String, Any], 
    RawServer
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> | node.https.Server<new (socket : node.node:net.Socket): node.node:http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>> ? (request : node.http.IncomingMessage & RawRequest, response : node.http.ServerResponse<node.http.IncomingMessage> & RawReply): void : (request : node.http2.Http2ServerRequest & RawRequest, response : node.http2.Http2ServerResponse & RawReply): void
    }}}
    */
  type FastifyServerFactoryHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] = js.Function2[
    /* request */ IncomingMessage & RawRequest, 
    /* response */ ServerResponse[IncomingMessage] & RawReply, 
    Unit
  ]
}
