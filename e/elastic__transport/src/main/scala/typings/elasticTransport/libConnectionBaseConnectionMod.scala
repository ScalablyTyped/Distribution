package typings.elasticTransport

import typings.elasticTransport.anon.ALIVE
import typings.elasticTransport.elasticTransportBooleans.`true`
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libTypesMod.ApiKeyAuth
import typings.elasticTransport.libTypesMod.BasicAuth
import typings.elasticTransport.libTypesMod.BearerAuth
import typings.elasticTransport.libTypesMod.HttpAgentOptions
import typings.elasticTransport.libTypesMod.UndiciAgentOptions
import typings.elasticTransport.libTypesMod.agentFn
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.tlsMod.DetailedPeerCertificate
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL_
import typings.std.AbortSignal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionBaseConnectionMod {
  
  @JSImport("@elastic/transport/lib/connection/BaseConnection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@elastic/transport/lib/connection/BaseConnection", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BaseConnection
       with Connection {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@elastic/transport/lib/connection/BaseConnection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport/lib/connection/BaseConnection", "default.statuses")
    @js.native
    def statuses: ALIVE = js.native
    inline def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  inline def getIssuerCertificate(socket: TLSSocket): DetailedPeerCertificate | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIssuerCertificate")(socket.asInstanceOf[js.Any]).asInstanceOf[DetailedPeerCertificate | Null]
  
  inline def prepareHeaders(): IncomingHttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")().asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: Unit, auth: ApiKeyAuth): IncomingHttpHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: Unit, auth: BasicAuth): IncomingHttpHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: Unit, auth: BearerAuth): IncomingHttpHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: IncomingHttpHeaders): IncomingHttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: IncomingHttpHeaders, auth: ApiKeyAuth): IncomingHttpHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: IncomingHttpHeaders, auth: BasicAuth): IncomingHttpHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[IncomingHttpHeaders]
  inline def prepareHeaders(headers: IncomingHttpHeaders, auth: BearerAuth): IncomingHttpHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareHeaders")(headers.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[IncomingHttpHeaders]
  
  @js.native
  trait BaseConnection extends StObject {
    
    var _openRequests: Double = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var deadCount: Double = js.native
    
    def diagnostic: typings.elasticTransport.libDiagnosticMod.default = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var id: String = js.native
    
    def request(params: ConnectionRequestParams, options: ConnectionRequestOptions): js.Promise[ConnectionRequestResponse] = js.native
    def request(params: ConnectionRequestParams, options: ConnectionRequestOptionsAsStream): js.Promise[ConnectionRequestResponseAsStream] = js.native
    
    var resurrectTimeout: Double = js.native
    
    def status: String = js.native
    def status_=(status: String): Unit = js.native
    
    var timeout: Double = js.native
    
    var tls: typings.node.tlsMod.ConnectionOptions | Null = js.native
    
    def toJSON(): Record[String, Any] = js.native
    
    var url: URL_ = js.native
    
    var weight: Double = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var agent: js.UndefOr[HttpAgentOptions | UndiciAgentOptions | agentFn | Boolean] = js.undefined
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth | BearerAuth] = js.undefined
    
    var caFingerprint: js.UndefOr[String] = js.undefined
    
    var diagnostic: js.UndefOr[typings.elasticTransport.libDiagnosticMod.default] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[String | URL_] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tls: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.undefined
    
    var url: URL_
  }
  object ConnectionOptions {
    
    inline def apply(url: URL_): ConnectionOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: HttpAgentOptions | UndiciAgentOptions | agentFn | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* opts */ ConnectionOptions => Any): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: BasicAuth | ApiKeyAuth | BearerAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCaFingerprint(value: String): Self = StObject.set(x, "caFingerprint", value.asInstanceOf[js.Any])
      
      inline def setCaFingerprintUndefined: Self = StObject.set(x, "caFingerprint", js.undefined)
      
      inline def setDiagnostic(value: typings.elasticTransport.libDiagnosticMod.default): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTls(value: typings.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionRequestOptions extends StObject {
    
    var context: Any
    
    var maxCompressedResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxResponseSize: js.UndefOr[Double] = js.undefined
    
    var name: String | js.Symbol
    
    var requestId: String | Double
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectionRequestOptions {
    
    inline def apply(context: Any, name: String | js.Symbol, requestId: String | Double): ConnectionRequestOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMaxCompressedResponseSize(value: Double): Self = StObject.set(x, "maxCompressedResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCompressedResponseSizeUndefined: Self = StObject.set(x, "maxCompressedResponseSize", js.undefined)
      
      inline def setMaxResponseSize(value: Double): Self = StObject.set(x, "maxResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseSizeUndefined: Self = StObject.set(x, "maxResponseSize", js.undefined)
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String | Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ConnectionRequestOptionsAsStream
    extends StObject
       with ConnectionRequestOptions {
    
    var asStream: `true`
  }
  object ConnectionRequestOptionsAsStream {
    
    inline def apply(context: Any, name: String | js.Symbol, requestId: String | Double): ConnectionRequestOptionsAsStream = {
      val __obj = js.Dynamic.literal(asStream = true, context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestOptionsAsStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionRequestOptionsAsStream] (val x: Self) extends AnyVal {
      
      inline def setAsStream(value: `true`): Self = StObject.set(x, "asStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionRequestParams extends StObject {
    
    var body: js.UndefOr[String | Buffer | Readable | Null] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var method: String
    
    var path: String
    
    var querystring: js.UndefOr[String] = js.undefined
  }
  object ConnectionRequestParams {
    
    inline def apply(method: String, path: String): ConnectionRequestParams = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionRequestParams] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String | Buffer | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
  
  trait ConnectionRequestResponse extends StObject {
    
    var body: String | Buffer
    
    var headers: IncomingHttpHeaders
    
    var statusCode: Double
  }
  object ConnectionRequestResponse {
    
    inline def apply(body: String | Buffer, headers: IncomingHttpHeaders, statusCode: Double): ConnectionRequestResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionRequestResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionRequestResponseAsStream extends StObject {
    
    var body: Readable
    
    var headers: IncomingHttpHeaders
    
    var statusCode: Double
  }
  object ConnectionRequestResponseAsStream {
    
    inline def apply(body: Readable, headers: IncomingHttpHeaders, statusCode: Double): ConnectionRequestResponseAsStream = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestResponseAsStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionRequestResponseAsStream] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
