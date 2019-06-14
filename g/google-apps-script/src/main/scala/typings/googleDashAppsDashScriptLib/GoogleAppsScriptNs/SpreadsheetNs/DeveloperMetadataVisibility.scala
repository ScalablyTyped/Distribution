package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeveloperMetadataVisibility extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility")
@js.native
object DeveloperMetadataVisibility extends js.Object {
  @js.native
  sealed trait DOCUMENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataVisibility
  
  @js.native
  sealed trait PROJECT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataVisibility
  
  /* 0 */ val DOCUMENT: DOCUMENT with scala.Double = js.native
  /* 1 */ val PROJECT: PROJECT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataVisibility with scala.Double
  ] = js.native
}

