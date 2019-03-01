package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.undefined
  var center: js.UndefOr[Coords] = js.undefined
  var debounced: js.UndefOr[scala.Boolean] = js.undefined
  var defaultCenter: js.UndefOr[Coords] = js.undefined
  var defaultZoom: js.UndefOr[scala.Double] = js.undefined
  var distanceToMouse: js.UndefOr[
    js.Function3[
      /* pt */ Point, 
      /* mousePos */ Point, 
      /* markerProps */ js.UndefOr[js.Object], 
      scala.Double
    ]
  ] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ js.Any, scala.Unit]] = js.undefined
  var hoverDistance: js.UndefOr[scala.Double] = js.undefined
  var layerTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var margin: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, _]] = js.undefined
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit]] = js.undefined
  var onChildMouseDown: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit]
  ] = js.undefined
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit]] = js.undefined
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit]] = js.undefined
  var onChildMouseMove: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit]
  ] = js.undefined
  var onChildMouseUp: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit]
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, _]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ googleDashMapDashReactLib.Anon_Map, scala.Unit]] = js.undefined
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var onTilesLoaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.undefined
  var resetBoundsOnResize: js.UndefOr[scala.Boolean] = js.undefined
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    bootstrapURLKeys: BootstrapURLKeys = null,
    center: Coords = null,
    debounced: js.UndefOr[scala.Boolean] = js.undefined,
    defaultCenter: Coords = null,
    defaultZoom: scala.Int | scala.Double = null,
    distanceToMouse: js.Function3[
      /* pt */ Point, 
      /* mousePos */ Point, 
      /* markerProps */ js.UndefOr[js.Object], 
      scala.Double
    ] = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    googleMapLoader: js.Function1[/* bootstrapURLKeys */ js.Any, scala.Unit] = null,
    hoverDistance: scala.Int | scala.Double = null,
    layerTypes: js.Array[java.lang.String] = null,
    margin: js.Array[_] = null,
    onChange: js.Function1[/* value */ ChangeEventValue, _] = null,
    onChildClick: js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit] = null,
    onChildMouseDown: js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit] = null,
    onChildMouseEnter: js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit] = null,
    onChildMouseLeave: js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit] = null,
    onChildMouseMove: js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit] = null,
    onChildMouseUp: js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit] = null,
    onClick: js.Function1[/* value */ ClickEventValue, _] = null,
    onDrag: js.Function1[/* args */ js.Any, scala.Unit] = null,
    onGoogleApiLoaded: js.Function1[/* maps */ googleDashMapDashReactLib.Anon_Map, scala.Unit] = null,
    onMapTypeIdChange: js.Function1[/* args */ js.Any, scala.Unit] = null,
    onTilesLoaded: js.Function0[scala.Unit] = null,
    onZoomAnimationEnd: js.Function1[/* args */ js.Any, scala.Unit] = null,
    onZoomAnimationStart: js.Function1[/* args */ js.Any, scala.Unit] = null,
    options: MapOptions | (js.Function1[/* maps */ Maps, MapOptions]) = null,
    resetBoundsOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    yesIWantToUseGoogleMapApiInternals: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (bootstrapURLKeys != null) __obj.updateDynamic("bootstrapURLKeys")(bootstrapURLKeys.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(debounced)) __obj.updateDynamic("debounced")(debounced)
    if (defaultCenter != null) __obj.updateDynamic("defaultCenter")(defaultCenter)
    if (defaultZoom != null) __obj.updateDynamic("defaultZoom")(defaultZoom.asInstanceOf[js.Any])
    if (distanceToMouse != null) __obj.updateDynamic("distanceToMouse")(distanceToMouse)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (googleMapLoader != null) __obj.updateDynamic("googleMapLoader")(googleMapLoader)
    if (hoverDistance != null) __obj.updateDynamic("hoverDistance")(hoverDistance.asInstanceOf[js.Any])
    if (layerTypes != null) __obj.updateDynamic("layerTypes")(layerTypes)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChildClick != null) __obj.updateDynamic("onChildClick")(onChildClick)
    if (onChildMouseDown != null) __obj.updateDynamic("onChildMouseDown")(onChildMouseDown)
    if (onChildMouseEnter != null) __obj.updateDynamic("onChildMouseEnter")(onChildMouseEnter)
    if (onChildMouseLeave != null) __obj.updateDynamic("onChildMouseLeave")(onChildMouseLeave)
    if (onChildMouseMove != null) __obj.updateDynamic("onChildMouseMove")(onChildMouseMove)
    if (onChildMouseUp != null) __obj.updateDynamic("onChildMouseUp")(onChildMouseUp)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onGoogleApiLoaded != null) __obj.updateDynamic("onGoogleApiLoaded")(onGoogleApiLoaded)
    if (onMapTypeIdChange != null) __obj.updateDynamic("onMapTypeIdChange")(onMapTypeIdChange)
    if (onTilesLoaded != null) __obj.updateDynamic("onTilesLoaded")(onTilesLoaded)
    if (onZoomAnimationEnd != null) __obj.updateDynamic("onZoomAnimationEnd")(onZoomAnimationEnd)
    if (onZoomAnimationStart != null) __obj.updateDynamic("onZoomAnimationStart")(onZoomAnimationStart)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBoundsOnResize)) __obj.updateDynamic("resetBoundsOnResize")(resetBoundsOnResize)
    if (!js.isUndefined(yesIWantToUseGoogleMapApiInternals)) __obj.updateDynamic("yesIWantToUseGoogleMapApiInternals")(yesIWantToUseGoogleMapApiInternals)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

