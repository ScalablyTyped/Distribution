package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextToColumnsDelimiter extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
@js.native
object TextToColumnsDelimiter extends js.Object {
  @js.native
  sealed trait COMMA extends TextToColumnsDelimiter
  
  @js.native
  sealed trait PERIOD extends TextToColumnsDelimiter
  
  @js.native
  sealed trait SEMICOLON extends TextToColumnsDelimiter
  
  @js.native
  sealed trait SPACE extends TextToColumnsDelimiter
  
  /* 0 */ val COMMA: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter.COMMA with Double = js.native
  /* 2 */ val PERIOD: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter.PERIOD with Double = js.native
  /* 1 */ val SEMICOLON: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter.SEMICOLON with Double = js.native
  /* 3 */ val SPACE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter.SPACE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextToColumnsDelimiter with Double] = js.native
}

