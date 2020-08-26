package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access developer metadata location information.
  */
@js.native
trait DeveloperMetadataLocation extends js.Object {
  def getColumn(): Range | Null = js.native
  def getLocationType(): DeveloperMetadataLocationType = js.native
  def getRow(): Range | Null = js.native
  def getSheet(): Sheet | Null = js.native
  def getSpreadsheet(): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null = js.native
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    getColumn: () => Range | Null,
    getLocationType: () => DeveloperMetadataLocationType,
    getRow: () => Range | Null,
    getSheet: () => Sheet | Null,
    getSpreadsheet: () => typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(getColumn = js.Any.fromFunction0(getColumn), getLocationType = js.Any.fromFunction0(getLocationType), getRow = js.Any.fromFunction0(getRow), getSheet = js.Any.fromFunction0(getSheet), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet))
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
    def setGetColumn(value: () => Range | Null): Self = this.set("getColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocationType(value: () => DeveloperMetadataLocationType): Self = this.set("getLocationType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRow(value: () => Range | Null): Self = this.set("getRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSheet(value: () => Sheet | Null): Self = this.set("getSheet", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpreadsheet(value: () => typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null): Self = this.set("getSpreadsheet", js.Any.fromFunction0(value))
  }
  
}

