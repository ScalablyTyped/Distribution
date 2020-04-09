package typings.exceljs.mod

import typings.exceljs.PartialFastCsvFormatterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvWriteOptions extends js.Object {
  var dateFormat: String
  var dateUTC: Boolean
  var encoding: String
  var formatterOptions: PartialFastCsvFormatterOp
  var includeEmptyRows: Boolean
  var sheetId: Double
  var sheetName: String
  def map(value: js.Any, index: Double): js.Any
}

object CsvWriteOptions {
  @scala.inline
  def apply(
    dateFormat: String,
    dateUTC: Boolean,
    encoding: String,
    formatterOptions: PartialFastCsvFormatterOp,
    includeEmptyRows: Boolean,
    map: (js.Any, Double) => js.Any,
    sheetId: Double,
    sheetName: String
  ): CsvWriteOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateUTC = dateUTC.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], includeEmptyRows = includeEmptyRows.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), sheetId = sheetId.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CsvWriteOptions]
  }
}

