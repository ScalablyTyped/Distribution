package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindReplaceRequest extends js.Object {
  var allSheets: js.UndefOr[Boolean] = js.native
  var find: js.UndefOr[String] = js.native
  var includeFormulas: js.UndefOr[Boolean] = js.native
  var matchCase: js.UndefOr[Boolean] = js.native
  var matchEntireCell: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[GridRange] = js.native
  var replacement: js.UndefOr[String] = js.native
  var searchByRegex: js.UndefOr[Boolean] = js.native
  var sheetId: js.UndefOr[Double] = js.native
}

object FindReplaceRequest {
  @scala.inline
  def apply(): FindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindReplaceRequest]
  }
  @scala.inline
  implicit class FindReplaceRequestOps[Self <: FindReplaceRequest] (val x: Self) extends AnyVal {
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
    def setAllSheets(value: Boolean): Self = this.set("allSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllSheets: Self = this.set("allSheets", js.undefined)
    @scala.inline
    def setFind(value: String): Self = this.set("find", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    @scala.inline
    def setIncludeFormulas(value: Boolean): Self = this.set("includeFormulas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFormulas: Self = this.set("includeFormulas", js.undefined)
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    @scala.inline
    def setMatchEntireCell(value: Boolean): Self = this.set("matchEntireCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchEntireCell: Self = this.set("matchEntireCell", js.undefined)
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
    @scala.inline
    def setSearchByRegex(value: Boolean): Self = this.set("searchByRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchByRegex: Self = this.set("searchByRegex", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
  
}

