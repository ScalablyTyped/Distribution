package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the request to launch a template.
  */
@js.native
trait Schema$LaunchTemplateResponse extends js.Object {
  /**
    * The job that was launched, if the request was not a dry run and the job
    * was successfully launched.
    */
  var job: js.UndefOr[Schema$Job] = js.native
}

object Schema$LaunchTemplateResponse {
  @scala.inline
  def apply(job: Schema$Job = null): Schema$LaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LaunchTemplateResponse]
  }
}

