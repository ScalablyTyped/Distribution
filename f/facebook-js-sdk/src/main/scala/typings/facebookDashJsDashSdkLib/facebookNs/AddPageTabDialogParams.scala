package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPageTabDialogParams extends DialogParams {
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.pagetab
  @JSName("redirect_uri")
  var redirect_uri_AddPageTabDialogParams: java.lang.String
}

object AddPageTabDialogParams {
  @scala.inline
  def apply(
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.pagetab,
    redirect_uri: java.lang.String,
    app_id: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null
  ): AddPageTabDialogParams = {
    val __obj = js.Dynamic.literal(method = method, redirect_uri = redirect_uri)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPageTabDialogParams]
  }
}

