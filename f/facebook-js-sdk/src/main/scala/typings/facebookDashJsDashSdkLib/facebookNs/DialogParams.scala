package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////
//
//  DIALOGS
//
////////////////////////
trait DialogParams extends js.Object {
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var display: js.UndefOr[
    facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup
  ] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
}

object DialogParams {
  @scala.inline
  def apply(
    app_id: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    redirect_uri: java.lang.String = null
  ): DialogParams = {
    val __obj = js.Dynamic.literal()
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[DialogParams]
  }
}

