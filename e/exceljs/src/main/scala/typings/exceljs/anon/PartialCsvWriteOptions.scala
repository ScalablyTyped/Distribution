package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvWriteOptions> */
@js.native
trait PartialCsvWriteOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.native
  var dateUTC: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var formatterOptions: js.UndefOr[PartialFastCsvFormatterOp] = js.native
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, _]] = js.native
  var sheetId: js.UndefOr[Double] = js.native
  var sheetName: js.UndefOr[String] = js.native
}

object PartialCsvWriteOptions {
  @scala.inline
  def apply(): PartialCsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCsvWriteOptions]
  }
  @scala.inline
  implicit class PartialCsvWriteOptionsOps[Self <: PartialCsvWriteOptions] (val x: Self) extends AnyVal {
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
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDateUTC(value: Boolean): Self = this.set("dateUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateUTC: Self = this.set("dateUTC", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFormatterOptions(value: PartialFastCsvFormatterOp): Self = this.set("formatterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatterOptions: Self = this.set("formatterOptions", js.undefined)
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = this.set("includeEmptyRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeEmptyRows: Self = this.set("includeEmptyRows", js.undefined)
    @scala.inline
    def setMap(value: (/* value */ js.Any, /* index */ Double) => _): Self = this.set("map", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetName: Self = this.set("sheetName", js.undefined)
  }
  
}

