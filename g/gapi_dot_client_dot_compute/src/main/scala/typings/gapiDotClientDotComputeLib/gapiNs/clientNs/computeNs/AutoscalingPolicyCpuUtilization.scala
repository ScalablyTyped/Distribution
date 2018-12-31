package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingPolicyCpuUtilization extends js.Object {
  /**
    * The target CPU utilization that the autoscaler should maintain. Must be a float value in the range (0, 1]. If not specified, the default is 0.6.
    *
    * If the CPU level is below the target utilization, the autoscaler scales down the number of instances until it reaches the minimum number of instances
    * you specified or until the average CPU of your instances reaches the target utilization.
    *
    * If the average CPU is above the target utilization, the autoscaler scales up until it reaches the maximum number of instances you specified or until
    * the average utilization reaches the target utilization.
    */
  var utilizationTarget: js.UndefOr[scala.Double] = js.undefined
}

