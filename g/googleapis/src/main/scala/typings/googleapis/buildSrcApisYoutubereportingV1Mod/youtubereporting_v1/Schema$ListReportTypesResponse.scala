package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListReportTypes.
  */
@js.native
trait Schema$ListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportTypesRequest.page_token field in the subsequent call to
    * `ListReportTypes` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of report types.
    */
  var reportTypes: js.UndefOr[js.Array[Schema$ReportType]] = js.native
}

object Schema$ListReportTypesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, reportTypes: js.Array[Schema$ReportType] = null): Schema$ListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (reportTypes != null) __obj.updateDynamic("reportTypes")(reportTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListReportTypesResponse]
  }
}

