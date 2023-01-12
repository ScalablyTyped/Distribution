package typings.elasticElasticsearch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.elasticElasticsearch.anon.IdString
import typings.elasticElasticsearch.anon.Ingest
import typings.elasticElasticsearch.anon.TypeofBaseConnection
import typings.elasticElasticsearch.anon.TypeofTransport
import typings.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.constructor
import typings.elasticElasticsearch.elasticElasticsearchStrings.none_
import typings.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typings.elasticElasticsearch.elasticElasticsearchStrings.ping
import typings.elasticElasticsearch.elasticElasticsearchStrings.proto
import typings.elasticElasticsearch.libApiMod.API
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestParams
import typings.elasticTransport.libTypesMod.ApiKeyAuth
import typings.elasticTransport.libTypesMod.BasicAuth
import typings.elasticTransport.libTypesMod.BearerAuth
import typings.elasticTransport.libTypesMod.Context
import typings.elasticTransport.libTypesMod.HttpAgentOptions
import typings.elasticTransport.libTypesMod.UndiciAgentOptions
import typings.elasticTransport.libTypesMod.agentFn
import typings.elasticTransport.libTypesMod.generateRequestIdFn
import typings.elasticTransport.libTypesMod.nodeFilterFn
import typings.elasticTransport.libTypesMod.nodeSelectorFn
import typings.elasticTransport.mod.BaseConnectionPool
import typings.elasticTransport.mod.Diagnostic
import typings.elasticTransport.mod.Serializer
import typings.node.tlsMod.ConnectionOptions
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("@elastic/elasticsearch/lib/client", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Client {
    def this(opts: ClientOptions) = this()
  }
  
  @js.native
  trait Client
    extends StObject
       with API {
    
    def child(opts: ClientOptions): Client = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var connectionPool: BaseConnectionPool = js.native
    
    var diagnostic: Diagnostic = js.native
    
    var helpers: typings.elasticElasticsearch.libHelpersMod.default = js.native
    
    var name: String | js.Symbol = js.native
    
    var serializer: Serializer = js.native
    
    var transport: typings.elasticElasticsearch.libSniffingTransportMod.default = js.native
  }
  
  trait ClientOptions extends StObject {
    
    var Connection: js.UndefOr[TypeofBaseConnection] = js.undefined
    
    var ConnectionPool: js.UndefOr[Instantiable1[/* opts */ ConnectionPoolOptions, BaseConnectionPool]] = js.undefined
    
    var Serializer: js.UndefOr[Instantiable0[typings.elasticTransport.mod.Serializer]] = js.undefined
    
    var Transport: js.UndefOr[TypeofTransport] = js.undefined
    
    var agent: js.UndefOr[HttpAgentOptions | UndiciAgentOptions | agentFn | `false`] = js.undefined
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth | BearerAuth] = js.undefined
    
    var caFingerprint: js.UndefOr[String] = js.undefined
    
    var cloud: js.UndefOr[IdString] = js.undefined
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[Context] = js.undefined
    
    var disablePrototypePoisoningProtection: js.UndefOr[Boolean | proto | constructor] = js.undefined
    
    var enableMetaHeader: js.UndefOr[Boolean] = js.undefined
    
    var generateRequestId: js.UndefOr[generateRequestIdFn] = js.undefined
    
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    var maxCompressedResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxResponseSize: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String | js.Symbol] = js.undefined
    
    var node: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.undefined
    
    var nodeFilter: js.UndefOr[nodeFilterFn] = js.undefined
    
    var nodeSelector: js.UndefOr[nodeSelectorFn] = js.undefined
    
    var nodes: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.undefined
    
    var opaqueIdPrefix: js.UndefOr[String] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[String | URL_] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var resurrectStrategy: js.UndefOr[ping | optimistic | none_] = js.undefined
    
    var sniffEndpoint: js.UndefOr[String] = js.undefined
    
    var sniffInterval: js.UndefOr[Double | Boolean] = js.undefined
    
    var sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined
    
    var sniffOnStart: js.UndefOr[Boolean] = js.undefined
    
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: HttpAgentOptions | UndiciAgentOptions | agentFn | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* opts */ typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions => Any): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: BasicAuth | ApiKeyAuth | BearerAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCaFingerprint(value: String): Self = StObject.set(x, "caFingerprint", value.asInstanceOf[js.Any])
      
      inline def setCaFingerprintUndefined: Self = StObject.set(x, "caFingerprint", js.undefined)
      
      inline def setCloud(value: IdString): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
      
      inline def setCloudUndefined: Self = StObject.set(x, "cloud", js.undefined)
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setConnection(value: TypeofBaseConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionPool(value: Instantiable1[/* opts */ ConnectionPoolOptions, BaseConnectionPool]): Self = StObject.set(x, "ConnectionPool", value.asInstanceOf[js.Any])
      
      inline def setConnectionPoolUndefined: Self = StObject.set(x, "ConnectionPool", js.undefined)
      
      inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDisablePrototypePoisoningProtection(value: Boolean | proto | constructor): Self = StObject.set(x, "disablePrototypePoisoningProtection", value.asInstanceOf[js.Any])
      
      inline def setDisablePrototypePoisoningProtectionUndefined: Self = StObject.set(x, "disablePrototypePoisoningProtection", js.undefined)
      
      inline def setEnableMetaHeader(value: Boolean): Self = StObject.set(x, "enableMetaHeader", value.asInstanceOf[js.Any])
      
      inline def setEnableMetaHeaderUndefined: Self = StObject.set(x, "enableMetaHeader", js.undefined)
      
      inline def setGenerateRequestId(value: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => Any): Self = StObject.set(x, "generateRequestId", js.Any.fromFunction2(value))
      
      inline def setGenerateRequestIdUndefined: Self = StObject.set(x, "generateRequestId", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxCompressedResponseSize(value: Double): Self = StObject.set(x, "maxCompressedResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCompressedResponseSizeUndefined: Self = StObject.set(x, "maxCompressedResponseSize", js.undefined)
      
      inline def setMaxResponseSize(value: Double): Self = StObject.set(x, "maxResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseSizeUndefined: Self = StObject.set(x, "maxResponseSize", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNode(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeFilter(value: /* connection */ Connection => Boolean): Self = StObject.set(x, "nodeFilter", js.Any.fromFunction1(value))
      
      inline def setNodeFilterUndefined: Self = StObject.set(x, "nodeFilter", js.undefined)
      
      inline def setNodeSelector(value: /* connections */ js.Array[Connection] => Connection): Self = StObject.set(x, "nodeSelector", js.Any.fromFunction1(value))
      
      inline def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setNodeVarargs(value: (NodeOptions | String)*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setNodes(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: (NodeOptions | String)*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOpaqueIdPrefix(value: String): Self = StObject.set(x, "opaqueIdPrefix", value.asInstanceOf[js.Any])
      
      inline def setOpaqueIdPrefixUndefined: Self = StObject.set(x, "opaqueIdPrefix", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setResurrectStrategy(value: ping | optimistic | none_): Self = StObject.set(x, "resurrectStrategy", value.asInstanceOf[js.Any])
      
      inline def setResurrectStrategyUndefined: Self = StObject.set(x, "resurrectStrategy", js.undefined)
      
      inline def setSerializer(value: Instantiable0[Serializer]): Self = StObject.set(x, "Serializer", value.asInstanceOf[js.Any])
      
      inline def setSerializerUndefined: Self = StObject.set(x, "Serializer", js.undefined)
      
      inline def setSniffEndpoint(value: String): Self = StObject.set(x, "sniffEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSniffEndpointUndefined: Self = StObject.set(x, "sniffEndpoint", js.undefined)
      
      inline def setSniffInterval(value: Double | Boolean): Self = StObject.set(x, "sniffInterval", value.asInstanceOf[js.Any])
      
      inline def setSniffIntervalUndefined: Self = StObject.set(x, "sniffInterval", js.undefined)
      
      inline def setSniffOnConnectionFault(value: Boolean): Self = StObject.set(x, "sniffOnConnectionFault", value.asInstanceOf[js.Any])
      
      inline def setSniffOnConnectionFaultUndefined: Self = StObject.set(x, "sniffOnConnectionFault", js.undefined)
      
      inline def setSniffOnStart(value: Boolean): Self = StObject.set(x, "sniffOnStart", value.asInstanceOf[js.Any])
      
      inline def setSniffOnStartUndefined: Self = StObject.set(x, "sniffOnStart", js.undefined)
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setTransport(value: TypeofTransport): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "Transport", js.undefined)
    }
  }
  
  trait NodeOptions extends StObject {
    
    var agent: js.UndefOr[HttpAgentOptions | UndiciAgentOptions] = js.undefined
    
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var roles: js.UndefOr[Ingest] = js.undefined
    
    var ssl: js.UndefOr[ConnectionOptions] = js.undefined
    
    var url: URL_
  }
  object NodeOptions {
    
    inline def apply(url: URL_): NodeOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: HttpAgentOptions | UndiciAgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRoles(value: Ingest): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      inline def setSsl(value: ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
