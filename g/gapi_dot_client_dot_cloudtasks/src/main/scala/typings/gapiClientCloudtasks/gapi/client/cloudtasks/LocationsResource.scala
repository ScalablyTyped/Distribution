package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudtasks.AnonAccesstoken
import typings.gapiClientCloudtasks.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var queues: QueuesResource
  /** Get information about a location. */
  def get(request: AnonAccesstoken): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonName): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => Request_[Location],
    list: AnonName => Request_[ListLocationsResponse],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), queues = queues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationsResource]
  }
}

