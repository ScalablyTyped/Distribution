package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadgenDialogResponse extends DialogResponse {
  var formID: java.lang.String
  var success: scala.Boolean
}

object LeadgenDialogResponse {
  @scala.inline
  def apply(
    formID: java.lang.String,
    success: scala.Boolean,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): LeadgenDialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formID")(formID)
    __obj.updateDynamic("success")(success)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[LeadgenDialogResponse]
  }
}

