package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameRequestDialogResponse extends DialogResponse {
  var request: String
  var to: js.Array[String]
}

object GameRequestDialogResponse {
  @scala.inline
  def apply(
    request: String,
    to: js.Array[String],
    error_code: js.UndefOr[Double] = js.undefined,
    error_message: String = null
  ): GameRequestDialogResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (!js.isUndefined(error_code)) __obj.updateDynamic("error_code")(error_code.get.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogResponse]
  }
}

