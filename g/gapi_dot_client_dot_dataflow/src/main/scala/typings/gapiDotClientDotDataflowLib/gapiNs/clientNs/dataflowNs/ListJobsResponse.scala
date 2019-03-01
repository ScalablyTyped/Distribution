package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /** Zero or more messages describing locations that failed to respond. */
  var failedLocation: js.UndefOr[js.Array[FailedLocation]] = js.undefined
  /** A subset of the requested job information. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  /** Set if there may be more results than fit in this response. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(
    failedLocation: js.Array[FailedLocation] = null,
    jobs: js.Array[Job] = null,
    nextPageToken: java.lang.String = null
  ): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (failedLocation != null) __obj.updateDynamic("failedLocation")(failedLocation)
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListJobsResponse]
  }
}

