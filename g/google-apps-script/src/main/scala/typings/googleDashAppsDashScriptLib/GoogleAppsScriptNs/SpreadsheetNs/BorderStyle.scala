package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderStyle extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
@js.native
object BorderStyle extends js.Object {
  @js.native
  sealed trait DASHED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle
  
  @js.native
  sealed trait DOTTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle
  
  @js.native
  sealed trait DOUBLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle
  
  @js.native
  sealed trait SOLID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle
  
  @js.native
  sealed trait SOLID_MEDIUM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle
  
  @js.native
  sealed trait SOLID_THICK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle
  
  val DASHED: DASHED with java.lang.String = js.native
  val DOTTED: DOTTED with java.lang.String = js.native
  val DOUBLE: DOUBLE with java.lang.String = js.native
  val SOLID: SOLID with java.lang.String = js.native
  val SOLID_MEDIUM: SOLID_MEDIUM with java.lang.String = js.native
  val SOLID_THICK: SOLID_THICK with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle with java.lang.String
  ] = js.native
}

