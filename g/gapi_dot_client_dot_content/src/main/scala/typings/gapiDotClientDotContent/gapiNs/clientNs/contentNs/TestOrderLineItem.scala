package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderLineItem extends js.Object {
  /** Product data from the time of the order placement. */
  var product: js.UndefOr[TestOrderLineItemProduct] = js.undefined
  /** Number of items ordered. */
  var quantityOrdered: js.UndefOr[Double] = js.undefined
  /** Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  /** Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  /** Unit tax for the line item. */
  var unitTax: js.UndefOr[Price] = js.undefined
}

object TestOrderLineItem {
  @scala.inline
  def apply(
    product: TestOrderLineItemProduct = null,
    quantityOrdered: Int | Double = null,
    returnInfo: OrderLineItemReturnInfo = null,
    shippingDetails: OrderLineItemShippingDetails = null,
    unitTax: Price = null
  ): TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (product != null) __obj.updateDynamic("product")(product)
    if (quantityOrdered != null) __obj.updateDynamic("quantityOrdered")(quantityOrdered.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo)
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails)
    if (unitTax != null) __obj.updateDynamic("unitTax")(unitTax)
    __obj.asInstanceOf[TestOrderLineItem]
  }
}

