package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.async
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.page
import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogParams extends DialogParams {
  var action: purchaseitem
  var method: pay
  var pricepoint_id: js.UndefOr[String] = js.undefined
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
    action: purchaseitem,
    method: pay,
    product: String,
    app_id: String = null,
    display: page | iframe | async | popup = null,
    pricepoint_id: String = null,
    quantity: js.UndefOr[Double] = js.undefined,
    quantity_max: js.UndefOr[Double] = js.undefined,
    quantity_min: js.UndefOr[Double] = js.undefined,
    redirect_uri: String = null,
    request_id: String = null,
    test_currency: String = null
  ): PayDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (pricepoint_id != null) __obj.updateDynamic("pricepoint_id")(pricepoint_id.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity_max)) __obj.updateDynamic("quantity_max")(quantity_max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity_min)) __obj.updateDynamic("quantity_min")(quantity_min.get.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    if (test_currency != null) __obj.updateDynamic("test_currency")(test_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogParams]
  }
}

