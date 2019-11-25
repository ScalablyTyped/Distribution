package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTabDialogParams extends js.Object {
   // "pagetab"
  var app_id: String
  var display: js.UndefOr[js.Any] = js.undefined
  var method: String
  var redirect_uri: js.UndefOr[String] = js.undefined
}

object PageTabDialogParams {
  @scala.inline
  def apply(app_id: String, method: String, display: js.Any = null, redirect_uri: String = null): PageTabDialogParams = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageTabDialogParams]
  }
}

