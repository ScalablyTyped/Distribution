package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobFromTemplateRequest extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.undefined
  /**
    * Required. A Cloud Storage path to the template from which to
    * create the job.
    * Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var gcsPath: js.UndefOr[String] = js.undefined
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[String] = js.undefined
  /** The location to which to direct the request. */
  var location: js.UndefOr[String] = js.undefined
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[Record[String, String]] = js.undefined
}

object CreateJobFromTemplateRequest {
  @scala.inline
  def apply(
    environment: RuntimeEnvironment = null,
    gcsPath: String = null,
    jobName: String = null,
    location: String = null,
    parameters: Record[String, String] = null
  ): CreateJobFromTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath)
    if (jobName != null) __obj.updateDynamic("jobName")(jobName)
    if (location != null) __obj.updateDynamic("location")(location)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[CreateJobFromTemplateRequest]
  }
}

