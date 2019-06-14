package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupControlTogglePosition extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
@js.native
object GroupControlTogglePosition extends js.Object {
  @js.native
  sealed trait AFTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.GroupControlTogglePosition
  
  @js.native
  sealed trait BEFORE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.GroupControlTogglePosition
  
  /* 1 */ val AFTER: AFTER with scala.Double = js.native
  /* 0 */ val BEFORE: BEFORE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.GroupControlTogglePosition with scala.Double
  ] = js.native
}

