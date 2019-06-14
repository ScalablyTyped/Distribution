package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecalculationInterval extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
@js.native
object RecalculationInterval extends js.Object {
  @js.native
  sealed trait HOUR
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval
  
  @js.native
  sealed trait MINUTE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval
  
  @js.native
  sealed trait ON_CHANGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval
  
  /* 2 */ val HOUR: HOUR with scala.Double = js.native
  /* 1 */ val MINUTE: MINUTE with scala.Double = js.native
  /* 0 */ val ON_CHANGE: ON_CHANGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval with scala.Double
  ] = js.native
}

