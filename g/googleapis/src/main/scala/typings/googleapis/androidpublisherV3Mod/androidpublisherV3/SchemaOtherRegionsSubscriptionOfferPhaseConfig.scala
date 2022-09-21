package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOtherRegionsSubscriptionOfferPhaseConfig extends StObject {
  
  /**
    * The absolute amount of money subtracted from the base plan price prorated over the phase duration that the user pays for this offer phase. For example, if the base plan price for this region is $12 for a period of 1 year, then a $1 absolute discount for a phase of a duration of 3 months would correspond to a price of $2. The resulting price may not be smaller than the minimum price allowed for any new locations Play may launch in.
    */
  var absoluteDiscounts: js.UndefOr[SchemaOtherRegionsSubscriptionOfferPhasePrices] = js.undefined
  
  /**
    * The absolute price the user pays for this offer phase. The price must not be smaller than the minimum price allowed for any new locations Play may launch in.
    */
  var otherRegionsPrices: js.UndefOr[SchemaOtherRegionsSubscriptionOfferPhasePrices] = js.undefined
  
  /**
    * The fraction of the base plan price prorated over the phase duration that the user pays for this offer phase. For example, if the base plan price for this region is $12 for a period of 1 year, then a 50% discount for a phase of a duration of 3 months would correspond to a price of $1.50. The discount must be specified as a fraction strictly larger than 0 and strictly smaller than 1. The resulting price will be rounded to the nearest billable unit (e.g. cents for USD). The relative discount is considered invalid if the discounted price ends up being smaller than the minimum price allowed in any new locations Play may launch in.
    */
  var relativeDiscount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOtherRegionsSubscriptionOfferPhaseConfig {
  
  inline def apply(): SchemaOtherRegionsSubscriptionOfferPhaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOtherRegionsSubscriptionOfferPhaseConfig]
  }
  
  extension [Self <: SchemaOtherRegionsSubscriptionOfferPhaseConfig](x: Self) {
    
    inline def setAbsoluteDiscounts(value: SchemaOtherRegionsSubscriptionOfferPhasePrices): Self = StObject.set(x, "absoluteDiscounts", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteDiscountsUndefined: Self = StObject.set(x, "absoluteDiscounts", js.undefined)
    
    inline def setOtherRegionsPrices(value: SchemaOtherRegionsSubscriptionOfferPhasePrices): Self = StObject.set(x, "otherRegionsPrices", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsPricesUndefined: Self = StObject.set(x, "otherRegionsPrices", js.undefined)
    
    inline def setRelativeDiscount(value: Double): Self = StObject.set(x, "relativeDiscount", value.asInstanceOf[js.Any])
    
    inline def setRelativeDiscountNull: Self = StObject.set(x, "relativeDiscount", null)
    
    inline def setRelativeDiscountUndefined: Self = StObject.set(x, "relativeDiscount", js.undefined)
  }
}
