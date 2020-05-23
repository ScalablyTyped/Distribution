package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItem extends js.Object {
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  var quantityCanceled: js.UndefOr[Double] = js.undefined
  var quantityDelivered: js.UndefOr[Double] = js.undefined
  var quantityOrdered: js.UndefOr[Double] = js.undefined
  var quantityPending: js.UndefOr[Double] = js.undefined
  var quantityReturned: js.UndefOr[Double] = js.undefined
  var quantityShipped: js.UndefOr[Double] = js.undefined
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.undefined
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  var tax: js.UndefOr[Price] = js.undefined
}

object OrderLineItem {
  @scala.inline
  def apply(
    annotations: js.Array[OrderMerchantProvidedAnnotation] = null,
    cancellations: js.Array[OrderCancellation] = null,
    id: String = null,
    price: Price = null,
    product: OrderLineItemProduct = null,
    quantityCanceled: js.UndefOr[Double] = js.undefined,
    quantityDelivered: js.UndefOr[Double] = js.undefined,
    quantityOrdered: js.UndefOr[Double] = js.undefined,
    quantityPending: js.UndefOr[Double] = js.undefined,
    quantityReturned: js.UndefOr[Double] = js.undefined,
    quantityShipped: js.UndefOr[Double] = js.undefined,
    returnInfo: OrderLineItemReturnInfo = null,
    returns: js.Array[OrderReturn] = null,
    shippingDetails: OrderLineItemShippingDetails = null,
    tax: Price = null
  ): OrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (cancellations != null) __obj.updateDynamic("cancellations")(cancellations.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityCanceled)) __obj.updateDynamic("quantityCanceled")(quantityCanceled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityDelivered)) __obj.updateDynamic("quantityDelivered")(quantityDelivered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityOrdered)) __obj.updateDynamic("quantityOrdered")(quantityOrdered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityPending)) __obj.updateDynamic("quantityPending")(quantityPending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityReturned)) __obj.updateDynamic("quantityReturned")(quantityReturned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityShipped)) __obj.updateDynamic("quantityShipped")(quantityShipped.get.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItem]
  }
}

