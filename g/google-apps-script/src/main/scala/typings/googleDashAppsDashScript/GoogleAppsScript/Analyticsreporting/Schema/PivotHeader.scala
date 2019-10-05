package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeader extends js.Object {
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.undefined
  var totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
}

object PivotHeader {
  @scala.inline
  def apply(pivotHeaderEntries: js.Array[PivotHeaderEntry] = null, totalPivotGroupsCount: Int | Double = null): PivotHeader = {
    val __obj = js.Dynamic.literal()
    if (pivotHeaderEntries != null) __obj.updateDynamic("pivotHeaderEntries")(pivotHeaderEntries)
    if (totalPivotGroupsCount != null) __obj.updateDynamic("totalPivotGroupsCount")(totalPivotGroupsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotHeader]
  }
}

