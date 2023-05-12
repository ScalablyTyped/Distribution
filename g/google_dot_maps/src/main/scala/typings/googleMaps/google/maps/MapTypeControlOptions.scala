package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeControlOptions extends StObject {
  
  /**
    * IDs of map types to show in the control.
    */
  var mapTypeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * @defaultValue {@link google.maps.ControlPosition.TOP_RIGHT}
    */
  var position: js.UndefOr[ControlPosition | Null] = js.undefined
  
  /**
    * Style id. Used to select what style of map type control to display.
    */
  var style: js.UndefOr[MapTypeControlStyle | Null] = js.undefined
}
object MapTypeControlOptions {
  
  inline def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    
    inline def setMapTypeIds(value: js.Array[String]): Self = StObject.set(x, "mapTypeIds", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdsNull: Self = StObject.set(x, "mapTypeIds", null)
    
    inline def setMapTypeIdsUndefined: Self = StObject.set(x, "mapTypeIds", js.undefined)
    
    inline def setMapTypeIdsVarargs(value: String*): Self = StObject.set(x, "mapTypeIds", js.Array(value*))
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: MapTypeControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
