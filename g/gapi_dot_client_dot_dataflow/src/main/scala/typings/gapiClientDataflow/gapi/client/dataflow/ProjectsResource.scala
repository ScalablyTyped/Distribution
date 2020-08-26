package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataflow.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var jobs: JobsResource = js.native
  var locations: LocationsResource = js.native
  var templates: TemplatesResource = js.native
  /** Send a worker_message to the service. */
  def workerMessages(request: Uploadprotocol): Request[SendWorkerMessagesResponse] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    locations: LocationsResource,
    templates: TemplatesResource,
    workerMessages: Uploadprotocol => Request[SendWorkerMessagesResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], workerMessages = js.Any.fromFunction1(workerMessages))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
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
    def setJobs(value: JobsResource): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocations(value: LocationsResource): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplates(value: TemplatesResource): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerMessages(value: Uploadprotocol => Request[SendWorkerMessagesResponse]): Self = this.set("workerMessages", js.Any.fromFunction1(value))
  }
  
}

