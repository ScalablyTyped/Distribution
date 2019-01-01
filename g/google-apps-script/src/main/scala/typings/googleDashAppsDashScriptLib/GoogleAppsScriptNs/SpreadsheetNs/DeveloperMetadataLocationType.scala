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
  
  val COLUMN: COLUMN with java.lang.String = js.native
  val ROW: ROW with java.lang.String = js.native
  val SHEET: SHEET with java.lang.String = js.native
  val SPREADSHEET: SPREADSHEET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataLocationType with java.lang.String
  ] = js.native
}

