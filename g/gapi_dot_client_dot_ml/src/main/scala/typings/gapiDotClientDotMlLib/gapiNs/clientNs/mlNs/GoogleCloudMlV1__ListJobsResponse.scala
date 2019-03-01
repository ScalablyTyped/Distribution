package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__ListJobsResponse extends js.Object {
  /** The list of jobs. */
  var jobs: js.UndefOr[js.Array[GoogleCloudMlV1__Job]] = js.undefined
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudMlV1__ListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[GoogleCloudMlV1__Job] = null, nextPageToken: java.lang.String = null): GoogleCloudMlV1__ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GoogleCloudMlV1__ListJobsResponse]
  }
}

