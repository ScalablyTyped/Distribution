package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CPU utilization policy.
  */
@js.native
trait SchemaAutoscalingPolicyCpuUtilization extends js.Object {
  /**
    * The target CPU utilization that the autoscaler should maintain. Must be a
    * float value in the range (0, 1]. If not specified, the default is 0.6. If
    * the CPU level is below the target utilization, the autoscaler scales down
    * the number of instances until it reaches the minimum number of instances
    * you specified or until the average CPU of your instances reaches the
    * target utilization.  If the average CPU is above the target utilization,
    * the autoscaler scales up until it reaches the maximum number of instances
    * you specified or until the average utilization reaches the target
    * utilization.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingPolicyCpuUtilization {
  @scala.inline
  def apply(): SchemaAutoscalingPolicyCpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyCpuUtilization]
  }
  @scala.inline
  implicit class SchemaAutoscalingPolicyCpuUtilizationOps[Self <: SchemaAutoscalingPolicyCpuUtilization] (val x: Self) extends AnyVal {
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

