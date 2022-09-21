package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceFailoverPolicy extends StObject {
  
  /**
    * This can be set to true only if the protocol is TCP. The default is false.
    */
  var disableConnectionDrainOnFailover: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
    */
  var dropTrafficIfUnhealthy: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
    */
  var failoverRatio: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBackendServiceFailoverPolicy {
  
  inline def apply(): SchemaBackendServiceFailoverPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceFailoverPolicy]
  }
  
  extension [Self <: SchemaBackendServiceFailoverPolicy](x: Self) {
    
    inline def setDisableConnectionDrainOnFailover(value: Boolean): Self = StObject.set(x, "disableConnectionDrainOnFailover", value.asInstanceOf[js.Any])
    
    inline def setDisableConnectionDrainOnFailoverNull: Self = StObject.set(x, "disableConnectionDrainOnFailover", null)
    
    inline def setDisableConnectionDrainOnFailoverUndefined: Self = StObject.set(x, "disableConnectionDrainOnFailover", js.undefined)
    
    inline def setDropTrafficIfUnhealthy(value: Boolean): Self = StObject.set(x, "dropTrafficIfUnhealthy", value.asInstanceOf[js.Any])
    
    inline def setDropTrafficIfUnhealthyNull: Self = StObject.set(x, "dropTrafficIfUnhealthy", null)
    
    inline def setDropTrafficIfUnhealthyUndefined: Self = StObject.set(x, "dropTrafficIfUnhealthy", js.undefined)
    
    inline def setFailoverRatio(value: Double): Self = StObject.set(x, "failoverRatio", value.asInstanceOf[js.Any])
    
    inline def setFailoverRatioNull: Self = StObject.set(x, "failoverRatio", null)
    
    inline def setFailoverRatioUndefined: Self = StObject.set(x, "failoverRatio", js.undefined)
  }
}
