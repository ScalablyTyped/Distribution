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
  
  @scala.inline
  def apply(): SchemaSubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferRequest]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionPurchasesDeferRequestMutableBuilder[Self <: SchemaSubscriptionPurchasesDeferRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferralInfo(value: SchemaSubscriptionDeferralInfo): Self = StObject.set(x, "deferralInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferralInfoUndefined: Self = StObject.set(x, "deferralInfo", js.undefined)
  }
}
