package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPurchaseLineItem extends StObject {
  
  /**
    * The item is auto renewing.
    */
  var autoRenewingPlan: js.UndefOr[SchemaAutoRenewingPlan] = js.undefined
  
  /**
    * Time at which the subscription expired or will expire unless the access is extended (ex. renews).
    */
  var expiryTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The item is prepaid.
    */
  var prepaidPlan: js.UndefOr[SchemaPrepaidPlan] = js.undefined
  
  /**
    * The purchased product ID (for example, 'monthly001').
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscriptionPurchaseLineItem {
  
  inline def apply(): SchemaSubscriptionPurchaseLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchaseLineItem]
  }
  
  extension [Self <: SchemaSubscriptionPurchaseLineItem](x: Self) {
    
    inline def setAutoRenewingPlan(value: SchemaAutoRenewingPlan): Self = StObject.set(x, "autoRenewingPlan", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewingPlanUndefined: Self = StObject.set(x, "autoRenewingPlan", js.undefined)
    
    inline def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeNull: Self = StObject.set(x, "expiryTime", null)
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    inline def setPrepaidPlan(value: SchemaPrepaidPlan): Self = StObject.set(x, "prepaidPlan", value.asInstanceOf[js.Any])
    
    inline def setPrepaidPlanUndefined: Self = StObject.set(x, "prepaidPlan", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
