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
  
  /* 0 */ val RANGE: RANGE with scala.Double = js.native
  /* 1 */ val SHEET: SHEET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.ProtectionType with scala.Double
  ] = js.native
}

