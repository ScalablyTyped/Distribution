package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters of autoscaling based on load balancing.
  */
@js.native
trait Schema$AutoscalingPolicyLoadBalancingUtilization extends js.Object {
  /**
    * Fraction of backend capacity utilization (set in HTTP(S) load balancing
    * configuration) that autoscaler should maintain. Must be a positive float
    * value. If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
}

object Schema$AutoscalingPolicyLoadBalancingUtilization {
  @scala.inline
  def apply(utilizationTarget: Int | Double = null): Schema$AutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    if (utilizationTarget != null) __obj.updateDynamic("utilizationTarget")(utilizationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoscalingPolicyLoadBalancingUtilization]
  }
}

