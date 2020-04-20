package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access developer metadata location information.
  */
trait DeveloperMetadataLocation extends js.Object {
  def getColumn(): Range | Null
  def getLocationType(): DeveloperMetadataLocationType
  def getRow(): Range | Null
  def getSheet(): Sheet | Null
  def getSpreadsheet(): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null
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
}

