package typings.geolib.anon

import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Altitude extends StObject {
  
  var altitude: js.Array[AltitudeKeys] = js.native
  
  var latitude: js.Array[LatitudeKeys] = js.native
  
  var longitude: js.Array[LongitudeKeys] = js.native
}
object Altitude {
  
  @scala.inline
  def apply(
    altitude: js.Array[AltitudeKeys],
    latitude: js.Array[LatitudeKeys],
    longitude: js.Array[LongitudeKeys]
  ): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: js.Array[AltitudeKeys]): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeVarargs(value: AltitudeKeys*): Self = StObject.set(x, "altitude", js.Array(value :_*))
    
    @scala.inline
    def setLatitude(value: js.Array[LatitudeKeys]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeVarargs(value: LatitudeKeys*): Self = StObject.set(x, "latitude", js.Array(value :_*))
    
    @scala.inline
    def setLongitude(value: js.Array[LongitudeKeys]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeVarargs(value: LongitudeKeys*): Self = StObject.set(x, "longitude", js.Array(value :_*))
  }
}
