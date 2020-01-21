package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudkms.AnonAccesstokenAlt
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertokenCallbackFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource
  /** Get information about a location. */
  def get(request: AnonAccesstokenAlt): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAccesstokenAlt => Request_[Location],
    keyRings: KeyRingsResource,
    list: AnonAccesstokenAltBearertokenCallbackFieldsFilter => Request_[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), keyRings = keyRings.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

