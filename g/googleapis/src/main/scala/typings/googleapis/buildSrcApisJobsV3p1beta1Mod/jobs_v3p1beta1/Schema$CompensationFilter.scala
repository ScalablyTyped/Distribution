package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Filter on job compensation type and amount.
  */
@js.native
trait Schema$CompensationFilter extends js.Object {
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[Schema$CompensationRange] = js.native
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * CompensationInfo.CompensationUnit.
    */
  var units: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CompensationFilter {
  @scala.inline
  def apply(
    includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.undefined,
    range: Schema$CompensationRange = null,
    `type`: String = null,
    units: js.Array[String] = null
  ): Schema$CompensationFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeJobsWithUnspecifiedCompensationRange)) __obj.updateDynamic("includeJobsWithUnspecifiedCompensationRange")(includeJobsWithUnspecifiedCompensationRange.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompensationFilter]
  }
}

