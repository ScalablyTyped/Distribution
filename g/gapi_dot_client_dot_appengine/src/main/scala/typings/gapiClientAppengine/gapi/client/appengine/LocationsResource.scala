package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFieldsFilter
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId => Request_[Location],
    list: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsFilter => Request_[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

