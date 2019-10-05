package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.CopySheetToAnotherSpreadsheetRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.SheetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsCollection extends js.Object {
  // Copies a single sheet from a spreadsheet to another spreadsheet.
  // Returns the properties of the newly created sheet.
  def copyTo(resource: CopySheetToAnotherSpreadsheetRequest, spreadsheetId: String, sheetId: Double): SheetProperties
}

object SheetsCollection {
  @scala.inline
  def apply(copyTo: (CopySheetToAnotherSpreadsheetRequest, String, Double) => SheetProperties): SheetsCollection = {
    val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction3(copyTo))
  
    __obj.asInstanceOf[SheetsCollection]
  }
}

