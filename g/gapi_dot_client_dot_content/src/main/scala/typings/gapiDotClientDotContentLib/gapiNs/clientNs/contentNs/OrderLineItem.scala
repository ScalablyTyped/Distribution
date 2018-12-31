package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItem extends js.Object {
  /** Cancellations of the line item. */
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.undefined
  /** The channel type of the order: "purchaseOnGoogle" or "googleExpress". */
  var channelType: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the line item. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Total price for the line item. For example, if two items for $10 are purchased, the total price will be $20. */
  var price: js.UndefOr[Price] = js.undefined
  /** Product data from the time of the order placement. */
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  /** Number of items canceled. */
  var quantityCanceled: js.UndefOr[scala.Double] = js.undefined
  /** Number of items delivered. */
  var quantityDelivered: js.UndefOr[scala.Double] = js.undefined
  /** Number of items ordered. */
  var quantityOrdered: js.UndefOr[scala.Double] = js.undefined
  /** Number of items pending. */
  var quantityPending: js.UndefOr[scala.Double] = js.undefined
  /** Number of items returned. */
  var quantityReturned: js.UndefOr[scala.Double] = js.undefined
  /** Number of items shipped. */
  var quantityShipped: js.UndefOr[scala.Double] = js.undefined
  /** Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  /** Returns of the line item. */
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.undefined
  /** Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  /** Total tax amount for the line item. For example, if two items are purchased, and each have a cost tax of $2, the total tax amount will be $4. */
  var tax: js.UndefOr[Price] = js.undefined
}

