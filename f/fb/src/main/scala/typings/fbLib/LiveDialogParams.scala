package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogParams extends js.Object {
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.undefined
  var display: java.lang.String
  var method: java.lang.String
  var phase: java.lang.String
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
}

object LiveDialogParams {
  @scala.inline
  def apply(
    display: java.lang.String,
    method: java.lang.String,
    phase: java.lang.String,
    broadcast_data: LiveDialogResponse = null,
    redirect_uri: java.lang.String = null
  ): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display, method = method, phase = phase)
    if (broadcast_data != null) __obj.updateDynamic("broadcast_data")(broadcast_data)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[LiveDialogParams]
  }
}

