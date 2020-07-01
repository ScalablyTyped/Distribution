package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Autoscaler policy.
  */
@js.native
trait SchemaAutoscalingPolicy extends js.Object {
  /**
    * The number of seconds that the autoscaler should wait before it starts
    * collecting information from a new instance. This prevents the autoscaler
    * from collecting information when the instance is initializing, during
    * which the collected usage would not be reliable. The default time
    * autoscaler waits is 60 seconds.  Virtual machine initialization times
    * might vary because of numerous factors. We recommend that you test how
    * long an instance may take to initialize. To do this, create an instance
    * and time the startup process.
    */
  var coolDownPeriodSec: js.UndefOr[Double] = js.native
  /**
    * Defines the CPU utilization policy that allows the autoscaler to scale
    * based on the average CPU utilization of a managed instance group.
    */
  var cpuUtilization: js.UndefOr[SchemaAutoscalingPolicyCpuUtilization] = js.native
  /**
    * Configuration parameters of autoscaling based on a custom metric.
    */
  var customMetricUtilizations: js.UndefOr[js.Array[SchemaAutoscalingPolicyCustomMetricUtilization]] = js.native
  /**
    * Configuration parameters of autoscaling based on load balancer.
    */
  var loadBalancingUtilization: js.UndefOr[SchemaAutoscalingPolicyLoadBalancingUtilization] = js.native
  /**
    * The maximum number of instances that the autoscaler can scale up to. This
    * is required when creating or updating an autoscaler. The maximum number
    * of replicas should not be lower than minimal number of replicas.
    */
  var maxNumReplicas: js.UndefOr[Double] = js.native
  /**
    * The minimum number of replicas that the autoscaler can scale down to.
    * This cannot be less than 0. If not provided, autoscaler will choose a
    * default value depending on maximum number of instances allowed.
    */
  var minNumReplicas: js.UndefOr[Double] = js.native
  /**
    * Defines operating mode for this policy.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Configuration parameters of autoscaling based on queuing system.
    */
  var queueBasedScaling: js.UndefOr[SchemaAutoscalingPolicyQueueBasedScaling] = js.native
}

object SchemaAutoscalingPolicy {
  @scala.inline
  def apply(
    coolDownPeriodSec: js.UndefOr[Double] = js.undefined,
    cpuUtilization: SchemaAutoscalingPolicyCpuUtilization = null,
    customMetricUtilizations: js.Array[SchemaAutoscalingPolicyCustomMetricUtilization] = null,
    loadBalancingUtilization: SchemaAutoscalingPolicyLoadBalancingUtilization = null,
    maxNumReplicas: js.UndefOr[Double] = js.undefined,
    minNumReplicas: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    queueBasedScaling: SchemaAutoscalingPolicyQueueBasedScaling = null
  ): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(coolDownPeriodSec)) __obj.updateDynamic("coolDownPeriodSec")(coolDownPeriodSec.get.asInstanceOf[js.Any])
    if (cpuUtilization != null) __obj.updateDynamic("cpuUtilization")(cpuUtilization.asInstanceOf[js.Any])
    if (customMetricUtilizations != null) __obj.updateDynamic("customMetricUtilizations")(customMetricUtilizations.asInstanceOf[js.Any])
    if (loadBalancingUtilization != null) __obj.updateDynamic("loadBalancingUtilization")(loadBalancingUtilization.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumReplicas)) __obj.updateDynamic("maxNumReplicas")(maxNumReplicas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minNumReplicas)) __obj.updateDynamic("minNumReplicas")(minNumReplicas.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (queueBasedScaling != null) __obj.updateDynamic("queueBasedScaling")(queueBasedScaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
}

