package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.UndefOr[js.Array[flexmonsterLib.flexmonsterMod.FlexmonsterNs.ColumnSize]] = js.undefined
  var rows: js.UndefOr[js.Array[flexmonsterLib.flexmonsterMod.FlexmonsterNs.RowSize]] = js.undefined
}

object Anon_Columns {
  @scala.inline
  def apply(
    columns: js.Array[flexmonsterLib.flexmonsterMod.FlexmonsterNs.ColumnSize] = null,
    rows: js.Array[flexmonsterLib.flexmonsterMod.FlexmonsterNs.RowSize] = null
  ): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Anon_Columns]
  }
}

