package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderStyle extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
@js.native
object BorderStyle extends js.Object {
  @js.native
  sealed trait DASHED extends BorderStyle
  
  @js.native
  sealed trait DOTTED extends BorderStyle
  
  @js.native
  sealed trait DOUBLE extends BorderStyle
  
  @js.native
  sealed trait SOLID extends BorderStyle
  
  @js.native
  sealed trait SOLID_MEDIUM extends BorderStyle
  
  @js.native
  sealed trait SOLID_THICK extends BorderStyle
  
  /* 1 */ val DASHED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle.DASHED with Double = js.native
  /* 0 */ val DOTTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle.DOTTED with Double = js.native
  /* 5 */ val DOUBLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle.DOUBLE with Double = js.native
  /* 2 */ val SOLID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle.SOLID with Double = js.native
  /* 3 */ val SOLID_MEDIUM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle.SOLID_MEDIUM with Double = js.native
  /* 4 */ val SOLID_THICK: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.BorderStyle.SOLID_THICK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BorderStyle with Double] = js.native
}

