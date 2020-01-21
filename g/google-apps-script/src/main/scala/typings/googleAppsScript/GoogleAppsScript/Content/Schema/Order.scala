package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var acknowledged: js.UndefOr[Boolean] = js.undefined
  var channelType: js.UndefOr[String] = js.undefined
  var customer: js.UndefOr[OrderCustomer] = js.undefined
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var merchantOrderId: js.UndefOr[String] = js.undefined
  var netAmount: js.UndefOr[Price] = js.undefined
  var paymentMethod: js.UndefOr[OrderPaymentMethod] = js.undefined
  var paymentStatus: js.UndefOr[String] = js.undefined
  var placedDate: js.UndefOr[String] = js.undefined
  var promotions: js.UndefOr[js.Array[OrderLegacyPromotion]] = js.undefined
  var refunds: js.UndefOr[js.Array[OrderRefund]] = js.undefined
  var shipments: js.UndefOr[js.Array[OrderShipment]] = js.undefined
  var shippingCost: js.UndefOr[Price] = js.undefined
  var shippingCostTax: js.UndefOr[Price] = js.undefined
  var shippingOption: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var taxCollector: js.UndefOr[String] = js.undefined
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
    promotions: js.Array[OrderLegacyPromotion] = null,
    refunds: js.Array[OrderRefund] = null,
    shipments: js.Array[OrderShipment] = null,
    shippingCost: Price = null,
    shippingCostTax: Price = null,
    shippingOption: String = null,
    status: String = null,
    taxCollector: String = null
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
    if (taxCollector != null) __obj.updateDynamic("taxCollector")(taxCollector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

