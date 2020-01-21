package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableIDOptions extends js.Object {
  /** Pass the sheet index
    */
  var sheetIdx: js.UndefOr[Double] = js.undefined
  /** Pass the table id
    */
  var tableId: js.UndefOr[Double] = js.undefined
}

object TableIDOptions {
  @scala.inline
  def apply(sheetIdx: Int | Double = null, tableId: Int | Double = null): TableIDOptions = {
    val __obj = js.Dynamic.literal()
    if (sheetIdx != null) __obj.updateDynamic("sheetIdx")(sheetIdx.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableIDOptions]
  }
}

