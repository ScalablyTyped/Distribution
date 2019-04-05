package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeader extends js.Object {
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.undefined
  var totalPivotGroupsCount: js.UndefOr[scala.Double] = js.undefined
}

object PivotHeader {
  @scala.inline
  def apply(
    pivotHeaderEntries: js.Array[PivotHeaderEntry] = null,
    totalPivotGroupsCount: scala.Int | scala.Double = null
  ): PivotHeader = {
    val __obj = js.Dynamic.literal()
    if (pivotHeaderEntries != null) __obj.updateDynamic("pivotHeaderEntries")(pivotHeaderEntries)
    if (totalPivotGroupsCount != null) __obj.updateDynamic("totalPivotGroupsCount")(totalPivotGroupsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotHeader]
  }
}

