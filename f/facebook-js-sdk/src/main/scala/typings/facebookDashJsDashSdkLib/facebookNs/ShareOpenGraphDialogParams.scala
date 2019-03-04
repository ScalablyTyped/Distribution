package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOpenGraphDialogParams extends DialogParams {
  var action_properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  var action_type: java.lang.String
  var hashtag: js.UndefOr[java.lang.String] = js.undefined
  var href: java.lang.String
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.share_open_graph
  var mobile_iframe: js.UndefOr[facebookDashJsDashSdkLib.facebookDashJsDashSdkLibNumbers.`false`] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
}

object ShareOpenGraphDialogParams {
  @scala.inline
  def apply(
    action_properties: org.scalablytyped.runtime.StringDictionary[js.Any],
    action_type: java.lang.String,
    href: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.share_open_graph,
    app_id: java.lang.String = null,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.page | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.iframe | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.async | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup = null,
    hashtag: java.lang.String = null,
    mobile_iframe: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibNumbers.`false` = null,
    quote: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): ShareOpenGraphDialogParams = {
    val __obj = js.Dynamic.literal(action_properties = action_properties, action_type = action_type, href = href, method = method)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (mobile_iframe != null) __obj.updateDynamic("mobile_iframe")(mobile_iframe)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[ShareOpenGraphDialogParams]
  }
}

