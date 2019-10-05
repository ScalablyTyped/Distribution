package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import typings.googlemaps.google.maps.FullscreenControlOptions
import typings.googlemaps.google.maps.GestureHandlingOptions
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.MapOptions
import typings.googlemaps.google.maps.MapRestriction
import typings.googlemaps.google.maps.MapTypeControlOptions
import typings.googlemaps.google.maps.MapTypeId
import typings.googlemaps.google.maps.MapTypeStyle
import typings.googlemaps.google.maps.PanControlOptions
import typings.googlemaps.google.maps.RotateControlOptions
import typings.googlemaps.google.maps.ScaleControlOptions
import typings.googlemaps.google.maps.StreetViewControlOptions
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.ZoomControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProps extends MapOptions {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.undefined
  var google: GoogleAPI
  var initialCenter: js.UndefOr[LatLngLiteral] = js.undefined
  var loaded: js.UndefOr[Boolean] = js.undefined
  var onBoundsChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onCenterChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onClick: js.UndefOr[mapEventHandler] = js.undefined
  var onDblclick: js.UndefOr[mapEventHandler] = js.undefined
  var onDragend: js.UndefOr[mapEventHandler] = js.undefined
  var onDragstart: js.UndefOr[mapEventHandler] = js.undefined
  var onHeadingChange: js.UndefOr[mapEventHandler] = js.undefined
  var onIdle: js.UndefOr[mapEventHandler] = js.undefined
  var onMaptypeidChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onMousemove: js.UndefOr[mapEventHandler] = js.undefined
  var onMouseout: js.UndefOr[mapEventHandler] = js.undefined
  var onMouseover: js.UndefOr[mapEventHandler] = js.undefined
  var onProjectionChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onReady: js.UndefOr[mapEventHandler] = js.undefined
  var onRecenter: js.UndefOr[mapEventHandler] = js.undefined
  var onResize: js.UndefOr[mapEventHandler] = js.undefined
  var onRightclick: js.UndefOr[mapEventHandler] = js.undefined
  var onTilesloaded: js.UndefOr[mapEventHandler] = js.undefined
  var onTiltChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onZoomChanged: js.UndefOr[mapEventHandler] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MapProps {
  @scala.inline
  def apply(
    google: GoogleAPI,
    backgroundColor: String = null,
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    center: LatLng | LatLngLiteral = null,
    centerAroundCurrentLocation: js.UndefOr[Boolean] = js.undefined,
    clickableIcons: js.UndefOr[Boolean] = js.undefined,
    controlSize: Int | Double = null,
    disableDefaultUI: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggableCursor: String = null,
    draggingCursor: String = null,
    fullscreenControl: js.UndefOr[Boolean] = js.undefined,
    fullscreenControlOptions: FullscreenControlOptions = null,
    gestureHandling: GestureHandlingOptions = null,
    heading: Int | Double = null,
    initialCenter: LatLngLiteral = null,
    keyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    loaded: js.UndefOr[Boolean] = js.undefined,
    mapTypeControl: js.UndefOr[Boolean] = js.undefined,
    mapTypeControlOptions: MapTypeControlOptions = null,
    mapTypeId: MapTypeId | String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    noClear: js.UndefOr[Boolean] = js.undefined,
    onBoundsChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onCenterChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onClick: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onDblclick: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onDragend: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onDragstart: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onHeadingChange: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onIdle: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onMaptypeidChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onMousemove: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onMouseout: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onMouseover: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onProjectionChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onReady: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onRecenter: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onResize: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onRightclick: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onTilesloaded: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onTiltChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    onZoomChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], /* event */ js.UndefOr[js.Any]) => js.Any = null,
    panControl: js.UndefOr[Boolean] = js.undefined,
    panControlOptions: PanControlOptions = null,
    restriction: MapRestriction = null,
    rotateControl: js.UndefOr[Boolean] = js.undefined,
    rotateControlOptions: RotateControlOptions = null,
    scaleControl: js.UndefOr[Boolean] = js.undefined,
    scaleControlOptions: ScaleControlOptions = null,
    scrollwheel: js.UndefOr[Boolean] = js.undefined,
    streetView: StreetViewPanorama = null,
    streetViewControl: js.UndefOr[Boolean] = js.undefined,
    streetViewControlOptions: StreetViewControlOptions = null,
    styles: js.Array[MapTypeStyle] = null,
    tilt: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomControlOptions: ZoomControlOptions = null
  ): MapProps = {
    val __obj = js.Dynamic.literal(google = google)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAroundCurrentLocation)) __obj.updateDynamic("centerAroundCurrentLocation")(centerAroundCurrentLocation)
    if (!js.isUndefined(clickableIcons)) __obj.updateDynamic("clickableIcons")(clickableIcons)
    if (controlSize != null) __obj.updateDynamic("controlSize")(controlSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDefaultUI)) __obj.updateDynamic("disableDefaultUI")(disableDefaultUI)
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggableCursor != null) __obj.updateDynamic("draggableCursor")(draggableCursor)
    if (draggingCursor != null) __obj.updateDynamic("draggingCursor")(draggingCursor)
    if (!js.isUndefined(fullscreenControl)) __obj.updateDynamic("fullscreenControl")(fullscreenControl)
    if (fullscreenControlOptions != null) __obj.updateDynamic("fullscreenControlOptions")(fullscreenControlOptions)
    if (gestureHandling != null) __obj.updateDynamic("gestureHandling")(gestureHandling)
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (initialCenter != null) __obj.updateDynamic("initialCenter")(initialCenter)
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts)
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded)
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl)
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions)
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noClear)) __obj.updateDynamic("noClear")(noClear)
    if (onBoundsChanged != null) __obj.updateDynamic("onBoundsChanged")(js.Any.fromFunction3(onBoundsChanged))
    if (onCenterChanged != null) __obj.updateDynamic("onCenterChanged")(js.Any.fromFunction3(onCenterChanged))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(js.Any.fromFunction3(onDblclick))
    if (onDragend != null) __obj.updateDynamic("onDragend")(js.Any.fromFunction3(onDragend))
    if (onDragstart != null) __obj.updateDynamic("onDragstart")(js.Any.fromFunction3(onDragstart))
    if (onHeadingChange != null) __obj.updateDynamic("onHeadingChange")(js.Any.fromFunction3(onHeadingChange))
    if (onIdle != null) __obj.updateDynamic("onIdle")(js.Any.fromFunction3(onIdle))
    if (onMaptypeidChanged != null) __obj.updateDynamic("onMaptypeidChanged")(js.Any.fromFunction3(onMaptypeidChanged))
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(js.Any.fromFunction3(onMousemove))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction3(onMouseout))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction3(onMouseover))
    if (onProjectionChanged != null) __obj.updateDynamic("onProjectionChanged")(js.Any.fromFunction3(onProjectionChanged))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction3(onReady))
    if (onRecenter != null) __obj.updateDynamic("onRecenter")(js.Any.fromFunction3(onRecenter))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction3(onResize))
    if (onRightclick != null) __obj.updateDynamic("onRightclick")(js.Any.fromFunction3(onRightclick))
    if (onTilesloaded != null) __obj.updateDynamic("onTilesloaded")(js.Any.fromFunction3(onTilesloaded))
    if (onTiltChanged != null) __obj.updateDynamic("onTiltChanged")(js.Any.fromFunction3(onTiltChanged))
    if (onZoomChanged != null) __obj.updateDynamic("onZoomChanged")(js.Any.fromFunction3(onZoomChanged))
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl)
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions)
    if (restriction != null) __obj.updateDynamic("restriction")(restriction)
    if (!js.isUndefined(rotateControl)) __obj.updateDynamic("rotateControl")(rotateControl)
    if (rotateControlOptions != null) __obj.updateDynamic("rotateControlOptions")(rotateControlOptions)
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl)
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions)
    if (!js.isUndefined(scrollwheel)) __obj.updateDynamic("scrollwheel")(scrollwheel)
    if (streetView != null) __obj.updateDynamic("streetView")(streetView)
    if (!js.isUndefined(streetViewControl)) __obj.updateDynamic("streetViewControl")(streetViewControl)
    if (streetViewControlOptions != null) __obj.updateDynamic("streetViewControlOptions")(streetViewControlOptions)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions)
    __obj.asInstanceOf[MapProps]
  }
}

