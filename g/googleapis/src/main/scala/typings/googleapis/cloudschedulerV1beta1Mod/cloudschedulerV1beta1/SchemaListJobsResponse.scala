package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing jobs using ListJobs.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in the
    * page_token field in the subsequent call to ListJobs to retrieve the next
    * page of results. If this is empty it indicates that there are no more
    * results through which to paginate.  The page token is valid for only 2
    * hours.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[SchemaJob] = null, nextPageToken: String = null): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
}

