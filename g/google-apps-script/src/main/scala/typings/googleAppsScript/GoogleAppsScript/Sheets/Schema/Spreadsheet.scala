package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spreadsheet extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.native
  var properties: js.UndefOr[SpreadsheetProperties] = js.native
  var sheets: js.UndefOr[js.Array[Sheet]] = js.native
  var spreadsheetId: js.UndefOr[String] = js.native
  var spreadsheetUrl: js.UndefOr[String] = js.native
}

object Spreadsheet {
  @scala.inline
  def apply(): Spreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spreadsheet]
  }
  @scala.inline
  implicit class SpreadsheetOps[Self <: Spreadsheet] (val x: Self) extends AnyVal {
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
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = this.set("developerMetadata", js.Array(value :_*))
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
    @scala.inline
    def setNamedRangesVarargs(value: NamedRange*): Self = this.set("namedRanges", js.Array(value :_*))
    @scala.inline
    def setNamedRanges(value: js.Array[NamedRange]): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
    @scala.inline
    def setProperties(value: SpreadsheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = this.set("sheets", js.Array(value :_*))
    @scala.inline
    def setSheets(value: js.Array[Sheet]): Self = this.set("sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheets: Self = this.set("sheets", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    @scala.inline
    def setSpreadsheetUrl(value: String): Self = this.set("spreadsheetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetUrl: Self = this.set("spreadsheetUrl", js.undefined)
  }
  
}

