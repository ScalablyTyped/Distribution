package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnsDrillAll extends js.Object {
  var columns: js.UndefOr[js.Array[Anon_Measure]] = js.undefined
  var drillAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[Anon_Measure]] = js.undefined
}

object Anon_ColumnsDrillAll {
  @scala.inline
  def apply(
    columns: js.Array[Anon_Measure] = null,
    drillAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[Anon_Measure] = null
  ): Anon_ColumnsDrillAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(drillAll)) __obj.updateDynamic("drillAll")(drillAll.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnsDrillAll]
  }
}

