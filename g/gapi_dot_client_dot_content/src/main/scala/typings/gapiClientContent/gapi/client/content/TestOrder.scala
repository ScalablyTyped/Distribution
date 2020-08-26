package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrder extends js.Object {
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[TestOrderCustomer] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#testOrder". */
  var kind: js.UndefOr[String] = js.native
  /** Line items that are ordered. At least one line item must be provided. */
  var lineItems: js.UndefOr[js.Array[TestOrderLineItem]] = js.native
  /** The details of the payment method. */
  var paymentMethod: js.UndefOr[TestOrderPaymentMethod] = js.native
  /** Identifier of one of the predefined delivery addresses for the delivery. */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  /** The details of the merchant provided promotions applied to the order. More details about the program are here. */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.native
  /** The total cost of shipping for all items. */
  var shippingCost: js.UndefOr[Price] = js.native
  /** The tax for the total shipping cost. */
  var shippingCostTax: js.UndefOr[Price] = js.native
  /** The requested shipping option. */
  var shippingOption: js.UndefOr[String] = js.native
}

object TestOrder {
  @scala.inline
  def apply(): TestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrder]
  }
  @scala.inline
  implicit class TestOrderOps[Self <: TestOrder] (val x: Self) extends AnyVal {
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
    def setCustomer(value: TestOrderCustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLineItemsVarargs(value: TestOrderLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    @scala.inline
    def setLineItems(value: js.Array[TestOrderLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    @scala.inline
    def setPaymentMethod(value: TestOrderPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    @scala.inline
    def setPredefinedDeliveryAddress(value: String): Self = this.set("predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedDeliveryAddress: Self = this.set("predefinedDeliveryAddress", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: OrderPromotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[OrderPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    @scala.inline
    def setShippingCost(value: Price): Self = this.set("shippingCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingCost: Self = this.set("shippingCost", js.undefined)
    @scala.inline
    def setShippingCostTax(value: Price): Self = this.set("shippingCostTax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingCostTax: Self = this.set("shippingCostTax", js.undefined)
    @scala.inline
    def setShippingOption(value: String): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOption: Self = this.set("shippingOption", js.undefined)
  }
  
}

