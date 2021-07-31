package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLatitude
import typings.geolib.typesMod.GeolibLatitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat
  extends StObject
     with GeolibInputLatitude {
  
  var lat: GeolibLatitudeInputValue
}
object Lat {
  
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit class LatMutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: GeolibLatitudeInputValue): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
  }
}
