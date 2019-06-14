package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InterpolationType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
@js.native
object InterpolationType extends js.Object {
  @js.native
  sealed trait MAX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType
  
  @js.native
  sealed trait MIN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType
  
  @js.native
  sealed trait NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType
  
  @js.native
  sealed trait PERCENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType
  
  @js.native
  sealed trait PERCENTILE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType
  
  /* 4 */ val MAX: MAX with scala.Double = js.native
  /* 3 */ val MIN: MIN with scala.Double = js.native
  /* 0 */ val NUMBER: NUMBER with scala.Double = js.native
  /* 1 */ val PERCENT: PERCENT with scala.Double = js.native
  /* 2 */ val PERCENTILE: PERCENTILE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType with scala.Double
  ] = js.native
}

