package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by CPU usage.
  */
@js.native
trait SchemaCpuUtilization extends js.Object {
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

object SchemaCpuUtilization {
  @scala.inline
  def apply(aggregationWindowLength: String = null, targetUtilization: js.UndefOr[Double] = js.undefined): SchemaCpuUtilization = {
    val __obj = js.Dynamic.literal()
    if (aggregationWindowLength != null) __obj.updateDynamic("aggregationWindowLength")(aggregationWindowLength.asInstanceOf[js.Any])
    if (!js.isUndefined(targetUtilization)) __obj.updateDynamic("targetUtilization")(targetUtilization.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCpuUtilization]
  }
}

