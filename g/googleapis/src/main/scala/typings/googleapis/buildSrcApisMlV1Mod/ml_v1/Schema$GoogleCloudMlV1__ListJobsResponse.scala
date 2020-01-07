package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListJobs method.
  */
@js.native
trait Schema$GoogleCloudMlV1__ListJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__Job]] = js.native
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__ListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[Schema$GoogleCloudMlV1__Job] = null, nextPageToken: String = null): Schema$GoogleCloudMlV1__ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__ListJobsResponse]
  }
}

