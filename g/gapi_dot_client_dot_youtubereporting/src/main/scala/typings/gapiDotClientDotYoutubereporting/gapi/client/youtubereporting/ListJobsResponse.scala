package typings.gapiDotClientDotYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /** The list of jobs. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListJobsRequest.page_token
    * field in the subsequent call to `ListJobs` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[Job] = null, nextPageToken: String = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
}

