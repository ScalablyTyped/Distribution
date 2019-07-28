package typings.gapiDotClientDotCloudkms.gapiNs.clientNs.cloudkmsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAlt
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource
  /** Get information about a location. */
  def get(request: Anon_AccesstokenAlt): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAlt => Request[Location],
    keyRings: KeyRingsResource,
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), keyRings = keyRings, list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

