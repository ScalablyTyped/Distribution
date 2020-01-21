package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnsExpandAll extends js.Object {
  var columns: js.UndefOr[js.Array[AnonMeasure]] = js.undefined
  var expandAll: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[AnonMeasure]] = js.undefined
}

object AnonColumnsExpandAll {
  @scala.inline
  def apply(
    columns: js.Array[AnonMeasure] = null,
    expandAll: js.UndefOr[Boolean] = js.undefined,
    rows: js.Array[AnonMeasure] = null
  ): AnonColumnsExpandAll = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAll)) __obj.updateDynamic("expandAll")(expandAll.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnsExpandAll]
  }
}

