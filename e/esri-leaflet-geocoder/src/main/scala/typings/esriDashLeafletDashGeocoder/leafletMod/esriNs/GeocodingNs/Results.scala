package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var bounds: LatLngBoundsExpression
  var latlng: LatLngExpression
  var results: js.Array[ResultObject]
}

object Results {
  @scala.inline
  def apply(bounds: LatLngBoundsExpression, latlng: LatLngExpression, results: js.Array[ResultObject]): Results = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], results = results)
  
    __obj.asInstanceOf[Results]
  }
}

