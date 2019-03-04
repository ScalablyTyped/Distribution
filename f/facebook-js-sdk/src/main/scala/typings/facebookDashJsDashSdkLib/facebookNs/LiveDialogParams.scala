package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogParams extends DialogParams {
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.undefined
  @JSName("display")
  var display_LiveDialogParams: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.live_broadcast
  var phase: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.create | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.publish
}

object LiveDialogParams {
  @scala.inline
  def apply(
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.live_broadcast,
    phase: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.create | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.publish,
    app_id: java.lang.String = null,
    broadcast_data: LiveDialogResponse = null,
    redirect_uri: java.lang.String = null
  ): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], method = method, phase = phase.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (broadcast_data != null) __obj.updateDynamic("broadcast_data")(broadcast_data)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[LiveDialogParams]
  }
}

