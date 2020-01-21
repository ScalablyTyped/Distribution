package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuUtilization extends js.Object {
  /** Period of time over which CPU utilization is calculated. */
  var aggregationWindowLength: js.UndefOr[String] = js.undefined
  /** Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1. */
  var targetUtilization: js.UndefOr[Double] = js.undefined
}

object CpuUtilization {
  @scala.inline
  def apply(aggregationWindowLength: String = null, targetUtilization: Int | Double = null): CpuUtilization = {
    val __obj = js.Dynamic.literal()
    if (aggregationWindowLength != null) __obj.updateDynamic("aggregationWindowLength")(aggregationWindowLength.asInstanceOf[js.Any])
    if (targetUtilization != null) __obj.updateDynamic("targetUtilization")(targetUtilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuUtilization]
  }
}

