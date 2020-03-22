package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var jobs: JobsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: AnonQuotaUser): Request_[SendWorkerMessagesResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    templates: TemplatesResource,
    workerMessages: AnonQuotaUser => Request_[SendWorkerMessagesResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], workerMessages = js.Any.fromFunction1(workerMessages))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

