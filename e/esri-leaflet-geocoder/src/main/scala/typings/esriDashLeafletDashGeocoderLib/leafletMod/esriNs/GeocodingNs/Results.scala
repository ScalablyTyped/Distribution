package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var bounds: leafletLib.leafletMod.LatLngBoundsExpression
  var latlng: leafletLib.leafletMod.LatLngExpression
  var results: js.Array[ResultObject]
}

object Results {
  @scala.inline
  def apply(
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    latlng: leafletLib.leafletMod.LatLngExpression,
    results: js.Array[ResultObject]
  ): Results = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    __obj.updateDynamic("latlng")(latlng.asInstanceOf[js.Any])
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[Results]
  }
}

