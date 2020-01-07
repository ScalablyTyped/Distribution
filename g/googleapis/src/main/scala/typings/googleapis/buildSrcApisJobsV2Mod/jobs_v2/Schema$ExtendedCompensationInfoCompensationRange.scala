package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  Compensation range.
  */
@js.native
trait Schema$ExtendedCompensationInfoCompensationRange extends js.Object {
  /**
    * Required.  Maximum value.
    */
  var max: js.UndefOr[Schema$ExtendedCompensationInfoDecimal] = js.native
  /**
    * Required.  Minimum value.
    */
  var min: js.UndefOr[Schema$ExtendedCompensationInfoDecimal] = js.native
}

object Schema$ExtendedCompensationInfoCompensationRange {
  @scala.inline
  def apply(
    max: Schema$ExtendedCompensationInfoDecimal = null,
    min: Schema$ExtendedCompensationInfoDecimal = null
  ): Schema$ExtendedCompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExtendedCompensationInfoCompensationRange]
  }
}

