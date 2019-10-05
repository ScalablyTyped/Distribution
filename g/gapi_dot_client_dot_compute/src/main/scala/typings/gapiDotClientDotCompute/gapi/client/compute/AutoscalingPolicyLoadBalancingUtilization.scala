package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingPolicyLoadBalancingUtilization extends js.Object {
  /**
    * Fraction of backend capacity utilization (set in HTTP(s) load balancing configuration) that autoscaler should maintain. Must be a positive float value.
    * If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.undefined
}

object AutoscalingPolicyLoadBalancingUtilization {
  @scala.inline
  def apply(utilizationTarget: Int | Double = null): AutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    if (utilizationTarget != null) __obj.updateDynamic("utilizationTarget")(utilizationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPolicyLoadBalancingUtilization]
  }
}

