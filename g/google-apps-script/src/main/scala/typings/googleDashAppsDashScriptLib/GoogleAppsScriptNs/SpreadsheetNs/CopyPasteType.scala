package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CopyPasteType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
@js.native
object CopyPasteType extends js.Object {
  @js.native
  sealed trait PASTE_COLUMN_WIDTHS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_CONDITIONAL_FORMATTING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_DATA_VALIDATION
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMAT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMULA
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_NORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_NO_BORDERS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  @js.native
  sealed trait PASTE_VALUES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType
  
  val PASTE_COLUMN_WIDTHS: PASTE_COLUMN_WIDTHS with java.lang.String = js.native
  val PASTE_CONDITIONAL_FORMATTING: PASTE_CONDITIONAL_FORMATTING with java.lang.String = js.native
  val PASTE_DATA_VALIDATION: PASTE_DATA_VALIDATION with java.lang.String = js.native
  val PASTE_FORMAT: PASTE_FORMAT with java.lang.String = js.native
  val PASTE_FORMULA: PASTE_FORMULA with java.lang.String = js.native
  val PASTE_NORMAL: PASTE_NORMAL with java.lang.String = js.native
  val PASTE_NO_BORDERS: PASTE_NO_BORDERS with java.lang.String = js.native
  val PASTE_VALUES: PASTE_VALUES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType with java.lang.String
  ] = js.native
}

