package typings.facebookDashJsDashSdk.facebook

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.completed
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.initiated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogResponse extends DialogResponse {
  var amount: String
  var currency: String
  var payment_id: String
  var quantity: String
  var request_id: js.UndefOr[String] = js.undefined
  var signed_request: String
  var status: completed | initiated
}

object PayDialogResponse {
  @scala.inline
  def apply(
    amount: String,
    currency: String,
    payment_id: String,
    quantity: String,
    signed_request: String,
    status: completed | initiated,
    error_code: Int | Double = null,
    error_message: String = null,
    request_id: String = null
  ): PayDialogResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogResponse]
  }
}

