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
  
  /* 7 */ val PASTE_COLUMN_WIDTHS: PASTE_COLUMN_WIDTHS with scala.Double = js.native
  /* 6 */ val PASTE_CONDITIONAL_FORMATTING: PASTE_CONDITIONAL_FORMATTING with scala.Double = js.native
  /* 4 */ val PASTE_DATA_VALIDATION: PASTE_DATA_VALIDATION with scala.Double = js.native
  /* 2 */ val PASTE_FORMAT: PASTE_FORMAT with scala.Double = js.native
  /* 3 */ val PASTE_FORMULA: PASTE_FORMULA with scala.Double = js.native
  /* 0 */ val PASTE_NORMAL: PASTE_NORMAL with scala.Double = js.native
  /* 1 */ val PASTE_NO_BORDERS: PASTE_NO_BORDERS with scala.Double = js.native
  /* 5 */ val PASTE_VALUES: PASTE_VALUES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType with scala.Double
  ] = js.native
}

