package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationGeocodingOptions extends StObject {
  
  /**
    * Whether to force using Google Maps API instead of the native implementation.
    * Used by default only on Web platform. Requires providing an API key by `setGoogleApiKey`.
    */
  var useGoogleMaps: js.UndefOr[Boolean] = js.undefined
}
object LocationGeocodingOptions {
  
  inline def apply(): LocationGeocodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationGeocodingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationGeocodingOptions] (val x: Self) extends AnyVal {
    
    inline def setUseGoogleMaps(value: Boolean): Self = StObject.set(x, "useGoogleMaps", value.asInstanceOf[js.Any])
    
    inline def setUseGoogleMapsUndefined: Self = StObject.set(x, "useGoogleMaps", js.undefined)
  }
}
