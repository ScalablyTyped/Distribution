package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsLiteDialogResponse extends DialogResponse {
  var app_id: scala.Double
  var developer_payload: js.UndefOr[java.lang.String] = js.undefined
  var payment_id: scala.Double
  var product_id: java.lang.String
  var purchase_time: scala.Double
  var purchase_token: java.lang.String
  var signed_request: java.lang.String
}

object PaymentsLiteDialogResponse {
  @scala.inline
  def apply(
    app_id: scala.Double,
    payment_id: scala.Double,
    product_id: java.lang.String,
    purchase_time: scala.Double,
    purchase_token: java.lang.String,
    signed_request: java.lang.String,
    developer_payload: java.lang.String = null,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): PaymentsLiteDialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app_id")(app_id)
    __obj.updateDynamic("payment_id")(payment_id)
    __obj.updateDynamic("product_id")(product_id)
    __obj.updateDynamic("purchase_time")(purchase_time)
    __obj.updateDynamic("purchase_token")(purchase_token)
    __obj.updateDynamic("signed_request")(signed_request)
    if (developer_payload != null) __obj.updateDynamic("developer_payload")(developer_payload)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[PaymentsLiteDialogResponse]
  }
}

