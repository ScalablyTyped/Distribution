package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeveloperMetadataLocationType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
@js.native
object DeveloperMetadataLocationType extends js.Object {
  @js.native
  sealed trait COLUMN extends DeveloperMetadataLocationType
  
  @js.native
  sealed trait ROW extends DeveloperMetadataLocationType
  
  @js.native
  sealed trait SHEET extends DeveloperMetadataLocationType
  
  @js.native
  sealed trait SPREADSHEET extends DeveloperMetadataLocationType
  
  /* 3 */ val COLUMN: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType.COLUMN with Double = js.native
  /* 2 */ val ROW: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType.ROW with Double = js.native
  /* 1 */ val SHEET: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType.SHEET with Double = js.native
  /* 0 */ val SPREADSHEET: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType.SPREADSHEET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeveloperMetadataLocationType with Double] = js.native
}

