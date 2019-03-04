package typings
package googleDashMapsDashReactLib.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProps
  extends googlemapsLib.googleNs.mapsNs.MapOptions {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var centerAroundCurrentLocation: js.UndefOr[scala.Boolean] = js.undefined
  var google: GoogleAPI
  var initialCenter: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLngLiteral] = js.undefined
  var loaded: js.UndefOr[scala.Boolean] = js.undefined
  var onBoundsChanged: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onCenterChanged: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onClick: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onDblclick: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onDragend: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onDragstart: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onHeadingChange: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onIdle: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onMaptypeidChanged: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onMousemove: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onMouseout: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onMouseover: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onProjectionChanged: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onReady: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onRecenter: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onResize: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onRightclick: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onTilesloaded: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onTiltChanged: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var onZoomChanged: js.UndefOr[googleDashMapsDashReactLib.mapEventHandler] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object MapProps {
  @scala.inline
  def apply(
    google: GoogleAPI,
    backgroundColor: java.lang.String = null,
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral = null,
    center: googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    centerAroundCurrentLocation: js.UndefOr[scala.Boolean] = js.undefined,
    clickableIcons: js.UndefOr[scala.Boolean] = js.undefined,
    disableDefaultUI: js.UndefOr[scala.Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    draggableCursor: java.lang.String = null,
    draggingCursor: java.lang.String = null,
    fullscreenControl: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenControlOptions: googlemapsLib.googleNs.mapsNs.FullscreenControlOptions = null,
    gestureHandling: googlemapsLib.googleNs.mapsNs.GestureHandlingOptions = null,
    heading: scala.Int | scala.Double = null,
    initialCenter: googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControlOptions: googlemapsLib.googleNs.mapsNs.MapTypeControlOptions = null,
    mapTypeId: googlemapsLib.googleNs.mapsNs.MapTypeId = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noClear: js.UndefOr[scala.Boolean] = js.undefined,
    onBoundsChanged: googleDashMapsDashReactLib.mapEventHandler = null,
    onCenterChanged: googleDashMapsDashReactLib.mapEventHandler = null,
    onClick: googleDashMapsDashReactLib.mapEventHandler = null,
    onDblclick: googleDashMapsDashReactLib.mapEventHandler = null,
    onDragend: googleDashMapsDashReactLib.mapEventHandler = null,
    onDragstart: googleDashMapsDashReactLib.mapEventHandler = null,
    onHeadingChange: googleDashMapsDashReactLib.mapEventHandler = null,
    onIdle: googleDashMapsDashReactLib.mapEventHandler = null,
    onMaptypeidChanged: googleDashMapsDashReactLib.mapEventHandler = null,
    onMousemove: googleDashMapsDashReactLib.mapEventHandler = null,
    onMouseout: googleDashMapsDashReactLib.mapEventHandler = null,
    onMouseover: googleDashMapsDashReactLib.mapEventHandler = null,
    onProjectionChanged: googleDashMapsDashReactLib.mapEventHandler = null,
    onReady: googleDashMapsDashReactLib.mapEventHandler = null,
    onRecenter: googleDashMapsDashReactLib.mapEventHandler = null,
    onResize: googleDashMapsDashReactLib.mapEventHandler = null,
    onRightclick: googleDashMapsDashReactLib.mapEventHandler = null,
    onTilesloaded: googleDashMapsDashReactLib.mapEventHandler = null,
    onTiltChanged: googleDashMapsDashReactLib.mapEventHandler = null,
    onZoomChanged: googleDashMapsDashReactLib.mapEventHandler = null,
    overviewMapControl: js.UndefOr[scala.Boolean] = js.undefined,
    overviewMapControlOptions: googlemapsLib.googleNs.mapsNs.OverviewMapControlOptions = null,
    panControl: js.UndefOr[scala.Boolean] = js.undefined,
    panControlOptions: googlemapsLib.googleNs.mapsNs.PanControlOptions = null,
    rotateControl: js.UndefOr[scala.Boolean] = js.undefined,
    rotateControlOptions: googlemapsLib.googleNs.mapsNs.RotateControlOptions = null,
    scaleControl: js.UndefOr[scala.Boolean] = js.undefined,
    scaleControlOptions: googlemapsLib.googleNs.mapsNs.ScaleControlOptions = null,
    scrollwheel: js.UndefOr[scala.Boolean] = js.undefined,
    signInControl: js.UndefOr[scala.Boolean] = js.undefined,
    streetView: googlemapsLib.googleNs.mapsNs.StreetViewPanorama = null,
    streetViewControl: js.UndefOr[scala.Boolean] = js.undefined,
    streetViewControlOptions: googlemapsLib.googleNs.mapsNs.StreetViewControlOptions = null,
    styles: js.Array[googlemapsLib.googleNs.mapsNs.MapTypeStyle] = null,
    tilt: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null,
    zoomControl: js.UndefOr[scala.Boolean] = js.undefined,
    zoomControlOptions: googlemapsLib.googleNs.mapsNs.ZoomControlOptions = null
  ): MapProps = {
    val __obj = js.Dynamic.literal(google = google)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAroundCurrentLocation)) __obj.updateDynamic("centerAroundCurrentLocation")(centerAroundCurrentLocation)
    if (!js.isUndefined(clickableIcons)) __obj.updateDynamic("clickableIcons")(clickableIcons)
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
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noClear)) __obj.updateDynamic("noClear")(noClear)
    if (onBoundsChanged != null) __obj.updateDynamic("onBoundsChanged")(onBoundsChanged)
    if (onCenterChanged != null) __obj.updateDynamic("onCenterChanged")(onCenterChanged)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(onDblclick)
    if (onDragend != null) __obj.updateDynamic("onDragend")(onDragend)
    if (onDragstart != null) __obj.updateDynamic("onDragstart")(onDragstart)
    if (onHeadingChange != null) __obj.updateDynamic("onHeadingChange")(onHeadingChange)
    if (onIdle != null) __obj.updateDynamic("onIdle")(onIdle)
    if (onMaptypeidChanged != null) __obj.updateDynamic("onMaptypeidChanged")(onMaptypeidChanged)
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(onMousemove)
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(onMouseout)
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(onMouseover)
    if (onProjectionChanged != null) __obj.updateDynamic("onProjectionChanged")(onProjectionChanged)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (onRecenter != null) __obj.updateDynamic("onRecenter")(onRecenter)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (onRightclick != null) __obj.updateDynamic("onRightclick")(onRightclick)
    if (onTilesloaded != null) __obj.updateDynamic("onTilesloaded")(onTilesloaded)
    if (onTiltChanged != null) __obj.updateDynamic("onTiltChanged")(onTiltChanged)
    if (onZoomChanged != null) __obj.updateDynamic("onZoomChanged")(onZoomChanged)
    if (!js.isUndefined(overviewMapControl)) __obj.updateDynamic("overviewMapControl")(overviewMapControl)
    if (overviewMapControlOptions != null) __obj.updateDynamic("overviewMapControlOptions")(overviewMapControlOptions)
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl)
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions)
    if (!js.isUndefined(rotateControl)) __obj.updateDynamic("rotateControl")(rotateControl)
    if (rotateControlOptions != null) __obj.updateDynamic("rotateControlOptions")(rotateControlOptions)
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl)
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions)
    if (!js.isUndefined(scrollwheel)) __obj.updateDynamic("scrollwheel")(scrollwheel)
    if (!js.isUndefined(signInControl)) __obj.updateDynamic("signInControl")(signInControl)
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

