package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FEWERTRANSFERS extends StObject {
  
  var FEWER_TRANSFERS: String
  
  var LESS_WALKING: String
}
object FEWERTRANSFERS {
  
  inline def apply(FEWER_TRANSFERS: String, LESS_WALKING: String): FEWERTRANSFERS = {
    val __obj = js.Dynamic.literal(FEWER_TRANSFERS = FEWER_TRANSFERS.asInstanceOf[js.Any], LESS_WALKING = LESS_WALKING.asInstanceOf[js.Any])
    __obj.asInstanceOf[FEWERTRANSFERS]
  }
  
  extension [Self <: FEWERTRANSFERS](x: Self) {
    
    inline def setFEWER_TRANSFERS(value: String): Self = StObject.set(x, "FEWER_TRANSFERS", value.asInstanceOf[js.Any])
    
    inline def setLESS_WALKING(value: String): Self = StObject.set(x, "LESS_WALKING", value.asInstanceOf[js.Any])
  }
}
