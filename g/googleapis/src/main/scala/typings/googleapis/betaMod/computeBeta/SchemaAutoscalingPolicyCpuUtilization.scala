package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingPolicyCpuUtilization extends StObject {
  
  /**
    * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
    */
  var predictiveMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
    */
  var utilizationTarget: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoscalingPolicyCpuUtilization {
  
  inline def apply(): SchemaAutoscalingPolicyCpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyCpuUtilization]
  }
  
  extension [Self <: SchemaAutoscalingPolicyCpuUtilization](x: Self) {
    
    inline def setPredictiveMethod(value: String): Self = StObject.set(x, "predictiveMethod", value.asInstanceOf[js.Any])
    
    inline def setPredictiveMethodNull: Self = StObject.set(x, "predictiveMethod", null)
    
    inline def setPredictiveMethodUndefined: Self = StObject.set(x, "predictiveMethod", js.undefined)
    
    inline def setUtilizationTarget(value: Double): Self = StObject.set(x, "utilizationTarget", value.asInstanceOf[js.Any])
    
    inline def setUtilizationTargetNull: Self = StObject.set(x, "utilizationTarget", null)
    
    inline def setUtilizationTargetUndefined: Self = StObject.set(x, "utilizationTarget", js.undefined)
  }
}
