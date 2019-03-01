package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var jobs: JobsResource
  var templates: TemplatesResource
  /** Send a worker_message to the service. */
  def workerMessages(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[SendWorkerMessagesResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    templates: TemplatesResource,
    workerMessages: js.Function1[
      gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SendWorkerMessagesResponse]
    ]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobs")(jobs)
    __obj.updateDynamic("templates")(templates)
    __obj.updateDynamic("workerMessages")(workerMessages)
    __obj.asInstanceOf[LocationsResource]
  }
}

