package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  sheetName  :string,   row  :number,   col  :number}> */
trait PartialsheetNamestringrow extends js.Object {
  var col: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
  var sheetName: js.UndefOr[String] = js.undefined
}

object PartialsheetNamestringrow {
  @scala.inline
  def apply(
    col: js.UndefOr[Double] = js.undefined,
    row: js.UndefOr[Double] = js.undefined,
    sheetName: String = null
  ): PartialsheetNamestringrow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(col)) __obj.updateDynamic("col")(col.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialsheetNamestringrow]
  }
}

