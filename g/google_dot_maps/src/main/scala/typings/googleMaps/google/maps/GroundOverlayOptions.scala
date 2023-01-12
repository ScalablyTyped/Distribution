package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object defines the properties that can be set on a
  * <code>GroundOverlay</code> object.
  */
trait GroundOverlayOptions extends StObject {
  
  /**
    * If <code>true</code>, the ground overlay can receive mouse events.
    */
  var clickable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The map on which to display the overlay.
    */
  var map: js.UndefOr[Map | Null] = js.undefined
  
  /**
    * The opacity of the overlay, expressed as a number between 0 and 1.
    * Optional.
    * @defaultValue <code>1.0</code>
    */
  var opacity: js.UndefOr[Double | Null] = js.undefined
}
object GroundOverlayOptions {
  
  inline def apply(): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundOverlayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroundOverlayOptions] (val x: Self) extends AnyVal {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableNull: Self = StObject.set(x, "clickable", null)
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
