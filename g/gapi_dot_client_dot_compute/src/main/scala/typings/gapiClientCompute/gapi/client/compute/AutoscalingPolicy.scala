package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingPolicy extends js.Object {
  /**
    * The number of seconds that the autoscaler should wait before it starts collecting information from a new instance. This prevents the autoscaler from
    * collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is
    * 60 seconds.
    *
    * Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To
    * do this, create an instance and time the startup process.
    */
  var coolDownPeriodSec: js.UndefOr[Double] = js.undefined
  /** Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group. */
  var cpuUtilization: js.UndefOr[AutoscalingPolicyCpuUtilization] = js.undefined
  /** Configuration parameters of autoscaling based on a custom metric. */
  var customMetricUtilizations: js.UndefOr[js.Array[AutoscalingPolicyCustomMetricUtilization]] = js.undefined
  /** Configuration parameters of autoscaling based on load balancer. */
  var loadBalancingUtilization: js.UndefOr[AutoscalingPolicyLoadBalancingUtilization] = js.undefined
  /**
    * The maximum number of instances that the autoscaler can scale up to. This is required when creating or updating an autoscaler. The maximum number of
    * replicas should not be lower than minimal number of replicas.
    */
  var maxNumReplicas: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of replicas that the autoscaler can scale down to. This cannot be less than 0. If not provided, autoscaler will choose a default
    * value depending on maximum number of instances allowed.
    */
  var minNumReplicas: js.UndefOr[Double] = js.undefined
}

object AutoscalingPolicy {
  @scala.inline
  def apply(
    coolDownPeriodSec: Int | Double = null,
    cpuUtilization: AutoscalingPolicyCpuUtilization = null,
    customMetricUtilizations: js.Array[AutoscalingPolicyCustomMetricUtilization] = null,
    loadBalancingUtilization: AutoscalingPolicyLoadBalancingUtilization = null,
    maxNumReplicas: Int | Double = null,
    minNumReplicas: Int | Double = null
  ): AutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (coolDownPeriodSec != null) __obj.updateDynamic("coolDownPeriodSec")(coolDownPeriodSec.asInstanceOf[js.Any])
    if (cpuUtilization != null) __obj.updateDynamic("cpuUtilization")(cpuUtilization.asInstanceOf[js.Any])
    if (customMetricUtilizations != null) __obj.updateDynamic("customMetricUtilizations")(customMetricUtilizations.asInstanceOf[js.Any])
    if (loadBalancingUtilization != null) __obj.updateDynamic("loadBalancingUtilization")(loadBalancingUtilization.asInstanceOf[js.Any])
    if (maxNumReplicas != null) __obj.updateDynamic("maxNumReplicas")(maxNumReplicas.asInstanceOf[js.Any])
    if (minNumReplicas != null) __obj.updateDynamic("minNumReplicas")(minNumReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPolicy]
  }
}

