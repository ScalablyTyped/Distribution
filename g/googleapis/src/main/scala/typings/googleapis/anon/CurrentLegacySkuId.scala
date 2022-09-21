package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentLegacySkuId extends StObject {
  
  var currentLegacySkuId: js.UndefOr[String] = js.undefined
  
  var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
  
  var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
}
object CurrentLegacySkuId {
  
  inline def apply(): CurrentLegacySkuId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentLegacySkuId]
  }
  
  extension [Self <: CurrentLegacySkuId](x: Self) {
    
    inline def setCurrentLegacySkuId(value: String): Self = StObject.set(x, "currentLegacySkuId", value.asInstanceOf[js.Any])
    
    inline def setCurrentLegacySkuIdUndefined: Self = StObject.set(x, "currentLegacySkuId", js.undefined)
    
    inline def setMinimumTransferableSeats(value: Double): Self = StObject.set(x, "minimumTransferableSeats", value.asInstanceOf[js.Any])
    
    inline def setMinimumTransferableSeatsUndefined: Self = StObject.set(x, "minimumTransferableSeats", js.undefined)
    
    inline def setTransferabilityExpirationTime(value: String): Self = StObject.set(x, "transferabilityExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setTransferabilityExpirationTimeUndefined: Self = StObject.set(x, "transferabilityExpirationTime", js.undefined)
  }
}
