package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait DOWN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Direction
  
  @js.native
  sealed trait NEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Direction
  
  @js.native
  sealed trait PREVIOUS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Direction
  
  @js.native
  sealed trait UP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Direction
  
  /* 1 */ val DOWN: DOWN with scala.Double = js.native
  /* 3 */ val NEXT: NEXT with scala.Double = js.native
  /* 2 */ val PREVIOUS: PREVIOUS with scala.Double = js.native
  /* 0 */ val UP: UP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Direction with scala.Double
  ] = js.native
}

