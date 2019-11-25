package typings.flexmonster

import typings.flexmonster.flexmonsterMod.ColumnSize
import typings.flexmonster.flexmonsterMod.RowSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.UndefOr[js.Array[ColumnSize]] = js.undefined
  var rows: js.UndefOr[js.Array[RowSize]] = js.undefined
}

object Anon_Columns {
  @scala.inline
  def apply(columns: js.Array[ColumnSize] = null, rows: js.Array[RowSize] = null): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Columns]
  }
}

