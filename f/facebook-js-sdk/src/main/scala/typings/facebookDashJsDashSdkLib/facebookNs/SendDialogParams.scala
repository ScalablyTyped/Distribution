package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDialogParams extends DialogParams {
  var link: java.lang.String
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.send
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object SendDialogParams {
  @scala.inline
  def apply(
    link: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.send,
    app_id: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    redirect_uri: java.lang.String = null,
    to: java.lang.String = null
  ): SendDialogParams = {
    val __obj = js.Dynamic.literal(link = link, method = method)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendDialogParams]
  }
}

