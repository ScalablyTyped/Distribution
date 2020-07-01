package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates numeric value that can be either absolute or relative.
  */
@js.native
trait SchemaFixedOrPercent extends js.Object {
  /**
    * [Output Only] Absolute value of VM instances calculated based on the
    * specific mode.    - If the value is fixed, then the caculated value is
    * equal to the fixed value.  - If the value is a percent, then the
    * calculated value is percent/100 * targetSize. For example, the calculated
    * value of a 80% of a managed instance group with 150 instances would be
    * (80/100 * 150) = 120 VM instances. If there is a remainder, the number is
    * rounded up.
    */
  var calculated: js.UndefOr[Double] = js.native
  /**
    * Specifies a fixed number of VM instances. This must be a positive
    * integer.
    */
  var fixed: js.UndefOr[Double] = js.native
  /**
    * Specifies a percentage of instances between 0 to 100%, inclusive. For
    * example, specify 80 for 80%.
    */
  var percent: js.UndefOr[Double] = js.native
}

object SchemaFixedOrPercent {
  @scala.inline
  def apply(
    calculated: js.UndefOr[Double] = js.undefined,
    fixed: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined
  ): SchemaFixedOrPercent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculated)) __obj.updateDynamic("calculated")(calculated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFixedOrPercent]
  }
}

