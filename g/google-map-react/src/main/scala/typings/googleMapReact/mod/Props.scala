package typings.googleMapReact.mod

import typings.googleMapReact.anon.Map
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.native
  var center: js.UndefOr[Coords] = js.native
  var debounced: js.UndefOr[Boolean] = js.native
  var defaultCenter: js.UndefOr[Coords] = js.native
  var defaultZoom: js.UndefOr[Double] = js.native
  var distanceToMouse: js.UndefOr[
    js.Function3[/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object], Double]
  ] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ js.Any, Unit]] = js.native
  var heatmap: js.UndefOr[Heatmap] = js.native
  var heatmapLibrary: js.UndefOr[Boolean] = js.native
  var hoverDistance: js.UndefOr[Double] = js.native
  var layerTypes: js.UndefOr[js.Array[String]] = js.native
  var margin: js.UndefOr[js.Array[_]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, _]] = js.native
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.native
  var onChildMouseDown: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.native
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.native
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.native
  var onChildMouseMove: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.native
  var onChildMouseUp: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.native
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, _]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ Map, Unit]] = js.native
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var onTilesLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.native
  var resetBoundsOnResize: js.UndefOr[Boolean] = js.native
  var shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBootstrapURLKeys(value: BootstrapURLKeys): Self = this.set("bootstrapURLKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapURLKeys: Self = this.set("bootstrapURLKeys", js.undefined)
    @scala.inline
    def setCenter(value: Coords): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDebounced(value: Boolean): Self = this.set("debounced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounced: Self = this.set("debounced", js.undefined)
    @scala.inline
    def setDefaultCenter(value: Coords): Self = this.set("defaultCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCenter: Self = this.set("defaultCenter", js.undefined)
    @scala.inline
    def setDefaultZoom(value: Double): Self = this.set("defaultZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZoom: Self = this.set("defaultZoom", js.undefined)
    @scala.inline
    def setDistanceToMouse(value: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double): Self = this.set("distanceToMouse", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDistanceToMouse: Self = this.set("distanceToMouse", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setGoogleMapLoader(value: /* bootstrapURLKeys */ js.Any => Unit): Self = this.set("googleMapLoader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGoogleMapLoader: Self = this.set("googleMapLoader", js.undefined)
    @scala.inline
    def setHeatmap(value: Heatmap): Self = this.set("heatmap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatmap: Self = this.set("heatmap", js.undefined)
    @scala.inline
    def setHeatmapLibrary(value: Boolean): Self = this.set("heatmapLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatmapLibrary: Self = this.set("heatmapLibrary", js.undefined)
    @scala.inline
    def setHoverDistance(value: Double): Self = this.set("hoverDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverDistance: Self = this.set("hoverDistance", js.undefined)
    @scala.inline
    def setLayerTypesVarargs(value: String*): Self = this.set("layerTypes", js.Array(value :_*))
    @scala.inline
    def setLayerTypes(value: js.Array[String]): Self = this.set("layerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerTypes: Self = this.set("layerTypes", js.undefined)
    @scala.inline
    def setMarginVarargs(value: js.Any*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: js.Array[_]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ ChangeEventValue => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChildClick(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = this.set("onChildClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChildClick: Self = this.set("onChildClick", js.undefined)
    @scala.inline
    def setOnChildMouseDown(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = this.set("onChildMouseDown", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChildMouseDown: Self = this.set("onChildMouseDown", js.undefined)
    @scala.inline
    def setOnChildMouseEnter(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = this.set("onChildMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChildMouseEnter: Self = this.set("onChildMouseEnter", js.undefined)
    @scala.inline
    def setOnChildMouseLeave(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = this.set("onChildMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChildMouseLeave: Self = this.set("onChildMouseLeave", js.undefined)
    @scala.inline
    def setOnChildMouseMove(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = this.set("onChildMouseMove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChildMouseMove: Self = this.set("onChildMouseMove", js.undefined)
    @scala.inline
    def setOnChildMouseUp(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = this.set("onChildMouseUp", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChildMouseUp: Self = this.set("onChildMouseUp", js.undefined)
    @scala.inline
    def setOnClick(value: /* value */ ClickEventValue => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDrag(value: /* map */ js.Any => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* map */ js.Any => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnGoogleApiLoaded(value: /* maps */ Map => Unit): Self = this.set("onGoogleApiLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGoogleApiLoaded: Self = this.set("onGoogleApiLoaded", js.undefined)
    @scala.inline
    def setOnMapTypeIdChange(value: /* args */ js.Any => Unit): Self = this.set("onMapTypeIdChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMapTypeIdChange: Self = this.set("onMapTypeIdChange", js.undefined)
    @scala.inline
    def setOnTilesLoaded(value: () => Unit): Self = this.set("onTilesLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTilesLoaded: Self = this.set("onTilesLoaded", js.undefined)
    @scala.inline
    def setOnZoomAnimationEnd(value: /* args */ js.Any => Unit): Self = this.set("onZoomAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnZoomAnimationEnd: Self = this.set("onZoomAnimationEnd", js.undefined)
    @scala.inline
    def setOnZoomAnimationStart(value: /* args */ js.Any => Unit): Self = this.set("onZoomAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnZoomAnimationStart: Self = this.set("onZoomAnimationStart", js.undefined)
    @scala.inline
    def setOptionsFunction1(value: /* maps */ Maps => MapOptions): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: MapOptions | (js.Function1[/* maps */ Maps, MapOptions])): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setResetBoundsOnResize(value: Boolean): Self = this.set("resetBoundsOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetBoundsOnResize: Self = this.set("resetBoundsOnResize", js.undefined)
    @scala.inline
    def setShouldUnregisterMapOnUnmount(value: Boolean): Self = this.set("shouldUnregisterMapOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldUnregisterMapOnUnmount: Self = this.set("shouldUnregisterMapOnUnmount", js.undefined)
    @scala.inline
    def setStyle(value: HTMLProps[HTMLDivElement]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setYesIWantToUseGoogleMapApiInternals(value: Boolean): Self = this.set("yesIWantToUseGoogleMapApiInternals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYesIWantToUseGoogleMapApiInternals: Self = this.set("yesIWantToUseGoogleMapApiInternals", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

