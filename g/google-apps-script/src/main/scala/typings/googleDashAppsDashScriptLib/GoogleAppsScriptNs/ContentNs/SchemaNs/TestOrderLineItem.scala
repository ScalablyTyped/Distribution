package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderLineItem extends js.Object {
  var product: js.UndefOr[TestOrderLineItemProduct] = js.undefined
  var quantityOrdered: js.UndefOr[scala.Double] = js.undefined
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  var unitTax: js.UndefOr[Price] = js.undefined
}

object TestOrderLineItem {
  @scala.inline
  def apply(
    product: TestOrderLineItemProduct = null,
    quantityOrdered: scala.Int | scala.Double = null,
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

