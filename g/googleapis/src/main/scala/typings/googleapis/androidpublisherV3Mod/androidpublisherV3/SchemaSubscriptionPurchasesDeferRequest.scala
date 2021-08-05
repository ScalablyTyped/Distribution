package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPurchasesDeferRequest extends StObject {
  
  /**
    * The information about the new desired expiry time for the subscription.
    */
  var deferralInfo: js.UndefOr[SchemaSubscriptionDeferralInfo] = js.undefined
}
object SchemaSubscriptionPurchasesDeferRequest {
  
  inline def apply(): SchemaSubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferRequest]
  }
  
  extension [Self <: SchemaSubscriptionPurchasesDeferRequest](x: Self) {
    
    inline def setDeferralInfo(value: SchemaSubscriptionDeferralInfo): Self = StObject.set(x, "deferralInfo", value.asInstanceOf[js.Any])
    
    inline def setDeferralInfoUndefined: Self = StObject.set(x, "deferralInfo", js.undefined)
  }
}
