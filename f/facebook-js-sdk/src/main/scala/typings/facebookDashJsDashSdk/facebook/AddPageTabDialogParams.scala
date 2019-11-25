package typings.facebookDashJsDashSdk.facebook

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.async
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.iframe
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.page
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.pagetab
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPageTabDialogParams extends DialogParams {
  var method: pagetab
  @JSName("redirect_uri")
  var redirect_uri_AddPageTabDialogParams: String
}

object AddPageTabDialogParams {
  @scala.inline
  def apply(
    method: pagetab,
    redirect_uri: String,
    app_id: String = null,
    display: page | iframe | async | popup = null
  ): AddPageTabDialogParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPageTabDialogParams]
  }
}

