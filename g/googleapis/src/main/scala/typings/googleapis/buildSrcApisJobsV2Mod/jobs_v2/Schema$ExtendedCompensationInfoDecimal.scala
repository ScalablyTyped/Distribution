package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  Decimal number.
  */
@js.native
trait Schema$ExtendedCompensationInfoDecimal extends js.Object {
  /**
    * Micro (10^-6) units. The value must be between -999,999 and +999,999
    * inclusive. If `units` is positive, `micros` must be positive or zero. If
    * `units` is zero, `micros` can be positive, zero, or negative. If `units`
    * is negative, `micros` must be negative or zero. For example -1.75 is
    * represented as `units`=-1 and `micros`=-750,000.
    */
  var micros: js.UndefOr[Double] = js.native
  /**
    * Whole units.
    */
  var units: js.UndefOr[String] = js.native
}

object Schema$ExtendedCompensationInfoDecimal {
  @scala.inline
  def apply(micros: Int | Double = null, units: String = null): Schema$ExtendedCompensationInfoDecimal = {
    val __obj = js.Dynamic.literal()
    if (micros != null) __obj.updateDynamic("micros")(micros.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExtendedCompensationInfoDecimal]
  }
}

