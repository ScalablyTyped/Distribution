package typings.googleMapReact.mod

import typings.googleMapReact.anon.Map
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends StObject {
  
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
  implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrapURLKeys(value: BootstrapURLKeys): Self = StObject.set(x, "bootstrapURLKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapURLKeysUndefined: Self = StObject.set(x, "bootstrapURLKeys", js.undefined)
    
    @scala.inline
    def setCenter(value: Coords): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setDebounced(value: Boolean): Self = StObject.set(x, "debounced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebouncedUndefined: Self = StObject.set(x, "debounced", js.undefined)
    
    @scala.inline
    def setDefaultCenter(value: Coords): Self = StObject.set(x, "defaultCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCenterUndefined: Self = StObject.set(x, "defaultCenter", js.undefined)
    
    @scala.inline
    def setDefaultZoom(value: Double): Self = StObject.set(x, "defaultZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultZoomUndefined: Self = StObject.set(x, "defaultZoom", js.undefined)
    
    @scala.inline
    def setDistanceToMouse(value: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double): Self = StObject.set(x, "distanceToMouse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDistanceToMouseUndefined: Self = StObject.set(x, "distanceToMouse", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setGoogleMapLoader(value: /* bootstrapURLKeys */ js.Any => Unit): Self = StObject.set(x, "googleMapLoader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGoogleMapLoaderUndefined: Self = StObject.set(x, "googleMapLoader", js.undefined)
    
    @scala.inline
    def setHeatmap(value: Heatmap): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeatmapLibrary(value: Boolean): Self = StObject.set(x, "heatmapLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeatmapLibraryUndefined: Self = StObject.set(x, "heatmapLibrary", js.undefined)
    
    @scala.inline
    def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    @scala.inline
    def setHoverDistance(value: Double): Self = StObject.set(x, "hoverDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDistanceUndefined: Self = StObject.set(x, "hoverDistance", js.undefined)
    
    @scala.inline
    def setLayerTypes(value: js.Array[String]): Self = StObject.set(x, "layerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTypesUndefined: Self = StObject.set(x, "layerTypes", js.undefined)
    
    @scala.inline
    def setLayerTypesVarargs(value: String*): Self = StObject.set(x, "layerTypes", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[_]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: js.Any*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setOnChange(value: /* value */ ChangeEventValue => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnChildClick(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = StObject.set(x, "onChildClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChildClickUndefined: Self = StObject.set(x, "onChildClick", js.undefined)
    
    @scala.inline
    def setOnChildMouseDown(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = StObject.set(x, "onChildMouseDown", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChildMouseDownUndefined: Self = StObject.set(x, "onChildMouseDown", js.undefined)
    
    @scala.inline
    def setOnChildMouseEnter(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = StObject.set(x, "onChildMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChildMouseEnterUndefined: Self = StObject.set(x, "onChildMouseEnter", js.undefined)
    
    @scala.inline
    def setOnChildMouseLeave(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = StObject.set(x, "onChildMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChildMouseLeaveUndefined: Self = StObject.set(x, "onChildMouseLeave", js.undefined)
    
    @scala.inline
    def setOnChildMouseMove(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = StObject.set(x, "onChildMouseMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChildMouseMoveUndefined: Self = StObject.set(x, "onChildMouseMove", js.undefined)
    
    @scala.inline
    def setOnChildMouseUp(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = StObject.set(x, "onChildMouseUp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChildMouseUpUndefined: Self = StObject.set(x, "onChildMouseUp", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* value */ ClickEventValue => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* map */ js.Any => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: /* map */ js.Any => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnGoogleApiLoaded(value: /* maps */ Map => Unit): Self = StObject.set(x, "onGoogleApiLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGoogleApiLoadedUndefined: Self = StObject.set(x, "onGoogleApiLoaded", js.undefined)
    
    @scala.inline
    def setOnMapTypeIdChange(value: /* args */ js.Any => Unit): Self = StObject.set(x, "onMapTypeIdChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMapTypeIdChangeUndefined: Self = StObject.set(x, "onMapTypeIdChange", js.undefined)
    
    @scala.inline
    def setOnTilesLoaded(value: () => Unit): Self = StObject.set(x, "onTilesLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTilesLoadedUndefined: Self = StObject.set(x, "onTilesLoaded", js.undefined)
    
    @scala.inline
    def setOnZoomAnimationEnd(value: /* args */ js.Any => Unit): Self = StObject.set(x, "onZoomAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnZoomAnimationEndUndefined: Self = StObject.set(x, "onZoomAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnZoomAnimationStart(value: /* args */ js.Any => Unit): Self = StObject.set(x, "onZoomAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnZoomAnimationStartUndefined: Self = StObject.set(x, "onZoomAnimationStart", js.undefined)
    
    @scala.inline
    def setOptions(value: MapOptions | (js.Function1[/* maps */ Maps, MapOptions])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction1(value: /* maps */ Maps => MapOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResetBoundsOnResize(value: Boolean): Self = StObject.set(x, "resetBoundsOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetBoundsOnResizeUndefined: Self = StObject.set(x, "resetBoundsOnResize", js.undefined)
    
    @scala.inline
    def setShouldUnregisterMapOnUnmount(value: Boolean): Self = StObject.set(x, "shouldUnregisterMapOnUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUnregisterMapOnUnmountUndefined: Self = StObject.set(x, "shouldUnregisterMapOnUnmount", js.undefined)
    
    @scala.inline
    def setStyle(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setYesIWantToUseGoogleMapApiInternals(value: Boolean): Self = StObject.set(x, "yesIWantToUseGoogleMapApiInternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYesIWantToUseGoogleMapApiInternalsUndefined: Self = StObject.set(x, "yesIWantToUseGoogleMapApiInternals", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
