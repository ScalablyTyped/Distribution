package typings.fastify

import org.scalablytyped.runtime.Instantiable1
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  type ContextConfigDefault = Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastify.fastifyStrings.DELETE
    - typings.fastify.fastifyStrings.GET
    - typings.fastify.fastifyStrings.HEAD
    - typings.fastify.fastifyStrings.PATCH
    - typings.fastify.fastifyStrings.POST
    - typings.fastify.fastifyStrings.PUT
    - typings.fastify.fastifyStrings.OPTIONS
    - typings.fastify.fastifyStrings.PROPFIND
    - typings.fastify.fastifyStrings.PROPPATCH
    - typings.fastify.fastifyStrings.MKCOL
    - typings.fastify.fastifyStrings.COPY
    - typings.fastify.fastifyStrings.MOVE
    - typings.fastify.fastifyStrings.LOCK
    - typings.fastify.fastifyStrings.UNLOCK
    - typings.fastify.fastifyStrings.TRACE
    - typings.fastify.fastifyStrings.SEARCH
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    inline def COPY: typings.fastify.fastifyStrings.COPY = "COPY".asInstanceOf[typings.fastify.fastifyStrings.COPY]
    
    inline def DELETE: typings.fastify.fastifyStrings.DELETE = "DELETE".asInstanceOf[typings.fastify.fastifyStrings.DELETE]
    
    inline def GET: typings.fastify.fastifyStrings.GET = "GET".asInstanceOf[typings.fastify.fastifyStrings.GET]
    
    inline def HEAD: typings.fastify.fastifyStrings.HEAD = "HEAD".asInstanceOf[typings.fastify.fastifyStrings.HEAD]
    
    inline def LOCK: typings.fastify.fastifyStrings.LOCK = "LOCK".asInstanceOf[typings.fastify.fastifyStrings.LOCK]
    
    inline def MKCOL: typings.fastify.fastifyStrings.MKCOL = "MKCOL".asInstanceOf[typings.fastify.fastifyStrings.MKCOL]
    
    inline def MOVE: typings.fastify.fastifyStrings.MOVE = "MOVE".asInstanceOf[typings.fastify.fastifyStrings.MOVE]
    
    inline def OPTIONS: typings.fastify.fastifyStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.fastify.fastifyStrings.OPTIONS]
    
    inline def PATCH: typings.fastify.fastifyStrings.PATCH = "PATCH".asInstanceOf[typings.fastify.fastifyStrings.PATCH]
    
    inline def POST: typings.fastify.fastifyStrings.POST = "POST".asInstanceOf[typings.fastify.fastifyStrings.POST]
    
    inline def PROPFIND: typings.fastify.fastifyStrings.PROPFIND = "PROPFIND".asInstanceOf[typings.fastify.fastifyStrings.PROPFIND]
    
    inline def PROPPATCH: typings.fastify.fastifyStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typings.fastify.fastifyStrings.PROPPATCH]
    
    inline def PUT: typings.fastify.fastifyStrings.PUT = "PUT".asInstanceOf[typings.fastify.fastifyStrings.PUT]
    
    inline def SEARCH: typings.fastify.fastifyStrings.SEARCH = "SEARCH".asInstanceOf[typings.fastify.fastifyStrings.SEARCH]
    
    inline def TRACE: typings.fastify.fastifyStrings.TRACE = "TRACE".asInstanceOf[typings.fastify.fastifyStrings.TRACE]
    
    inline def UNLOCK: typings.fastify.fastifyStrings.UNLOCK = "UNLOCK".asInstanceOf[typings.fastify.fastifyStrings.UNLOCK]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> | node.https.Server<new (socket : node.node:net.Socket): node.node:http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>> ? node.http.ServerResponse<node.http.IncomingMessage> : RawServer extends node.http2.Http2Server | node.http2.Http2SecureServer ? node.http2.Http2ServerResponse : never
    }}}
    */
  type RawReplyDefaultExpression[RawServer /* <: RawServerBase */] = ServerResponse[IncomingMessage]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> | node.https.Server<new (socket : node.node:net.Socket): node.node:http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>> ? node.http.IncomingMessage : RawServer extends node.http2.Http2Server | node.http2.Http2SecureServer ? node.http2.Http2ServerRequest : never
    }}}
    */
  type RawRequestDefaultExpression[RawServer /* <: RawServerBase */] = IncomingMessage
  
  type RawServerBase = (Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) | (typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) | Http2Server | Http2SecureServer
  
  type RawServerDefault = Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  type ReplyDefault = Any
  
  type RequestBodyDefault = Any
  
  type RequestHeadersDefault = Any
  
  type RequestParamsDefault = Any
  
  type RequestQuerystringDefault = Any
}
