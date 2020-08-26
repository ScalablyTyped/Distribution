package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionPurchase extends js.Object {
  /** Whether the subscription will automatically be renewed when it reaches its current expiry time. */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * The reason why a subscription was cancelled or is not auto-renewing. Possible values are:
    * - User cancelled the subscription
    * - Subscription was cancelled by the system, for example because of a billing problem
    * - Subscription was replaced with a new subscription
    */
  var cancelReason: js.UndefOr[Double] = js.native
  /** ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted. */
  var countryCode: js.UndefOr[String] = js.native
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.native
  /** Time at which the subscription will expire, in milliseconds since the Epoch. */
  var expiryTimeMillis: js.UndefOr[String] = js.native
  /** This kind represents a subscriptionPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  /** The order id of the latest recurring order associated with the purchase of the subscription. */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The payment state of the subscription. Possible values are:
    * - Payment pending
    * - Payment received
    * - Free trial
    */
  var paymentState: js.UndefOr[Double] = js.native
  /**
    * Price of the subscription, not including tax. Price is expressed in micro-units, where 1,000,000 micro-units represents one unit of the currency. For
    * example, if the subscription price is €1.99, price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.native
  /** ISO 4217 currency code for the subscription price. For example, if the price is specified in British pounds sterling, price_currency_code is "GBP". */
  var priceCurrencyCode: js.UndefOr[String] = js.native
  /** Time at which the subscription was granted, in milliseconds since the Epoch. */
  var startTimeMillis: js.UndefOr[String] = js.native
  /** The time at which the subscription was canceled by the user, in milliseconds since the epoch. Only present if cancelReason is 0. */
  var userCancellationTimeMillis: js.UndefOr[String] = js.native
}

object SubscriptionPurchase {
  @scala.inline
  def apply(): SubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchase]
  }
  @scala.inline
  implicit class SubscriptionPurchaseOps[Self <: SubscriptionPurchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoRenewing(value: Boolean): Self = this.set("autoRenewing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRenewing: Self = this.set("autoRenewing", js.undefined)
    @scala.inline
    def setCancelReason(value: Double): Self = this.set("cancelReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelReason: Self = this.set("cancelReason", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
    @scala.inline
    def setExpiryTimeMillis(value: String): Self = this.set("expiryTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryTimeMillis: Self = this.set("expiryTimeMillis", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setPaymentState(value: Double): Self = this.set("paymentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentState: Self = this.set("paymentState", js.undefined)
    @scala.inline
    def setPriceAmountMicros(value: String): Self = this.set("priceAmountMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceAmountMicros: Self = this.set("priceAmountMicros", js.undefined)
    @scala.inline
    def setPriceCurrencyCode(value: String): Self = this.set("priceCurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceCurrencyCode: Self = this.set("priceCurrencyCode", js.undefined)
    @scala.inline
    def setStartTimeMillis(value: String): Self = this.set("startTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeMillis: Self = this.set("startTimeMillis", js.undefined)
    @scala.inline
    def setUserCancellationTimeMillis(value: String): Self = this.set("userCancellationTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserCancellationTimeMillis: Self = this.set("userCancellationTimeMillis", js.undefined)
  }
  
}

