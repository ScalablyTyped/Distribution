package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogResponse extends DialogResponse {
  var post_id: String
}

object ShareDialogResponse {
  @scala.inline
  def apply(post_id: String, error_code: js.UndefOr[Double] = js.undefined, error_message: String = null): ShareDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    if (!js.isUndefined(error_code)) __obj.updateDynamic("error_code")(error_code.get.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogResponse]
  }
}

