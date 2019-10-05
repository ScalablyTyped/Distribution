package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var jobs: JobsResource
  var locations: LocationsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[SendWorkerMessagesResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    locations: LocationsResource,
    templates: TemplatesResource,
    workerMessages: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[SendWorkerMessagesResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs, locations = locations, templates = templates, workerMessages = js.Any.fromFunction1(workerMessages))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

