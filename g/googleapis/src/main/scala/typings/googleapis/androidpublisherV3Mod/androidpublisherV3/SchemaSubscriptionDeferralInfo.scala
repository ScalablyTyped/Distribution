package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionDeferralInfo extends StObject {
  
  /**
    * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch. The given time must be later/greater than the current expiry time for the subscription.
    */
  var desiredExpiryTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expected expiry time for the subscription. If the current expiry time for the subscription is not the value specified here, the deferral will not occur.
    */
  var expectedExpiryTimeMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscriptionDeferralInfo {
  
  inline def apply(): SchemaSubscriptionDeferralInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionDeferralInfo]
  }
  
  extension [Self <: SchemaSubscriptionDeferralInfo](x: Self) {
    
    inline def setDesiredExpiryTimeMillis(value: String): Self = StObject.set(x, "desiredExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setDesiredExpiryTimeMillisNull: Self = StObject.set(x, "desiredExpiryTimeMillis", null)
    
    inline def setDesiredExpiryTimeMillisUndefined: Self = StObject.set(x, "desiredExpiryTimeMillis", js.undefined)
    
    inline def setExpectedExpiryTimeMillis(value: String): Self = StObject.set(x, "expectedExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setExpectedExpiryTimeMillisNull: Self = StObject.set(x, "expectedExpiryTimeMillis", null)
    
    inline def setExpectedExpiryTimeMillisUndefined: Self = StObject.set(x, "expectedExpiryTimeMillis", js.undefined)
  }
}
