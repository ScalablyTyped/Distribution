package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestsDialogParams extends js.Object {
  var action_type: js.UndefOr[java.lang.String] = js.undefined
   // "apprequests"
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var exclude_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filters: js.Array[java.lang.String] | Anon_Name
  var max_recipients: js.UndefOr[scala.Double] = js.undefined
  var message: java.lang.String
  var method: java.lang.String
   // "send" | "askfor" | "turn"
  var object_id: js.UndefOr[java.lang.String] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var suggestions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object RequestsDialogParams {
  @scala.inline
  def apply(
    filters: js.Array[java.lang.String] | Anon_Name,
    message: java.lang.String,
    method: java.lang.String,
    action_type: java.lang.String = null,
    app_id: java.lang.String = null,
    data: java.lang.String = null,
    exclude_ids: js.Array[java.lang.String] = null,
    max_recipients: scala.Int | scala.Double = null,
    object_id: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    suggestions: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    to: java.lang.String = null
  ): RequestsDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("method")(method)
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

