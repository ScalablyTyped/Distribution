package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPurchaseV2 extends StObject {
  
  /**
    * The acknowledgement state of the subscription.
    */
  var acknowledgementState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional context around canceled subscriptions. Only present if the subscription currently has subscription_state SUBSCRIPTION_STATE_CANCELED.
    */
  var canceledStateContext: js.UndefOr[SchemaCanceledStateContext] = js.undefined
  
  /**
    * User account identifier in the third-party service.
    */
  var externalAccountIdentifiers: js.UndefOr[SchemaExternalAccountIdentifiers] = js.undefined
  
  /**
    * This kind represents a SubscriptionPurchaseV2 object in the androidpublisher service.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order id of the latest order associated with the purchase of the subscription. For autoRenewing subscription, this is the order id of signup order if it is not renewed yet, or the last recurring order id (success, pending, or declined order). For prepaid subscription, this is the order id associated with the queried purchase token.
    */
  var latestOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Item-level info for a subscription purchase. The items in the same purchase should be either all with AutoRenewingPlan or all with PrepaidPlan.
    */
  var lineItems: js.UndefOr[js.Array[SchemaSubscriptionPurchaseLineItem]] = js.undefined
  
  /**
    * The purchase token of the old subscription if this subscription is one of the following: * Re-signup of a canceled but non-lapsed subscription * Upgrade/downgrade from a previous subscription. * Convert from prepaid to auto renewing subscription. * Convert from an auto renewing subscription to prepaid. * Topup a prepaid subscription.
    */
  var linkedPurchaseToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional context around paused subscriptions. Only present if the subscription currently has subscription_state SUBSCRIPTION_STATE_PAUSED.
    */
  var pausedStateContext: js.UndefOr[SchemaPausedStateContext] = js.undefined
  
  /**
    * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time at which the subscription was granted. Not set for pending subscriptions (subscription was created but awaiting payment during signup).
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User profile associated with purchases made with 'Subscribe with Google'.
    */
  var subscribeWithGoogleInfo: js.UndefOr[SchemaSubscribeWithGoogleInfo] = js.undefined
  
  /**
    * The current state of the subscription.
    */
  var subscriptionState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only present if this subscription purchase is a test purchase.
    */
  var testPurchase: js.UndefOr[SchemaTestPurchase] = js.undefined
}
object SchemaSubscriptionPurchaseV2 {
  
  inline def apply(): SchemaSubscriptionPurchaseV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchaseV2]
  }
  
  extension [Self <: SchemaSubscriptionPurchaseV2](x: Self) {
    
    inline def setAcknowledgementState(value: String): Self = StObject.set(x, "acknowledgementState", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgementStateNull: Self = StObject.set(x, "acknowledgementState", null)
    
    inline def setAcknowledgementStateUndefined: Self = StObject.set(x, "acknowledgementState", js.undefined)
    
    inline def setCanceledStateContext(value: SchemaCanceledStateContext): Self = StObject.set(x, "canceledStateContext", value.asInstanceOf[js.Any])
    
    inline def setCanceledStateContextUndefined: Self = StObject.set(x, "canceledStateContext", js.undefined)
    
    inline def setExternalAccountIdentifiers(value: SchemaExternalAccountIdentifiers): Self = StObject.set(x, "externalAccountIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdentifiersUndefined: Self = StObject.set(x, "externalAccountIdentifiers", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLatestOrderId(value: String): Self = StObject.set(x, "latestOrderId", value.asInstanceOf[js.Any])
    
    inline def setLatestOrderIdNull: Self = StObject.set(x, "latestOrderId", null)
    
    inline def setLatestOrderIdUndefined: Self = StObject.set(x, "latestOrderId", js.undefined)
    
    inline def setLineItems(value: js.Array[SchemaSubscriptionPurchaseLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: SchemaSubscriptionPurchaseLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setLinkedPurchaseToken(value: String): Self = StObject.set(x, "linkedPurchaseToken", value.asInstanceOf[js.Any])
    
    inline def setLinkedPurchaseTokenNull: Self = StObject.set(x, "linkedPurchaseToken", null)
    
    inline def setLinkedPurchaseTokenUndefined: Self = StObject.set(x, "linkedPurchaseToken", js.undefined)
    
    inline def setPausedStateContext(value: SchemaPausedStateContext): Self = StObject.set(x, "pausedStateContext", value.asInstanceOf[js.Any])
    
    inline def setPausedStateContextUndefined: Self = StObject.set(x, "pausedStateContext", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSubscribeWithGoogleInfo(value: SchemaSubscribeWithGoogleInfo): Self = StObject.set(x, "subscribeWithGoogleInfo", value.asInstanceOf[js.Any])
    
    inline def setSubscribeWithGoogleInfoUndefined: Self = StObject.set(x, "subscribeWithGoogleInfo", js.undefined)
    
    inline def setSubscriptionState(value: String): Self = StObject.set(x, "subscriptionState", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStateNull: Self = StObject.set(x, "subscriptionState", null)
    
    inline def setSubscriptionStateUndefined: Self = StObject.set(x, "subscriptionState", js.undefined)
    
    inline def setTestPurchase(value: SchemaTestPurchase): Self = StObject.set(x, "testPurchase", value.asInstanceOf[js.Any])
    
    inline def setTestPurchaseUndefined: Self = StObject.set(x, "testPurchase", js.undefined)
  }
}
