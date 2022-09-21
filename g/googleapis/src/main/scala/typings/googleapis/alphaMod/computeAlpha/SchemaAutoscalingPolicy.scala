package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingPolicy extends StObject {
  
  /**
    * The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
    */
  var coolDownPeriodSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
    */
  var cpuUtilization: js.UndefOr[SchemaAutoscalingPolicyCpuUtilization] = js.undefined
  
  /**
    * Configuration parameters of autoscaling based on a custom metric.
    */
  var customMetricUtilizations: js.UndefOr[js.Array[SchemaAutoscalingPolicyCustomMetricUtilization]] = js.undefined
  
  /**
    * Configuration parameters of autoscaling based on load balancer.
    */
  var loadBalancingUtilization: js.UndefOr[SchemaAutoscalingPolicyLoadBalancingUtilization] = js.undefined
  
  /**
    * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
    */
  var maxNumReplicas: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
    */
  var minNumReplicas: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines operating mode for this policy.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  var scaleDownControl: js.UndefOr[SchemaAutoscalingPolicyScaleDownControl] = js.undefined
  
  var scaleInControl: js.UndefOr[SchemaAutoscalingPolicyScaleInControl] = js.undefined
  
  /**
    * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
    */
  var scalingSchedules: js.UndefOr[StringDictionary[SchemaAutoscalingPolicyScalingSchedule] | Null] = js.undefined
}
object SchemaAutoscalingPolicy {
  
  inline def apply(): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
  
  extension [Self <: SchemaAutoscalingPolicy](x: Self) {
    
    inline def setCoolDownPeriodSec(value: Double): Self = StObject.set(x, "coolDownPeriodSec", value.asInstanceOf[js.Any])
    
    inline def setCoolDownPeriodSecNull: Self = StObject.set(x, "coolDownPeriodSec", null)
    
    inline def setCoolDownPeriodSecUndefined: Self = StObject.set(x, "coolDownPeriodSec", js.undefined)
    
    inline def setCpuUtilization(value: SchemaAutoscalingPolicyCpuUtilization): Self = StObject.set(x, "cpuUtilization", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationUndefined: Self = StObject.set(x, "cpuUtilization", js.undefined)
    
    inline def setCustomMetricUtilizations(value: js.Array[SchemaAutoscalingPolicyCustomMetricUtilization]): Self = StObject.set(x, "customMetricUtilizations", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricUtilizationsUndefined: Self = StObject.set(x, "customMetricUtilizations", js.undefined)
    
    inline def setCustomMetricUtilizationsVarargs(value: SchemaAutoscalingPolicyCustomMetricUtilization*): Self = StObject.set(x, "customMetricUtilizations", js.Array(value*))
    
    inline def setLoadBalancingUtilization(value: SchemaAutoscalingPolicyLoadBalancingUtilization): Self = StObject.set(x, "loadBalancingUtilization", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingUtilizationUndefined: Self = StObject.set(x, "loadBalancingUtilization", js.undefined)
    
    inline def setMaxNumReplicas(value: Double): Self = StObject.set(x, "maxNumReplicas", value.asInstanceOf[js.Any])
    
    inline def setMaxNumReplicasNull: Self = StObject.set(x, "maxNumReplicas", null)
    
    inline def setMaxNumReplicasUndefined: Self = StObject.set(x, "maxNumReplicas", js.undefined)
    
    inline def setMinNumReplicas(value: Double): Self = StObject.set(x, "minNumReplicas", value.asInstanceOf[js.Any])
    
    inline def setMinNumReplicasNull: Self = StObject.set(x, "minNumReplicas", null)
    
    inline def setMinNumReplicasUndefined: Self = StObject.set(x, "minNumReplicas", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setScaleDownControl(value: SchemaAutoscalingPolicyScaleDownControl): Self = StObject.set(x, "scaleDownControl", value.asInstanceOf[js.Any])
    
    inline def setScaleDownControlUndefined: Self = StObject.set(x, "scaleDownControl", js.undefined)
    
    inline def setScaleInControl(value: SchemaAutoscalingPolicyScaleInControl): Self = StObject.set(x, "scaleInControl", value.asInstanceOf[js.Any])
    
    inline def setScaleInControlUndefined: Self = StObject.set(x, "scaleInControl", js.undefined)
    
    inline def setScalingSchedules(value: StringDictionary[SchemaAutoscalingPolicyScalingSchedule]): Self = StObject.set(x, "scalingSchedules", value.asInstanceOf[js.Any])
    
    inline def setScalingSchedulesNull: Self = StObject.set(x, "scalingSchedules", null)
    
    inline def setScalingSchedulesUndefined: Self = StObject.set(x, "scalingSchedules", js.undefined)
  }
}
