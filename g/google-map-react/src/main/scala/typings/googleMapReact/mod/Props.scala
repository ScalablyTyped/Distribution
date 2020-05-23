package typings.googleMapReact.mod

import typings.googleMapReact.anon.Map
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.undefined
  var center: js.UndefOr[Coords] = js.undefined
  var debounced: js.UndefOr[Boolean] = js.undefined
  var defaultCenter: js.UndefOr[Coords] = js.undefined
  var defaultZoom: js.UndefOr[Double] = js.undefined
  var distanceToMouse: js.UndefOr[
    js.Function3[/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object], Double]
  ] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ js.Any, Unit]] = js.undefined
  var heatmap: js.UndefOr[Heatmap] = js.undefined
  var heatmapLibrary: js.UndefOr[Boolean] = js.undefined
  var hoverDistance: js.UndefOr[Double] = js.undefined
  var layerTypes: js.UndefOr[js.Array[String]] = js.undefined
  var margin: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, _]] = js.undefined
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.undefined
  var onChildMouseDown: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.undefined
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.undefined
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.undefined
  var onChildMouseMove: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.undefined
  var onChildMouseUp: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, _]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ Map, Unit]] = js.undefined
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var onTilesLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.undefined
  var resetBoundsOnResize: js.UndefOr[Boolean] = js.undefined
  var shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    bootstrapURLKeys: BootstrapURLKeys = null,
    center: Coords = null,
    debounced: js.UndefOr[Boolean] = js.undefined,
    defaultCenter: Coords = null,
    defaultZoom: js.UndefOr[Double] = js.undefined,
    distanceToMouse: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    googleMapLoader: /* bootstrapURLKeys */ js.Any => Unit = null,
    heatmap: Heatmap = null,
    heatmapLibrary: js.UndefOr[Boolean] = js.undefined,
    hoverDistance: js.UndefOr[Double] = js.undefined,
    layerTypes: js.Array[String] = null,
    margin: js.Array[_] = null,
    onChange: /* value */ ChangeEventValue => _ = null,
    onChildClick: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit = null,
    onChildMouseDown: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit = null,
    onChildMouseEnter: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit = null,
    onChildMouseLeave: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit = null,
    onChildMouseMove: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit = null,
    onChildMouseUp: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit = null,
    onClick: /* value */ ClickEventValue => _ = null,
    onDrag: /* map */ js.Any => Unit = null,
    onDragEnd: /* map */ js.Any => Unit = null,
    onGoogleApiLoaded: /* maps */ Map => Unit = null,
    onMapTypeIdChange: /* args */ js.Any => Unit = null,
    onTilesLoaded: () => Unit = null,
    onZoomAnimationEnd: /* args */ js.Any => Unit = null,
    onZoomAnimationStart: /* args */ js.Any => Unit = null,
    options: MapOptions | (js.Function1[/* maps */ Maps, MapOptions]) = null,
    resetBoundsOnResize: js.UndefOr[Boolean] = js.undefined,
    shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.undefined,
    style: HTMLProps[HTMLDivElement] = null,
    yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (bootstrapURLKeys != null) __obj.updateDynamic("bootstrapURLKeys")(bootstrapURLKeys.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(debounced)) __obj.updateDynamic("debounced")(debounced.get.asInstanceOf[js.Any])
    if (defaultCenter != null) __obj.updateDynamic("defaultCenter")(defaultCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultZoom)) __obj.updateDynamic("defaultZoom")(defaultZoom.get.asInstanceOf[js.Any])
    if (distanceToMouse != null) __obj.updateDynamic("distanceToMouse")(js.Any.fromFunction3(distanceToMouse))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (googleMapLoader != null) __obj.updateDynamic("googleMapLoader")(js.Any.fromFunction1(googleMapLoader))
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (!js.isUndefined(heatmapLibrary)) __obj.updateDynamic("heatmapLibrary")(heatmapLibrary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverDistance)) __obj.updateDynamic("hoverDistance")(hoverDistance.get.asInstanceOf[js.Any])
    if (layerTypes != null) __obj.updateDynamic("layerTypes")(layerTypes.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChildClick != null) __obj.updateDynamic("onChildClick")(js.Any.fromFunction2(onChildClick))
    if (onChildMouseDown != null) __obj.updateDynamic("onChildMouseDown")(js.Any.fromFunction3(onChildMouseDown))
    if (onChildMouseEnter != null) __obj.updateDynamic("onChildMouseEnter")(js.Any.fromFunction2(onChildMouseEnter))
    if (onChildMouseLeave != null) __obj.updateDynamic("onChildMouseLeave")(js.Any.fromFunction2(onChildMouseLeave))
    if (onChildMouseMove != null) __obj.updateDynamic("onChildMouseMove")(js.Any.fromFunction3(onChildMouseMove))
    if (onChildMouseUp != null) __obj.updateDynamic("onChildMouseUp")(js.Any.fromFunction3(onChildMouseUp))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onGoogleApiLoaded != null) __obj.updateDynamic("onGoogleApiLoaded")(js.Any.fromFunction1(onGoogleApiLoaded))
    if (onMapTypeIdChange != null) __obj.updateDynamic("onMapTypeIdChange")(js.Any.fromFunction1(onMapTypeIdChange))
    if (onTilesLoaded != null) __obj.updateDynamic("onTilesLoaded")(js.Any.fromFunction0(onTilesLoaded))
    if (onZoomAnimationEnd != null) __obj.updateDynamic("onZoomAnimationEnd")(js.Any.fromFunction1(onZoomAnimationEnd))
    if (onZoomAnimationStart != null) __obj.updateDynamic("onZoomAnimationStart")(js.Any.fromFunction1(onZoomAnimationStart))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBoundsOnResize)) __obj.updateDynamic("resetBoundsOnResize")(resetBoundsOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUnregisterMapOnUnmount)) __obj.updateDynamic("shouldUnregisterMapOnUnmount")(shouldUnregisterMapOnUnmount.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(yesIWantToUseGoogleMapApiInternals)) __obj.updateDynamic("yesIWantToUseGoogleMapApiInternals")(yesIWantToUseGoogleMapApiInternals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

