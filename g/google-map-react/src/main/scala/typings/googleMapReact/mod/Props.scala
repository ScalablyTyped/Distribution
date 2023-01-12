package typings.googleMapReact.mod

import typings.googleMapReact.anon.Map
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.undefined
  
  var center: js.UndefOr[Coords] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var debounced: js.UndefOr[Boolean] = js.undefined
  
  var defaultCenter: js.UndefOr[Coords] = js.undefined
  
  var defaultZoom: js.UndefOr[Double] = js.undefined
  
  var distanceToMouse: js.UndefOr[
    js.Function3[/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object], Double]
  ] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ Any, Unit]] = js.undefined
  
  var heatmap: js.UndefOr[Heatmap] = js.undefined
  
  var heatmapLibrary: js.UndefOr[Boolean] = js.undefined
  
  var hoverDistance: js.UndefOr[Double] = js.undefined
  
  var layerTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var margin: js.UndefOr[js.Array[Any]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, Any]] = js.undefined
  
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ Any, /* childProps */ Any, Unit]] = js.undefined
  
  var onChildMouseDown: js.UndefOr[js.Function3[/* childKey */ Any, /* childProps */ Any, /* mouse */ Any, Unit]] = js.undefined
  
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ Any, /* childProps */ Any, Unit]] = js.undefined
  
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ Any, /* childProps */ Any, Unit]] = js.undefined
  
  var onChildMouseMove: js.UndefOr[js.Function3[/* childKey */ Any, /* childProps */ Any, /* mouse */ Any, Unit]] = js.undefined
  
  var onChildMouseUp: js.UndefOr[js.Function3[/* childKey */ Any, /* childProps */ Any, /* mouse */ Any, Unit]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, Any]] = js.undefined
  
  var onDrag: js.UndefOr[js.Function1[/* map */ Any, Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* map */ Any, Unit]] = js.undefined
  
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ Map, Unit]] = js.undefined
  
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.undefined
  
  var onTilesLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.undefined
  
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.undefined
  
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.undefined
  
  var resetBoundsOnResize: js.UndefOr[Boolean] = js.undefined
  
  var shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object Props {
  
  inline def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    inline def setBootstrapURLKeys(value: BootstrapURLKeys): Self = StObject.set(x, "bootstrapURLKeys", value.asInstanceOf[js.Any])
    
    inline def setBootstrapURLKeysUndefined: Self = StObject.set(x, "bootstrapURLKeys", js.undefined)
    
    inline def setCenter(value: Coords): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDebounced(value: Boolean): Self = StObject.set(x, "debounced", value.asInstanceOf[js.Any])
    
    inline def setDebouncedUndefined: Self = StObject.set(x, "debounced", js.undefined)
    
    inline def setDefaultCenter(value: Coords): Self = StObject.set(x, "defaultCenter", value.asInstanceOf[js.Any])
    
    inline def setDefaultCenterUndefined: Self = StObject.set(x, "defaultCenter", js.undefined)
    
    inline def setDefaultZoom(value: Double): Self = StObject.set(x, "defaultZoom", value.asInstanceOf[js.Any])
    
    inline def setDefaultZoomUndefined: Self = StObject.set(x, "defaultZoom", js.undefined)
    
    inline def setDistanceToMouse(value: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double): Self = StObject.set(x, "distanceToMouse", js.Any.fromFunction3(value))
    
    inline def setDistanceToMouseUndefined: Self = StObject.set(x, "distanceToMouse", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setGoogleMapLoader(value: /* bootstrapURLKeys */ Any => Unit): Self = StObject.set(x, "googleMapLoader", js.Any.fromFunction1(value))
    
    inline def setGoogleMapLoaderUndefined: Self = StObject.set(x, "googleMapLoader", js.undefined)
    
    inline def setHeatmap(value: Heatmap): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    inline def setHeatmapLibrary(value: Boolean): Self = StObject.set(x, "heatmapLibrary", value.asInstanceOf[js.Any])
    
    inline def setHeatmapLibraryUndefined: Self = StObject.set(x, "heatmapLibrary", js.undefined)
    
    inline def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    inline def setHoverDistance(value: Double): Self = StObject.set(x, "hoverDistance", value.asInstanceOf[js.Any])
    
    inline def setHoverDistanceUndefined: Self = StObject.set(x, "hoverDistance", js.undefined)
    
    inline def setLayerTypes(value: js.Array[String]): Self = StObject.set(x, "layerTypes", value.asInstanceOf[js.Any])
    
    inline def setLayerTypesUndefined: Self = StObject.set(x, "layerTypes", js.undefined)
    
    inline def setLayerTypesVarargs(value: String*): Self = StObject.set(x, "layerTypes", js.Array(value*))
    
    inline def setMargin(value: js.Array[Any]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Any*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setOnChange(value: /* value */ ChangeEventValue => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnChildClick(value: (/* hoverKey */ Any, /* childProps */ Any) => Unit): Self = StObject.set(x, "onChildClick", js.Any.fromFunction2(value))
    
    inline def setOnChildClickUndefined: Self = StObject.set(x, "onChildClick", js.undefined)
    
    inline def setOnChildMouseDown(value: (/* childKey */ Any, /* childProps */ Any, /* mouse */ Any) => Unit): Self = StObject.set(x, "onChildMouseDown", js.Any.fromFunction3(value))
    
    inline def setOnChildMouseDownUndefined: Self = StObject.set(x, "onChildMouseDown", js.undefined)
    
    inline def setOnChildMouseEnter(value: (/* hoverKey */ Any, /* childProps */ Any) => Unit): Self = StObject.set(x, "onChildMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnChildMouseEnterUndefined: Self = StObject.set(x, "onChildMouseEnter", js.undefined)
    
    inline def setOnChildMouseLeave(value: (/* hoverKey */ Any, /* childProps */ Any) => Unit): Self = StObject.set(x, "onChildMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnChildMouseLeaveUndefined: Self = StObject.set(x, "onChildMouseLeave", js.undefined)
    
    inline def setOnChildMouseMove(value: (/* childKey */ Any, /* childProps */ Any, /* mouse */ Any) => Unit): Self = StObject.set(x, "onChildMouseMove", js.Any.fromFunction3(value))
    
    inline def setOnChildMouseMoveUndefined: Self = StObject.set(x, "onChildMouseMove", js.undefined)
    
    inline def setOnChildMouseUp(value: (/* childKey */ Any, /* childProps */ Any, /* mouse */ Any) => Unit): Self = StObject.set(x, "onChildMouseUp", js.Any.fromFunction3(value))
    
    inline def setOnChildMouseUpUndefined: Self = StObject.set(x, "onChildMouseUp", js.undefined)
    
    inline def setOnClick(value: /* value */ ClickEventValue => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDrag(value: /* map */ Any => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragEnd(value: /* map */ Any => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnGoogleApiLoaded(value: /* maps */ Map => Unit): Self = StObject.set(x, "onGoogleApiLoaded", js.Any.fromFunction1(value))
    
    inline def setOnGoogleApiLoadedUndefined: Self = StObject.set(x, "onGoogleApiLoaded", js.undefined)
    
    inline def setOnMapTypeIdChange(value: /* args */ Any => Unit): Self = StObject.set(x, "onMapTypeIdChange", js.Any.fromFunction1(value))
    
    inline def setOnMapTypeIdChangeUndefined: Self = StObject.set(x, "onMapTypeIdChange", js.undefined)
    
    inline def setOnTilesLoaded(value: () => Unit): Self = StObject.set(x, "onTilesLoaded", js.Any.fromFunction0(value))
    
    inline def setOnTilesLoadedUndefined: Self = StObject.set(x, "onTilesLoaded", js.undefined)
    
    inline def setOnZoomAnimationEnd(value: /* args */ Any => Unit): Self = StObject.set(x, "onZoomAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnZoomAnimationEndUndefined: Self = StObject.set(x, "onZoomAnimationEnd", js.undefined)
    
    inline def setOnZoomAnimationStart(value: /* args */ Any => Unit): Self = StObject.set(x, "onZoomAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnZoomAnimationStartUndefined: Self = StObject.set(x, "onZoomAnimationStart", js.undefined)
    
    inline def setOptions(value: MapOptions | (js.Function1[/* maps */ Maps, MapOptions])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* maps */ Maps => MapOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResetBoundsOnResize(value: Boolean): Self = StObject.set(x, "resetBoundsOnResize", value.asInstanceOf[js.Any])
    
    inline def setResetBoundsOnResizeUndefined: Self = StObject.set(x, "resetBoundsOnResize", js.undefined)
    
    inline def setShouldUnregisterMapOnUnmount(value: Boolean): Self = StObject.set(x, "shouldUnregisterMapOnUnmount", value.asInstanceOf[js.Any])
    
    inline def setShouldUnregisterMapOnUnmountUndefined: Self = StObject.set(x, "shouldUnregisterMapOnUnmount", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setYesIWantToUseGoogleMapApiInternals(value: Boolean): Self = StObject.set(x, "yesIWantToUseGoogleMapApiInternals", value.asInstanceOf[js.Any])
    
    inline def setYesIWantToUseGoogleMapApiInternalsUndefined: Self = StObject.set(x, "yesIWantToUseGoogleMapApiInternals", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
