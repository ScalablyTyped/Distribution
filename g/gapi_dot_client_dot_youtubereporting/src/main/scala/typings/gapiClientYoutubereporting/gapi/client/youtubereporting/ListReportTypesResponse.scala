package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListReportTypesRequest.page_token
    * field in the subsequent call to `ListReportTypes` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of report types. */
  var reportTypes: js.UndefOr[js.Array[ReportType]] = js.undefined
}

object ListReportTypesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, reportTypes: js.Array[ReportType] = null): ListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (reportTypes != null) __obj.updateDynamic("reportTypes")(reportTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReportTypesResponse]
  }
}

