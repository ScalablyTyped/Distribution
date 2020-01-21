package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesByDataFilterResponse extends js.Object {
  /** The ID of the spreadsheet the data was retrieved from. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  /** The requested values with the list of data filters that matched them. */
  var valueRanges: js.UndefOr[js.Array[MatchedValueRange]] = js.undefined
}

object BatchGetValuesByDataFilterResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, valueRanges: js.Array[MatchedValueRange] = null): BatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetValuesByDataFilterResponse]
  }
}

