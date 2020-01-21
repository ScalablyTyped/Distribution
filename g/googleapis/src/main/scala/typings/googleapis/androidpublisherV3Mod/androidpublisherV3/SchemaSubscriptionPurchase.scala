package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SubscriptionPurchase resource indicates the status of a user&#39;s
  * subscription purchase.
  */
@js.native
trait SchemaSubscriptionPurchase extends js.Object {
  /**
    * Whether the subscription will automatically be renewed when it reaches
    * its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the subscription will be automatically resumed, in
    * milliseconds since the Epoch. Only present if the user has requested to
    * pause the subscription.
    */
  var autoResumeTimeMillis: js.UndefOr[String] = js.native
  /**
    * The reason why a subscription was canceled or is not auto-renewing.
    * Possible values are:   - User canceled the subscription  - Subscription
    * was canceled by the system, for example because of a billing problem  -
    * Subscription was replaced with a new subscription  - Subscription was
    * canceled by the developer
    */
  var cancelReason: js.UndefOr[Double] = js.native
  /**
    * Information provided by the user when they complete the subscription
    * cancellation flow (cancellation reason survey).
    */
  var cancelSurveyResult: js.UndefOr[SchemaSubscriptionCancelSurveyResult] = js.native
  /**
    * ISO 3166-1 alpha-2 billing country/region code of the user at the time
    * the subscription was granted.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * The email address of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Time at which the subscription will expire, in milliseconds since the
    * Epoch.
    */
  var expiryTimeMillis: js.UndefOr[String] = js.native
  /**
    * The family name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The given name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * This kind represents a subscriptionPurchase object in the
    * androidpublisher service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The purchase token of the originating purchase if this subscription is
    * one of the following:   - Re-signup of a canceled but non-lapsed
    * subscription  - Upgrade/downgrade from a previous subscription  For
    * example, suppose a user originally signs up and you receive purchase
    * token X, then the user cancels and goes through the resignup flow (before
    * their subscription lapses) and you receive purchase token Y, and finally
    * the user upgrades their subscription and you receive purchase token Z. If
    * you call this API with purchase token Z, this field will be set to Y. If
    * you call this API with purchase token Y, this field will be set to X. If
    * you call this API with purchase token X, this field will not be set.
    */
  var linkedPurchaseToken: js.UndefOr[String] = js.native
  /**
    * The order id of the latest recurring order associated with the purchase
    * of the subscription.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The payment state of the subscription. Possible values are:   - Payment
    * pending  - Payment received  - Free trial  - Pending deferred
    * upgrade/downgrade
    */
  var paymentState: js.UndefOr[Double] = js.native
  /**
    * Price of the subscription, not including tax. Price is expressed in
    * micro-units, where 1,000,000 micro-units represents one unit of the
    * currency. For example, if the subscription price is €1.99,
    * price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.native
  /**
    * The latest price change information available. This is present only when
    * there is an upcoming price change for the subscription yet to be applied.
    * Once the subscription renews with the new price or the subscription is
    * canceled, no price change information will be returned.
    */
  var priceChange: js.UndefOr[SchemaSubscriptionPriceChange] = js.native
  /**
    * ISO 4217 currency code for the subscription price. For example, if the
    * price is specified in British pounds sterling, price_currency_code is
    * &quot;GBP&quot;.
    */
  var priceCurrencyCode: js.UndefOr[String] = js.native
  /**
    * The profile id of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * The profile name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var profileName: js.UndefOr[String] = js.native
  /**
    * The type of purchase of the subscription. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)
    */
  var purchaseType: js.UndefOr[Double] = js.native
  /**
    * Time at which the subscription was granted, in milliseconds since the
    * Epoch.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
  /**
    * The time at which the subscription was canceled by the user, in
    * milliseconds since the epoch. Only present if cancelReason is 0.
    */
  var userCancellationTimeMillis: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchase {
  @scala.inline
  def apply(
    autoRenewing: js.UndefOr[Boolean] = js.undefined,
    autoResumeTimeMillis: String = null,
    cancelReason: Int | Double = null,
    cancelSurveyResult: SchemaSubscriptionCancelSurveyResult = null,
    countryCode: String = null,
    developerPayload: String = null,
    emailAddress: String = null,
    expiryTimeMillis: String = null,
    familyName: String = null,
    givenName: String = null,
    kind: String = null,
    linkedPurchaseToken: String = null,
    orderId: String = null,
    paymentState: Int | Double = null,
    priceAmountMicros: String = null,
    priceChange: SchemaSubscriptionPriceChange = null,
    priceCurrencyCode: String = null,
    profileId: String = null,
    profileName: String = null,
    purchaseType: Int | Double = null,
    startTimeMillis: String = null,
    userCancellationTimeMillis: String = null
  ): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRenewing)) __obj.updateDynamic("autoRenewing")(autoRenewing.asInstanceOf[js.Any])
    if (autoResumeTimeMillis != null) __obj.updateDynamic("autoResumeTimeMillis")(autoResumeTimeMillis.asInstanceOf[js.Any])
    if (cancelReason != null) __obj.updateDynamic("cancelReason")(cancelReason.asInstanceOf[js.Any])
    if (cancelSurveyResult != null) __obj.updateDynamic("cancelSurveyResult")(cancelSurveyResult.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (expiryTimeMillis != null) __obj.updateDynamic("expiryTimeMillis")(expiryTimeMillis.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (linkedPurchaseToken != null) __obj.updateDynamic("linkedPurchaseToken")(linkedPurchaseToken.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (paymentState != null) __obj.updateDynamic("paymentState")(paymentState.asInstanceOf[js.Any])
    if (priceAmountMicros != null) __obj.updateDynamic("priceAmountMicros")(priceAmountMicros.asInstanceOf[js.Any])
    if (priceChange != null) __obj.updateDynamic("priceChange")(priceChange.asInstanceOf[js.Any])
    if (priceCurrencyCode != null) __obj.updateDynamic("priceCurrencyCode")(priceCurrencyCode.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (purchaseType != null) __obj.updateDynamic("purchaseType")(purchaseType.asInstanceOf[js.Any])
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis.asInstanceOf[js.Any])
    if (userCancellationTimeMillis != null) __obj.updateDynamic("userCancellationTimeMillis")(userCancellationTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
}

