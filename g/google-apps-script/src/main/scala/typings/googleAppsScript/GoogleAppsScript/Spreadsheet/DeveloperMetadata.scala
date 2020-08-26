package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify developer metadata. To create new developer metadata use Range.addDeveloperMetadata(key), Sheet.addDeveloperMetadata(key), or Spreadsheet.addDeveloperMetadata(key).
  */
@js.native
trait DeveloperMetadata extends js.Object {
  def getId(): Integer = js.native
  def getKey(): String = js.native
  def getLocation(): DeveloperMetadataLocation = js.native
  def getValue(): String | Null = js.native
  def getVisibility(): DeveloperMetadataVisibility = js.native
  def moveToColumn(column: Range): DeveloperMetadata = js.native
  def moveToRow(row: Range): DeveloperMetadata = js.native
  def moveToSheet(sheet: Sheet): DeveloperMetadata = js.native
  def moveToSpreadsheet(): DeveloperMetadata = js.native
  def remove(): Unit = js.native
  def setKey(key: String): DeveloperMetadata = js.native
  def setValue(value: String): DeveloperMetadata = js.native
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata = js.native
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    getId: () => Integer,
    getKey: () => String,
    getLocation: () => DeveloperMetadataLocation,
    getValue: () => String | Null,
    getVisibility: () => DeveloperMetadataVisibility,
    moveToColumn: Range => DeveloperMetadata,
    moveToRow: Range => DeveloperMetadata,
    moveToSheet: Sheet => DeveloperMetadata,
    moveToSpreadsheet: () => DeveloperMetadata,
    remove: () => Unit,
    setKey: String => DeveloperMetadata,
    setValue: String => DeveloperMetadata,
    setVisibility: DeveloperMetadataVisibility => DeveloperMetadata
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getKey = js.Any.fromFunction0(getKey), getLocation = js.Any.fromFunction0(getLocation), getValue = js.Any.fromFunction0(getValue), getVisibility = js.Any.fromFunction0(getVisibility), moveToColumn = js.Any.fromFunction1(moveToColumn), moveToRow = js.Any.fromFunction1(moveToRow), moveToSheet = js.Any.fromFunction1(moveToSheet), moveToSpreadsheet = js.Any.fromFunction0(moveToSpreadsheet), remove = js.Any.fromFunction0(remove), setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[DeveloperMetadata]
  }
  @scala.inline
  implicit class DeveloperMetadataOps[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
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
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKey(value: () => String): Self = this.set("getKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocation(value: () => DeveloperMetadataLocation): Self = this.set("getLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => String | Null): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVisibility(value: () => DeveloperMetadataVisibility): Self = this.set("getVisibility", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToColumn(value: Range => DeveloperMetadata): Self = this.set("moveToColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToRow(value: Range => DeveloperMetadata): Self = this.set("moveToRow", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToSheet(value: Sheet => DeveloperMetadata): Self = this.set("moveToSheet", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToSpreadsheet(value: () => DeveloperMetadata): Self = this.set("moveToSpreadsheet", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setSetKey(value: String => DeveloperMetadata): Self = this.set("setKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: String => DeveloperMetadata): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVisibility(value: DeveloperMetadataVisibility => DeveloperMetadata): Self = this.set("setVisibility", js.Any.fromFunction1(value))
  }
  
}

