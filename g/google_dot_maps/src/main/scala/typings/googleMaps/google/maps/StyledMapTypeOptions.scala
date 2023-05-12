package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyledMapTypeOptions extends StObject {
  
  /**
    * Text to display when this <code>MapType</code>&#39;s button is hovered
    * over in the map type control.
    */
  var alt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum zoom level for the map when displaying this
    * <code>MapType</code>. Optional.
    */
  var maxZoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum zoom level for the map when displaying this
    * <code>MapType</code>. Optional.
    */
  var minZoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name to display in the map type control.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object StyledMapTypeOptions {
  
  inline def apply(): StyledMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledMapTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyledMapTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltNull: Self = StObject.set(x, "alt", null)
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomNull: Self = StObject.set(x, "maxZoom", null)
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomNull: Self = StObject.set(x, "minZoom", null)
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
