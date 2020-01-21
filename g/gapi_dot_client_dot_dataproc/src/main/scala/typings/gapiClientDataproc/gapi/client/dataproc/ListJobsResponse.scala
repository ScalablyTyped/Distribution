package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /** Output-only. Jobs list. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  /**
    * Optional. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token
    * in a subsequent <code>ListJobsRequest</code>.
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

