package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create a Cloud Dataflow job from a template.
  */
@js.native
trait Schema$CreateJobFromTemplateRequest extends js.Object {
  /**
    * The runtime environment for the job.
    */
  var environment: js.UndefOr[Schema$RuntimeEnvironment] = js.native
  /**
    * Required. A Cloud Storage path to the template from which to create the
    * job. Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var gcsPath: js.UndefOr[String] = js.native
  /**
    * Required. The job name to use for the created job.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
    * which to direct the request.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The runtime parameters to pass to the job.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$CreateJobFromTemplateRequest {
  @scala.inline
  def apply(
    environment: Schema$RuntimeEnvironment = null,
    gcsPath: String = null,
    jobName: String = null,
    location: String = null,
    parameters: StringDictionary[String] = null
  ): Schema$CreateJobFromTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateJobFromTemplateRequest]
  }
}

