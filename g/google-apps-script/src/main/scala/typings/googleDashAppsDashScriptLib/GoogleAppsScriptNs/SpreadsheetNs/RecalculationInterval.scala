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
  
  val HOUR: HOUR with java.lang.String = js.native
  val MINUTE: MINUTE with java.lang.String = js.native
  val ON_CHANGE: ON_CHANGE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval with java.lang.String
  ] = js.native
}

