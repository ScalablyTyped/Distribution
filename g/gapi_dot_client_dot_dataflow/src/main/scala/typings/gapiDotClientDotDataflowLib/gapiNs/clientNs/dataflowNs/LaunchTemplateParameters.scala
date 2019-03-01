package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateParameters extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.undefined
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[java.lang.String] = js.undefined
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object LaunchTemplateParameters {
  @scala.inline
  def apply(
    environment: RuntimeEnvironment = null,
    jobName: java.lang.String = null,
    parameters: stdLib.Record[java.lang.String, java.lang.String] = null
  ): LaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (jobName != null) __obj.updateDynamic("jobName")(jobName)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[LaunchTemplateParameters]
  }
}

