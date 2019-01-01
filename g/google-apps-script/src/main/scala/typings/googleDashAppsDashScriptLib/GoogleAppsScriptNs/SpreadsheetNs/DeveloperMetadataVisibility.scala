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
  
  val DOCUMENT: DOCUMENT with java.lang.String = js.native
  val PROJECT: PROJECT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DeveloperMetadataVisibility with java.lang.String
  ] = js.native
}

