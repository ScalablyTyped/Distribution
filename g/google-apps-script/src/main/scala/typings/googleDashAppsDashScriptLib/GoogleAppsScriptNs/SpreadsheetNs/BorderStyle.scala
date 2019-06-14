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
  
  /* 1 */ val DASHED: DASHED with scala.Double = js.native
  /* 0 */ val DOTTED: DOTTED with scala.Double = js.native
  /* 5 */ val DOUBLE: DOUBLE with scala.Double = js.native
  /* 2 */ val SOLID: SOLID with scala.Double = js.native
  /* 3 */ val SOLID_MEDIUM: SOLID_MEDIUM with scala.Double = js.native
  /* 4 */ val SOLID_THICK: SOLID_THICK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle with scala.Double
  ] = js.native
}

