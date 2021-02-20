package typings.elasticElasticsearch

import typings.elasticElasticsearch.anon.Aborted
import typings.elasticElasticsearch.anon.DEFAULT
import typings.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.elasticElasticsearch.errorsMod.ConnectionError
import typings.elasticElasticsearch.errorsMod.NoLivingConnectionsError
import typings.elasticElasticsearch.errorsMod.RequestAbortedError
import typings.elasticElasticsearch.errorsMod.ResponseError
import typings.elasticElasticsearch.errorsMod.TimeoutError
import typings.elasticElasticsearch.poolMod.CloudConnectionPool
import typings.elasticElasticsearch.poolMod.ConnectionPool
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("@elastic/elasticsearch/lib/Transport", JSImport.Default)
  @js.native
  class default protected () extends Transport {
    def this(opts: TransportOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@elastic/elasticsearch/lib/Transport", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch/lib/Transport", "default.sniffReasons")
    @js.native
    def sniffReasons: DEFAULT = js.native
    @scala.inline
    def sniffReasons_=(x: DEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sniffReasons")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticElasticsearch.errorsMod.ConfigurationError
    - typings.elasticElasticsearch.errorsMod.ConnectionError[
  typings.std.Record[java.lang.String, js.Any], 
  typings.elasticElasticsearch.transportMod.Context]
    - typings.elasticElasticsearch.errorsMod.DeserializationError
    - typings.elasticElasticsearch.errorsMod.SerializationError
    - typings.elasticElasticsearch.errorsMod.NoLivingConnectionsError[
  typings.std.Record[java.lang.String, js.Any], 
  typings.elasticElasticsearch.transportMod.Context]
    - typings.elasticElasticsearch.errorsMod.ResponseError[
  typings.std.Record[java.lang.String, js.Any], 
  typings.elasticElasticsearch.transportMod.Context]
    - typings.elasticElasticsearch.errorsMod.TimeoutError[
  typings.std.Record[java.lang.String, js.Any], 
  typings.elasticElasticsearch.transportMod.Context]
    - typings.elasticElasticsearch.errorsMod.RequestAbortedError[
  typings.std.Record[java.lang.String, js.Any], 
  typings.elasticElasticsearch.transportMod.Context]
  */
  type ApiError = _ApiError | (ConnectionError[Record[String, js.Any], Context]) | (NoLivingConnectionsError[Record[String, js.Any], Context]) | (ResponseError[Record[String, js.Any], Context]) | (TimeoutError[Record[String, js.Any], Context]) | (RequestAbortedError[Record[String, js.Any], Context])
  
  type ApiResponse[TResponse, TContext] = RequestEvent[TResponse, TContext]
  
  type Context = (Record[String, js.Any]) | Null
  
  type RequestBody[T] = T | String | Buffer | Readable
  
  @js.native
  trait RequestEvent[TResponse, TContext] extends StObject {
    
    var body: TResponse = js.native
    
    var headers: (Record[String, _]) | Null = js.native
    
    var meta: Aborted[TContext] = js.native
    
    var statusCode: Double | Null = js.native
    
    var warnings: js.Array[String] | Null = js.native
  }
  object RequestEvent {
    
    @scala.inline
    def apply[TResponse, TContext](body: TResponse, meta: Aborted[TContext]): RequestEvent[TResponse, TContext] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEvent[TResponse, TContext]]
    }
    
    @scala.inline
    implicit class RequestEventMutableBuilder[Self <: RequestEvent[_, _], TResponse, TContext] (val x: Self with (RequestEvent[TResponse, TContext])) extends AnyVal {
      
      @scala.inline
      def setBody(value: TResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      @scala.inline
      def setMeta(value: Aborted[TContext]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsNull: Self = StObject.set(x, "warnings", null)
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  type RequestNDBody[T] = T | String | js.Array[String] | Buffer | Readable
  
  @js.native
  trait Transport extends StObject {
    
    var _isSniffing: Boolean = js.native
    
    var _nextSniff: Double = js.native
    
    var _sniffEnabled: Boolean = js.native
    
    var compression: gzip | `false` = js.native
    
    var connectionPool: ConnectionPool | CloudConnectionPool = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    def getConnection(opts: TransportGetConnectionOptions): typings.elasticElasticsearch.connectionMod.default | Null = js.native
    
    var maxRetries: Double = js.native
    
    var opaqueIdPrefix: String | Null = js.native
    
    def request(params: TransportRequestParams): TransportRequestPromise[ApiResponse[Record[String, _], Context]] = js.native
    def request(
      params: TransportRequestParams,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ ApiError, /* result */ ApiResponse[Record[String, _], Context], Unit]
    ): TransportRequestCallback = js.native
    def request(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[Record[String, _], Context]] = js.native
    def request(
      params: TransportRequestParams,
      options: TransportRequestOptions,
      callback: js.Function2[/* err */ ApiError, /* result */ ApiResponse[Record[String, _], Context], Unit]
    ): TransportRequestCallback = js.native
    
    var requestTimeout: Double = js.native
    
    @JSName("request")
    def request_TransportRequestCallback(params: TransportRequestParams): TransportRequestCallback = js.native
    @JSName("request")
    def request_TransportRequestCallback(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestCallback = js.native
    
    var serializer: typings.elasticElasticsearch.serializerMod.default = js.native
    
    def sniff(): Unit = js.native
    def sniff(opts: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def sniff(opts: TransportSniffOptions): Unit = js.native
    def sniff(opts: TransportSniffOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    var sniffEndpoint: String = js.native
    
    var sniffInterval: Double = js.native
    
    var sniffOnConnectionFault: Boolean = js.native
    
    var suggestCompression: Boolean = js.native
  }
  
  @js.native
  trait TransportGetConnectionOptions extends StObject {
    
    var requestId: String = js.native
  }
  object TransportGetConnectionOptions {
    
    @scala.inline
    def apply(requestId: String): TransportGetConnectionOptions = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportGetConnectionOptions]
    }
    
    @scala.inline
    implicit class TransportGetConnectionOptionsMutableBuilder[Self <: TransportGetConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransportOptions extends StObject {
    
    var compression: js.UndefOr[gzip] = js.native
    
    var connectionPool: ConnectionPool | CloudConnectionPool = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var maxRetries: Double = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
    
    var nodeSelector: js.UndefOr[String | nodeSelectorFn] = js.native
    
    var opaqueIdPrefix: js.UndefOr[String] = js.native
    
    var requestTimeout: Double | String = js.native
    
    var serializer: typings.elasticElasticsearch.serializerMod.default = js.native
    
    var sniffEndpoint: String = js.native
    
    var sniffInterval: js.UndefOr[Double] = js.native
    
    var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
    
    var sniffOnStart: js.UndefOr[Boolean] = js.native
    
    var suggestCompression: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait TransportRequestCallback extends StObject {
    
    def abort(): Unit = js.native
  }
  object TransportRequestCallback {
    
    @scala.inline
    def apply(abort: () => Unit): TransportRequestCallback = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[TransportRequestCallback]
    }
    
    @scala.inline
    implicit class TransportRequestCallbackMutableBuilder[Self <: TransportRequestCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TransportRequestOptions extends StObject {
    
    var asStream: js.UndefOr[Boolean] = js.native
    
    var compression: js.UndefOr[gzip] = js.native
    
    var context: js.UndefOr[Context] = js.native
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var id: js.UndefOr[js.Any] = js.native
    
    var ignore: js.UndefOr[js.Array[Double]] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var opaqueId: js.UndefOr[String] = js.native
    
    var querystring: js.UndefOr[Record[String, _]] = js.native
    
    var requestTimeout: js.UndefOr[Double | String] = js.native
    
    var warnings: js.UndefOr[js.Array[String]] = js.native
  }
  object TransportRequestOptions {
    
    @scala.inline
    def apply(): TransportRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportRequestOptions]
    }
    
    @scala.inline
    implicit class TransportRequestOptionsMutableBuilder[Self <: TransportRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsStream(value: Boolean): Self = StObject.set(x, "asStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStreamUndefined: Self = StObject.set(x, "asStream", js.undefined)
      
      @scala.inline
      def setCompression(value: gzip): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextNull: Self = StObject.set(x, "context", null)
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[Double]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: Double*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setOpaqueId(value: String): Self = StObject.set(x, "opaqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpaqueIdUndefined: Self = StObject.set(x, "opaqueId", js.undefined)
      
      @scala.inline
      def setQuerystring(value: Record[String, _]): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
      
      @scala.inline
      def setRequestTimeout(value: Double | String): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransportRequestParams extends StObject {
    
    var body: js.UndefOr[RequestBody[Record[String, _]]] = js.native
    
    var bulkBody: js.UndefOr[RequestNDBody[js.Array[Record[String, _]]]] = js.native
    
    var method: String = js.native
    
    var path: String = js.native
    
    var querystring: js.UndefOr[(Record[String, _]) | String] = js.native
  }
  object TransportRequestParams {
    
    @scala.inline
    def apply(method: String, path: String): TransportRequestParams = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportRequestParams]
    }
    
    @scala.inline
    implicit class TransportRequestParamsMutableBuilder[Self <: TransportRequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: RequestBody[Record[String, _]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setBulkBody(value: RequestNDBody[js.Array[Record[String, _]]]): Self = StObject.set(x, "bulkBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulkBodyUndefined: Self = StObject.set(x, "bulkBody", js.undefined)
      
      @scala.inline
      def setBulkBodyVarargs(value: ((Record[String, js.Any]) | String)*): Self = StObject.set(x, "bulkBody", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystring(value: (Record[String, _]) | String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
  
  @js.native
  trait TransportRequestPromise[T]
    extends js.Promise[T] {
    
    def abort(): Unit = js.native
  }
  
  @js.native
  trait TransportSniffOptions extends StObject {
    
    var reason: String = js.native
    
    var requestId: js.UndefOr[String] = js.native
  }
  object TransportSniffOptions {
    
    @scala.inline
    def apply(reason: String): TransportSniffOptions = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportSniffOptions]
    }
    
    @scala.inline
    implicit class TransportSniffOptionsMutableBuilder[Self <: TransportSniffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    }
  }
  
  trait _ApiError extends StObject
  
  type generateRequestIdFn = js.Function2[/* params */ TransportRequestParams, /* options */ TransportRequestOptions, js.Any]
  
  type nodeFilterFn = js.Function1[/* connection */ typings.elasticElasticsearch.connectionMod.default, Boolean]
  
  type nodeSelectorFn = js.Function1[
    /* connections */ js.Array[typings.elasticElasticsearch.connectionMod.default], 
    typings.elasticElasticsearch.connectionMod.default
  ]
}
