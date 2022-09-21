package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BICYCLING extends StObject {
  
  var BICYCLING: String
  
  var DRIVING: String
  
  var TRANSIT: String
  
  var TWO_WHEELER: String
  
  var WALKING: String
}
object BICYCLING {
  
  inline def apply(BICYCLING: String, DRIVING: String, TRANSIT: String, TWO_WHEELER: String, WALKING: String): BICYCLING = {
    val __obj = js.Dynamic.literal(BICYCLING = BICYCLING.asInstanceOf[js.Any], DRIVING = DRIVING.asInstanceOf[js.Any], TRANSIT = TRANSIT.asInstanceOf[js.Any], TWO_WHEELER = TWO_WHEELER.asInstanceOf[js.Any], WALKING = WALKING.asInstanceOf[js.Any])
    __obj.asInstanceOf[BICYCLING]
  }
  
  extension [Self <: BICYCLING](x: Self) {
    
    inline def setBICYCLING(value: String): Self = StObject.set(x, "BICYCLING", value.asInstanceOf[js.Any])
    
    inline def setDRIVING(value: String): Self = StObject.set(x, "DRIVING", value.asInstanceOf[js.Any])
    
    inline def setTRANSIT(value: String): Self = StObject.set(x, "TRANSIT", value.asInstanceOf[js.Any])
    
    inline def setTWO_WHEELER(value: String): Self = StObject.set(x, "TWO_WHEELER", value.asInstanceOf[js.Any])
    
    inline def setWALKING(value: String): Self = StObject.set(x, "WALKING", value.asInstanceOf[js.Any])
  }
}
