package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxMap.RouteMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locations extends StObject {
  
  /**
    * Specifies the color of the line displaying the route.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an array of objects making up the route.
    */
  var locations: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Specifies a transportation mode to be used in the displayed route.
    */
  var mode: js.UndefOr[RouteMode] = js.undefined
  
  /**
    * Specifies the opacity of the line displaying the route.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the thickness of the line displaying the route in pixels.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object Locations {
  
  inline def apply(): Locations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locations] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLocations(value: js.Array[Any]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Any*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMode(value: RouteMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
