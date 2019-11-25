package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySheetToAnotherSpreadsheetRequest extends js.Object {
  var destinationSpreadsheetId: js.UndefOr[String] = js.undefined
}

object CopySheetToAnotherSpreadsheetRequest {
  @scala.inline
  def apply(destinationSpreadsheetId: String = null): CopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationSpreadsheetId != null) __obj.updateDynamic("destinationSpreadsheetId")(destinationSpreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySheetToAnotherSpreadsheetRequest]
  }
}

