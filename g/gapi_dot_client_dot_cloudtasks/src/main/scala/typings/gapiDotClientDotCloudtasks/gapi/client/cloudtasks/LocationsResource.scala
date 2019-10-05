package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudtasks.Anon_Accesstoken
import typings.gapiDotClientDotCloudtasks.Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var queues: QueuesResource
  /** Get information about a location. */
  def get(request: Anon_Accesstoken): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => Request[Location],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey => Request[ListLocationsResponse],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), queues = queues)
  
    __obj.asInstanceOf[LocationsResource]
  }
}

