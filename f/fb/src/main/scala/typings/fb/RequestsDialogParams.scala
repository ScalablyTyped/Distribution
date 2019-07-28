package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestsDialogParams extends js.Object {
  var action_type: js.UndefOr[String] = js.undefined
   // "apprequests"
  var app_id: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var exclude_ids: js.UndefOr[js.Array[String]] = js.undefined
  var filters: js.Array[String] | Anon_Name
  var max_recipients: js.UndefOr[Double] = js.undefined
  var message: String
  var method: String
   // "send" | "askfor" | "turn"
  var object_id: js.UndefOr[String] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var suggestions: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object RequestsDialogParams {
  @scala.inline
  def apply(
    filters: js.Array[String] | Anon_Name,
    message: String,
    method: String,
    action_type: String = null,
    app_id: String = null,
    data: String = null,
    exclude_ids: js.Array[String] = null,
    max_recipients: Int | Double = null,
    object_id: String = null,
    redirect_uri: String = null,
    suggestions: js.Array[String] = null,
    title: String = null,
    to: String = null
  ): RequestsDialogParams = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], message = message, method = method)
    if (action_type != null) __obj.updateDynamic("action_type")(action_type)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (data != null) __obj.updateDynamic("data")(data)
    if (exclude_ids != null) __obj.updateDynamic("exclude_ids")(exclude_ids)
    if (max_recipients != null) __obj.updateDynamic("max_recipients")(max_recipients.asInstanceOf[js.Any])
    if (object_id != null) __obj.updateDynamic("object_id")(object_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (title != null) __obj.updateDynamic("title")(title)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RequestsDialogParams]
  }
}

