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

object GameRequestDialogParams {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.apprequests,
    action_type: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.send | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.askfor | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.turn = null,
    app_id: java.lang.String = null,
    data: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    exclude_ids: js.Array[java.lang.String] = null,
    filters: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.app_users | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.app_non_users | js.Array[facebookDashJsDashSdkLib.Anon_Name] = null,
    max_recipients: scala.Int | scala.Double = null,
    object_id: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    suggestions: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    to: java.lang.String | scala.Double = null
  ): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("method")(method)
    if (action_type != null) __obj.updateDynamic("action_type")(action_type.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (data != null) __obj.updateDynamic("data")(data)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (exclude_ids != null) __obj.updateDynamic("exclude_ids")(exclude_ids)
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (max_recipients != null) __obj.updateDynamic("max_recipients")(max_recipients.asInstanceOf[js.Any])
    if (object_id != null) __obj.updateDynamic("object_id")(object_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (title != null) __obj.updateDynamic("title")(title)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogParams]
  }
}

