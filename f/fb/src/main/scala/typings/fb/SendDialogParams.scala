package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDialogParams extends js.Object {
   // "send"
  var app_id: String
  var display: js.UndefOr[js.Any] = js.undefined
  var link: String
  var method: String
  var redirect_uri: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object SendDialogParams {
  @scala.inline
  def apply(
    app_id: String,
    link: String,
    method: String,
    display: js.Any = null,
    redirect_uri: String = null,
    to: String = null
  ): SendDialogParams = {
    val __obj = js.Dynamic.literal(app_id = app_id, link = link, method = method)
    if (display != null) __obj.updateDynamic("display")(display)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendDialogParams]
  }
}

