package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalBasePlanConfig extends StObject {
  
  /**
    * Whether the base plan in the specified region is available for new subscribers. Existing subscribers will not have their subscription canceled if this value is set to false. If not specified, this will default to false.
    */
  var newSubscriberAvailability: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The price of the base plan in the specified region. Must be set if the base plan is available to new subscribers. Must be set in the currency that is linked to the specified region.
    */
  var price: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Required. Region code this configuration applies to, as defined by ISO 3166-2, e.g. "US".
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionalBasePlanConfig {
  
  inline def apply(): SchemaRegionalBasePlanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalBasePlanConfig]
  }
  
  extension [Self <: SchemaRegionalBasePlanConfig](x: Self) {
    
    inline def setNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "newSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriberAvailabilityNull: Self = StObject.set(x, "newSubscriberAvailability", null)
    
    inline def setNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "newSubscriberAvailability", js.undefined)
    
    inline def setPrice(value: SchemaMoney): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
