package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListJobs.
  */
@js.native
trait Schema$ListJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[Schema$Job]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListJobsRequest.page_token field in the subsequent call to `ListJobs`
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[Schema$Job] = null, nextPageToken: String = null): Schema$ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListJobsResponse]
  }
}

