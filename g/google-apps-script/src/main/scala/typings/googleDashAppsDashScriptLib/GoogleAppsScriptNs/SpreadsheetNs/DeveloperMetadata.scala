package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getKey(): java.lang.String
  def getLocation(): DeveloperMetadataLocation
  def getValue(): java.lang.String
  def getVisibility(): DeveloperMetadataVisibility
  def moveToColumn(column: Range): DeveloperMetadata
  def moveToRow(row: Range): DeveloperMetadata
  def moveToSheet(sheet: Sheet): DeveloperMetadata
  def moveToSpreadsheet(): DeveloperMetadata
  def remove(): scala.Unit
  def setKey(key: java.lang.String): DeveloperMetadata
  def setValue(value: java.lang.String): DeveloperMetadata
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getKey: () => java.lang.String,
    getLocation: () => DeveloperMetadataLocation,
    getValue: () => java.lang.String,
    getVisibility: () => DeveloperMetadataVisibility,
    moveToColumn: Range => DeveloperMetadata,
    moveToRow: Range => DeveloperMetadata,
    moveToSheet: Sheet => DeveloperMetadata,
    moveToSpreadsheet: () => DeveloperMetadata,
    remove: () => scala.Unit,
    setKey: java.lang.String => DeveloperMetadata,
    setValue: java.lang.String => DeveloperMetadata,
    setVisibility: DeveloperMetadataVisibility => DeveloperMetadata
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getKey = js.Any.fromFunction0(getKey), getLocation = js.Any.fromFunction0(getLocation), getValue = js.Any.fromFunction0(getValue), getVisibility = js.Any.fromFunction0(getVisibility), moveToColumn = js.Any.fromFunction1(moveToColumn), moveToRow = js.Any.fromFunction1(moveToRow), moveToSheet = js.Any.fromFunction1(moveToSheet), moveToSpreadsheet = js.Any.fromFunction0(moveToSpreadsheet), remove = js.Any.fromFunction0(remove), setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue), setVisibility = js.Any.fromFunction1(setVisibility))
  
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

