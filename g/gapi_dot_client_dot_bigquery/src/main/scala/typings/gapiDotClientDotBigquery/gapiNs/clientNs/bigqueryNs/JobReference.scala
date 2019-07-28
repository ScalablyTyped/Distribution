package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReference extends js.Object {
  /**
    * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024
    * characters.
    */
  var jobId: js.UndefOr[String] = js.undefined
  /** [Required] The ID of the project containing this job. */
  var projectId: js.UndefOr[String] = js.undefined
}

object JobReference {
  @scala.inline
  def apply(jobId: String = null, projectId: String = null): JobReference = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[JobReference]
  }
}

