package typings.gapiClientSheets.gapi.client.sheets

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSheets.AnonFields
import typings.gapiClientSheets.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsResource extends js.Object {
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
    */
  def copyTo(request: AnonFields): Request_[SheetProperties] = js.native
  def copyTo(request: AnonKey, body: CopySheetToAnotherSpreadsheetRequest): Request_[SheetProperties] = js.native
}

