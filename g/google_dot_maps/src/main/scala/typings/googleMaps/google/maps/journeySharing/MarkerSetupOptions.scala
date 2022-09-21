package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * MarkerSetup options.
  */
trait MarkerSetupOptions extends StObject {
  
  /**
    * Marker options.
    */
  var markerOptions: js.UndefOr[MarkerOptions | Null] = js.undefined
}
object MarkerSetupOptions {
  
  inline def apply(): MarkerSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerSetupOptions]
  }
  
  extension [Self <: MarkerSetupOptions](x: Self) {
    
    inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    inline def setMarkerOptionsNull: Self = StObject.set(x, "markerOptions", null)
    
    inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
  }
}
