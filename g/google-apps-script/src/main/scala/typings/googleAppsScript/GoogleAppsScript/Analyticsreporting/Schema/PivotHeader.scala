package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeader extends js.Object {
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.undefined
  var totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
}

object PivotHeader {
  @scala.inline
  def apply(
    pivotHeaderEntries: js.Array[PivotHeaderEntry] = null,
    totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
  ): PivotHeader = {
    val __obj = js.Dynamic.literal()
    if (pivotHeaderEntries != null) __obj.updateDynamic("pivotHeaderEntries")(pivotHeaderEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(totalPivotGroupsCount)) __obj.updateDynamic("totalPivotGroupsCount")(totalPivotGroupsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotHeader]
  }
}

