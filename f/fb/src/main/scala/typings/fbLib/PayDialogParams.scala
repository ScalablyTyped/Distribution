package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogParams extends js.Object {
   // "pay"
  var action: java.lang.String
  var method: java.lang.String
  var pricepoint_id: js.UndefOr[java.lang.String] = js.undefined
   // "purchaseitem"
  var product: java.lang.String
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var quantity_max: js.UndefOr[scala.Double] = js.undefined
  var quantity_min: js.UndefOr[scala.Double] = js.undefined
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var test_currency: js.UndefOr[java.lang.String] = js.undefined
}

object PayDialogParams {
  @scala.inline
  def apply(
    action: java.lang.String,
    method: java.lang.String,
    product: java.lang.String,
    pricepoint_id: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    quantity_max: scala.Int | scala.Double = null,
    quantity_min: scala.Int | scala.Double = null,
    request_id: java.lang.String = null,
    test_currency: java.lang.String = null
  ): PayDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("product")(product)
    if (pricepoint_id != null) __obj.updateDynamic("pricepoint_id")(pricepoint_id)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (quantity_max != null) __obj.updateDynamic("quantity_max")(quantity_max.asInstanceOf[js.Any])
    if (quantity_min != null) __obj.updateDynamic("quantity_min")(quantity_min.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (test_currency != null) __obj.updateDynamic("test_currency")(test_currency)
    __obj.asInstanceOf[PayDialogParams]
  }
}

