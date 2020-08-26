package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperMetadataLocation extends js.Object {
  var dimensionRange: js.UndefOr[DimensionRange] = js.native
  var locationType: js.UndefOr[String] = js.native
  var sheetId: js.UndefOr[Double] = js.native
  var spreadsheet: js.UndefOr[Boolean] = js.native
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  @scala.inline
  implicit class DeveloperMetadataLocationOps[Self <: DeveloperMetadataLocation] (val x: Self) extends AnyVal {
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
    def setDimensionRange(value: DimensionRange): Self = this.set("dimensionRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionRange: Self = this.set("dimensionRange", js.undefined)
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    @scala.inline
    def setSpreadsheet(value: Boolean): Self = this.set("spreadsheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheet: Self = this.set("spreadsheet", js.undefined)
  }
  
}

