package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Dimension extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
@js.native
object Dimension extends js.Object {
  @js.native
  sealed trait COLUMNS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Dimension
  
  @js.native
  sealed trait ROWS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Dimension
  
  val COLUMNS: COLUMNS with java.lang.String = js.native
  val ROWS: ROWS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Dimension with java.lang.String
  ] = js.native
}

