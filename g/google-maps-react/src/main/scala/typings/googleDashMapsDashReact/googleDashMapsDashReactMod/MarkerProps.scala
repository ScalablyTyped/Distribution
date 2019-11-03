package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.MarkerOptions ]:? googlemaps.google.maps.MarkerOptions[P]} */ trait MarkerProps extends js.Object {
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var onClick: js.UndefOr[markerEventHandler] = js.undefined
  var onDragend: js.UndefOr[markerEventHandler] = js.undefined
  var onMouseover: js.UndefOr[markerEventHandler] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    mapCenter: LatLng | LatLngLiteral = null,
    onClick: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onDragend: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onMouseover: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onDragend != null) __obj.updateDynamic("onDragend")(js.Any.fromFunction3(onDragend))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction3(onMouseover))
    __obj.asInstanceOf[MarkerProps]
  }
}

