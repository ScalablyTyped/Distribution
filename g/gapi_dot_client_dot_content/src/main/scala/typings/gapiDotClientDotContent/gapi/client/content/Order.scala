package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  /** Whether the order was acknowledged. */
  var acknowledged: js.UndefOr[Boolean] = js.undefined
  /** The channel type of the order: "purchaseOnGoogle" or "googleExpress". */
  var channelType: js.UndefOr[String] = js.undefined
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[OrderCustomer] = js.undefined
  /** The details for the delivery. */
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.undefined
  /** The REST id of the order. Globally unique. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#order". */
  var kind: js.UndefOr[String] = js.undefined
  /** Line items that are ordered. */
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  /** Merchant-provided id of the order. */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  /**
    * The net amount for the order. For example, if an order was originally for a grand total of $100 and a refund was issued for $20, the net amount will be
    * $80.
    */
  var netAmount: js.UndefOr[Price] = js.undefined
  /** The details of the payment method. */
  var paymentMethod: js.UndefOr[OrderPaymentMethod] = js.undefined
  /** The status of the payment. */
  var paymentStatus: js.UndefOr[String] = js.undefined
  /** The date when the order was placed, in ISO 8601 format. */
  var placedDate: js.UndefOr[String] = js.undefined
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
  var shippingOption: js.UndefOr[String] = js.undefined
  /** The status of the order. */
  var status: js.UndefOr[String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    acknowledged: js.UndefOr[Boolean] = js.undefined,
    channelType: String = null,
    customer: OrderCustomer = null,
    deliveryDetails: OrderDeliveryDetails = null,
    id: String = null,
    kind: String = null,
    lineItems: js.Array[OrderLineItem] = null,
    merchantId: String = null,
    merchantOrderId: String = null,
    netAmount: Price = null,
    paymentMethod: OrderPaymentMethod = null,
    paymentStatus: String = null,
    placedDate: String = null,
    promotions: js.Array[OrderPromotion] = null,
    refunds: js.Array[OrderRefund] = null,
    shipments: js.Array[OrderShipment] = null,
    shippingCost: Price = null,
    shippingCostTax: Price = null,
    shippingOption: String = null,
    status: String = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged.asInstanceOf[js.Any])
    if (channelType != null) __obj.updateDynamic("channelType")(channelType.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (deliveryDetails != null) __obj.updateDynamic("deliveryDetails")(deliveryDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (netAmount != null) __obj.updateDynamic("netAmount")(netAmount.asInstanceOf[js.Any])
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod.asInstanceOf[js.Any])
    if (paymentStatus != null) __obj.updateDynamic("paymentStatus")(paymentStatus.asInstanceOf[js.Any])
    if (placedDate != null) __obj.updateDynamic("placedDate")(placedDate.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (refunds != null) __obj.updateDynamic("refunds")(refunds.asInstanceOf[js.Any])
    if (shipments != null) __obj.updateDynamic("shipments")(shipments.asInstanceOf[js.Any])
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost.asInstanceOf[js.Any])
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax.asInstanceOf[js.Any])
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

