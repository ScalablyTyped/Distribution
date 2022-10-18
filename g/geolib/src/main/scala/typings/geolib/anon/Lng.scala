package typings.geolib.anon

import typings.geolib.esTypesMod.GeolibInputLongitude
import typings.geolib.esTypesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lng
  extends StObject
     with GeolibInputLongitude {
  
  var lng: GeolibLongitudeInputValue
}
object Lng {
  
  inline def apply(lng: GeolibLongitudeInputValue): Lng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lng]
  }
  
  extension [Self <: Lng](x: Self) {
    
    inline def setLng(value: GeolibLongitudeInputValue): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
