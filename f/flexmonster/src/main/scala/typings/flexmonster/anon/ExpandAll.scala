package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandAll extends js.Object {
  var columns: js.UndefOr[js.Array[Measure]] = js.undefined
  var expandAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[Measure]] = js.undefined
}

object ExpandAll {
  @scala.inline
  def apply(
    columns: js.Array[Measure] = null,
    expandAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[Measure] = null
  ): ExpandAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAll)) __obj.updateDynamic("expandAll")(expandAll.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandAll]
  }
}

