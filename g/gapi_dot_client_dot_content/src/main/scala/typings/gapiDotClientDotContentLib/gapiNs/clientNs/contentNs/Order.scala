package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  /** Whether the order was acknowledged. */
  var acknowledged: js.UndefOr[scala.Boolean] = js.undefined
  /** The channel type of the order: "purchaseOnGoogle" or "googleExpress". */
  var channelType: js.UndefOr[java.lang.String] = js.undefined
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[OrderCustomer] = js.undefined
  /** The details for the delivery. */
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.undefined
  /** The REST id of the order. Globally unique. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#order". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Line items that are ordered. */
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  /** Merchant-provided id of the order. */
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The net amount for the order. For example, if an order was originally for a grand total of $100 and a refund was issued for $20, the net amount will be
    * $80.
    */
  var netAmount: js.UndefOr[Price] = js.undefined
  /** The details of the payment method. */
  var paymentMethod: js.UndefOr[OrderPaymentMethod] = js.undefined
  /** The status of the payment. */
  var paymentStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The date when the order was placed, in ISO 8601 format. */
  var placedDate: js.UndefOr[java.lang.String] = js.undefined
  /** The details of the merchant provided promotions applied to the order. More details about the program are here. */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.undefined
  /** Refunds for the order. */
  var refunds: js.UndefOr[js.Array[OrderRefund]] = js.undefined
  /** Shipments of the order. */
  var shipments: js.UndefOr[js.Array[OrderShipment]] = js.undefined
  /** The total cost of shipping for all items. */
  var shippingCost: js.UndefOr[Price] = js.undefined
  /** The tax for the total shipping cost. */
  var shippingCostTax: js.UndefOr[Price] = js.undefined
  /** The requested shipping option. */
  var shippingOption: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the order. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    acknowledged: js.UndefOr[scala.Boolean] = js.undefined,
    channelType: java.lang.String = null,
    customer: OrderCustomer = null,
    deliveryDetails: OrderDeliveryDetails = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lineItems: js.Array[OrderLineItem] = null,
    merchantId: java.lang.String = null,
    merchantOrderId: java.lang.String = null,
    netAmount: Price = null,
    paymentMethod: OrderPaymentMethod = null,
    paymentStatus: java.lang.String = null,
    placedDate: java.lang.String = null,
    promotions: js.Array[OrderPromotion] = null,
    refunds: js.Array[OrderRefund] = null,
    shipments: js.Array[OrderShipment] = null,
    shippingCost: Price = null,
    shippingCostTax: Price = null,
    shippingOption: java.lang.String = null,
    status: java.lang.String = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged)
    if (channelType != null) __obj.updateDynamic("channelType")(channelType)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (deliveryDetails != null) __obj.updateDynamic("deliveryDetails")(deliveryDetails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (netAmount != null) __obj.updateDynamic("netAmount")(netAmount)
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod)
    if (paymentStatus != null) __obj.updateDynamic("paymentStatus")(paymentStatus)
    if (placedDate != null) __obj.updateDynamic("placedDate")(placedDate)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (refunds != null) __obj.updateDynamic("refunds")(refunds)
    if (shipments != null) __obj.updateDynamic("shipments")(shipments)
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost)
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Order]
  }
}

