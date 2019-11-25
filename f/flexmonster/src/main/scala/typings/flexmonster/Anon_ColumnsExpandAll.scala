package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnsExpandAll extends js.Object {
  var columns: js.UndefOr[js.Array[Anon_Measure]] = js.undefined
  var expandAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[Anon_Measure]] = js.undefined
}

object Anon_ColumnsExpandAll {
  @scala.inline
  def apply(
    columns: js.Array[Anon_Measure] = null,
    expandAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[Anon_Measure] = null
  ): Anon_ColumnsExpandAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAll)) __obj.updateDynamic("expandAll")(expandAll.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnsExpandAll]
  }
}

