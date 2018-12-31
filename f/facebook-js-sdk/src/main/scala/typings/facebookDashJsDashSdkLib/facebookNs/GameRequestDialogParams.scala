package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameRequestDialogParams extends DialogParams {
  var action_type: js.UndefOr[
    facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.send | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.askfor | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.turn
  ] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var exclude_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filters: js.UndefOr[
    facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.app_users | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.app_non_users | js.Array[facebookDashJsDashSdkLib.Anon_Name]
  ] = js.undefined
  var max_recipients: js.UndefOr[scala.Double] = js.undefined
  var message: java.lang.String
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.apprequests
  var object_id: js.UndefOr[java.lang.String] = js.undefined
  var suggestions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

