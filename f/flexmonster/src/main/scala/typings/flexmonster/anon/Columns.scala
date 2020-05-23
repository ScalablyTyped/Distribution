package typings.flexmonster.anon

import typings.flexmonster.mod.ColumnSize
import typings.flexmonster.mod.RowSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.UndefOr[js.Array[ColumnSize]] = js.undefined
  var rows: js.UndefOr[js.Array[RowSize]] = js.undefined
}

object Columns {
  @scala.inline
  def apply(columns: js.Array[ColumnSize] = null, rows: js.Array[RowSize] = null): Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

