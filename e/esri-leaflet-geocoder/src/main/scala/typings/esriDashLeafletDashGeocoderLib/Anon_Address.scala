package typings
package esriDashLeafletDashGeocoderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var latlng: leafletLib.leafletMod.LatLng
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, latlng: leafletLib.leafletMod.LatLng): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, latlng = latlng)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

