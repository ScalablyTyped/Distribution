package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOtherRegionsBasePlanConfig extends StObject {
  
  /**
    * Required. Price in EUR to use for any new locations Play may launch in.
    */
  var eurPrice: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Whether the base plan is available for new subscribers in any new locations Play may launch in. If not specified, this will default to false.
    */
  var newSubscriberAvailability: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Price in USD to use for any new locations Play may launch in.
    */
  var usdPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaOtherRegionsBasePlanConfig {
  
  inline def apply(): SchemaOtherRegionsBasePlanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOtherRegionsBasePlanConfig]
  }
  
  extension [Self <: SchemaOtherRegionsBasePlanConfig](x: Self) {
    
    inline def setEurPrice(value: SchemaMoney): Self = StObject.set(x, "eurPrice", value.asInstanceOf[js.Any])
    
    inline def setEurPriceUndefined: Self = StObject.set(x, "eurPrice", js.undefined)
    
    inline def setNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "newSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriberAvailabilityNull: Self = StObject.set(x, "newSubscriberAvailability", null)
    
    inline def setNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "newSubscriberAvailability", js.undefined)
    
    inline def setUsdPrice(value: SchemaMoney): Self = StObject.set(x, "usdPrice", value.asInstanceOf[js.Any])
    
    inline def setUsdPriceUndefined: Self = StObject.set(x, "usdPrice", js.undefined)
  }
}
