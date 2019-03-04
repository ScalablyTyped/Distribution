package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayDialogResponse extends DialogResponse {
  var amount: java.lang.String
  var currency: java.lang.String
  var payment_id: java.lang.String
  var quantity: java.lang.String
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var signed_request: java.lang.String
  var status: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.completed | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.initiated
}

object PayDialogResponse {
  @scala.inline
  def apply(
    amount: java.lang.String,
    currency: java.lang.String,
    payment_id: java.lang.String,
    quantity: java.lang.String,
    signed_request: java.lang.String,
    status: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.completed | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.initiated,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null,
    request_id: java.lang.String = null
  ): PayDialogResponse = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, payment_id = payment_id, quantity = quantity, signed_request = signed_request, status = status.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    __obj.asInstanceOf[PayDialogResponse]
  }
}

