package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesAdsDialogResponse extends DialogResponse {
  var id: String
  var success: Boolean
}

object InstantExperiencesAdsDialogResponse {
  @scala.inline
  def apply(id: String, success: Boolean, error_code: Int | Double = null, error_message: String = null): InstantExperiencesAdsDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogResponse]
  }
}

