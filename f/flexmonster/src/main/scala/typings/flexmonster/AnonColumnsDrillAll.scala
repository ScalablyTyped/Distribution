package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnsDrillAll extends js.Object {
  var columns: js.UndefOr[js.Array[AnonMeasure]] = js.undefined
  var drillAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[AnonMeasure]] = js.undefined
}

object AnonColumnsDrillAll {
  @scala.inline
  def apply(
    columns: js.Array[AnonMeasure] = null,
    drillAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[AnonMeasure] = null
  ): AnonColumnsDrillAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(drillAll)) __obj.updateDynamic("drillAll")(drillAll.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnsDrillAll]
  }
}

