package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogParams extends DialogParams {
  var action: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.purchaseitem
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.pay
  var pricepoint_id: js.UndefOr[java.lang.String] = js.undefined
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
    action: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.purchaseitem,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.pay,
    product: java.lang.String,
    app_id: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    pricepoint_id: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    quantity_max: scala.Int | scala.Double = null,
    quantity_min: scala.Int | scala.Double = null,
    redirect_uri: java.lang.String = null,
    request_id: java.lang.String = null,
    test_currency: java.lang.String = null
  ): PayDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("product")(product)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (pricepoint_id != null) __obj.updateDynamic("pricepoint_id")(pricepoint_id)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (quantity_max != null) __obj.updateDynamic("quantity_max")(quantity_max.asInstanceOf[js.Any])
    if (quantity_min != null) __obj.updateDynamic("quantity_min")(quantity_min.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (test_currency != null) __obj.updateDynamic("test_currency")(test_currency)
    __obj.asInstanceOf[PayDialogParams]
  }
}

