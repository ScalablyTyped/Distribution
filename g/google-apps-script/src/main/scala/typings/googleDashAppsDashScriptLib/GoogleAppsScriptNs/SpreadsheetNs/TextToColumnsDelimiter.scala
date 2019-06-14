package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextToColumnsDelimiter extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
@js.native
object TextToColumnsDelimiter extends js.Object {
  @js.native
  sealed trait COMMA
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter
  
  @js.native
  sealed trait PERIOD
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter
  
  @js.native
  sealed trait SEMICOLON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter
  
  @js.native
  sealed trait SPACE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter
  
  /* 0 */ val COMMA: COMMA with scala.Double = js.native
  /* 2 */ val PERIOD: PERIOD with scala.Double = js.native
  /* 1 */ val SEMICOLON: SEMICOLON with scala.Double = js.native
  /* 3 */ val SPACE: SPACE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter with scala.Double
  ] = js.native
}

