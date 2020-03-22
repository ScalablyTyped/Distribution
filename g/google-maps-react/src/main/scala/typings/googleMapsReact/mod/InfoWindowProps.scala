package typings.googleMapsReact.mod

import typings.googleMapsReact.Typeofgoogle
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Size
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<googlemaps.google.maps.InfoWindowOptions> */
trait InfoWindowProps extends js.Object {
  var content: js.UndefOr[String | Node] = js.undefined
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  var google: js.UndefOr[Typeofgoogle] = js.undefined
  var map: js.UndefOr[typings.googlemaps.google.maps.Map[Element]] = js.undefined
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var marker: js.UndefOr[typings.googlemaps.google.maps.Marker] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pixelOffset: js.UndefOr[Size] = js.undefined
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object InfoWindowProps {
  @scala.inline
  def apply(
    content: String | Node = null,
    disableAutoPan: js.UndefOr[Boolean] = js.undefined,
    google: Typeofgoogle = null,
    map: typings.googlemaps.google.maps.Map[Element] = null,
    mapCenter: LatLng | LatLngLiteral = null,
    marker: typings.googlemaps.google.maps.Marker = null,
    maxWidth: Int | Double = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    pixelOffset: Size = null,
    position: LatLng | LatLngLiteral = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): InfoWindowProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan.asInstanceOf[js.Any])
    if (google != null) __obj.updateDynamic("google")(google.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowProps]
  }
}

