package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecalculationInterval extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
@js.native
object RecalculationInterval extends js.Object {
  @js.native
  sealed trait HOUR extends RecalculationInterval
  
  @js.native
  sealed trait MINUTE extends RecalculationInterval
  
  @js.native
  sealed trait ON_CHANGE extends RecalculationInterval
  
  /* 2 */ val HOUR: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval.HOUR with Double = js.native
  /* 1 */ val MINUTE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval.MINUTE with Double = js.native
  /* 0 */ val ON_CHANGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.RecalculationInterval.ON_CHANGE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecalculationInterval with Double] = js.native
}

