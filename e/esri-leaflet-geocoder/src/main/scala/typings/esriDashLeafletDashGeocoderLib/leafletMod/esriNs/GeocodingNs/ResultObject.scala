package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var bounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var geojson: js.UndefOr[leafletLib.leafletMod.GeoJSON[_]] = js.undefined
  var latlng: js.UndefOr[leafletLib.leafletMod.LatLngExpression] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ResultObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    geojson: leafletLib.leafletMod.GeoJSON[_] = null,
    latlng: leafletLib.leafletMod.LatLngExpression = null,
    properties: js.Any = null,
    text: java.lang.String = null
  ): ResultObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson)
    if (latlng != null) __obj.updateDynamic("latlng")(latlng.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ResultObject]
  }
}

