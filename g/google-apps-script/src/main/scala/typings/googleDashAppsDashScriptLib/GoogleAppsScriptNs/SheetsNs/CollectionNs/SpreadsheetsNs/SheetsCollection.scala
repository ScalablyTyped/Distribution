package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.CollectionNs.SpreadsheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsCollection extends js.Object {
  // Copies a single sheet from a spreadsheet to another spreadsheet.
  // Returns the properties of the newly created sheet.
  def copyTo(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs.CopySheetToAnotherSpreadsheetRequest,
    spreadsheetId: java.lang.String,
    sheetId: scala.Double
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs.SheetProperties
}

object SheetsCollection {
  @scala.inline
  def apply(
    copyTo: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs.CopySheetToAnotherSpreadsheetRequest, java.lang.String, scala.Double) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs.SheetProperties
  ): SheetsCollection = {
    val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction3(copyTo))
  
    __obj.asInstanceOf[SheetsCollection]
  }
}

