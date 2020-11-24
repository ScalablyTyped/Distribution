package typings.elasticElasticsearch.mod

import org.scalablytyped.runtime.Instantiable0
import typings.elasticElasticsearch.anon.Id
import typings.elasticElasticsearch.anon.TypeofConnection
import typings.elasticElasticsearch.anon.TypeofConnectionPool
import typings.elasticElasticsearch.anon.TypeofTransport
import typings.elasticElasticsearch.connectionMod.AgentOptions
import typings.elasticElasticsearch.connectionMod.agentFn
import typings.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typings.elasticElasticsearch.elasticElasticsearchStrings.ping
import typings.elasticElasticsearch.poolMod.ApiKeyAuth
import typings.elasticElasticsearch.poolMod.BasicAuth
import typings.elasticElasticsearch.serializerMod.default
import typings.elasticElasticsearch.transportMod.Context
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import typings.elasticElasticsearch.transportMod.generateRequestIdFn
import typings.elasticElasticsearch.transportMod.nodeFilterFn
import typings.elasticElasticsearch.transportMod.nodeSelectorFn
import typings.node.tlsMod.ConnectionOptions
import typings.node.urlMod.URL_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var Connection: js.UndefOr[TypeofConnection] = js.native
  
  var ConnectionPool: js.UndefOr[TypeofConnectionPool] = js.native
  
  var Serializer: js.UndefOr[Instantiable0[default]] = js.native
  
  var Transport: js.UndefOr[TypeofTransport] = js.native
  
  var agent: js.UndefOr[AgentOptions | agentFn | `false`] = js.native
  
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
  
  var cloud: js.UndefOr[Id] = js.native
  
  var compression: js.UndefOr[gzip] = js.native
  
  var context: js.UndefOr[Context] = js.native
  
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
  
  var headers: js.UndefOr[Record[String, _]] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String | js.Symbol] = js.native
  
  var node: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.native
  
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
  
  var nodeSelector: js.UndefOr[nodeSelectorFn | String] = js.native
  
  var nodes: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.native
  
  var opaqueIdPrefix: js.UndefOr[String] = js.native
  
  var pingTimeout: js.UndefOr[Double] = js.native
  
  var proxy: js.UndefOr[String | URL_] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.native
  
  var sniffEndpoint: js.UndefOr[String] = js.native
  
  var sniffInterval: js.UndefOr[Double | Boolean] = js.native
  
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
  
  var sniffOnStart: js.UndefOr[Boolean] = js.native
  
  var ssl: js.UndefOr[ConnectionOptions] = js.native
  
  var suggestCompression: js.UndefOr[Boolean] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection(value: TypeofConnection): Self = this.set("Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("Connection", js.undefined)
    
    @scala.inline
    def setConnectionPool(value: TypeofConnectionPool): Self = this.set("ConnectionPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPool: Self = this.set("ConnectionPool", js.undefined)
    
    @scala.inline
    def setSerializer(value: Instantiable0[default]): Self = this.set("Serializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializer: Self = this.set("Serializer", js.undefined)
    
    @scala.inline
    def setTransport(value: TypeofTransport): Self = this.set("Transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("Transport", js.undefined)
    
    @scala.inline
    def setAgentFunction1(value: /* opts */ typings.elasticElasticsearch.connectionMod.ConnectionOptions => js.Any): Self = this.set("agent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAgent(value: AgentOptions | agentFn | `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAuth(value: BasicAuth | ApiKeyAuth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCloud(value: Id): Self = this.set("cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloud: Self = this.set("cloud", js.undefined)
    
    @scala.inline
    def setCompression(value: gzip): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setGenerateRequestId(value: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => js.Any): Self = this.set("generateRequestId", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGenerateRequestId: Self = this.set("generateRequestId", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setName(value: String | js.Symbol): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeVarargs(value: (NodeOptions | String)*): Self = this.set("node", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setNodeFilter(value: /* connection */ typings.elasticElasticsearch.connectionMod.default => Boolean): Self = this.set("nodeFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNodeFilter: Self = this.set("nodeFilter", js.undefined)
    
    @scala.inline
    def setNodeSelectorFunction1(
      value: /* connections */ js.Array[typings.elasticElasticsearch.connectionMod.default] => typings.elasticElasticsearch.connectionMod.default
    ): Self = this.set("nodeSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNodeSelector(value: nodeSelectorFn | String): Self = this.set("nodeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeSelector: Self = this.set("nodeSelector", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: (NodeOptions | String)*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setOpaqueIdPrefix(value: String): Self = this.set("opaqueIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpaqueIdPrefix: Self = this.set("opaqueIdPrefix", js.undefined)
    
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    
    @scala.inline
    def setProxy(value: String | URL_): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setResurrectStrategy(value: ping | optimistic | none): Self = this.set("resurrectStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResurrectStrategy: Self = this.set("resurrectStrategy", js.undefined)
    
    @scala.inline
    def setSniffEndpoint(value: String): Self = this.set("sniffEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSniffEndpoint: Self = this.set("sniffEndpoint", js.undefined)
    
    @scala.inline
    def setSniffInterval(value: Double | Boolean): Self = this.set("sniffInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSniffInterval: Self = this.set("sniffInterval", js.undefined)
    
    @scala.inline
    def setSniffOnConnectionFault(value: Boolean): Self = this.set("sniffOnConnectionFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSniffOnConnectionFault: Self = this.set("sniffOnConnectionFault", js.undefined)
    
    @scala.inline
    def setSniffOnStart(value: Boolean): Self = this.set("sniffOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSniffOnStart: Self = this.set("sniffOnStart", js.undefined)
    
    @scala.inline
    def setSsl(value: ConnectionOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSuggestCompression(value: Boolean): Self = this.set("suggestCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestCompression: Self = this.set("suggestCompression", js.undefined)
  }
}
