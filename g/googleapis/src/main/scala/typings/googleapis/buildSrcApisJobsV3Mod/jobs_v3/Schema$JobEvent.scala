package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event issued when a job seeker interacts with the application that
  * implements Cloud Talent Solution.
  */
@js.native
trait Schema$JobEvent extends js.Object {
  /**
    * Required.  The job name(s) associated with this event. For example, if
    * this is an impression event, this field contains the identifiers of all
    * jobs shown to the job seeker. If this was a view event, this field
    * contains the identifier of the viewed job.
    */
  var jobs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required.  The type of the event (see JobEventType).
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$JobEvent {
  @scala.inline
  def apply(jobs: js.Array[String] = null, `type`: String = null): Schema$JobEvent = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobEvent]
  }
}

