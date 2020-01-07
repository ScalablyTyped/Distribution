package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Job compensation details.
  */
@js.native
trait Schema$CompensationInfo extends js.Object {
  /**
    * Output only. Annualized base compensation range. Computed as base
    * compensation entry&#39;s CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[Schema$CompensationRange] = js.native
  /**
    * Output only. Annualized total compensation range. Computed as all
    * compensation entries&#39; CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[Schema$CompensationRange] = js.native
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type CompensationInfo.CompensationType.BASE, which is referred as ** base
    * compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[Schema$CompensationEntry]] = js.native
}

object Schema$CompensationInfo {
  @scala.inline
  def apply(
    annualizedBaseCompensationRange: Schema$CompensationRange = null,
    annualizedTotalCompensationRange: Schema$CompensationRange = null,
    entries: js.Array[Schema$CompensationEntry] = null
  ): Schema$CompensationInfo = {
    val __obj = js.Dynamic.literal()
    if (annualizedBaseCompensationRange != null) __obj.updateDynamic("annualizedBaseCompensationRange")(annualizedBaseCompensationRange.asInstanceOf[js.Any])
    if (annualizedTotalCompensationRange != null) __obj.updateDynamic("annualizedTotalCompensationRange")(annualizedTotalCompensationRange.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompensationInfo]
  }
}

