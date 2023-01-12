package typings.googleMaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapPanes extends StObject {
  
  /**
    * This pane contains the info window. It is above all map overlays. (Pane
    * 4).
    */
  var floatPane: Element
  
  /**
    * This pane is the lowest pane and is above the tiles. It does not receive
    * DOM events. (Pane 0).
    */
  var mapPane: Element
  
  /**
    * This pane contains markers. It does not receive DOM events. (Pane 2).
    */
  var markerLayer: Element
  
  /**
    * This pane contains polylines, polygons, ground overlays and tile layer
    * overlays. It does not receive DOM events. (Pane 1).
    */
  var overlayLayer: Element
  
  /**
    * This pane contains elements that receive DOM events. (Pane 3).
    */
  var overlayMouseTarget: Element
}
object MapPanes {
  
  inline def apply(
    floatPane: Element,
    mapPane: Element,
    markerLayer: Element,
    overlayLayer: Element,
    overlayMouseTarget: Element
  ): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], mapPane = mapPane.asInstanceOf[js.Any], markerLayer = markerLayer.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any], overlayMouseTarget = overlayMouseTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapPanes] (val x: Self) extends AnyVal {
    
    inline def setFloatPane(value: Element): Self = StObject.set(x, "floatPane", value.asInstanceOf[js.Any])
    
    inline def setMapPane(value: Element): Self = StObject.set(x, "mapPane", value.asInstanceOf[js.Any])
    
    inline def setMarkerLayer(value: Element): Self = StObject.set(x, "markerLayer", value.asInstanceOf[js.Any])
    
    inline def setOverlayLayer(value: Element): Self = StObject.set(x, "overlayLayer", value.asInstanceOf[js.Any])
    
    inline def setOverlayMouseTarget(value: Element): Self = StObject.set(x, "overlayMouseTarget", value.asInstanceOf[js.Any])
  }
}
