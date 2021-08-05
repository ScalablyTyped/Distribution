package typings.fastify

import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type ContextConfigDefault = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastify.fastifyStrings.DELETE
    - typings.fastify.fastifyStrings.GET
    - typings.fastify.fastifyStrings.HEAD
    - typings.fastify.fastifyStrings.PATCH
    - typings.fastify.fastifyStrings.POST
    - typings.fastify.fastifyStrings.PUT
    - typings.fastify.fastifyStrings.OPTIONS
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    inline def DELETE: typings.fastify.fastifyStrings.DELETE = "DELETE".asInstanceOf[typings.fastify.fastifyStrings.DELETE]
    
    inline def GET: typings.fastify.fastifyStrings.GET = "GET".asInstanceOf[typings.fastify.fastifyStrings.GET]
    
    inline def HEAD: typings.fastify.fastifyStrings.HEAD = "HEAD".asInstanceOf[typings.fastify.fastifyStrings.HEAD]
    
    inline def OPTIONS: typings.fastify.fastifyStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.fastify.fastifyStrings.OPTIONS]
    
    inline def PATCH: typings.fastify.fastifyStrings.PATCH = "PATCH".asInstanceOf[typings.fastify.fastifyStrings.PATCH]
    
    inline def POST: typings.fastify.fastifyStrings.POST = "POST".asInstanceOf[typings.fastify.fastifyStrings.POST]
    
    inline def PUT: typings.fastify.fastifyStrings.PUT = "PUT".asInstanceOf[typings.fastify.fastifyStrings.PUT]
  }
  
  type RawReplyDefaultExpression[RawServer /* <: RawServerBase */] = Http2ServerResponse | ServerResponse
  
  type RawRequestDefaultExpression[RawServer /* <: RawServerBase */] = Http2ServerRequest | IncomingMessage
  
  type RawServerBase = Server | typings.node.httpsMod.Server | Http2Server | Http2SecureServer
  
  type RawServerDefault = Server
  
  type ReplyDefault = js.Any
  
  type RequestBodyDefault = js.Any
  
  type RequestHeadersDefault = js.Any
  
  type RequestParamsDefault = js.Any
  
  type RequestQuerystringDefault = js.Any
}
