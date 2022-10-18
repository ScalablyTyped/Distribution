package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Object containing a snapshot of what capabilities are currently available
  * for the Map. See the properties for a list of possible capabilities.
  */
trait MapCapabilities extends StObject {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    */
  var isAdvancedMarkersAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    */
  var isDataDrivenStylingAvailable: js.UndefOr[Boolean] = js.undefined
}
object MapCapabilities {
  
  inline def apply(): MapCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCapabilities]
  }
  
  extension [Self <: MapCapabilities](x: Self) {
    
    inline def setIsAdvancedMarkersAvailable(value: Boolean): Self = StObject.set(x, "isAdvancedMarkersAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsAdvancedMarkersAvailableUndefined: Self = StObject.set(x, "isAdvancedMarkersAvailable", js.undefined)
    
    inline def setIsDataDrivenStylingAvailable(value: Boolean): Self = StObject.set(x, "isDataDrivenStylingAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsDataDrivenStylingAvailableUndefined: Self = StObject.set(x, "isDataDrivenStylingAvailable", js.undefined)
  }
}
