package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object defines the properties that can be set on a
  * <code>KmlLayer</code> object.
  */
trait KmlLayerOptions extends StObject {
  
  /**
    * If <code>true</code>, the layer receives mouse events.
    * @defaultValue <code>true</code>
    */
  var clickable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The map on which to display the layer.
    */
  var map: js.UndefOr[Map | Null] = js.undefined
  
  /**
    * If this option is set to <code>true</code> or if the map&#39;s center and
    * zoom were never set, the input map is centered and zoomed to the bounding
    * box of the contents of the layer.
    * @defaultValue <code>false</code>
    */
  var preserveViewport: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to render the screen overlays.
    * @defaultValue <code>true</code>
    */
  var screenOverlays: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Suppress the rendering of info windows when layer features are clicked.
    */
  var suppressInfoWindows: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The URL of the KML document to display.
    */
  var url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The z-index of the layer.
    */
  var zIndex: js.UndefOr[Double | Null] = js.undefined
}
object KmlLayerOptions {
  
  inline def apply(): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmlLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableNull: Self = StObject.set(x, "clickable", null)
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    inline def setPreserveViewportNull: Self = StObject.set(x, "preserveViewport", null)
    
    inline def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    inline def setScreenOverlays(value: Boolean): Self = StObject.set(x, "screenOverlays", value.asInstanceOf[js.Any])
    
    inline def setScreenOverlaysNull: Self = StObject.set(x, "screenOverlays", null)
    
    inline def setScreenOverlaysUndefined: Self = StObject.set(x, "screenOverlays", js.undefined)
    
    inline def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    inline def setSuppressInfoWindowsNull: Self = StObject.set(x, "suppressInfoWindows", null)
    
    inline def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
