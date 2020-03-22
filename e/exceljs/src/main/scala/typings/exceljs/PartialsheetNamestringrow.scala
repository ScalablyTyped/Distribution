package typings.exceljs

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
  def apply(col: Int | Double = null, row: Int | Double = null, sheetName: String = null): PartialsheetNamestringrow = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialsheetNamestringrow]
  }
}

