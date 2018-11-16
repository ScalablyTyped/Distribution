package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProtectionType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.ProtectionType")
@js.native
object ProtectionType extends js.Object {
  @js.native
  sealed trait RANGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.ProtectionType
  
  @js.native
  sealed trait SHEET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.ProtectionType
  
  val RANGE: RANGE with java.lang.String = js.native
  val SHEET: SHEET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.ProtectionType with java.lang.String
  ] = js.native
}

