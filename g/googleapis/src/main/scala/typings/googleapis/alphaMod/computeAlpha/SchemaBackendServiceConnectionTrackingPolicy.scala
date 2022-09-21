package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceConnectionTrackingPolicy extends StObject {
  
  /**
    * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
    */
  var connectionPersistenceOnUnhealthyBackends: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
    */
  var enableStrongAffinity: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
    */
  var idleTimeoutSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
    */
  var trackingMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceConnectionTrackingPolicy {
  
  inline def apply(): SchemaBackendServiceConnectionTrackingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceConnectionTrackingPolicy]
  }
  
  extension [Self <: SchemaBackendServiceConnectionTrackingPolicy](x: Self) {
    
    inline def setConnectionPersistenceOnUnhealthyBackends(value: String): Self = StObject.set(x, "connectionPersistenceOnUnhealthyBackends", value.asInstanceOf[js.Any])
    
    inline def setConnectionPersistenceOnUnhealthyBackendsNull: Self = StObject.set(x, "connectionPersistenceOnUnhealthyBackends", null)
    
    inline def setConnectionPersistenceOnUnhealthyBackendsUndefined: Self = StObject.set(x, "connectionPersistenceOnUnhealthyBackends", js.undefined)
    
    inline def setEnableStrongAffinity(value: Boolean): Self = StObject.set(x, "enableStrongAffinity", value.asInstanceOf[js.Any])
    
    inline def setEnableStrongAffinityNull: Self = StObject.set(x, "enableStrongAffinity", null)
    
    inline def setEnableStrongAffinityUndefined: Self = StObject.set(x, "enableStrongAffinity", js.undefined)
    
    inline def setIdleTimeoutSec(value: Double): Self = StObject.set(x, "idleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutSecNull: Self = StObject.set(x, "idleTimeoutSec", null)
    
    inline def setIdleTimeoutSecUndefined: Self = StObject.set(x, "idleTimeoutSec", js.undefined)
    
    inline def setTrackingMode(value: String): Self = StObject.set(x, "trackingMode", value.asInstanceOf[js.Any])
    
    inline def setTrackingModeNull: Self = StObject.set(x, "trackingMode", null)
    
    inline def setTrackingModeUndefined: Self = StObject.set(x, "trackingMode", js.undefined)
  }
}
