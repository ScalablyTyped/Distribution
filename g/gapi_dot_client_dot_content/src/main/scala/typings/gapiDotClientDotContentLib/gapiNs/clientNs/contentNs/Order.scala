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

