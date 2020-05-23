package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudtasks.anon.Accesstoken
import typings.gapiClientCloudtasks.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var queues: QueuesResource
  /** Get information about a location. */
  def get(request: Accesstoken): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Name): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Accesstoken => Request[Location],
    list: Name => Request[ListLocationsResponse],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
}

