package typings.elasticTransport

import typings.elasticTransport.anon.Accept
import typings.elasticTransport.anon.DEFAULT
import typings.elasticTransport.elasticTransportBooleans.`false`
import typings.elasticTransport.elasticTransportBooleans.`true`
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libPoolMod.BaseConnectionPool
import typings.elasticTransport.libTypesMod.Context
import typings.elasticTransport.libTypesMod.RequestBody
import typings.elasticTransport.libTypesMod.RequestNDBody
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.libTypesMod.generateRequestIdFn
import typings.elasticTransport.libTypesMod.nodeFilterFn
import typings.elasticTransport.libTypesMod.nodeSelectorFn
import typings.node.httpMod.IncomingHttpHeaders
import typings.std.AbortSignal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransportMod {
  
  @JSImport("@elastic/transport/lib/Transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@elastic/transport/lib/Transport", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Transport {
    def this(opts: TransportOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@elastic/transport/lib/Transport", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport/lib/Transport", "default.sniffReasons")
    @js.native
    def sniffReasons: DEFAULT = js.native
    inline def sniffReasons_=(x: DEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sniffReasons")(x.asInstanceOf[js.Any])
  }
  
  inline def generateRequestId(): generateRequestIdFn = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestId")().asInstanceOf[generateRequestIdFn]
  
  inline def lowerCaseHeaders(): IncomingHttpHeaders | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerCaseHeaders")().asInstanceOf[IncomingHttpHeaders | Null]
  inline def lowerCaseHeaders(oldHeaders: IncomingHttpHeaders): IncomingHttpHeaders | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerCaseHeaders")(oldHeaders.asInstanceOf[js.Any]).asInstanceOf[IncomingHttpHeaders | Null]
  
  trait GetConnectionOptions extends StObject {
    
    var context: Any
    
    var requestId: String | Double
  }
  object GetConnectionOptions {
    
    inline def apply(context: Any, requestId: String | Double): GetConnectionOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String | Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SniffOptions extends StObject {
    
    var context: Any
    
    var reason: String
    
    var requestId: js.UndefOr[String | Double] = js.undefined
  }
  object SniffOptions {
    
    inline def apply(context: Any, reason: String): SniffOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[SniffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SniffOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String | Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    }
  }
  
  @js.native
  trait Transport extends StObject {
    
    def connectionPool: BaseConnectionPool = js.native
    
    def diagnostic: typings.elasticTransport.libDiagnosticMod.default = js.native
    
    def getConnection(opts: GetConnectionOptions): Connection | Null = js.native
    
    def isSniffing: Boolean = js.native
    def isSniffing_=(`val`: Boolean): Unit = js.native
    
    def nextSniff: Double | Null = js.native
    
    def request[TResponse](params: TransportRequestParams): js.Promise[TResponse] = js.native
    def request[TResponse](params: TransportRequestParams, options: TransportRequestOptions): js.Promise[TResponse] = js.native
    def request[TResponse](params: TransportRequestParams, options: TransportRequestOptionsWithOutMeta): js.Promise[TResponse] = js.native
    def request[TResponse, TContext](params: TransportRequestParams, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TResponse, TContext]] = js.native
    @JSName("request")
    def request_TResponseTContext[TResponse, TContext](params: TransportRequestParams): js.Promise[TransportResult[TResponse, TContext]] = js.native
    
    def sniff(opts: SniffOptions): Unit = js.native
    
    def sniffEnabled: Boolean = js.native
    
    def sniffEndpoint: String | Null = js.native
  }
  
  trait TransportOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var connectionPool: BaseConnectionPool
    
    var context: js.UndefOr[Context] = js.undefined
    
    var diagnostic: js.UndefOr[typings.elasticTransport.libDiagnosticMod.default] = js.undefined
    
    var generateRequestId: js.UndefOr[generateRequestIdFn] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var maxCompressedResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String | js.Symbol] = js.undefined
    
    var nodeFilter: js.UndefOr[nodeFilterFn] = js.undefined
    
    var nodeSelector: js.UndefOr[nodeSelectorFn] = js.undefined
    
    var opaqueIdPrefix: js.UndefOr[String] = js.undefined
    
    var productCheck: js.UndefOr[String] = js.undefined
    
    var requestTimeout: js.UndefOr[Double | String] = js.undefined
    
    var serializer: js.UndefOr[typings.elasticTransport.libSerializerMod.default] = js.undefined
    
    var sniffEndpoint: js.UndefOr[String] = js.undefined
    
    var sniffInterval: js.UndefOr[Double | Boolean] = js.undefined
    
    var sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined
    
    var sniffOnStart: js.UndefOr[Boolean] = js.undefined
    
    var vendoredHeaders: js.UndefOr[Accept] = js.undefined
  }
  object TransportOptions {
    
    inline def apply(connectionPool: BaseConnectionPool): TransportOptions = {
      val __obj = js.Dynamic.literal(connectionPool = connectionPool.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setConnectionPool(value: BaseConnectionPool): Self = StObject.set(x, "connectionPool", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDiagnostic(value: typings.elasticTransport.libDiagnosticMod.default): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
      
      inline def setGenerateRequestId(value: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => Any): Self = StObject.set(x, "generateRequestId", js.Any.fromFunction2(value))
      
      inline def setGenerateRequestIdUndefined: Self = StObject.set(x, "generateRequestId", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxCompressedResponseSize(value: Double): Self = StObject.set(x, "maxCompressedResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCompressedResponseSizeUndefined: Self = StObject.set(x, "maxCompressedResponseSize", js.undefined)
      
      inline def setMaxResponseSize(value: Double): Self = StObject.set(x, "maxResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseSizeUndefined: Self = StObject.set(x, "maxResponseSize", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodeFilter(value: /* connection */ Connection => Boolean): Self = StObject.set(x, "nodeFilter", js.Any.fromFunction1(value))
      
      inline def setNodeFilterUndefined: Self = StObject.set(x, "nodeFilter", js.undefined)
      
      inline def setNodeSelector(value: /* connections */ js.Array[Connection] => Connection): Self = StObject.set(x, "nodeSelector", js.Any.fromFunction1(value))
      
      inline def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
      
      inline def setOpaqueIdPrefix(value: String): Self = StObject.set(x, "opaqueIdPrefix", value.asInstanceOf[js.Any])
      
      inline def setOpaqueIdPrefixUndefined: Self = StObject.set(x, "opaqueIdPrefix", js.undefined)
      
      inline def setProductCheck(value: String): Self = StObject.set(x, "productCheck", value.asInstanceOf[js.Any])
      
      inline def setProductCheckUndefined: Self = StObject.set(x, "productCheck", js.undefined)
      
      inline def setRequestTimeout(value: Double | String): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSerializer(value: typings.elasticTransport.libSerializerMod.default): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      inline def setSniffEndpoint(value: String): Self = StObject.set(x, "sniffEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSniffEndpointUndefined: Self = StObject.set(x, "sniffEndpoint", js.undefined)
      
      inline def setSniffInterval(value: Double | Boolean): Self = StObject.set(x, "sniffInterval", value.asInstanceOf[js.Any])
      
      inline def setSniffIntervalUndefined: Self = StObject.set(x, "sniffInterval", js.undefined)
      
      inline def setSniffOnConnectionFault(value: Boolean): Self = StObject.set(x, "sniffOnConnectionFault", value.asInstanceOf[js.Any])
      
      inline def setSniffOnConnectionFaultUndefined: Self = StObject.set(x, "sniffOnConnectionFault", js.undefined)
      
      inline def setSniffOnStart(value: Boolean): Self = StObject.set(x, "sniffOnStart", value.asInstanceOf[js.Any])
      
      inline def setSniffOnStartUndefined: Self = StObject.set(x, "sniffOnStart", js.undefined)
      
      inline def setVendoredHeaders(value: Accept): Self = StObject.set(x, "vendoredHeaders", value.asInstanceOf[js.Any])
      
      inline def setVendoredHeadersUndefined: Self = StObject.set(x, "vendoredHeaders", js.undefined)
    }
  }
  
  trait TransportRequestOptions extends StObject {
    
    var asStream: js.UndefOr[Boolean] = js.undefined
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[Context] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var id: js.UndefOr[Any] = js.undefined
    
    var ignore: js.UndefOr[js.Array[Double]] = js.undefined
    
    var maxCompressedResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Warning: If you set meta to true the result will no longer be
      * the response body, but an object containing the body, statusCode,
      * headers and meta keys.
      * You can use the destructuring assignment to update your code without
      * refactoring the entire code base:
      * From:
      * ```
      * const result = await client.method(params)
      * ```
      * To:
      * ```
      * const {
      *   body: result,
      *   statusCode,
      *   headers,
      *   meta
      * } = await client.method(params, { meta: true })
      * ```
      */
    var meta: js.UndefOr[Boolean] = js.undefined
    
    var opaqueId: js.UndefOr[String] = js.undefined
    
    var querystring: js.UndefOr[Record[String, Any]] = js.undefined
    
    var requestTimeout: js.UndefOr[Double | String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TransportRequestOptions {
    
    inline def apply(): TransportRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAsStream(value: Boolean): Self = StObject.set(x, "asStream", value.asInstanceOf[js.Any])
      
      inline def setAsStreamUndefined: Self = StObject.set(x, "asStream", js.undefined)
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIgnore(value: js.Array[Double]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: Double*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMaxCompressedResponseSize(value: Double): Self = StObject.set(x, "maxCompressedResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCompressedResponseSizeUndefined: Self = StObject.set(x, "maxCompressedResponseSize", js.undefined)
      
      inline def setMaxResponseSize(value: Double): Self = StObject.set(x, "maxResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseSizeUndefined: Self = StObject.set(x, "maxResponseSize", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setOpaqueId(value: String): Self = StObject.set(x, "opaqueId", value.asInstanceOf[js.Any])
      
      inline def setOpaqueIdUndefined: Self = StObject.set(x, "opaqueId", js.undefined)
      
      inline def setQuerystring(value: Record[String, Any]): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
      
      inline def setRequestTimeout(value: Double | String): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait TransportRequestOptionsWithMeta
    extends StObject
       with TransportRequestOptions {
    
    @JSName("meta")
    var meta_TransportRequestOptionsWithMeta: `true`
  }
  object TransportRequestOptionsWithMeta {
    
    inline def apply(): TransportRequestOptionsWithMeta = {
      val __obj = js.Dynamic.literal(meta = true)
      __obj.asInstanceOf[TransportRequestOptionsWithMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportRequestOptionsWithMeta] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: `true`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportRequestOptionsWithOutMeta
    extends StObject
       with TransportRequestOptions {
    
    @JSName("meta")
    var meta_TransportRequestOptionsWithOutMeta: `false`
  }
  object TransportRequestOptionsWithOutMeta {
    
    inline def apply(): TransportRequestOptionsWithOutMeta = {
      val __obj = js.Dynamic.literal(meta = false)
      __obj.asInstanceOf[TransportRequestOptionsWithOutMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportRequestOptionsWithOutMeta] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: `false`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportRequestParams extends StObject {
    
    var body: js.UndefOr[RequestBody[Record[String, Any]]] = js.undefined
    
    var bulkBody: js.UndefOr[RequestNDBody[js.Array[Record[String, Any]]]] = js.undefined
    
    var method: String
    
    var path: String
    
    var querystring: js.UndefOr[(Record[String, Any]) | String] = js.undefined
  }
  object TransportRequestParams {
    
    inline def apply(method: String, path: String): TransportRequestParams = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportRequestParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportRequestParams] (val x: Self) extends AnyVal {
      
      inline def setBody(value: RequestBody[Record[String, Any]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBulkBody(value: RequestNDBody[js.Array[Record[String, Any]]]): Self = StObject.set(x, "bulkBody", value.asInstanceOf[js.Any])
      
      inline def setBulkBodyUndefined: Self = StObject.set(x, "bulkBody", js.undefined)
      
      inline def setBulkBodyVarargs(value: ((Record[String, Any]) | String)*): Self = StObject.set(x, "bulkBody", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuerystring(value: (Record[String, Any]) | String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
}
