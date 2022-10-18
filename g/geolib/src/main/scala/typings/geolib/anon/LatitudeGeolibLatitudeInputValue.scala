package typings.geolib.anon

import typings.geolib.esTypesMod.GeolibInputLatitude
import typings.geolib.esTypesMod.GeolibLatitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatitudeGeolibLatitudeInputValue
  extends StObject
     with GeolibInputLatitude {
  
  var latitude: GeolibLatitudeInputValue
}
object LatitudeGeolibLatitudeInputValue {
  
  inline def apply(latitude: GeolibLatitudeInputValue): LatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatitudeGeolibLatitudeInputValue]
  }
  
  extension [Self <: LatitudeGeolibLatitudeInputValue](x: Self) {
    
    inline def setLatitude(value: GeolibLatitudeInputValue): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
  }
}
