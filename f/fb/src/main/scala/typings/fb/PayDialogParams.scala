package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogParams extends js.Object {
   // "pay"
  var action: String
  var method: String
  var pricepoint_id: js.UndefOr[String] = js.undefined
   // "purchaseitem"
  var product: String
  var quantity: js.UndefOr[Double] = js.undefined
  var quantity_max: js.UndefOr[Double] = js.undefined
  var quantity_min: js.UndefOr[Double] = js.undefined
  var request_id: js.UndefOr[String] = js.undefined
  var test_currency: js.UndefOr[String] = js.undefined
}

object PayDialogParams {
  @scala.inline
  def apply(
    action: String,
    method: String,
    product: String,
    pricepoint_id: String = null,
    quantity: Int | Double = null,
    quantity_max: Int | Double = null,
    quantity_min: Int | Double = null,
    request_id: String = null,
    test_currency: String = null
  ): PayDialogParams = {
    val __obj = js.Dynamic.literal(action = action, method = method, product = product)
    if (pricepoint_id != null) __obj.updateDynamic("pricepoint_id")(pricepoint_id)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (quantity_max != null) __obj.updateDynamic("quantity_max")(quantity_max.asInstanceOf[js.Any])
    if (quantity_min != null) __obj.updateDynamic("quantity_min")(quantity_min.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (test_currency != null) __obj.updateDynamic("test_currency")(test_currency)
    __obj.asInstanceOf[PayDialogParams]
  }
}

