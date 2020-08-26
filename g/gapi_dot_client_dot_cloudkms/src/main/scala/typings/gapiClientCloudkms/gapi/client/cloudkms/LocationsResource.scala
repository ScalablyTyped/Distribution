package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudkms.anon.Alt
import typings.gapiClientCloudkms.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource = js.native
  /** Get information about a location. */
  def get(request: Alt): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse] = js.native
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
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Alt => Request[Location]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyRings(value: KeyRingsResource): Self = this.set("keyRings", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Filter => Request[ListLocationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

