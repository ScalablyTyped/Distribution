package typings.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopySheetToAnotherSpreadsheetRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.SheetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsCollection extends js.Object {
  // Copies a single sheet from a spreadsheet to another spreadsheet.
  // Returns the properties of the newly created sheet.
  def copyTo(resource: CopySheetToAnotherSpreadsheetRequest, spreadsheetId: String, sheetId: Double): SheetProperties = js.native
}

object SheetsCollection {
  @scala.inline
  def apply(copyTo: (CopySheetToAnotherSpreadsheetRequest, String, Double) => SheetProperties): SheetsCollection = {
    val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction3(copyTo))
    __obj.asInstanceOf[SheetsCollection]
  }
  @scala.inline
  implicit class SheetsCollectionOps[Self <: SheetsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopyTo(value: (CopySheetToAnotherSpreadsheetRequest, String, Double) => SheetProperties): Self = this.set("copyTo", js.Any.fromFunction3(value))
  }
  
}

