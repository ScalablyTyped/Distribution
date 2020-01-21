package typings.googleMapsReact.mod

import typings.googleMapsReact.Typeofgoogle
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.InfoWindowOptions ]:? googlemaps.google.maps.InfoWindowOptions[P]} */ trait InfoWindowProps extends js.Object {
  var google: Typeofgoogle
  var map: typings.googlemaps.google.maps.Map[Element]
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var marker: typings.googlemaps.google.maps.Marker
  var visible: js.UndefOr[Boolean] = js.undefined
}

object InfoWindowProps {
  @scala.inline
  def apply(
    google: Typeofgoogle,
    map: typings.googlemaps.google.maps.Map[Element],
    marker: typings.googlemaps.google.maps.Marker,
    mapCenter: LatLng | LatLngLiteral = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): InfoWindowProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowProps]
  }
}

