package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var registries: RegistriesResource
}

object LocationsResource {
  @scala.inline
  def apply(registries: RegistriesResource): LocationsResource = {
    val __obj = js.Dynamic.literal(registries = registries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationsResource]
  }
}

