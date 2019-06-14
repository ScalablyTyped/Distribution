package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrapStrategy extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
@js.native
object WrapStrategy extends js.Object {
  @js.native
  sealed trait CLIP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.WrapStrategy
  
  @js.native
  sealed trait OVERFLOW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.WrapStrategy
  
  @js.native
  sealed trait WRAP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.WrapStrategy
  
  /* 2 */ val CLIP: CLIP with scala.Double = js.native
  /* 1 */ val OVERFLOW: OVERFLOW with scala.Double = js.native
  /* 0 */ val WRAP: WRAP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.WrapStrategy with scala.Double
  ] = js.native
}

