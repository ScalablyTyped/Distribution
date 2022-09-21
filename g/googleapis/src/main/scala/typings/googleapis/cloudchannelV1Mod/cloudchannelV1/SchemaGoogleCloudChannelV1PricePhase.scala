package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1PricePhase extends StObject {
  
  /**
    * Defines first period for the phase.
    */
  var firstPeriod: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines first period for the phase.
    */
  var lastPeriod: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines the phase period type.
    */
  var periodType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price of the phase. Present if there are no price tiers.
    */
  var price: js.UndefOr[SchemaGoogleCloudChannelV1Price] = js.undefined
  
  /**
    * Price by the resource tiers.
    */
  var priceTiers: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1PriceTier]] = js.undefined
}
object SchemaGoogleCloudChannelV1PricePhase {
  
  inline def apply(): SchemaGoogleCloudChannelV1PricePhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1PricePhase]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1PricePhase](x: Self) {
    
    inline def setFirstPeriod(value: Double): Self = StObject.set(x, "firstPeriod", value.asInstanceOf[js.Any])
    
    inline def setFirstPeriodNull: Self = StObject.set(x, "firstPeriod", null)
    
    inline def setFirstPeriodUndefined: Self = StObject.set(x, "firstPeriod", js.undefined)
    
    inline def setLastPeriod(value: Double): Self = StObject.set(x, "lastPeriod", value.asInstanceOf[js.Any])
    
    inline def setLastPeriodNull: Self = StObject.set(x, "lastPeriod", null)
    
    inline def setLastPeriodUndefined: Self = StObject.set(x, "lastPeriod", js.undefined)
    
    inline def setPeriodType(value: String): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
    
    inline def setPeriodTypeNull: Self = StObject.set(x, "periodType", null)
    
    inline def setPeriodTypeUndefined: Self = StObject.set(x, "periodType", js.undefined)
    
    inline def setPrice(value: SchemaGoogleCloudChannelV1Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceTiers(value: js.Array[SchemaGoogleCloudChannelV1PriceTier]): Self = StObject.set(x, "priceTiers", value.asInstanceOf[js.Any])
    
    inline def setPriceTiersUndefined: Self = StObject.set(x, "priceTiers", js.undefined)
    
    inline def setPriceTiersVarargs(value: SchemaGoogleCloudChannelV1PriceTier*): Self = StObject.set(x, "priceTiers", js.Array(value*))
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
