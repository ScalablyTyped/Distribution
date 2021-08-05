package typings.elasticElasticsearch

import typings.elasticElasticsearch.anon.Apikey
import typings.elasticElasticsearch.anon.IdAny
import typings.elasticElasticsearch.anon.Instantiable
import typings.elasticElasticsearch.anon.TypeofConnection
import typings.elasticElasticsearch.anon.Url
import typings.elasticElasticsearch.connectionMod.AgentOptions
import typings.elasticElasticsearch.connectionMod.default
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typings.elasticElasticsearch.elasticElasticsearchStrings.ping
import typings.elasticElasticsearch.transportMod.nodeFilterFn
import typings.elasticElasticsearch.transportMod.nodeSelectorFn
import typings.node.tlsMod.SecureContextOptions
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolMod {
  
  @JSImport("@elastic/elasticsearch/lib/pool", "BaseConnectionPool")
  @js.native
  class BaseConnectionPool () extends StObject {
    def this(opts: BaseConnectionPoolOptions) = this()
    
    var Connection: Instantiable = js.native
    
    var _agent: AgentOptions | Null = js.native
    
    var _proxy: String | URL_ = js.native
    
    var _ssl: SecureContextOptions | Null = js.native
    
    /**
      * Adds a new connection to the pool.
      *
      * @param {object|string} host
      * @returns {ConnectionPool}
      */
    def addConnection(opts: js.Any): default = js.native
    
    var auth: BasicAuth | ApiKeyAuth = js.native
    
    var connections: js.Array[default] = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    /**
      * Empties the connection pool.
      *
      * @returns {ConnectionPool}
      */
    def empty(): this.type = js.native
    
    /**
      * Returns an alive connection if present,
      * otherwise returns a dead connection.
      * By default it filters the `master` only nodes.
      * It uses the selector to choose which
      * connection return.
      *
      * @param {object} options (filter and selector)
      * @returns {object|null} connection
      */
    def getConnection(): default | Null = js.native
    def getConnection(opts: getConnectionOptions): default | Null = js.native
    
    /**
      * Marks a connection as 'alive'.
      * If needed removes the connection from the dead list
      * and then resets the `deadCount`.
      *
      * @param {object} connection
      */
    def markAlive(connection: default): this.type = js.native
    
    /**
      * Marks a connection as 'dead'.
      * If needed adds the connection to the dead list
      * and then increments the `deadCount`.
      *
      * @param {object} connection
      */
    def markDead(connection: default): this.type = js.native
    
    /**
      * Transforms the nodes objects to a host object.
      *
      * @param {object} nodes
      * @returns {array} hosts
      */
    def nodesToHost(nodes: js.Any, protocol: String): js.Array[js.Any] = js.native
    
    /**
      * Removes a new connection to the pool.
      *
      * @param {object} connection
      * @returns {ConnectionPool}
      */
    def removeConnection(connection: default): this.type = js.native
    
    var size: Double = js.native
    
    /**
      * Update the ConnectionPool with new connections.
      *
      * @param {array} array of connections
      * @returns {ConnectionPool}
      */
    def update(connections: js.Array[js.Any]): this.type = js.native
    
    /**
      * Transforms an url string to a host object
      *
      * @param {string} url
      * @returns {object} host
      */
    def urlToHost(url: String): Url = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/pool", "CloudConnectionPool")
  @js.native
  class CloudConnectionPool () extends BaseConnectionPool {
    def this(opts: BaseConnectionPoolOptions) = this()
    
    var cloudConnection: default | Null = js.native
  }
  
  @JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool")
  @js.native
  class ConnectionPool () extends BaseConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
    
    var _sniffEnabled: Boolean = js.native
    
    var dead: js.Array[String] = js.native
    
    var pingTimeout: Double = js.native
    
    /**
      * If enabled, tries to resurrect a connection with the given
      * resurrect strategy ('ping', 'optimistic', 'none').
      *
      * @param {object} { now, requestId, name }
      * @param {function} callback (isAlive, connection)
      */
    def resurrect(opts: resurrectOptions): Unit = js.native
    def resurrect(
      opts: resurrectOptions,
      callback: js.Function2[/* isAlive */ Boolean | Null, /* connection */ default | Null, Unit]
    ): Unit = js.native
    
    var resurrectStrategy: Double = js.native
    
    var resurrectTimeout: Double = js.native
    
    var resurrectTimeoutCutoff: Double = js.native
  }
  object ConnectionPool {
    
    /* static member */
    object resurrectStrategies {
      
      @JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool.resurrectStrategies")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool.resurrectStrategies.none")
      @js.native
      def none: Double = js.native
      inline def none_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
      
      @JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool.resurrectStrategies.optimistic")
      @js.native
      def optimistic: Double = js.native
      inline def optimistic_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(x.asInstanceOf[js.Any])
      
      @JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool.resurrectStrategies.ping")
      @js.native
      def ping: Double = js.native
      inline def ping_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ping")(x.asInstanceOf[js.Any])
    }
  }
  
  object internals {
    
    @JSImport("@elastic/elasticsearch/lib/pool", "internals")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch/lib/pool", "internals.defaultNodeFilter")
    @js.native
    def defaultNodeFilter: js.Function1[/* node */ default, Boolean] = js.native
    inline def defaultNodeFilter(node: default): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNodeFilter")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def defaultNodeFilter_=(x: js.Function1[/* node */ default, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeFilter")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch/lib/pool", "internals.randomSelector")
    @js.native
    def randomSelector: js.Function1[/* connections */ js.Array[default], default] = js.native
    inline def randomSelector(connections: js.Array[default]): default = ^.asInstanceOf[js.Dynamic].applyDynamic("randomSelector")(connections.asInstanceOf[js.Any]).asInstanceOf[default]
    inline def randomSelector_=(x: js.Function1[/* connections */ js.Array[default], default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("randomSelector")(x.asInstanceOf[js.Any])
    
    inline def roundRobinSelector(): js.Function1[/* connections */ js.Array[default], default] = ^.asInstanceOf[js.Dynamic].applyDynamic("roundRobinSelector")().asInstanceOf[js.Function1[/* connections */ js.Array[default], default]]
    @JSImport("@elastic/elasticsearch/lib/pool", "internals.roundRobinSelector")
    @js.native
    def roundRobinSelector_Finternals: js.Function0[js.Function1[/* connections */ js.Array[default], default]] = js.native
    
    inline def roundRobinSelector_Finternals_=(x: js.Function0[js.Function1[/* connections */ js.Array[default], default]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundRobinSelector")(x.asInstanceOf[js.Any])
  }
  
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
  
  @js.native
  trait BaseConnectionPoolOptions extends StObject {
    
    var Connection: TypeofConnection = js.native
    
    var agent: js.UndefOr[AgentOptions] = js.native
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    var proxy: js.UndefOr[String | URL_] = js.native
    
    var ssl: js.UndefOr[SecureContextOptions] = js.native
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
  
  @js.native
  trait ConnectionPoolOptions
    extends StObject
       with BaseConnectionPoolOptions {
    
    var pingTimeout: js.UndefOr[Double] = js.native
    
    var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.native
    
    var sniffEnabled: js.UndefOr[Boolean] = js.native
  }
  
  trait ResurrectEvent extends StObject {
    
    var connection: default
    
    var isAlive: Boolean
    
    var name: String
    
    var request: IdAny
    
    var strategy: String
  }
  object ResurrectEvent {
    
    inline def apply(connection: default, isAlive: Boolean, name: String, request: IdAny, strategy: String): ResurrectEvent = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResurrectEvent]
    }
    
    extension [Self <: ResurrectEvent](x: Self) {
      
      inline def setConnection(value: default): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setIsAlive(value: Boolean): Self = StObject.set(x, "isAlive", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: IdAny): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait getConnectionOptions extends StObject {
    
    var filter: js.UndefOr[nodeFilterFn] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var now: js.UndefOr[Double] = js.undefined
    
    var requestId: js.UndefOr[String | Double] = js.undefined
    
    var selector: js.UndefOr[nodeSelectorFn] = js.undefined
  }
  object getConnectionOptions {
    
    inline def apply(): getConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[getConnectionOptions]
    }
    
    extension [Self <: getConnectionOptions](x: Self) {
      
      inline def setFilter(value: /* connection */ default => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setRequestId(value: String | Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      inline def setSelector(value: /* connections */ js.Array[default] => default): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait resurrectOptions extends StObject {
    
    var name: String
    
    var now: js.UndefOr[Double] = js.undefined
    
    var requestId: String
  }
  object resurrectOptions {
    
    inline def apply(name: String, requestId: String): resurrectOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[resurrectOptions]
    }
    
    extension [Self <: resurrectOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
