package typings.geolib.anon

import typings.geolib.esTypesMod.AltitudeKeys
import typings.geolib.esTypesMod.LatitudeKeys
import typings.geolib.esTypesMod.LongitudeKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Altitude extends StObject {
  
  var altitude: js.Array[AltitudeKeys]
  
  var latitude: js.Array[LatitudeKeys]
  
  var longitude: js.Array[LongitudeKeys]
}
object Altitude {
  
  inline def apply(
    altitude: js.Array[AltitudeKeys],
    latitude: js.Array[LatitudeKeys],
    longitude: js.Array[LongitudeKeys]
  ): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: js.Array[AltitudeKeys]): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeVarargs(value: AltitudeKeys*): Self = StObject.set(x, "altitude", js.Array(value*))
    
    inline def setLatitude(value: js.Array[LatitudeKeys]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeVarargs(value: LatitudeKeys*): Self = StObject.set(x, "latitude", js.Array(value*))
    
    inline def setLongitude(value: js.Array[LongitudeKeys]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeVarargs(value: LongitudeKeys*): Self = StObject.set(x, "longitude", js.Array(value*))
  }
}
