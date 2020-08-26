package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalingPolicyLoadBalancingUtilization extends js.Object {
  /**
    * Fraction of backend capacity utilization (set in HTTP(s) load balancing configuration) that autoscaler should maintain. Must be a positive float value.
    * If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
}

object AutoscalingPolicyLoadBalancingUtilization {
  @scala.inline
  def apply(): AutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicyLoadBalancingUtilization]
  }
  @scala.inline
  implicit class AutoscalingPolicyLoadBalancingUtilizationOps[Self <: AutoscalingPolicyLoadBalancingUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUtilizationTarget(value: Double): Self = this.set("utilizationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilizationTarget: Self = this.set("utilizationTarget", js.undefined)
  }
  
}

