package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Bing
import typings.devextreme.anon.Color
import typings.devextreme.anon.IconSrc
import typings.devextreme.mod.DevExpress.ui.dxMap.ClickEvent
import typings.devextreme.mod.DevExpress.ui.dxMap.MapProvider
import typings.devextreme.mod.DevExpress.ui.dxMap.MapType
import typings.devextreme.mod.DevExpress.ui.dxMap.MarkerAddedEvent
import typings.devextreme.mod.DevExpress.ui.dxMap.MarkerRemovedEvent
import typings.devextreme.mod.DevExpress.ui.dxMap.ReadyEvent
import typings.devextreme.mod.DevExpress.ui.dxMap.RouteAddedEvent
import typings.devextreme.mod.DevExpress.ui.dxMap.RouteRemovedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxMapOptions
  extends StObject
     with WidgetOptions[dxMap] {
  
  /**
    * Keys to authenticate the component within map providers.
    */
  var apiKey: js.UndefOr[String | Bing] = js.undefined
  
  /**
    * Specifies whether the UI component automatically adjusts center and zoom property values when adding a new marker or route, or if a new UI component contains markers or routes by default.
    */
  var autoAdjust: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object, a string, or an array specifying which part of the map is displayed at the UI component&apos;s center using coordinates. The UI component can change this value if autoAdjust is enabled.
    */
  var center: js.UndefOr[Any | String | js.Array[Double]] = js.undefined
  
  /**
    * Specifies whether or not map UI component controls are available.
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A URL pointing to the custom icon to be used for map markers.
    */
  var markerIconSrc: js.UndefOr[String] = js.undefined
  
  /**
    * An array of markers displayed on a map.
    */
  var markers: js.UndefOr[js.Array[IconSrc]] = js.undefined
  
  /**
    * A function that is executed when any location on the map is clicked or tapped.
    */
  var onClick: js.UndefOr[(js.Function1[/* e */ ClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a marker is created on the map.
    */
  var onMarkerAdded: js.UndefOr[js.Function1[/* e */ MarkerAddedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a marker is removed from the map.
    */
  var onMarkerRemoved: js.UndefOr[js.Function1[/* e */ MarkerRemovedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the map is ready.
    */
  var onReady: js.UndefOr[js.Function1[/* e */ ReadyEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a route is created on the map.
    */
  var onRouteAdded: js.UndefOr[js.Function1[/* e */ RouteAddedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a route is removed from the map.
    */
  var onRouteRemoved: js.UndefOr[js.Function1[/* e */ RouteRemovedEvent, Unit]] = js.undefined
  
  /**
    * The name of the current map data provider.
    */
  var provider: js.UndefOr[MapProvider] = js.undefined
  
  /**
    * An array of routes shown on the map.
    */
  var routes: js.UndefOr[js.Array[Color]] = js.undefined
  
  /**
    * The type of a map to display.
    */
  var `type`: js.UndefOr[MapType] = js.undefined
  
  /**
    * The map&apos;s zoom level. The UI component can change this value if autoAdjust is enabled.
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object dxMapOptions {
  
  inline def apply(): dxMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMapOptions]
  }
  
  extension [Self <: dxMapOptions](x: Self) {
    
    inline def setApiKey(value: String | Bing): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAutoAdjust(value: Boolean): Self = StObject.set(x, "autoAdjust", value.asInstanceOf[js.Any])
    
    inline def setAutoAdjustUndefined: Self = StObject.set(x, "autoAdjust", js.undefined)
    
    inline def setCenter(value: Any | String | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setMarkerIconSrc(value: String): Self = StObject.set(x, "markerIconSrc", value.asInstanceOf[js.Any])
    
    inline def setMarkerIconSrcUndefined: Self = StObject.set(x, "markerIconSrc", js.undefined)
    
    inline def setMarkers(value: js.Array[IconSrc]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: IconSrc*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setOnClick(value: (js.Function1[/* e */ ClickEvent, Unit]) | String): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction1(value: /* e */ ClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMarkerAdded(value: /* e */ MarkerAddedEvent => Unit): Self = StObject.set(x, "onMarkerAdded", js.Any.fromFunction1(value))
    
    inline def setOnMarkerAddedUndefined: Self = StObject.set(x, "onMarkerAdded", js.undefined)
    
    inline def setOnMarkerRemoved(value: /* e */ MarkerRemovedEvent => Unit): Self = StObject.set(x, "onMarkerRemoved", js.Any.fromFunction1(value))
    
    inline def setOnMarkerRemovedUndefined: Self = StObject.set(x, "onMarkerRemoved", js.undefined)
    
    inline def setOnReady(value: /* e */ ReadyEvent => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnRouteAdded(value: /* e */ RouteAddedEvent => Unit): Self = StObject.set(x, "onRouteAdded", js.Any.fromFunction1(value))
    
    inline def setOnRouteAddedUndefined: Self = StObject.set(x, "onRouteAdded", js.undefined)
    
    inline def setOnRouteRemoved(value: /* e */ RouteRemovedEvent => Unit): Self = StObject.set(x, "onRouteRemoved", js.Any.fromFunction1(value))
    
    inline def setOnRouteRemovedUndefined: Self = StObject.set(x, "onRouteRemoved", js.undefined)
    
    inline def setProvider(value: MapProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRoutes(value: js.Array[Color]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    inline def setRoutesVarargs(value: Color*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setType(value: MapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
