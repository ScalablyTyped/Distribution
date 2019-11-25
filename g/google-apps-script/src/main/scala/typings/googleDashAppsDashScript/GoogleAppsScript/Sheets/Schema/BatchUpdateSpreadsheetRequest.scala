package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateSpreadsheetRequest extends js.Object {
  var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.undefined
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  var responseIncludeGridData: js.UndefOr[Boolean] = js.undefined
  var responseRanges: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchUpdateSpreadsheetRequest {
  @scala.inline
  def apply(
    includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.undefined,
    requests: js.Array[Request] = null,
    responseIncludeGridData: js.UndefOr[Boolean] = js.undefined,
    responseRanges: js.Array[String] = null
  ): BatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSpreadsheetInResponse)) __obj.updateDynamic("includeSpreadsheetInResponse")(includeSpreadsheetInResponse.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (!js.isUndefined(responseIncludeGridData)) __obj.updateDynamic("responseIncludeGridData")(responseIncludeGridData.asInstanceOf[js.Any])
    if (responseRanges != null) __obj.updateDynamic("responseRanges")(responseRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
  }
}

