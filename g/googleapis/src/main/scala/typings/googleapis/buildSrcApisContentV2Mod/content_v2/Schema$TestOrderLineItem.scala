package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TestOrderLineItem extends js.Object {
  /**
    * Product data from the time of the order placement.
    */
  var product: js.UndefOr[Schema$TestOrderLineItemProduct] = js.native
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[Schema$OrderLineItemReturnInfo] = js.native
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[Schema$OrderLineItemShippingDetails] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var unitTax: js.UndefOr[Schema$Price] = js.native
}

object Schema$TestOrderLineItem {
  @scala.inline
  def apply(
    product: Schema$TestOrderLineItemProduct = null,
    quantityOrdered: Int | Double = null,
    returnInfo: Schema$OrderLineItemReturnInfo = null,
    shippingDetails: Schema$OrderLineItemShippingDetails = null,
    unitTax: Schema$Price = null
  ): Schema$TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (quantityOrdered != null) __obj.updateDynamic("quantityOrdered")(quantityOrdered.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails.asInstanceOf[js.Any])
    if (unitTax != null) __obj.updateDynamic("unitTax")(unitTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestOrderLineItem]
  }
}

