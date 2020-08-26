package typings.exceljs.mod

import typings.exceljs.anon.PartialFastCsvFormatterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvWriteOptions extends js.Object {
  var dateFormat: String = js.native
  var dateUTC: Boolean = js.native
  var encoding: String = js.native
  var formatterOptions: PartialFastCsvFormatterOp = js.native
  var includeEmptyRows: Boolean = js.native
  var sheetId: Double = js.native
  var sheetName: String = js.native
  def map(value: js.Any, index: Double): js.Any = js.native
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
  @scala.inline
  implicit class CsvWriteOptionsOps[Self <: CsvWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateUTC(value: Boolean): Self = this.set("dateUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatterOptions(value: PartialFastCsvFormatterOp): Self = this.set("formatterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = this.set("includeEmptyRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: (js.Any, Double) => js.Any): Self = this.set("map", js.Any.fromFunction2(value))
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
  }
  
}

