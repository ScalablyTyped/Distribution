package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.async
import typings.facebookJsSdk.facebookJsSdkStrings.iframe
import typings.facebookJsSdk.facebookJsSdkStrings.page
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import typings.facebookJsSdk.facebookJsSdkStrings.send
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
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDialogParams]
  }
}

