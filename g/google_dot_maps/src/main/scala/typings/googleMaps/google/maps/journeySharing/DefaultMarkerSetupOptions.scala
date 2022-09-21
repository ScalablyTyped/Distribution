package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * MarkerSetup default options.
  */
trait DefaultMarkerSetupOptions extends StObject {
  
  /**
    * Default marker options.
    */
  var defaultMarkerOptions: MarkerOptions
}
object DefaultMarkerSetupOptions {
  
  inline def apply(defaultMarkerOptions: MarkerOptions): DefaultMarkerSetupOptions = {
    val __obj = js.Dynamic.literal(defaultMarkerOptions = defaultMarkerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMarkerSetupOptions]
  }
  
  extension [Self <: DefaultMarkerSetupOptions](x: Self) {
    
    inline def setDefaultMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "defaultMarkerOptions", value.asInstanceOf[js.Any])
  }
}
