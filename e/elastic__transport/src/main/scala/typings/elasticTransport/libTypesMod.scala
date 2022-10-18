package typings.elasticTransport

import typings.elasticTransport.anon.Aborted
import typings.elasticTransport.anon.Apikey
import typings.elasticTransport.elasticTransportStrings.fifo
import typings.elasticTransport.elasticTransportStrings.lifo
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestParams
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait ApiKeyAuth extends StObject {
    
    var apiKey: String | Apikey
  }
  object ApiKeyAuth {
    
    inline def apply(apiKey: String | Apikey): ApiKeyAuth = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyAuth]
    }
    
    extension [Self <: ApiKeyAuth](x: Self) {
      
      inline def setApiKey(value: String | Apikey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasicAuth extends StObject {
    
    var password: String
    
    var username: String
  }
  object BasicAuth {
    
    inline def apply(password: String, username: String): BasicAuth = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicAuth]
    }
    
    extension [Self <: BasicAuth](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait BearerAuth extends StObject {
    
    var bearer: String
  }
  object BearerAuth {
    
    inline def apply(bearer: String): BearerAuth = {
      val __obj = js.Dynamic.literal(bearer = bearer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BearerAuth]
    }
    
    extension [Self <: BearerAuth](x: Self) {
      
      inline def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
    }
  }
  
  type Context = (Record[String, Any]) | Null
  
  trait DiagnosticResult[TResponse, TContext] extends StObject {
    
    var body: js.UndefOr[TResponse] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var meta: Aborted[TContext]
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var warnings: js.Array[String] | Null
  }
  object DiagnosticResult {
    
    inline def apply[TResponse, TContext](meta: Aborted[TContext]): DiagnosticResult[TResponse, TContext] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], warnings = null)
      __obj.asInstanceOf[DiagnosticResult[TResponse, TContext]]
    }
    
    extension [Self <: DiagnosticResult[?, ?], TResponse, TContext](x: Self & (DiagnosticResult[TResponse, TContext])) {
      
      inline def setBody(value: TResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMeta(value: Aborted[TContext]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  /* Inlined std.Required<@elastic/transport.@elastic/transport/lib/types.DiagnosticResult<TResponse, TContext>> */
  trait DiagnosticResultResponse[TResponse, TContext] extends StObject {
    
    var body: TResponse
    
    var headers: IncomingHttpHeaders
    
    var meta: Aborted[TContext]
    
    var statusCode: Double
    
    var warnings: js.Array[String]
  }
  object DiagnosticResultResponse {
    
    inline def apply[TResponse, TContext](
      body: TResponse,
      headers: IncomingHttpHeaders,
      meta: Aborted[TContext],
      statusCode: Double,
      warnings: js.Array[String]
    ): DiagnosticResultResponse[TResponse, TContext] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticResultResponse[TResponse, TContext]]
    }
    
    extension [Self <: DiagnosticResultResponse[?, ?], TResponse, TContext](x: Self & (DiagnosticResultResponse[TResponse, TContext])) {
      
      inline def setBody(value: TResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Aborted[TContext]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait HttpAgentOptions extends StObject {
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[String | URL_] = js.undefined
    
    var scheduling: js.UndefOr[lifo | fifo] = js.undefined
  }
  object HttpAgentOptions {
    
    inline def apply(): HttpAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpAgentOptions]
    }
    
    extension [Self <: HttpAgentOptions](x: Self) {
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setScheduling(value: lifo | fifo): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    }
  }
  
  type RequestBody[T] = T | String | Buffer | Readable
  
  type RequestNDBody[T] = T | String | js.Array[String] | Buffer | Readable
  
  trait TransportResult[TResponse, TContext]
    extends StObject
       with DiagnosticResult[TResponse, TContext] {
    
    @JSName("body")
    var body_TransportResult: TResponse
    
    @JSName("headers")
    var headers_TransportResult: IncomingHttpHeaders
    
    @JSName("statusCode")
    var statusCode_TransportResult: Double
  }
  object TransportResult {
    
    inline def apply[TResponse, TContext](body: TResponse, headers: IncomingHttpHeaders, meta: Aborted[TContext], statusCode: Double): TransportResult[TResponse, TContext] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = null)
      __obj.asInstanceOf[TransportResult[TResponse, TContext]]
    }
    
    extension [Self <: TransportResult[?, ?], TResponse, TContext](x: Self & (TransportResult[TResponse, TContext])) {
      
      inline def setBody(value: TResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait UndiciAgentOptions extends StObject {
    
    var connections: js.UndefOr[Double] = js.undefined
    
    var keepAliveMaxTimeout: js.UndefOr[Double] = js.undefined
    
    var keepAliveTimeout: js.UndefOr[Double] = js.undefined
    
    var keepAliveTimeoutThreshold: js.UndefOr[Double] = js.undefined
    
    var maxHeaderSize: js.UndefOr[Double] = js.undefined
    
    var pipelining: js.UndefOr[Double] = js.undefined
  }
  object UndiciAgentOptions {
    
    inline def apply(): UndiciAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UndiciAgentOptions]
    }
    
    extension [Self <: UndiciAgentOptions](x: Self) {
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setKeepAliveMaxTimeout(value: Double): Self = StObject.set(x, "keepAliveMaxTimeout", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMaxTimeoutUndefined: Self = StObject.set(x, "keepAliveMaxTimeout", js.undefined)
      
      inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveTimeoutThreshold(value: Double): Self = StObject.set(x, "keepAliveTimeoutThreshold", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveTimeoutThresholdUndefined: Self = StObject.set(x, "keepAliveTimeoutThreshold", js.undefined)
      
      inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setPipelining(value: Double): Self = StObject.set(x, "pipelining", value.asInstanceOf[js.Any])
      
      inline def setPipeliningUndefined: Self = StObject.set(x, "pipelining", js.undefined)
    }
  }
  
  type agentFn = js.Function1[/* opts */ ConnectionOptions, Any]
  
  type generateRequestIdFn = js.Function2[/* params */ TransportRequestParams, /* options */ TransportRequestOptions, Any]
  
  type nodeFilterFn = js.Function1[/* connection */ Connection, Boolean]
  
  type nodeSelectorFn = js.Function1[/* connections */ js.Array[Connection], Connection]
}
