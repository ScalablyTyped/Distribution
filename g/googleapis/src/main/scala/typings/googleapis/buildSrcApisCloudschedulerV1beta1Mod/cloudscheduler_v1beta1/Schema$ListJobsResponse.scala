package typings.googleapis.buildSrcApisCloudschedulerV1beta1Mod.cloudscheduler_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing jobs using ListJobs.
  */
@js.native
trait Schema$ListJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[Schema$Job]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in the
    * page_token field in the subsequent call to ListJobs to retrieve the next
    * page of results. If this is empty it indicates that there are no more
    * results through which to paginate.  The page token is valid for only 2
    * hours.
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

