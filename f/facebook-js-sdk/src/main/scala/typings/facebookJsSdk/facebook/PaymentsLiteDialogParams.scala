package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.async
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.page
import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseiap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsLiteDialogParams extends DialogParams {
  var action: purchaseiap
  var developer_payload: js.UndefOr[String] = js.undefined
  var method: pay
  var product_id: String
  var quantity: js.UndefOr[Double] = js.undefined
}

object PaymentsLiteDialogParams {
  @scala.inline
  def apply(
    action: purchaseiap,
    method: pay,
    product_id: String,
    app_id: String = null,
    developer_payload: String = null,
    display: page | iframe | async | popup = null,
    quantity: js.UndefOr[Double] = js.undefined,
    redirect_uri: String = null
  ): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (developer_payload != null) __obj.updateDynamic("developer_payload")(developer_payload.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
}

