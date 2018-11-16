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

