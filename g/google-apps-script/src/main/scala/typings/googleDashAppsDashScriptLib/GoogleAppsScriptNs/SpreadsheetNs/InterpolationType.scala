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
  
  val MAX: MAX with java.lang.String = js.native
  val MIN: MIN with java.lang.String = js.native
  val NUMBER: NUMBER with java.lang.String = js.native
  val PERCENT: PERCENT with java.lang.String = js.native
  val PERCENTILE: PERCENTILE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.InterpolationType with java.lang.String
  ] = js.native
}

