package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumTransferableSeats extends StObject {
  
  var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
  
  var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
}
object MinimumTransferableSeats {
  
  @scala.inline
  def apply(): MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumTransferableSeats]
  }
  
  @scala.inline
  implicit class MinimumTransferableSeatsMutableBuilder[Self <: MinimumTransferableSeats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumTransferableSeats(value: Double): Self = StObject.set(x, "minimumTransferableSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTransferableSeatsUndefined: Self = StObject.set(x, "minimumTransferableSeats", js.undefined)
    
    @scala.inline
    def setTransferabilityExpirationTime(value: String): Self = StObject.set(x, "transferabilityExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferabilityExpirationTimeUndefined: Self = StObject.set(x, "transferabilityExpirationTime", js.undefined)
  }
}
