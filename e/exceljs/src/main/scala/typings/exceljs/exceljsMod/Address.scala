package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  @JSName("$col$row")
  var $col$row: String
  var address: String
  var col: String
  var row: String
  var sheetName: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply($col$row: String, address: String, col: String, row: String, sheetName: String = null): Address = {
    val __obj = js.Dynamic.literal($col$row = $col$row, address = address, col = col, row = row)
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName)
    __obj.asInstanceOf[Address]
  }
}

