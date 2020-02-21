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
  var google: js.UndefOr[Typeofgoogle] = js.undefined
  var map: js.UndefOr[typings.googlemaps.google.maps.Map[Element]] = js.undefined
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var marker: js.UndefOr[typings.googlemaps.google.maps.Marker] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object InfoWindowProps {
  @scala.inline
  def apply(
    google: Typeofgoogle = null,
    map: typings.googlemaps.google.maps.Map[Element] = null,
    mapCenter: LatLng | LatLngLiteral = null,
    marker: typings.googlemaps.google.maps.Marker = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): InfoWindowProps = {
    val __obj = js.Dynamic.literal()
    if (google != null) __obj.updateDynamic("google")(google.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowProps]
  }
}

