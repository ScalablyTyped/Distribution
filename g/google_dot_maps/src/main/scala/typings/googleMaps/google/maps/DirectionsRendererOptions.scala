package typings.googleMaps.google.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object defines the properties that can be set on a
  * <code>DirectionsRenderer</code> object.
  */
trait DirectionsRendererOptions extends StObject {
  
  /**
    * The directions to display on the map and/or in a <code>&lt;div&gt;</code>
    * panel, retrieved as a <code>DirectionsResult</code> object from
    * <code>DirectionsService</code>.
    */
  var directions: js.UndefOr[DirectionsResult | Null] = js.undefined
  
  /**
    * If <code>true</code>, allows the user to drag and modify the paths of
    * routes rendered by this <code>DirectionsRenderer</code>.
    */
  var draggable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This property indicates whether the renderer should provide a
    * user-selectable list of routes shown in the directions panel.
    * @defaultValue <code>false</code>
    */
  var hideRouteList: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The <code>InfoWindow</code> in which to render text information when a
    * marker is clicked. Existing info window content will be overwritten and
    * its position moved. If no info window is specified, the
    * <code>DirectionsRenderer</code> will create and use its own info window.
    * This property will be ignored if <code>suppressInfoWindows</code> is set
    * to <code>true</code>.
    */
  var infoWindow: js.UndefOr[InfoWindow | Null] = js.undefined
  
  /**
    * Map on which to display the directions.
    */
  var map: js.UndefOr[Map | Null] = js.undefined
  
  /**
    * Options for the markers. All markers rendered by the
    * <code>DirectionsRenderer</code> will use these options.
    */
  var markerOptions: js.UndefOr[MarkerOptions | Null] = js.undefined
  
  /**
    * The <code>&lt;div&gt;</code> in which to display the directions steps.
    */
  var panel: js.UndefOr[HTMLElement | Null] = js.undefined
  
  /**
    * Options for the polylines. All polylines rendered by the
    * <code>DirectionsRenderer</code> will use these options.
    */
  var polylineOptions: js.UndefOr[PolylineOptions | Null] = js.undefined
  
  /**
    * If this option is set to <code>true</code> or the map&#39;s center and
    * zoom were never set, the input map is centered and zoomed to the bounding
    * box of this set of directions.
    * @defaultValue <code>false</code>
    */
  var preserveViewport: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The index of the route within the <code>DirectionsResult</code> object.
    * The default value is 0.
    */
  var routeIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Suppress the rendering of the <code>BicyclingLayer</code> when bicycling
    * directions are requested.
    */
  var suppressBicyclingLayer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Suppress the rendering of info windows.
    */
  var suppressInfoWindows: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Suppress the rendering of markers.
    */
  var suppressMarkers: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Suppress the rendering of polylines.
    */
  var suppressPolylines: js.UndefOr[Boolean | Null] = js.undefined
}
object DirectionsRendererOptions {
  
  inline def apply(): DirectionsRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setDirections(value: DirectionsResult): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsNull: Self = StObject.set(x, "directions", null)
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHideRouteList(value: Boolean): Self = StObject.set(x, "hideRouteList", value.asInstanceOf[js.Any])
    
    inline def setHideRouteListNull: Self = StObject.set(x, "hideRouteList", null)
    
    inline def setHideRouteListUndefined: Self = StObject.set(x, "hideRouteList", js.undefined)
    
    inline def setInfoWindow(value: InfoWindow): Self = StObject.set(x, "infoWindow", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowNull: Self = StObject.set(x, "infoWindow", null)
    
    inline def setInfoWindowUndefined: Self = StObject.set(x, "infoWindow", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    inline def setMarkerOptionsNull: Self = StObject.set(x, "markerOptions", null)
    
    inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
    
    inline def setPanel(value: HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelNull: Self = StObject.set(x, "panel", null)
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    inline def setPolylineOptionsNull: Self = StObject.set(x, "polylineOptions", null)
    
    inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    inline def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    inline def setPreserveViewportNull: Self = StObject.set(x, "preserveViewport", null)
    
    inline def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    inline def setRouteIndex(value: Double): Self = StObject.set(x, "routeIndex", value.asInstanceOf[js.Any])
    
    inline def setRouteIndexNull: Self = StObject.set(x, "routeIndex", null)
    
    inline def setRouteIndexUndefined: Self = StObject.set(x, "routeIndex", js.undefined)
    
    inline def setSuppressBicyclingLayer(value: Boolean): Self = StObject.set(x, "suppressBicyclingLayer", value.asInstanceOf[js.Any])
    
    inline def setSuppressBicyclingLayerNull: Self = StObject.set(x, "suppressBicyclingLayer", null)
    
    inline def setSuppressBicyclingLayerUndefined: Self = StObject.set(x, "suppressBicyclingLayer", js.undefined)
    
    inline def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    inline def setSuppressInfoWindowsNull: Self = StObject.set(x, "suppressInfoWindows", null)
    
    inline def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
    
    inline def setSuppressMarkers(value: Boolean): Self = StObject.set(x, "suppressMarkers", value.asInstanceOf[js.Any])
    
    inline def setSuppressMarkersNull: Self = StObject.set(x, "suppressMarkers", null)
    
    inline def setSuppressMarkersUndefined: Self = StObject.set(x, "suppressMarkers", js.undefined)
    
    inline def setSuppressPolylines(value: Boolean): Self = StObject.set(x, "suppressPolylines", value.asInstanceOf[js.Any])
    
    inline def setSuppressPolylinesNull: Self = StObject.set(x, "suppressPolylines", null)
    
    inline def setSuppressPolylinesUndefined: Self = StObject.set(x, "suppressPolylines", js.undefined)
  }
}
