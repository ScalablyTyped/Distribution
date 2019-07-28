package typings.facebookDashJsDashSdk.facebookNs

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
    val __obj = js.Dynamic.literal(request = request, to = to)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[GameRequestDialogResponse]
  }
}

