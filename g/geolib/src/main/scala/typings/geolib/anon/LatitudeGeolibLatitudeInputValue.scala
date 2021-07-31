package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLatitude
import typings.geolib.typesMod.GeolibLatitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatitudeGeolibLatitudeInputValue
  extends StObject
     with GeolibInputLatitude {
  
  var latitude: GeolibLatitudeInputValue
}
object LatitudeGeolibLatitudeInputValue {
  
  @scala.inline
  def apply(latitude: GeolibLatitudeInputValue): LatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatitudeGeolibLatitudeInputValue]
  }
  
  @scala.inline
  implicit class LatitudeGeolibLatitudeInputValueMutableBuilder[Self <: LatitudeGeolibLatitudeInputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: GeolibLatitudeInputValue): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
  }
}
