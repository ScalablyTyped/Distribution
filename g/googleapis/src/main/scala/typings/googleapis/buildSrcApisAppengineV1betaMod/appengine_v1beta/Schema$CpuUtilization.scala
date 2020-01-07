package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by CPU usage.
  */
@js.native
trait Schema$CpuUtilization extends js.Object {
  /**
    * Period of time over which CPU utilization is calculated.
    */
  var aggregationWindowLength: js.UndefOr[String] = js.native
  /**
    * Target CPU utilization ratio to maintain when scaling. Must be between 0
    * and 1.
    */
  var targetUtilization: js.UndefOr[Double] = js.native
}

object Schema$CpuUtilization {
  @scala.inline
  def apply(aggregationWindowLength: String = null, targetUtilization: Int | Double = null): Schema$CpuUtilization = {
    val __obj = js.Dynamic.literal()
    if (aggregationWindowLength != null) __obj.updateDynamic("aggregationWindowLength")(aggregationWindowLength.asInstanceOf[js.Any])
    if (targetUtilization != null) __obj.updateDynamic("targetUtilization")(targetUtilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CpuUtilization]
  }
}

