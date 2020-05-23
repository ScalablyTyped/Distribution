package typings.esriLeafletGeocoder.anon

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var latlng: LatLng_
}

object Address {
  @scala.inline
  def apply(address: String, latlng: LatLng_): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

