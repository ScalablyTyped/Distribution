package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogParams extends DialogParams {
  var hashtag: js.UndefOr[java.lang.String] = js.undefined
  var href: java.lang.String
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.share
  var mobile_iframe: js.UndefOr[scala.Boolean] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
}

object ShareDialogParams {
  @scala.inline
  def apply(
    href: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.share,
    app_id: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    hashtag: java.lang.String = null,
    mobile_iframe: js.UndefOr[scala.Boolean] = js.undefined,
    quote: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): ShareDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("method")(method)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (!js.isUndefined(mobile_iframe)) __obj.updateDynamic("mobile_iframe")(mobile_iframe)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[ShareDialogParams]
  }
}

