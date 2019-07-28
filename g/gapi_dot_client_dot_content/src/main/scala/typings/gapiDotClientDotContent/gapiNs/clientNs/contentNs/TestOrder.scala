package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrder extends js.Object {
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[TestOrderCustomer] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#testOrder". */
  var kind: js.UndefOr[String] = js.undefined
  /** Line items that are ordered. At least one line item must be provided. */
  var lineItems: js.UndefOr[js.Array[TestOrderLineItem]] = js.undefined
  /** The details of the payment method. */
  var paymentMethod: js.UndefOr[TestOrderPaymentMethod] = js.undefined
  /** Identifier of one of the predefined delivery addresses for the delivery. */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.undefined
  /** The details of the merchant provided promotions applied to the order. More details about the program are here. */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.undefined
  /** The total cost of shipping for all items. */
  var shippingCost: js.UndefOr[Price] = js.undefined
  /** The tax for the total shipping cost. */
  var shippingCostTax: js.UndefOr[Price] = js.undefined
  /** The requested shipping option. */
  var shippingOption: js.UndefOr[String] = js.undefined
}

object TestOrder {
  @scala.inline
  def apply(
    customer: TestOrderCustomer = null,
    kind: String = null,
    lineItems: js.Array[TestOrderLineItem] = null,
    paymentMethod: TestOrderPaymentMethod = null,
    predefinedDeliveryAddress: String = null,
    promotions: js.Array[OrderPromotion] = null,
    shippingCost: Price = null,
    shippingCostTax: Price = null,
    shippingOption: String = null
  ): TestOrder = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod)
    if (predefinedDeliveryAddress != null) __obj.updateDynamic("predefinedDeliveryAddress")(predefinedDeliveryAddress)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost)
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[TestOrder]
  }
}

