package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogParams extends js.Object {
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.undefined
  var display: String
  var method: String
  var phase: String
  var redirect_uri: js.UndefOr[String] = js.undefined
}

object LiveDialogParams {
  @scala.inline
  def apply(
    display: String,
    method: String,
    phase: String,
    broadcast_data: LiveDialogResponse = null,
    redirect_uri: String = null
  ): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    if (broadcast_data != null) __obj.updateDynamic("broadcast_data")(broadcast_data.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogParams]
  }
}

