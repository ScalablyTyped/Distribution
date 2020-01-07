package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$JobReference extends js.Object {
  /**
    * [Required] The ID of the job. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length
    * is 1,024 characters.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The geographic location of the job. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the project containing this job.
    */
  var projectId: js.UndefOr[String] = js.native
}

object Schema$JobReference {
  @scala.inline
  def apply(jobId: String = null, location: String = null, projectId: String = null): Schema$JobReference = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobReference]
  }
}

