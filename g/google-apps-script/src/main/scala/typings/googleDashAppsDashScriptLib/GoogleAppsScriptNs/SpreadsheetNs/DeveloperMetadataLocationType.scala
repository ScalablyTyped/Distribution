package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeveloperMetadataLocationType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
@js.native
object DeveloperMetadataLocationType extends js.Object {
  @js.native
  sealed trait COLUMN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType
  
  @js.native
  sealed trait ROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType
  
  @js.native
  sealed trait SHEET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType
  
  @js.native
  sealed trait SPREADSHEET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType
  
  /* 3 */ val COLUMN: COLUMN with scala.Double = js.native
  /* 2 */ val ROW: ROW with scala.Double = js.native
  /* 1 */ val SHEET: SHEET with scala.Double = js.native
  /* 0 */ val SPREADSHEET: SPREADSHEET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType with scala.Double
  ] = js.native
}

