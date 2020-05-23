package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudkms.anon.Alt
import typings.gapiClientCloudkms.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource
  /** Get information about a location. */
  def get(request: Alt): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Alt => Request[Location],
    keyRings: KeyRingsResource,
    list: Filter => Request[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), keyRings = keyRings.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
}

