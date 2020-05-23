package typings.googleMapsReact.mod

import typings.googlemaps.google.maps.Animation
import typings.googlemaps.google.maps.Icon
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.MarkerLabel
import typings.googlemaps.google.maps.MarkerShape
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.Symbol
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<googlemaps.google.maps.MarkerOptions> */
trait IMarkerProps extends js.Object {
  var anchorPoint: js.UndefOr[Point] = js.undefined
  var animation: js.UndefOr[Animation] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var crossOnDrag: js.UndefOr[Boolean] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
  var label: js.UndefOr[String | MarkerLabel] = js.undefined
  var map: js.UndefOr[typings.googlemaps.google.maps.Map[Element] | StreetViewPanorama] = js.undefined
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var onClick: js.UndefOr[markerEventHandler] = js.undefined
  var onMouseover: js.UndefOr[markerEventHandler] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var optimized: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var shape: js.UndefOr[MarkerShape] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IMarkerProps {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: String | Icon | Symbol = null,
    label: String | MarkerLabel = null,
    map: typings.googlemaps.google.maps.Map[Element] | StreetViewPanorama = null,
    mapCenter: LatLng | LatLngLiteral = null,
    onClick: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onMouseover: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    opacity: js.UndefOr[Double] = js.undefined,
    optimized: js.UndefOr[Boolean] = js.undefined,
    position: LatLng | LatLngLiteral = null,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IMarkerProps = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction3(onMouseover))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkerProps]
  }
}

