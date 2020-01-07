package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Commute details related to this job.
  */
@js.native
trait Schema$CommuteInfo extends js.Object {
  /**
    * Location used as the destination in the commute calculation.
    */
  var jobLocation: js.UndefOr[Schema$JobLocation] = js.native
  /**
    * The number of seconds required to travel to the job location from the
    * query location. A duration of 0 seconds indicates that the job is not
    * reachable within the requested duration, but was returned as part of an
    * expanded query.
    */
  var travelDuration: js.UndefOr[String] = js.native
}

object Schema$CommuteInfo {
  @scala.inline
  def apply(jobLocation: Schema$JobLocation = null, travelDuration: String = null): Schema$CommuteInfo = {
    val __obj = js.Dynamic.literal()
    if (jobLocation != null) __obj.updateDynamic("jobLocation")(jobLocation.asInstanceOf[js.Any])
    if (travelDuration != null) __obj.updateDynamic("travelDuration")(travelDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommuteInfo]
  }
}

