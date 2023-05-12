package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapCapabilities extends StObject {
  
  var isAdvancedMarkersAvailable: js.UndefOr[Boolean] = js.undefined
  
  var isDataDrivenStylingAvailable: js.UndefOr[Boolean] = js.undefined
}
object MapCapabilities {
  
  inline def apply(): MapCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapCapabilities] (val x: Self) extends AnyVal {
    
    inline def setIsAdvancedMarkersAvailable(value: Boolean): Self = StObject.set(x, "isAdvancedMarkersAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsAdvancedMarkersAvailableUndefined: Self = StObject.set(x, "isAdvancedMarkersAvailable", js.undefined)
    
    inline def setIsDataDrivenStylingAvailable(value: Boolean): Self = StObject.set(x, "isDataDrivenStylingAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsDataDrivenStylingAvailableUndefined: Self = StObject.set(x, "isDataDrivenStylingAvailable", js.undefined)
  }
}
