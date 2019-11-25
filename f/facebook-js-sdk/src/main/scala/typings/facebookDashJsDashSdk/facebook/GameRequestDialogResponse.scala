package typings.facebookDashJsDashSdk.facebook

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
    error_code: Int | Double = null,
    error_message: String = null
  ): GameRequestDialogResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogResponse]
  }
}

