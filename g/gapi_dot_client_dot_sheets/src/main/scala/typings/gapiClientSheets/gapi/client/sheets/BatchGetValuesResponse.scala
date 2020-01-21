package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesResponse extends js.Object {
  /** The ID of the spreadsheet the data was retrieved from. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  /**
    * The requested values. The order of the ValueRanges is the same as the
    * order of the requested ranges.
    */
  var valueRanges: js.UndefOr[js.Array[ValueRange]] = js.undefined
}

object BatchGetValuesResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, valueRanges: js.Array[ValueRange] = null): BatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetValuesResponse]
  }
}

