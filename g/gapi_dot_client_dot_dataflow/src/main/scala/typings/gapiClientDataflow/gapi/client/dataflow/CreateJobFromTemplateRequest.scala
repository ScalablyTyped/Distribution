package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobFromTemplateRequest extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.native
  /**
    * Required. A Cloud Storage path to the template from which to
    * create the job.
    * Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var gcsPath: js.UndefOr[String] = js.native
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[String] = js.native
  /** The location to which to direct the request. */
  var location: js.UndefOr[String] = js.native
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[Record[String, String]] = js.native
}

object CreateJobFromTemplateRequest {
  @scala.inline
  def apply(): CreateJobFromTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobFromTemplateRequest]
  }
  @scala.inline
  implicit class CreateJobFromTemplateRequestOps[Self <: CreateJobFromTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvironment(value: RuntimeEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setGcsPath(value: String): Self = this.set("gcsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsPath: Self = this.set("gcsPath", js.undefined)
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setParameters(value: Record[String, String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

