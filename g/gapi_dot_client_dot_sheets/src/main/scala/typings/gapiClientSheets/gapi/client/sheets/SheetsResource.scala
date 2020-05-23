package typings.gapiClientSheets.gapi.client.sheets

import typings.gapiClientSheets.anon.Fields
import typings.gapiClientSheets.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsResource extends js.Object {
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
    */
  def copyTo(request: Fields): typings.gapiClient.gapi.client.Request[SheetProperties] = js.native
  def copyTo(request: Key, body: CopySheetToAnotherSpreadsheetRequest): typings.gapiClient.gapi.client.Request[SheetProperties] = js.native
}

