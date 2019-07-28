package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import typings.googleDashMapsDashReact.Typeofgoogle
import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.InfoWindowOptions ]:? googlemaps.google.maps.InfoWindowOptions[P]} */ trait InfoWindowProps extends js.Object {
  var google: Typeofgoogle
  var map: typings.googlemaps.googleNs.mapsNs.Map
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var marker: typings.googlemaps.googleNs.mapsNs.Marker
  var visible: js.UndefOr[Boolean] = js.undefined
}

object InfoWindowProps {
  @scala.inline
  def apply(
    google: Typeofgoogle,
    map: typings.googlemaps.googleNs.mapsNs.Map,
    marker: typings.googlemaps.googleNs.mapsNs.Marker,
    mapCenter: LatLng | LatLngLiteral = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): InfoWindowProps = {
    val __obj = js.Dynamic.literal(google = google, map = map, marker = marker)
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[InfoWindowProps]
  }
}

