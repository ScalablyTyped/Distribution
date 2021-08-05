package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumTransferableSeats extends StObject {
  
  var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
  
  var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
}
object MinimumTransferableSeats {
  
  inline def apply(): MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumTransferableSeats]
  }
  
  extension [Self <: MinimumTransferableSeats](x: Self) {
    
    inline def setMinimumTransferableSeats(value: Double): Self = StObject.set(x, "minimumTransferableSeats", value.asInstanceOf[js.Any])
    
    inline def setMinimumTransferableSeatsUndefined: Self = StObject.set(x, "minimumTransferableSeats", js.undefined)
    
    inline def setTransferabilityExpirationTime(value: String): Self = StObject.set(x, "transferabilityExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setTransferabilityExpirationTimeUndefined: Self = StObject.set(x, "transferabilityExpirationTime", js.undefined)
  }
}
