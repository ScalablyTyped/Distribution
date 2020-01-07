package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters to provide to the template being launched.
  */
@js.native
trait Schema$LaunchTemplateParameters extends js.Object {
  /**
    * The runtime environment for the job.
    */
  var environment: js.UndefOr[Schema$RuntimeEnvironment] = js.native
  /**
    * Required. The job name to use for the created job.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * The runtime parameters to pass to the job.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$LaunchTemplateParameters {
  @scala.inline
  def apply(
    environment: Schema$RuntimeEnvironment = null,
    jobName: String = null,
    parameters: StringDictionary[String] = null
  ): Schema$LaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LaunchTemplateParameters]
  }
}

