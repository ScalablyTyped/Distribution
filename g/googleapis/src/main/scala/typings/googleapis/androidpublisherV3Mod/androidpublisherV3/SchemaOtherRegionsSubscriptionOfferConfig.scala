package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOtherRegionsSubscriptionOfferConfig extends StObject {
  
  /**
    * Whether the subscription offer in any new locations Play may launch in the future. If not specified, this will default to false.
    */
  var otherRegionsNewSubscriberAvailability: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaOtherRegionsSubscriptionOfferConfig {
  
  inline def apply(): SchemaOtherRegionsSubscriptionOfferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOtherRegionsSubscriptionOfferConfig]
  }
  
  extension [Self <: SchemaOtherRegionsSubscriptionOfferConfig](x: Self) {
    
    inline def setOtherRegionsNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "otherRegionsNewSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsNewSubscriberAvailabilityNull: Self = StObject.set(x, "otherRegionsNewSubscriberAvailability", null)
    
    inline def setOtherRegionsNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "otherRegionsNewSubscriberAvailability", js.undefined)
  }
}
