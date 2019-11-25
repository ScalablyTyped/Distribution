package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPurchase extends js.Object {
  /** Whether the subscription will automatically be renewed when it reaches its current expiry time. */
  var autoRenewing: js.UndefOr[Boolean] = js.undefined
  /**
    * The reason why a subscription was cancelled or is not auto-renewing. Possible values are:
    * - User cancelled the subscription
    * - Subscription was cancelled by the system, for example because of a billing problem
    * - Subscription was replaced with a new subscription
    */
  var cancelReason: js.UndefOr[Double] = js.undefined
  /** ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.undefined
  /** Time at which the subscription will expire, in milliseconds since the Epoch. */
  var expiryTimeMillis: js.UndefOr[String] = js.undefined
  /** This kind represents a subscriptionPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.undefined
  /** The order id of the latest recurring order associated with the purchase of the subscription. */
  var orderId: js.UndefOr[String] = js.undefined
  /**
    * The payment state of the subscription. Possible values are:
    * - Payment pending
    * - Payment received
    * - Free trial
    */
  var paymentState: js.UndefOr[Double] = js.undefined
  /**
    * Price of the subscription, not including tax. Price is expressed in micro-units, where 1,000,000 micro-units represents one unit of the currency. For
    * example, if the subscription price is €1.99, price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.undefined
  /** ISO 4217 currency code for the subscription price. For example, if the price is specified in British pounds sterling, price_currency_code is "GBP". */
  var priceCurrencyCode: js.UndefOr[String] = js.undefined
  /** Time at which the subscription was granted, in milliseconds since the Epoch. */
  var startTimeMillis: js.UndefOr[String] = js.undefined
  /** The time at which the subscription was canceled by the user, in milliseconds since the epoch. Only present if cancelReason is 0. */
  var userCancellationTimeMillis: js.UndefOr[String] = js.undefined
}

object SubscriptionPurchase {
  @scala.inline
  def apply(
    autoRenewing: js.UndefOr[Boolean] = js.undefined,
    cancelReason: Int | Double = null,
    countryCode: String = null,
    developerPayload: String = null,
    expiryTimeMillis: String = null,
    kind: String = null,
    orderId: String = null,
    paymentState: Int | Double = null,
    priceAmountMicros: String = null,
    priceCurrencyCode: String = null,
    startTimeMillis: String = null,
    userCancellationTimeMillis: String = null
  ): SubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRenewing)) __obj.updateDynamic("autoRenewing")(autoRenewing.asInstanceOf[js.Any])
    if (cancelReason != null) __obj.updateDynamic("cancelReason")(cancelReason.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (expiryTimeMillis != null) __obj.updateDynamic("expiryTimeMillis")(expiryTimeMillis.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (paymentState != null) __obj.updateDynamic("paymentState")(paymentState.asInstanceOf[js.Any])
    if (priceAmountMicros != null) __obj.updateDynamic("priceAmountMicros")(priceAmountMicros.asInstanceOf[js.Any])
    if (priceCurrencyCode != null) __obj.updateDynamic("priceCurrencyCode")(priceCurrencyCode.asInstanceOf[js.Any])
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis.asInstanceOf[js.Any])
    if (userCancellationTimeMillis != null) __obj.updateDynamic("userCancellationTimeMillis")(userCancellationTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPurchase]
  }
}

