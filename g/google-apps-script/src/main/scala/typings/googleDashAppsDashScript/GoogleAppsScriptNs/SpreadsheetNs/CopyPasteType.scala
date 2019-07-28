package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CopyPasteType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
@js.native
object CopyPasteType extends js.Object {
  @js.native
  sealed trait PASTE_COLUMN_WIDTHS extends CopyPasteType
  
  @js.native
  sealed trait PASTE_CONDITIONAL_FORMATTING extends CopyPasteType
  
  @js.native
  sealed trait PASTE_DATA_VALIDATION extends CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMAT extends CopyPasteType
  
  @js.native
  sealed trait PASTE_FORMULA extends CopyPasteType
  
  @js.native
  sealed trait PASTE_NORMAL extends CopyPasteType
  
  @js.native
  sealed trait PASTE_NO_BORDERS extends CopyPasteType
  
  @js.native
  sealed trait PASTE_VALUES extends CopyPasteType
  
  /* 7 */ val PASTE_COLUMN_WIDTHS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_COLUMN_WIDTHS with Double = js.native
  /* 6 */ val PASTE_CONDITIONAL_FORMATTING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_CONDITIONAL_FORMATTING with Double = js.native
  /* 4 */ val PASTE_DATA_VALIDATION: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_DATA_VALIDATION with Double = js.native
  /* 2 */ val PASTE_FORMAT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_FORMAT with Double = js.native
  /* 3 */ val PASTE_FORMULA: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_FORMULA with Double = js.native
  /* 0 */ val PASTE_NORMAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_NORMAL with Double = js.native
  /* 1 */ val PASTE_NO_BORDERS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_NO_BORDERS with Double = js.native
  /* 5 */ val PASTE_VALUES: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.CopyPasteType.PASTE_VALUES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CopyPasteType with Double] = js.native
}

