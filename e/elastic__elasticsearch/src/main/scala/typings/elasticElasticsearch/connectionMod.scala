package typings.elasticElasticsearch

import typings.elasticElasticsearch.anon.ALIVE
import typings.elasticElasticsearch.anon.DATA_
import typings.elasticElasticsearch.poolMod.ApiKeyAuth
import typings.elasticElasticsearch.poolMod.BasicAuth
import typings.hpagent.mod.HttpProxyAgent
import typings.hpagent.mod.HttpsProxyAgent
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.node.urlMod.URL_
import typings.node.utilMod.InspectOptions
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("@elastic/elasticsearch/lib/Connection", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Connection {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@elastic/elasticsearch/lib/Connection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch/lib/Connection", "default.roles")
    @js.native
    def roles: DATA_ = js.native
    inline def roles_=(x: DATA_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roles")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch/lib/Connection", "default.statuses")
    @js.native
    def statuses: ALIVE = js.native
    inline def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  trait AgentOptions extends StObject {
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    var maxSockets: js.UndefOr[Double] = js.undefined
  }
  object AgentOptions {
    
    inline def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    extension [Self <: AgentOptions](x: Self) {
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    def apply(`object`: js.Any, options: InspectOptions): String = js.native
    
    var _agent: Agent | typings.node.httpsMod.Agent | HttpProxyAgent | HttpsProxyAgent = js.native
    
    var _openRequests: Double = js.native
    
    var _status: String = js.native
    
    def buildRequestObject(params: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: node.http.ClientRequestArgs[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inspect.custom * / any] */ js.Any = js.native
    
    def close(): Connection = js.native
    
    var deadCount: Double = js.native
    
    var headers: Record[String, js.Any] = js.native
    
    var id: String = js.native
    
    var makeRequest: js.Any = js.native
    
    def request(
      params: RequestOptions,
      callback: js.Function2[/* err */ Error | Null, /* response */ IncomingMessage | Null, Unit]
    ): ClientRequest = js.native
    
    var resurrectTimeout: Double = js.native
    
    var roles: ConnectionRoles = js.native
    
    def setRole(role: String, enabled: Boolean): Connection = js.native
    
    var ssl: typings.node.tlsMod.ConnectionOptions | Null = js.native
    
    var status: String = js.native
    
    def toJSON(): js.Any = js.native
    
    var url: URL_ = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var agent: js.UndefOr[AgentOptions | agentFn] = js.undefined
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.undefined
    
    var headers: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[String | URL_] = js.undefined
    
    var roles: js.UndefOr[ConnectionRoles] = js.undefined
    
    var ssl: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var url: URL_
  }
  object ConnectionOptions {
    
    inline def apply(url: URL_): ConnectionOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setAgent(value: AgentOptions | agentFn): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* opts */ ConnectionOptions => js.Any): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: BasicAuth | ApiKeyAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHeaders(value: Record[String, js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRoles(value: ConnectionRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      inline def setSsl(value: typings.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionRoles extends StObject {
    
    var data: js.UndefOr[Boolean] = js.undefined
    
    var ingest: js.UndefOr[Boolean] = js.undefined
    
    var master: js.UndefOr[Boolean] = js.undefined
    
    var ml: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectionRoles {
    
    inline def apply(): ConnectionRoles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionRoles]
    }
    
    extension [Self <: ConnectionRoles](x: Self) {
      
      inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIngest(value: Boolean): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
      
      inline def setIngestUndefined: Self = StObject.set(x, "ingest", js.undefined)
      
      inline def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      inline def setMl(value: Boolean): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    }
  }
  
  trait RequestOptions
    extends StObject
       with ClientRequestArgs {
    
    var asStream: js.UndefOr[Boolean] = js.undefined
    
    var body: js.UndefOr[String | Buffer | Readable | Null] = js.undefined
    
    var querystring: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAsStream(value: Boolean): Self = StObject.set(x, "asStream", value.asInstanceOf[js.Any])
      
      inline def setAsStreamUndefined: Self = StObject.set(x, "asStream", js.undefined)
      
      inline def setBody(value: String | Buffer | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
  
  type agentFn = js.Function1[/* opts */ ConnectionOptions, js.Any]
}
