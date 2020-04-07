package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  @JSName("$col$row")
  var DollarcolDollarrow: String
  var address: String
  var col: String
  var row: String
  var sheetName: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(DollarcolDollarrow: String, address: String, col: String, row: String, sheetName: String = null): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("$col$row")(DollarcolDollarrow.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

