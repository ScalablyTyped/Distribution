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

