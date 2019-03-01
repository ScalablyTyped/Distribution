package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  // Any options from https://developers.google.com/maps/documentation/javascript/reference/3/#MapOptions
  // excluding 'zoom' and 'center' which get set via props.
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var clickableIcons: js.UndefOr[scala.Boolean] = js.undefined
  var disableDefaultUI: js.UndefOr[scala.Boolean] = js.undefined
  var disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var draggableCursor: js.UndefOr[java.lang.String] = js.undefined
  var draggingCursor: js.UndefOr[java.lang.String] = js.undefined
  var fullscreenControl: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreenControlOptions: js.UndefOr[googleDashMapDashReactLib.Anon_Position] = js.undefined
  var gestureHandling: js.UndefOr[java.lang.String] = js.undefined
  var heading: js.UndefOr[scala.Double] = js.undefined
  var keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined
  var mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapTypeId: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoomOverride: js.UndefOr[scala.Boolean] = js.undefined
  var noClear: js.UndefOr[scala.Boolean] = js.undefined
  var panControl: js.UndefOr[scala.Boolean] = js.undefined
  var panControlOptions: js.UndefOr[googleDashMapDashReactLib.Anon_Position] = js.undefined
  var rotateControl: js.UndefOr[scala.Boolean] = js.undefined
  var rotateControlOptions: js.UndefOr[googleDashMapDashReactLib.Anon_Position] = js.undefined
  var scaleControl: js.UndefOr[scala.Boolean] = js.undefined
  var scaleControlOptions: js.UndefOr[js.Any] = js.undefined
  var scrollwheel: js.UndefOr[scala.Boolean] = js.undefined
  var streetView: js.UndefOr[js.Any] = js.undefined
  var streetViewControl: js.UndefOr[scala.Boolean] = js.undefined
  var streetViewControlOptions: js.UndefOr[googleDashMapDashReactLib.Anon_Position] = js.undefined
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.undefined
  var tilt: js.UndefOr[scala.Double] = js.undefined
  var zoomControl: js.UndefOr[scala.Boolean] = js.undefined
  var zoomControlOptions: js.UndefOr[googleDashMapDashReactLib.Anon_Position] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    clickableIcons: js.UndefOr[scala.Boolean] = js.undefined,
    disableDefaultUI: js.UndefOr[scala.Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    draggableCursor: java.lang.String = null,
    draggingCursor: java.lang.String = null,
    fullscreenControl: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenControlOptions: googleDashMapDashReactLib.Anon_Position = null,
    gestureHandling: java.lang.String = null,
    heading: scala.Int | scala.Double = null,
    keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControlOptions: js.Any = null,
    mapTypeId: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    minZoomOverride: js.UndefOr[scala.Boolean] = js.undefined,
    noClear: js.UndefOr[scala.Boolean] = js.undefined,
    panControl: js.UndefOr[scala.Boolean] = js.undefined,
    panControlOptions: googleDashMapDashReactLib.Anon_Position = null,
    rotateControl: js.UndefOr[scala.Boolean] = js.undefined,
    rotateControlOptions: googleDashMapDashReactLib.Anon_Position = null,
    scaleControl: js.UndefOr[scala.Boolean] = js.undefined,
    scaleControlOptions: js.Any = null,
    scrollwheel: js.UndefOr[scala.Boolean] = js.undefined,
    streetView: js.Any = null,
    streetViewControl: js.UndefOr[scala.Boolean] = js.undefined,
    streetViewControlOptions: googleDashMapDashReactLib.Anon_Position = null,
    styles: js.Array[MapTypeStyle] = null,
    tilt: scala.Int | scala.Double = null,
    zoomControl: js.UndefOr[scala.Boolean] = js.undefined,
    zoomControlOptions: googleDashMapDashReactLib.Anon_Position = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
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
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts)
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl)
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions)
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomOverride)) __obj.updateDynamic("minZoomOverride")(minZoomOverride)
    if (!js.isUndefined(noClear)) __obj.updateDynamic("noClear")(noClear)
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl)
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions)
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
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions)
    __obj.asInstanceOf[MapOptions]
  }
}

