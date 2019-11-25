package typings.facebookDashJsDashSdk.facebook

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.async
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.iframe
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.page
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////
//
//  DIALOGS
//
////////////////////////
trait DialogParams extends js.Object {
  var app_id: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[page | iframe | async | popup] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
}

object DialogParams {
  @scala.inline
  def apply(app_id: String = null, display: page | iframe | async | popup = null, redirect_uri: String = null): DialogParams = {
    val __obj = js.Dynamic.literal()
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogParams]
  }
}

