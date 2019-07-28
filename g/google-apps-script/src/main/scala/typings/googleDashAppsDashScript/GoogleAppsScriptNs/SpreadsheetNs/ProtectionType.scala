package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProtectionType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.ProtectionType")
@js.native
object ProtectionType extends js.Object {
  @js.native
  sealed trait RANGE extends ProtectionType
  
  @js.native
  sealed trait SHEET extends ProtectionType
  
  /* 0 */ val RANGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.ProtectionType.RANGE with Double = js.native
  /* 1 */ val SHEET: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.ProtectionType.SHEET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionType with Double] = js.native
}

