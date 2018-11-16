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
  
  val DOWN: DOWN with java.lang.String = js.native
  val NEXT: NEXT with java.lang.String = js.native
  val PREVIOUS: PREVIOUS with java.lang.String = js.native
  val UP: UP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Direction with java.lang.String
  ] = js.native
}

