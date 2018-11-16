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
  
  val COMMA: COMMA with java.lang.String = js.native
  val PERIOD: PERIOD with java.lang.String = js.native
  val SEMICOLON: SEMICOLON with java.lang.String = js.native
  val SPACE: SPACE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.TextToColumnsDelimiter with java.lang.String
  ] = js.native
}

