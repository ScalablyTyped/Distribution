package typings.facebookDashJsDashSdk.facebook

import org.scalablytyped.runtime.StringDictionary
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkNumbers.`false`
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.async
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.iframe
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.page
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.share_open_graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOpenGraphDialogParams extends DialogParams {
  var action_properties: StringDictionary[js.Any]
  var action_type: String
  var hashtag: js.UndefOr[String] = js.undefined
  var href: String
  var method: share_open_graph
  var mobile_iframe: js.UndefOr[`false`] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
}

object ShareOpenGraphDialogParams {
  @scala.inline
  def apply(
    action_properties: StringDictionary[js.Any],
    action_type: String,
    href: String,
    method: share_open_graph,
    app_id: String = null,
    display: page | iframe | async | popup = null,
    hashtag: String = null,
    mobile_iframe: `false` = null,
    quote: String = null,
    redirect_uri: String = null
  ): ShareOpenGraphDialogParams = {
    val __obj = js.Dynamic.literal(action_properties = action_properties.asInstanceOf[js.Any], action_type = action_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (mobile_iframe != null) __obj.updateDynamic("mobile_iframe")(mobile_iframe.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogParams]
  }
}

