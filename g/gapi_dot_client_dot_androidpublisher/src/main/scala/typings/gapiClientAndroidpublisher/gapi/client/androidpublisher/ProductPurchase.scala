package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductPurchase extends js.Object {
  /**
    * The consumption state of the inapp product. Possible values are:
    * - Yet to be consumed
    * - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.native
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.native
  /** This kind represents an inappPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  /** The order id associated with the purchase of the inapp product. */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The purchase state of the order. Possible values are:
    * - Purchased
    * - Cancelled
    */
  var purchaseState: js.UndefOr[Double] = js.native
  /** The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
}

object ProductPurchase {
  @scala.inline
  def apply(): ProductPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPurchase]
  }
  @scala.inline
  implicit class ProductPurchaseOps[Self <: ProductPurchase] (val x: Self) extends AnyVal {
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
    def setConsumptionState(value: Double): Self = this.set("consumptionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumptionState: Self = this.set("consumptionState", js.undefined)
    @scala.inline
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setPurchaseState(value: Double): Self = this.set("purchaseState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurchaseState: Self = this.set("purchaseState", js.undefined)
    @scala.inline
    def setPurchaseTimeMillis(value: String): Self = this.set("purchaseTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurchaseTimeMillis: Self = this.set("purchaseTimeMillis", js.undefined)
  }
  
}

