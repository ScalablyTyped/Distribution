package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.leafletMod.GeoJSON
import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject
  extends /* key */ StringDictionary[js.Any] {
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var geojson: js.UndefOr[GeoJSON[_]] = js.undefined
  var latlng: js.UndefOr[LatLngExpression] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ResultObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bounds: LatLngBoundsExpression = null,
    geojson: GeoJSON[_] = null,
    latlng: LatLngExpression = null,
    properties: js.Any = null,
    text: String = null
  ): ResultObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson.asInstanceOf[js.Any])
    if (latlng != null) __obj.updateDynamic("latlng")(latlng.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultObject]
  }
}

