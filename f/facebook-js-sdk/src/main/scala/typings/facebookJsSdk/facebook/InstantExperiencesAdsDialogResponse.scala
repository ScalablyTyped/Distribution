package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesAdsDialogResponse extends DialogResponse {
  var id: String
  var success: Boolean
}

object InstantExperiencesAdsDialogResponse {
  @scala.inline
  def apply(
    id: String,
    success: Boolean,
    error_code: js.UndefOr[Double] = js.undefined,
    error_message: String = null
  ): InstantExperiencesAdsDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (!js.isUndefined(error_code)) __obj.updateDynamic("error_code")(error_code.get.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogResponse]
  }
}

