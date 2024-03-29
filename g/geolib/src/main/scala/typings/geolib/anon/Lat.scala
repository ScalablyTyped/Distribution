package typings.geolib.anon

import typings.geolib.esTypesMod.GeolibInputLatitude
import typings.geolib.esTypesMod.GeolibLatitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat
  extends StObject
     with GeolibInputLatitude {
  
  var lat: GeolibLatitudeInputValue
}
object Lat {
  
  inline def apply(lat: GeolibLatitudeInputValue): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    inline def setLat(value: GeolibLatitudeInputValue): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
  }
}
