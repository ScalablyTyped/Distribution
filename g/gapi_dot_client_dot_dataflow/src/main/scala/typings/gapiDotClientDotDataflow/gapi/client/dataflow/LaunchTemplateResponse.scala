package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateResponse extends js.Object {
  /**
    * The job that was launched, if the request was not a dry run and
    * the job was successfully launched.
    */
  var job: js.UndefOr[Job] = js.undefined
}

object LaunchTemplateResponse {
  @scala.inline
  def apply(job: Job = null): LaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job)
    __obj.asInstanceOf[LaunchTemplateResponse]
  }
}

