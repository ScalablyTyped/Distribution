package typings.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudfunctions.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: Bearertoken): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(list: Bearertoken => Request[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
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
    def setList(value: Bearertoken => Request[ListLocationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

