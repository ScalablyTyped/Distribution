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
  
  @scala.inline
  def apply(longitude: GeolibLongitudeInputValue): LongitudeGeolibLongitudeInputValue = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongitudeGeolibLongitudeInputValue]
  }
  
  @scala.inline
  implicit class LongitudeGeolibLongitudeInputValueMutableBuilder[Self <: LongitudeGeolibLongitudeInputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLongitude(value: GeolibLongitudeInputValue): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
