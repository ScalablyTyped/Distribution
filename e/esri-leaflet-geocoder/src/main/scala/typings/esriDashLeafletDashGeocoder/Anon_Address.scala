package typings.esriDashLeafletDashGeocoder

import typings.leaflet.leafletMod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var latlng: LatLng
}

object Anon_Address {
  @scala.inline
  def apply(address: String, latlng: LatLng): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, latlng = latlng)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

