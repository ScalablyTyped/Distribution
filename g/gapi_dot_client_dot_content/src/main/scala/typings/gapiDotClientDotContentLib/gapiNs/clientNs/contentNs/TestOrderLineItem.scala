package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderLineItem extends js.Object {
  /** Product data from the time of the order placement. */
  var product: js.UndefOr[TestOrderLineItemProduct] = js.undefined
  /** Number of items ordered. */
  var quantityOrdered: js.UndefOr[scala.Double] = js.undefined
  /** Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  /** Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  /** Unit tax for the line item. */
  var unitTax: js.UndefOr[Price] = js.undefined
}

