package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBackendServiceFailoverPolicy extends StObject {
  
  /**
    * On failover or failback, this field indicates whether connection drain
    * will be honored. Setting this to true has the following effect:
    * connections to the old active pool are not drained. Connections to the
    * new active pool use the timeout of 10 min (currently fixed). Setting to
    * false has the following effect: both old and new connections will have a
    * drain timeout of 10 min.  This can be set to true only if the protocol is
    * TCP.  The default is false.
    */
  var disableConnectionDrainOnFailover: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is used only when no healthy VMs are detected in the primary
    * and backup instance groups. When set to true, traffic is dropped. When
    * set to false, new connections are sent across all VMs in the primary
    * group.  The default is false.
    */
  var dropTrafficIfUnhealthy: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the field must be in [0, 1]. If the ratio of the healthy VMs
    * in the primary backend is at or below this number, traffic arriving at
    * the load-balanced IP will be directed to the failover backend.  In case
    * where &#39;failoverRatio&#39; is not set or all the VMs in the backup
    * backend are unhealthy, the traffic will be directed back to the primary
    * backend in the &quot;force&quot; mode, where traffic will be spread to
    * the healthy VMs with the best effort, or to all VMs when no VM is
    * healthy.  This field is only used with l4 load balancing.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
}
object SchemaBackendServiceFailoverPolicy {
  
  @scala.inline
  def apply(): SchemaBackendServiceFailoverPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceFailoverPolicy]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceFailoverPolicyMutableBuilder[Self <: SchemaBackendServiceFailoverPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableConnectionDrainOnFailover(value: Boolean): Self = StObject.set(x, "disableConnectionDrainOnFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableConnectionDrainOnFailoverUndefined: Self = StObject.set(x, "disableConnectionDrainOnFailover", js.undefined)
    
    @scala.inline
    def setDropTrafficIfUnhealthy(value: Boolean): Self = StObject.set(x, "dropTrafficIfUnhealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTrafficIfUnhealthyUndefined: Self = StObject.set(x, "dropTrafficIfUnhealthy", js.undefined)
    
    @scala.inline
    def setFailoverRatio(value: Double): Self = StObject.set(x, "failoverRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverRatioUndefined: Self = StObject.set(x, "failoverRatio", js.undefined)
  }
}
