package typings.elasticTransport

import typings.elasticTransport.anon.Id
import typings.elasticTransport.anon.None
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPoolClusterConnectionPoolMod {
  
  @JSImport("@elastic/transport/lib/pool/ClusterConnectionPool", JSImport.Default)
  @js.native
  open class default protected () extends ClusterConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@elastic/transport/lib/pool/ClusterConnectionPool", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport/lib/pool/ClusterConnectionPool", "default.resurrectStrategies")
    @js.native
    def resurrectStrategies: None = js.native
    inline def resurrectStrategies_=(x: None): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resurrectStrategies")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ClusterConnectionPool
    extends typings.elasticTransport.libPoolBaseConnectionPoolMod.default {
    
    var dead: js.Array[String] = js.native
    
    var pingTimeout: Double = js.native
    
    /**
      * If enabled, tries to resurrect a connection with the given
      * resurrect strategy ('ping', 'optimistic', 'none').
      *
      * @param {object} { now, requestId }
      */
    def resurrect(opts: ResurrectOptions): Unit = js.native
    
    var resurrectStrategy: Double = js.native
    
    var resurrectTimeout: Double = js.native
    
    var resurrectTimeoutCutoff: Double = js.native
  }
  
  trait ResurrectEvent extends StObject {
    
    var connection: Connection
    
    var isAlive: Boolean
    
    var name: String | js.Symbol
    
    var request: Id
    
    var strategy: String
  }
  object ResurrectEvent {
    
    inline def apply(connection: Connection, isAlive: Boolean, name: String | js.Symbol, request: Id, strategy: String): ResurrectEvent = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResurrectEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResurrectEvent] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setIsAlive(value: Boolean): Self = StObject.set(x, "isAlive", value.asInstanceOf[js.Any])
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Id): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResurrectOptions extends StObject {
    
    var context: Any
    
    var name: String | js.Symbol
    
    var now: Double
    
    var requestId: String | Double
  }
  object ResurrectOptions {
    
    inline def apply(context: Any, name: String | js.Symbol, now: Double, requestId: String | Double): ResurrectOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResurrectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResurrectOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String | Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
