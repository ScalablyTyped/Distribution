package typings.facebookDashJsDashSdk.facebook

import typings.facebookDashJsDashSdk.Anon_Name
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.app_non_users
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.app_users
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.apprequests
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.askfor
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.async
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.iframe
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.page
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.send
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.turn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameRequestDialogParams extends DialogParams {
  var action_type: js.UndefOr[send | askfor | turn] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var exclude_ids: js.UndefOr[js.Array[String]] = js.undefined
  var filters: js.UndefOr[app_users | app_non_users | js.Array[Anon_Name]] = js.undefined
  var max_recipients: js.UndefOr[Double] = js.undefined
  var message: String
  var method: apprequests
  var object_id: js.UndefOr[String] = js.undefined
  var suggestions: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String | Double] = js.undefined
}

object GameRequestDialogParams {
  @scala.inline
  def apply(
    message: String,
    method: apprequests,
    action_type: send | askfor | turn = null,
    app_id: String = null,
    data: String = null,
    display: page | iframe | async | popup = null,
    exclude_ids: js.Array[String] = null,
    filters: app_users | app_non_users | js.Array[Anon_Name] = null,
    max_recipients: Int | Double = null,
    object_id: String = null,
    redirect_uri: String = null,
    suggestions: js.Array[String] = null,
    title: String = null,
    to: String | Double = null
  ): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal(message = message, method = method)
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

