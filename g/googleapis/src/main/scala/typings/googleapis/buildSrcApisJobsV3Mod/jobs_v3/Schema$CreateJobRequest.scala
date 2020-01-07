package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Create job request.
  */
@js.native
trait Schema$CreateJobRequest extends js.Object {
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[Schema$Job] = js.native
}

object Schema$CreateJobRequest {
  @scala.inline
  def apply(job: Schema$Job = null): Schema$CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateJobRequest]
  }
}

