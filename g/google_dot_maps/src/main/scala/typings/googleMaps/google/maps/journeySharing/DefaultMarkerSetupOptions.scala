package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultMarkerSetupOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "defaultMarkerOptions", value.asInstanceOf[js.Any])
  }
}
