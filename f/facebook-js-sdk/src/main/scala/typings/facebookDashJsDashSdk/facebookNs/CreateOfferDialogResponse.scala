package typings.facebookDashJsDashSdk.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOfferDialogResponse extends DialogResponse {
  var id: String
  var success: Boolean
}

object CreateOfferDialogResponse {
  @scala.inline
  def apply(id: String, success: Boolean, error_code: Int | Double = null, error_message: String = null): CreateOfferDialogResponse = {
    val __obj = js.Dynamic.literal(id = id, success = success)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[CreateOfferDialogResponse]
  }
}

