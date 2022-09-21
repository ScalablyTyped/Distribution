package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingPolicyLoadBalancingUtilization extends StObject {
  
  /**
    * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoscalingPolicyLoadBalancingUtilization {
  
  inline def apply(): SchemaAutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyLoadBalancingUtilization]
  }
  
  extension [Self <: SchemaAutoscalingPolicyLoadBalancingUtilization](x: Self) {
    
    inline def setUtilizationTarget(value: Double): Self = StObject.set(x, "utilizationTarget", value.asInstanceOf[js.Any])
    
    inline def setUtilizationTargetNull: Self = StObject.set(x, "utilizationTarget", null)
    
    inline def setUtilizationTargetUndefined: Self = StObject.set(x, "utilizationTarget", js.undefined)
  }
}
