package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItem extends js.Object {
  /** Cancellations of the line item. */
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.undefined
  /** The channel type of the order: "purchaseOnGoogle" or "googleExpress". */
  var channelType: js.UndefOr[String] = js.undefined
  /** The id of the line item. */
  var id: js.UndefOr[String] = js.undefined
  /** Total price for the line item. For example, if two items for $10 are purchased, the total price will be $20. */
  var price: js.UndefOr[Price] = js.undefined
  /** Product data from the time of the order placement. */
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  /** Number of items canceled. */
  var quantityCanceled: js.UndefOr[Double] = js.undefined
  /** Number of items delivered. */
  var quantityDelivered: js.UndefOr[Double] = js.undefined
  /** Number of items ordered. */
  var quantityOrdered: js.UndefOr[Double] = js.undefined
  /** Number of items pending. */
  var quantityPending: js.UndefOr[Double] = js.undefined
  /** Number of items returned. */
  var quantityReturned: js.UndefOr[Double] = js.undefined
  /** Number of items shipped. */
  var quantityShipped: js.UndefOr[Double] = js.undefined
  /** Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  /** Returns of the line item. */
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.undefined
  /** Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  /** Total tax amount for the line item. For example, if two items are purchased, and each have a cost tax of $2, the total tax amount will be $4. */
  var tax: js.UndefOr[Price] = js.undefined
}

object OrderLineItem {
  @scala.inline
  def apply(
    cancellations: js.Array[OrderCancellation] = null,
    channelType: String = null,
    id: String = null,
    price: Price = null,
    product: OrderLineItemProduct = null,
    quantityCanceled: Int | Double = null,
    quantityDelivered: Int | Double = null,
    quantityOrdered: Int | Double = null,
    quantityPending: Int | Double = null,
    quantityReturned: Int | Double = null,
    quantityShipped: Int | Double = null,
    returnInfo: OrderLineItemReturnInfo = null,
    returns: js.Array[OrderReturn] = null,
    shippingDetails: OrderLineItemShippingDetails = null,
    tax: Price = null
  ): OrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (cancellations != null) __obj.updateDynamic("cancellations")(cancellations.asInstanceOf[js.Any])
    if (channelType != null) __obj.updateDynamic("channelType")(channelType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (quantityCanceled != null) __obj.updateDynamic("quantityCanceled")(quantityCanceled.asInstanceOf[js.Any])
    if (quantityDelivered != null) __obj.updateDynamic("quantityDelivered")(quantityDelivered.asInstanceOf[js.Any])
    if (quantityOrdered != null) __obj.updateDynamic("quantityOrdered")(quantityOrdered.asInstanceOf[js.Any])
    if (quantityPending != null) __obj.updateDynamic("quantityPending")(quantityPending.asInstanceOf[js.Any])
    if (quantityReturned != null) __obj.updateDynamic("quantityReturned")(quantityReturned.asInstanceOf[js.Any])
    if (quantityShipped != null) __obj.updateDynamic("quantityShipped")(quantityShipped.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItem]
  }
}

