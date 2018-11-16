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
  
  val AFTER: AFTER with java.lang.String = js.native
  val BEFORE: BEFORE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.GroupControlTogglePosition with java.lang.String
  ] = js.native
}

