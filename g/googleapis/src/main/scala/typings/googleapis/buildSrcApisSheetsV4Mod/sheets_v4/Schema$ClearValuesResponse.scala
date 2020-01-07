package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when clearing a range of values in a spreadsheet.
  */
@js.native
trait Schema$ClearValuesResponse extends js.Object {
  /**
    * The range (in A1 notation) that was cleared. (If the request was for an
    * unbounded range or a ranger larger  than the bounds of the sheet, this
    * will be the actual range  that was cleared, bounded to the sheet&#39;s
    * limits.)
    */
  var clearedRange: js.UndefOr[String] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object Schema$ClearValuesResponse {
  @scala.inline
  def apply(clearedRange: String = null, spreadsheetId: String = null): Schema$ClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRange != null) __obj.updateDynamic("clearedRange")(clearedRange.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClearValuesResponse]
  }
}

