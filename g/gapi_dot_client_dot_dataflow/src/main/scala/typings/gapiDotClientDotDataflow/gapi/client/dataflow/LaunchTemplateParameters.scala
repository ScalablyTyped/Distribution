package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateParameters extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.undefined
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[String] = js.undefined
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[Record[String, String]] = js.undefined
}

object LaunchTemplateParameters {
  @scala.inline
  def apply(
    environment: RuntimeEnvironment = null,
    jobName: String = null,
    parameters: Record[String, String] = null
  ): LaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateParameters]
  }
}

