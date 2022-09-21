package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalSubscriptionOfferConfig extends StObject {
  
  /**
    * Whether the subscription offer in the specified region is available for new subscribers. Existing subscribers will not have their subscription cancelled if this value is set to false. If not specified, this will default to false.
    */
  var newSubscriberAvailability: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Immutable. Region code this configuration applies to, as defined by ISO 3166-2, e.g. "US".
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionalSubscriptionOfferConfig {
  
  inline def apply(): SchemaRegionalSubscriptionOfferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalSubscriptionOfferConfig]
  }
  
  extension [Self <: SchemaRegionalSubscriptionOfferConfig](x: Self) {
    
    inline def setNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "newSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriberAvailabilityNull: Self = StObject.set(x, "newSubscriberAvailability", null)
    
    inline def setNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "newSubscriberAvailability", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
