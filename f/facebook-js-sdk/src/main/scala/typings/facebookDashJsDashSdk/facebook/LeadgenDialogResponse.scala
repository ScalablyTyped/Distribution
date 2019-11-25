package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadgenDialogResponse extends DialogResponse {
  var formID: String
  var success: Boolean
}

object LeadgenDialogResponse {
  @scala.inline
  def apply(formID: String, success: Boolean, error_code: Int | Double = null, error_message: String = null): LeadgenDialogResponse = {
    val __obj = js.Dynamic.literal(formID = formID.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadgenDialogResponse]
  }
}

