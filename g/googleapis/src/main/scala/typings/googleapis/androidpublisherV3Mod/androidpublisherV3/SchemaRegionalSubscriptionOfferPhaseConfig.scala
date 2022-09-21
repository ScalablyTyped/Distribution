package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalSubscriptionOfferPhaseConfig extends StObject {
  
  /**
    * The absolute amount of money subtracted from the base plan price prorated over the phase duration that the user pays for this offer phase. For example, if the base plan price for this region is $12 for a period of 1 year, then a $1 absolute discount for a phase of a duration of 3 months would correspond to a price of $2. The resulting price may not be smaller than the minimum price allowed for this region.
    */
  var absoluteDiscount: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * The absolute price the user pays for this offer phase. The price must not be smaller than the minimum price allowed for this region.
    */
  var price: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Required. Immutable. The region to which this config applies.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fraction of the base plan price prorated over the phase duration that the user pays for this offer phase. For example, if the base plan price for this region is $12 for a period of 1 year, then a 50% discount for a phase of a duration of 3 months would correspond to a price of $1.50. The discount must be specified as a fraction strictly larger than 0 and strictly smaller than 1. The resulting price will be rounded to the nearest billable unit (e.g. cents for USD). The relative discount is considered invalid if the discounted price ends up being smaller than the minimum price allowed in this region.
    */
  var relativeDiscount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRegionalSubscriptionOfferPhaseConfig {
  
  inline def apply(): SchemaRegionalSubscriptionOfferPhaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalSubscriptionOfferPhaseConfig]
  }
  
  extension [Self <: SchemaRegionalSubscriptionOfferPhaseConfig](x: Self) {
    
    inline def setAbsoluteDiscount(value: SchemaMoney): Self = StObject.set(x, "absoluteDiscount", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteDiscountUndefined: Self = StObject.set(x, "absoluteDiscount", js.undefined)
    
    inline def setPrice(value: SchemaMoney): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setRelativeDiscount(value: Double): Self = StObject.set(x, "relativeDiscount", value.asInstanceOf[js.Any])
    
    inline def setRelativeDiscountNull: Self = StObject.set(x, "relativeDiscount", null)
    
    inline def setRelativeDiscountUndefined: Self = StObject.set(x, "relativeDiscount", js.undefined)
  }
}
