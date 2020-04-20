package typings.esriLeafletGeocoder

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var latlng: LatLng_
}

object AnonAddress {
  @scala.inline
  def apply(address: String, latlng: LatLng_): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

