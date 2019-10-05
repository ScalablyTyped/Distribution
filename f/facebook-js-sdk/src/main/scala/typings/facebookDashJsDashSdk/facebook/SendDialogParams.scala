package typings.facebookDashJsDashSdk.facebook

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.async
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.iframe
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.page
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDialogParams extends DialogParams {
  var link: String
  var method: send
  var to: js.UndefOr[String] = js.undefined
}

object SendDialogParams {
  @scala.inline
  def apply(
    link: String,
    method: send,
    app_id: String = null,
    display: page | iframe | async | popup = null,
    redirect_uri: String = null,
    to: String = null
  ): SendDialogParams = {
    val __obj = js.Dynamic.literal(link = link, method = method)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendDialogParams]
  }
}

