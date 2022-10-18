package typings.fastify

import typings.fastify.typesContentTypeParserMod.ConstructorAction
import typings.fastify.typesContentTypeParserMod.ProtoAction
import typings.fastify.typesRequestMod.HTTPRequestPart
import typings.fastify.typesUtilsMod.HTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fastifyStrings {
  
  @js.native
  sealed trait COPY
    extends StObject
       with HTTPMethods
  inline def COPY: COPY = "COPY".asInstanceOf[COPY]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HTTPMethods
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HTTPMethods
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HTTPMethods
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait LOCK
    extends StObject
       with HTTPMethods
  inline def LOCK: LOCK = "LOCK".asInstanceOf[LOCK]
  
  @js.native
  sealed trait MKCOL
    extends StObject
       with HTTPMethods
  inline def MKCOL: MKCOL = "MKCOL".asInstanceOf[MKCOL]
  
  @js.native
  sealed trait MOVE
    extends StObject
       with HTTPMethods
  inline def MOVE: MOVE = "MOVE".asInstanceOf[MOVE]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HTTPMethods
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HTTPMethods
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HTTPMethods
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PROPFIND
    extends StObject
       with HTTPMethods
  inline def PROPFIND: PROPFIND = "PROPFIND".asInstanceOf[PROPFIND]
  
  @js.native
  sealed trait PROPPATCH
    extends StObject
       with HTTPMethods
  inline def PROPPATCH: PROPPATCH = "PROPPATCH".asInstanceOf[PROPPATCH]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HTTPMethods
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait SEARCH
    extends StObject
       with HTTPMethods
  inline def SEARCH: SEARCH = "SEARCH".asInstanceOf[SEARCH]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with HTTPMethods
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait UNLOCK
    extends StObject
       with HTTPMethods
  inline def UNLOCK: UNLOCK = "UNLOCK".asInstanceOf[UNLOCK]
  
  @js.native
  sealed trait body
    extends StObject
       with HTTPRequestPart
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait both extends StObject
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait constraints extends StObject
  inline def constraints: constraints = "constraints".asInstanceOf[constraints]
  
  @js.native
  sealed trait error
    extends StObject
       with ConstructorAction
       with ProtoAction
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait headers
    extends StObject
       with HTTPRequestPart
  inline def headers: headers = "headers".asInstanceOf[headers]
  
  @js.native
  sealed trait http extends StObject
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait idle extends StObject
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait ignore
    extends StObject
       with ConstructorAction
       with ProtoAction
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait method extends StObject
  inline def method: method = "method".asInstanceOf[method]
  
  @js.native
  sealed trait `no-slash` extends StObject
  inline def `no-slash`: `no-slash` = "no-slash".asInstanceOf[`no-slash`]
  
  @js.native
  sealed trait onClose extends StObject
  inline def onClose: onClose = "onClose".asInstanceOf[onClose]
  
  @js.native
  sealed trait onError extends StObject
  inline def onError: onError = "onError".asInstanceOf[onError]
  
  @js.native
  sealed trait onReady extends StObject
  inline def onReady: onReady = "onReady".asInstanceOf[onReady]
  
  @js.native
  sealed trait onRegister extends StObject
  inline def onRegister: onRegister = "onRegister".asInstanceOf[onRegister]
  
  @js.native
  sealed trait onRequest extends StObject
  inline def onRequest: onRequest = "onRequest".asInstanceOf[onRequest]
  
  @js.native
  sealed trait onResponse extends StObject
  inline def onResponse: onResponse = "onResponse".asInstanceOf[onResponse]
  
  @js.native
  sealed trait onRoute extends StObject
  inline def onRoute: onRoute = "onRoute".asInstanceOf[onRoute]
  
  @js.native
  sealed trait onSend extends StObject
  inline def onSend: onSend = "onSend".asInstanceOf[onSend]
  
  @js.native
  sealed trait onTimeout extends StObject
  inline def onTimeout: onTimeout = "onTimeout".asInstanceOf[onTimeout]
  
  @js.native
  sealed trait params
    extends StObject
       with HTTPRequestPart
  inline def params: params = "params".asInstanceOf[params]
  
  @js.native
  sealed trait preHandler extends StObject
  inline def preHandler: preHandler = "preHandler".asInstanceOf[preHandler]
  
  @js.native
  sealed trait preParsing extends StObject
  inline def preParsing: preParsing = "preParsing".asInstanceOf[preParsing]
  
  @js.native
  sealed trait preSerialization extends StObject
  inline def preSerialization: preSerialization = "preSerialization".asInstanceOf[preSerialization]
  
  @js.native
  sealed trait preValidation extends StObject
  inline def preValidation: preValidation = "preValidation".asInstanceOf[preValidation]
  
  @js.native
  sealed trait query
    extends StObject
       with HTTPRequestPart
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait querystring
    extends StObject
       with HTTPRequestPart
  inline def querystring: querystring = "querystring".asInstanceOf[querystring]
  
  @js.native
  sealed trait remove
    extends StObject
       with ConstructorAction
       with ProtoAction
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait slash extends StObject
  inline def slash: slash = "slash".asInstanceOf[slash]
  
  @js.native
  sealed trait url extends StObject
  inline def url: url = "url".asInstanceOf[url]
}
