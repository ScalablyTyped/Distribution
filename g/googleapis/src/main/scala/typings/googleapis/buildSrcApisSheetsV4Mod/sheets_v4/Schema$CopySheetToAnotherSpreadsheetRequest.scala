package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to copy a sheet across spreadsheets.
  */
@js.native
trait Schema$CopySheetToAnotherSpreadsheetRequest extends js.Object {
  /**
    * The ID of the spreadsheet to copy the sheet to.
    */
  var destinationSpreadsheetId: js.UndefOr[String] = js.native
}

object Schema$CopySheetToAnotherSpreadsheetRequest {
  @scala.inline
  def apply(destinationSpreadsheetId: String = null): Schema$CopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationSpreadsheetId != null) __obj.updateDynamic("destinationSpreadsheetId")(destinationSpreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CopySheetToAnotherSpreadsheetRequest]
  }
}

