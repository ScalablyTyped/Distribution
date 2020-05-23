package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Filter
import typings.gapiClientAppengine.anon.LocationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(request: LocationsId): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(get: LocationsId => Request[Location], list: Filter => Request[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
}

