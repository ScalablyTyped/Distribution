package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var jobs: JobsResource
  var locations: LocationsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[SendWorkerMessagesResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    locations: LocationsResource,
    templates: TemplatesResource,
    workerMessages: js.Function1[
      gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SendWorkerMessagesResponse]
    ]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs, locations = locations, templates = templates, workerMessages = workerMessages)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

