package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLocation extends js.Object {
  def getColumn(): Range
  def getLocationType(): DeveloperMetadataLocationType
  def getRow(): Range
  def getSheet(): Sheet
  def getSpreadsheet(): Spreadsheet
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    getColumn: () => Range,
    getLocationType: () => DeveloperMetadataLocationType,
    getRow: () => Range,
    getSheet: () => Sheet,
    getSpreadsheet: () => Spreadsheet
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(getColumn = js.Any.fromFunction0(getColumn), getLocationType = js.Any.fromFunction0(getLocationType), getRow = js.Any.fromFunction0(getRow), getSheet = js.Any.fromFunction0(getSheet), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet))
  
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
}

