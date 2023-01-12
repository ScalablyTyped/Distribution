package typings.elasticTransport

import typings.elasticTransport.anon.TypeofBaseConnection
import typings.elasticTransport.elasticTransportBooleans.`false`
import typings.elasticTransport.elasticTransportStrings.none
import typings.elasticTransport.elasticTransportStrings.optimistic
import typings.elasticTransport.elasticTransportStrings.ping
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libTypesMod.ApiKeyAuth
import typings.elasticTransport.libTypesMod.BasicAuth
import typings.elasticTransport.libTypesMod.BearerAuth
import typings.elasticTransport.libTypesMod.HttpAgentOptions
import typings.elasticTransport.libTypesMod.UndiciAgentOptions
import typings.elasticTransport.libTypesMod.agentFn
import typings.elasticTransport.libTypesMod.nodeFilterFn
import typings.elasticTransport.libTypesMod.nodeSelectorFn
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPoolBaseConnectionPoolMod {
  
  @JSImport("@elastic/transport/lib/pool/BaseConnectionPool", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BaseConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  type AddConnectionOptions = String | ConnectionOptions
  
  @js.native
  trait BaseConnectionPool extends StObject {
    
    var Connection: TypeofBaseConnection = js.native
    
    var _agent: js.UndefOr[HttpAgentOptions | UndiciAgentOptions | agentFn | `false`] = js.native
    
    var _proxy: js.UndefOr[String | URL_] = js.native
    
    var _tls: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.native
    
    def addConnection(connection: js.Array[AddConnectionOptions]): this.type = js.native
    /**
      * Adds a new connection to the pool.
      *
      * @param {object|string} host
      * @returns {ConnectionPool}
      */
    def addConnection(connection: AddConnectionOptions): this.type = js.native
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth | BearerAuth] = js.native
    
    var connections: js.Array[Connection] = js.native
    
    /**
      * Creates a new connection instance.
      */
    def createConnection(opts: String): Connection = js.native
    def createConnection(opts: ConnectionOptions): Connection = js.native
    
    var diagnostic: typings.elasticTransport.libDiagnosticMod.default = js.native
    
    /**
      * Empties the connection pool.
      *
      * @returns {ConnectionPool}
      */
    def empty(): js.Promise[Unit] = js.native
    
    def getConnection(opts: GetConnectionOptions): Connection | Null = js.native
    
    def markAlive(connection: Connection): this.type = js.native
    
    def markDead(connection: Connection): this.type = js.native
    
    /**
      * Transforms the nodes objects to a host object.
      *
      * @param {object} nodes
      * @returns {array} hosts
      */
    def nodesToHost(nodes: Record[String, Any], protocol: String): js.Array[ConnectionOptions] = js.native
    
    /**
      * Removes a new connection to the pool.
      *
      * @param {object} connection
      * @returns {ConnectionPool}
      */
    def removeConnection(connection: Connection): this.type = js.native
    
    var size: Double = js.native
    
    /**
      * Update the ConnectionPool with new connections.
      *
      * @param {array} array of connections
      * @returns {ConnectionPool}
      */
    def update(nodes: js.Array[Connection | ConnectionOptions]): this.type = js.native
    
    /**
      * Transforms an url string to a host object
      *
      * @param {string} url
      * @returns {object} host
      */
    def urlToHost(url: String): ConnectionOptions = js.native
  }
  
  trait ConnectionPoolOptions extends StObject {
    
    var Connection: TypeofBaseConnection
    
    var agent: js.UndefOr[HttpAgentOptions | UndiciAgentOptions | agentFn | `false`] = js.undefined
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth | BearerAuth] = js.undefined
    
    var caFingerprint: js.UndefOr[String] = js.undefined
    
    var diagnostic: js.UndefOr[typings.elasticTransport.libDiagnosticMod.default] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[String | URL_] = js.undefined
    
    var resurrectStrategy: js.UndefOr[none | ping | optimistic] = js.undefined
    
    var tls: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.undefined
  }
  object ConnectionPoolOptions {
    
    inline def apply(Connection: TypeofBaseConnection): ConnectionPoolOptions = {
      val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPoolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionPoolOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: HttpAgentOptions | UndiciAgentOptions | agentFn | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* opts */ ConnectionOptions => Any): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: BasicAuth | ApiKeyAuth | BearerAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCaFingerprint(value: String): Self = StObject.set(x, "caFingerprint", value.asInstanceOf[js.Any])
      
      inline def setCaFingerprintUndefined: Self = StObject.set(x, "caFingerprint", js.undefined)
      
      inline def setConnection(value: TypeofBaseConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      inline def setDiagnostic(value: typings.elasticTransport.libDiagnosticMod.default): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setResurrectStrategy(value: none | ping | optimistic): Self = StObject.set(x, "resurrectStrategy", value.asInstanceOf[js.Any])
      
      inline def setResurrectStrategyUndefined: Self = StObject.set(x, "resurrectStrategy", js.undefined)
      
      inline def setTls(value: typings.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  trait GetConnectionOptions extends StObject {
    
    var context: Any
    
    var filter: js.UndefOr[nodeFilterFn] = js.undefined
    
    var name: String | js.Symbol
    
    var now: Double
    
    var requestId: String | Double
    
    var selector: js.UndefOr[nodeSelectorFn] = js.undefined
  }
  object GetConnectionOptions {
    
    inline def apply(context: Any, name: String | js.Symbol, now: Double, requestId: String | Double): GetConnectionOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: /* connection */ Connection => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String | Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: /* connections */ js.Array[Connection] => Connection): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
}
