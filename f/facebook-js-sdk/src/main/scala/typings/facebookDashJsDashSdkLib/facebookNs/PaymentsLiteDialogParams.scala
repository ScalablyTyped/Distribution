package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsLiteDialogParams extends DialogParams {
  var action: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.purchaseiap
  var developer_payload: js.UndefOr[java.lang.String] = js.undefined
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.pay
  var product_id: java.lang.String
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object PaymentsLiteDialogParams {
  @scala.inline
  def apply(
    action: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.purchaseiap,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.pay,
    product_id: java.lang.String,
    app_id: java.lang.String = null,
    developer_payload: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    quantity: scala.Int | scala.Double = null,
    redirect_uri: java.lang.String = null
  ): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("product_id")(product_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (developer_payload != null) __obj.updateDynamic("developer_payload")(developer_payload)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
}

