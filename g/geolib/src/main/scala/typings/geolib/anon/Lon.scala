package typings.geolib.anon

import typings.geolib.esTypesMod.GeolibInputLongitude
import typings.geolib.esTypesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lon
  extends StObject
     with GeolibInputLongitude {
  
  var lon: GeolibLongitudeInputValue
}
object Lon {
  
  inline def apply(lon: GeolibLongitudeInputValue): Lon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lon] (val x: Self) extends AnyVal {
    
    inline def setLon(value: GeolibLongitudeInputValue): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
