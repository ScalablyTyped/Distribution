package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var jobs: JobsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken): Request[SendWorkerMessagesResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    templates: TemplatesResource,
    workerMessages: Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken => Request[SendWorkerMessagesResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs, templates = templates, workerMessages = js.Any.fromFunction1(workerMessages))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

