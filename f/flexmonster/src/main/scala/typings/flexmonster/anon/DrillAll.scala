package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillAll extends js.Object {
  var columns: js.UndefOr[js.Array[Measure]] = js.undefined
  var drillAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[Measure]] = js.undefined
}

object DrillAll {
  @scala.inline
  def apply(
    columns: js.Array[Measure] = null,
    drillAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[Measure] = null
  ): DrillAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(drillAll)) __obj.updateDynamic("drillAll")(drillAll.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillAll]
  }
}

