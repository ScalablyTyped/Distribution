package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListReports.
  */
@js.native
trait Schema$ListReportsResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportsRequest.page_token field in the subsequent call to
    * `ListReports` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of report types.
    */
  var reports: js.UndefOr[js.Array[Schema$Report]] = js.native
}

object Schema$ListReportsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, reports: js.Array[Schema$Report] = null): Schema$ListReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListReportsResponse]
  }
}

