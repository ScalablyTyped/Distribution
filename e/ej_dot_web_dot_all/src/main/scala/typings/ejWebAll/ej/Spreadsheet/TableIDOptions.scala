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
  def apply(sheetIdx: js.UndefOr[Double] = js.undefined, tableId: js.UndefOr[Double] = js.undefined): TableIDOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sheetIdx)) __obj.updateDynamic("sheetIdx")(sheetIdx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tableId)) __obj.updateDynamic("tableId")(tableId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableIDOptions]
  }
}

