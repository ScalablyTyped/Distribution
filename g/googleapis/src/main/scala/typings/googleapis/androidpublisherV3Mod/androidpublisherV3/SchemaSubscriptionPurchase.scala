package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPurchase extends StObject {
  
  /**
    * The acknowledgement state of the subscription product. Possible values are: 0. Yet to be acknowledged 1. Acknowledged
    */
  var acknowledgementState: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether the subscription will automatically be renewed when it reaches its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Time at which the subscription will be automatically resumed, in milliseconds since the Epoch. Only present if the user has requested to pause the subscription.
    */
  var autoResumeTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason why a subscription was canceled or is not auto-renewing. Possible values are: 0. User canceled the subscription 1. Subscription was canceled by the system, for example because of a billing problem 2. Subscription was replaced with a new subscription 3. Subscription was canceled by the developer
    */
  var cancelReason: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Information provided by the user when they complete the subscription cancellation flow (cancellation reason survey).
    */
  var cancelSurveyResult: js.UndefOr[SchemaSubscriptionCancelSurveyResult] = js.undefined
  
  /**
    * ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A developer-specified string that contains supplemental information about an order.
    */
  var developerPayload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time at which the subscription will expire, in milliseconds since the Epoch.
    */
  var expiryTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User account identifier in the third-party service. Only present if account linking happened as part of the subscription purchase flow.
    */
  var externalAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The family name of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'.
    */
  var familyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The given name of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'.
    */
  var givenName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Introductory price information of the subscription. This is only present when the subscription was purchased with an introductory price. This field does not indicate the subscription is currently in introductory price period.
    */
  var introductoryPriceInfo: js.UndefOr[SchemaIntroductoryPriceInfo] = js.undefined
  
  /**
    * This kind represents a subscriptionPurchase object in the androidpublisher service.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The purchase token of the originating purchase if this subscription is one of the following: 0. Re-signup of a canceled but non-lapsed subscription 1. Upgrade/downgrade from a previous subscription For example, suppose a user originally signs up and you receive purchase token X, then the user cancels and goes through the resignup flow (before their subscription lapses) and you receive purchase token Y, and finally the user upgrades their subscription and you receive purchase token Z. If you call this API with purchase token Z, this field will be set to Y. If you call this API with purchase token Y, this field will be set to X. If you call this API with purchase token X, this field will not be set.
    */
  var linkedPurchaseToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's account in your app. Present for the following purchases: * If account linking happened as part of the subscription purchase flow. * It was specified using https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
    */
  var obfuscatedExternalAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's profile in your app. Only present if specified using https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
    */
  var obfuscatedExternalProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order id of the latest recurring order associated with the purchase of the subscription. If the subscription was canceled because payment was declined, this will be the order id from the payment declined order.
    */
  var orderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The payment state of the subscription. Possible values are: 0. Payment pending 1. Payment received 2. Free trial 3. Pending deferred upgrade/downgrade Not present for canceled, expired subscriptions.
    */
  var paymentState: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Price of the subscription, For tax exclusive countries, the price doesn't include tax. For tax inclusive countries, the price includes tax. Price is expressed in micro-units, where 1,000,000 micro-units represents one unit of the currency. For example, if the subscription price is €1.99, price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latest price change information available. This is present only when there is an upcoming price change for the subscription yet to be applied. Once the subscription renews with the new price or the subscription is canceled, no price change information will be returned.
    */
  var priceChange: js.UndefOr[SchemaSubscriptionPriceChange] = js.undefined
  
  /**
    * ISO 4217 currency code for the subscription price. For example, if the price is specified in British pounds sterling, price_currency_code is "GBP".
    */
  var priceCurrencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google profile id of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'.
    */
  var profileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The profile name of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'.
    */
  var profileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The promotion code applied on this purchase. This field is only set if a vanity code promotion is applied when the subscription was purchased.
    */
  var promotionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of promotion applied on this purchase. This field is only set if a promotion is applied when the subscription was purchased. Possible values are: 0. One time code 1. Vanity code
    */
  var promotionType: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The type of purchase of the subscription. This field is only set if this purchase was not made using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased from a license testing account) 1. Promo (i.e. purchased using a promo code)
    */
  var purchaseType: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time at which the subscription was granted, in milliseconds since the Epoch.
    */
  var startTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the subscription was canceled by the user, in milliseconds since the epoch. Only present if cancelReason is 0.
    */
  var userCancellationTimeMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscriptionPurchase {
  
  inline def apply(): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
  
  extension [Self <: SchemaSubscriptionPurchase](x: Self) {
    
    inline def setAcknowledgementState(value: Double): Self = StObject.set(x, "acknowledgementState", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgementStateNull: Self = StObject.set(x, "acknowledgementState", null)
    
    inline def setAcknowledgementStateUndefined: Self = StObject.set(x, "acknowledgementState", js.undefined)
    
    inline def setAutoRenewing(value: Boolean): Self = StObject.set(x, "autoRenewing", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewingNull: Self = StObject.set(x, "autoRenewing", null)
    
    inline def setAutoRenewingUndefined: Self = StObject.set(x, "autoRenewing", js.undefined)
    
    inline def setAutoResumeTimeMillis(value: String): Self = StObject.set(x, "autoResumeTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setAutoResumeTimeMillisNull: Self = StObject.set(x, "autoResumeTimeMillis", null)
    
    inline def setAutoResumeTimeMillisUndefined: Self = StObject.set(x, "autoResumeTimeMillis", js.undefined)
    
    inline def setCancelReason(value: Double): Self = StObject.set(x, "cancelReason", value.asInstanceOf[js.Any])
    
    inline def setCancelReasonNull: Self = StObject.set(x, "cancelReason", null)
    
    inline def setCancelReasonUndefined: Self = StObject.set(x, "cancelReason", js.undefined)
    
    inline def setCancelSurveyResult(value: SchemaSubscriptionCancelSurveyResult): Self = StObject.set(x, "cancelSurveyResult", value.asInstanceOf[js.Any])
    
    inline def setCancelSurveyResultUndefined: Self = StObject.set(x, "cancelSurveyResult", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadNull: Self = StObject.set(x, "developerPayload", null)
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setExpiryTimeMillis(value: String): Self = StObject.set(x, "expiryTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeMillisNull: Self = StObject.set(x, "expiryTimeMillis", null)
    
    inline def setExpiryTimeMillisUndefined: Self = StObject.set(x, "expiryTimeMillis", js.undefined)
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdNull: Self = StObject.set(x, "externalAccountId", null)
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setIntroductoryPriceInfo(value: SchemaIntroductoryPriceInfo): Self = StObject.set(x, "introductoryPriceInfo", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPriceInfoUndefined: Self = StObject.set(x, "introductoryPriceInfo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkedPurchaseToken(value: String): Self = StObject.set(x, "linkedPurchaseToken", value.asInstanceOf[js.Any])
    
    inline def setLinkedPurchaseTokenNull: Self = StObject.set(x, "linkedPurchaseToken", null)
    
    inline def setLinkedPurchaseTokenUndefined: Self = StObject.set(x, "linkedPurchaseToken", js.undefined)
    
    inline def setObfuscatedExternalAccountId(value: String): Self = StObject.set(x, "obfuscatedExternalAccountId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedExternalAccountIdNull: Self = StObject.set(x, "obfuscatedExternalAccountId", null)
    
    inline def setObfuscatedExternalAccountIdUndefined: Self = StObject.set(x, "obfuscatedExternalAccountId", js.undefined)
    
    inline def setObfuscatedExternalProfileId(value: String): Self = StObject.set(x, "obfuscatedExternalProfileId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedExternalProfileIdNull: Self = StObject.set(x, "obfuscatedExternalProfileId", null)
    
    inline def setObfuscatedExternalProfileIdUndefined: Self = StObject.set(x, "obfuscatedExternalProfileId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPaymentState(value: Double): Self = StObject.set(x, "paymentState", value.asInstanceOf[js.Any])
    
    inline def setPaymentStateNull: Self = StObject.set(x, "paymentState", null)
    
    inline def setPaymentStateUndefined: Self = StObject.set(x, "paymentState", js.undefined)
    
    inline def setPriceAmountMicros(value: String): Self = StObject.set(x, "priceAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountMicrosNull: Self = StObject.set(x, "priceAmountMicros", null)
    
    inline def setPriceAmountMicrosUndefined: Self = StObject.set(x, "priceAmountMicros", js.undefined)
    
    inline def setPriceChange(value: SchemaSubscriptionPriceChange): Self = StObject.set(x, "priceChange", value.asInstanceOf[js.Any])
    
    inline def setPriceChangeUndefined: Self = StObject.set(x, "priceChange", js.undefined)
    
    inline def setPriceCurrencyCode(value: String): Self = StObject.set(x, "priceCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrencyCodeNull: Self = StObject.set(x, "priceCurrencyCode", null)
    
    inline def setPriceCurrencyCodeUndefined: Self = StObject.set(x, "priceCurrencyCode", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdNull: Self = StObject.set(x, "profileId", null)
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameNull: Self = StObject.set(x, "profileName", null)
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setPromotionCode(value: String): Self = StObject.set(x, "promotionCode", value.asInstanceOf[js.Any])
    
    inline def setPromotionCodeNull: Self = StObject.set(x, "promotionCode", null)
    
    inline def setPromotionCodeUndefined: Self = StObject.set(x, "promotionCode", js.undefined)
    
    inline def setPromotionType(value: Double): Self = StObject.set(x, "promotionType", value.asInstanceOf[js.Any])
    
    inline def setPromotionTypeNull: Self = StObject.set(x, "promotionType", null)
    
    inline def setPromotionTypeUndefined: Self = StObject.set(x, "promotionType", js.undefined)
    
    inline def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTypeNull: Self = StObject.set(x, "purchaseType", null)
    
    inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
    
    inline def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMillisNull: Self = StObject.set(x, "startTimeMillis", null)
    
    inline def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
    
    inline def setUserCancellationTimeMillis(value: String): Self = StObject.set(x, "userCancellationTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setUserCancellationTimeMillisNull: Self = StObject.set(x, "userCancellationTimeMillis", null)
    
    inline def setUserCancellationTimeMillisUndefined: Self = StObject.set(x, "userCancellationTimeMillis", js.undefined)
  }
}
