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

