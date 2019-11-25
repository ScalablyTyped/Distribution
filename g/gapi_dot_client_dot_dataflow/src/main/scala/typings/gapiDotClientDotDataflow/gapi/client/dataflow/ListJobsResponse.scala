package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /** Zero or more messages describing locations that failed to respond. */
  var failedLocation: js.UndefOr[js.Array[FailedLocation]] = js.undefined
  /** A subset of the requested job information. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  /** Set if there may be more results than fit in this response. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(
    failedLocation: js.Array[FailedLocation] = null,
    jobs: js.Array[Job] = null,
    nextPageToken: String = null
  ): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (failedLocation != null) __obj.updateDynamic("failedLocation")(failedLocation.asInstanceOf[js.Any])
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
}

