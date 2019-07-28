package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.MarkerOptions ]:? googlemaps.google.maps.MarkerOptions[P]} */ trait MarkerProps extends js.Object {
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var onClick: js.UndefOr[markerEventHandler] = js.undefined
  var onMouseover: js.UndefOr[markerEventHandler] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    mapCenter: LatLng | LatLngLiteral = null,
    onClick: markerEventHandler = null,
    onMouseover: markerEventHandler = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(onMouseover)
    __obj.asInstanceOf[MarkerProps]
  }
}

