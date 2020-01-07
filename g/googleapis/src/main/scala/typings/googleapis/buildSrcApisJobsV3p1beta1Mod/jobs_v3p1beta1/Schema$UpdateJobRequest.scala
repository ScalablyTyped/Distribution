package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Update job request.
  */
@js.native
trait Schema$UpdateJobRequest extends js.Object {
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[Schema$Job] = js.native
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_mask is provided, only the specified fields in job
    * are updated. Otherwise all the fields are updated.  A field mask to
    * restrict the fields that are updated. Only top level fields of Job are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateJobRequest {
  @scala.inline
  def apply(job: Schema$Job = null, updateMask: String = null): Schema$UpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateJobRequest]
  }
}

