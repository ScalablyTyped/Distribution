package typings
package googleDashMapsDashReactLib.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.InfoWindowOptions ]:? googlemaps.google.maps.InfoWindowOptions[P]} */ trait InfoWindowProps extends js.Object {
  var google: googleDashMapsDashReactLib.Anon_Maps
  var map: googlemapsLib.googleNs.mapsNs.Map
  var mapCenter: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var marker: googlemapsLib.googleNs.mapsNs.Marker
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object InfoWindowProps {
  @scala.inline
  def apply(
    google: googleDashMapsDashReactLib.Anon_Maps,
    map: googlemapsLib.googleNs.mapsNs.Map,
    marker: googlemapsLib.googleNs.mapsNs.Marker,
    mapCenter: googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): InfoWindowProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("google")(google)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("marker")(marker)
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[InfoWindowProps]
  }
}

