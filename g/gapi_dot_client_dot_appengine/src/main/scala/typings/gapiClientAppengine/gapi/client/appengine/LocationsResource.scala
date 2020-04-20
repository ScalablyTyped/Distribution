package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonFilter
import typings.gapiClientAppengine.AnonLocationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(request: AnonLocationsId): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(get: AnonLocationsId => Request_[Location], list: AnonFilter => Request_[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
}

