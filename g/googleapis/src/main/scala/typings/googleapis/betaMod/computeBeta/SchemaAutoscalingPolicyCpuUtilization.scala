package typings.googleapis.betaMod.computeBeta

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
  def apply(utilizationTarget: js.UndefOr[Double] = js.undefined): SchemaAutoscalingPolicyCpuUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(utilizationTarget)) __obj.updateDynamic("utilizationTarget")(utilizationTarget.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicyCpuUtilization]
  }
}

