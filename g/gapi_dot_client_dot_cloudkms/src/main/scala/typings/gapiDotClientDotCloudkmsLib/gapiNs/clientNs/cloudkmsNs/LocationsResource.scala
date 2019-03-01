package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource
  /** Get information about a location. */
  def get(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Location]
    ],
    keyRings: KeyRingsResource,
    list: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
    ]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("keyRings")(keyRings)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[LocationsResource]
  }
}

