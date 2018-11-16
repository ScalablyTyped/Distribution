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
  
  val CLIP: CLIP with java.lang.String = js.native
  val OVERFLOW: OVERFLOW with java.lang.String = js.native
  val WRAP: WRAP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.WrapStrategy with java.lang.String
  ] = js.native
}

