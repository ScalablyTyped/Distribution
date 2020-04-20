package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var jobs: JobsResource
  var locations: LocationsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: AnonUploadprotocol): Request_[SendWorkerMessagesResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    locations: LocationsResource,
    templates: TemplatesResource,
    workerMessages: AnonUploadprotocol => Request_[SendWorkerMessagesResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], workerMessages = js.Any.fromFunction1(workerMessages))
    __obj.asInstanceOf[ProjectsResource]
  }
}

