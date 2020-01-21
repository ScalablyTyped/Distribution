package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeader extends js.Object {
  /** A single pivot section header. */
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.undefined
  /** The total number of groups for this pivot. */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
}

object PivotHeader {
  @scala.inline
  def apply(pivotHeaderEntries: js.Array[PivotHeaderEntry] = null, totalPivotGroupsCount: Int | Double = null): PivotHeader = {
    val __obj = js.Dynamic.literal()
    if (pivotHeaderEntries != null) __obj.updateDynamic("pivotHeaderEntries")(pivotHeaderEntries.asInstanceOf[js.Any])
    if (totalPivotGroupsCount != null) __obj.updateDynamic("totalPivotGroupsCount")(totalPivotGroupsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotHeader]
  }
}

