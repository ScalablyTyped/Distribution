package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsLiteDialogResponse extends DialogResponse {
  var app_id: Double
  var developer_payload: js.UndefOr[String] = js.undefined
  var payment_id: Double
  var product_id: String
  var purchase_time: Double
  var purchase_token: String
  var signed_request: String
}

object PaymentsLiteDialogResponse {
  @scala.inline
  def apply(
    app_id: Double,
    payment_id: Double,
    product_id: String,
    purchase_time: Double,
    purchase_token: String,
    signed_request: String,
    developer_payload: String = null,
    error_code: Int | Double = null,
    error_message: String = null
  ): PaymentsLiteDialogResponse = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], purchase_time = purchase_time.asInstanceOf[js.Any], purchase_token = purchase_token.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any])
    if (developer_payload != null) __obj.updateDynamic("developer_payload")(developer_payload.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogResponse]
  }
}

