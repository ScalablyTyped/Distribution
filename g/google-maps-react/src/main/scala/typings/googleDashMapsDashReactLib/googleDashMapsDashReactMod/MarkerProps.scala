package typings
package googleDashMapsDashReactLib.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.MarkerOptions ]:? googlemaps.google.maps.MarkerOptions[P]} */ trait MarkerProps extends js.Object {
  var mapCenter: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var onClick: js.UndefOr[googleDashMapsDashReactLib.markerEventHandler] = js.undefined
  var onMouseover: js.UndefOr[googleDashMapsDashReactLib.markerEventHandler] = js.undefined
}

