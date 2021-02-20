package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration parameters of autoscaling based on load balancing.
  */
@js.native
trait SchemaAutoscalingPolicyLoadBalancingUtilization extends StObject {
  
  /**
    * Fraction of backend capacity utilization (set in HTTP(S) load balancing
    * configuration) that autoscaler should maintain. Must be a positive float
    * value. If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
}
object SchemaAutoscalingPolicyLoadBalancingUtilization {
  
  @scala.inline
  def apply(): SchemaAutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyLoadBalancingUtilization]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingPolicyLoadBalancingUtilizationMutableBuilder[Self <: SchemaAutoscalingPolicyLoadBalancingUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUtilizationTarget(value: Double): Self = StObject.set(x, "utilizationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationTargetUndefined: Self = StObject.set(x, "utilizationTarget", js.undefined)
  }
}
