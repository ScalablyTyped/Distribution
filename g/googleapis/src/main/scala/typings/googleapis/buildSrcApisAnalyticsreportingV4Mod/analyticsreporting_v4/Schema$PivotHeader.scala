package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for each of the pivot sections defined in the request.
  */
@js.native
trait Schema$PivotHeader extends js.Object {
  /**
    * A single pivot section header.
    */
  var pivotHeaderEntries: js.UndefOr[js.Array[Schema$PivotHeaderEntry]] = js.native
  /**
    * The total number of groups for this pivot.
    */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}

object Schema$PivotHeader {
  @scala.inline
  def apply(
    pivotHeaderEntries: js.Array[Schema$PivotHeaderEntry] = null,
    totalPivotGroupsCount: Int | Double = null
  ): Schema$PivotHeader = {
    val __obj = js.Dynamic.literal()
    if (pivotHeaderEntries != null) __obj.updateDynamic("pivotHeaderEntries")(pivotHeaderEntries.asInstanceOf[js.Any])
    if (totalPivotGroupsCount != null) __obj.updateDynamic("totalPivotGroupsCount")(totalPivotGroupsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotHeader]
  }
}

