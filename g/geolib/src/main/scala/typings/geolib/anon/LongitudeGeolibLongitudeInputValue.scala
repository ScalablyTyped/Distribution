package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongitudeGeolibLongitudeInputValue
  extends StObject
     with GeolibInputLongitude {
  
  var longitude: GeolibLongitudeInputValue
}
object LongitudeGeolibLongitudeInputValue {
  
  inline def apply(longitude: GeolibLongitudeInputValue): LongitudeGeolibLongitudeInputValue = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongitudeGeolibLongitudeInputValue]
  }
  
  extension [Self <: LongitudeGeolibLongitudeInputValue](x: Self) {
    
    inline def setLongitude(value: GeolibLongitudeInputValue): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
