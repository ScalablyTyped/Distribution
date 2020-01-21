package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesAdsDialogParams extends DialogParams {
  var business_id: String
  var canvas_id: js.UndefOr[String] = js.undefined
  @JSName("display")
  var display_InstantExperiencesAdsDialogParams: popup
  var method: canvas_editor
  var page_id: String
}

object InstantExperiencesAdsDialogParams {
  @scala.inline
  def apply(
    business_id: String,
    display: popup,
    method: canvas_editor,
    page_id: String,
    app_id: String = null,
    canvas_id: String = null,
    redirect_uri: String = null
  ): InstantExperiencesAdsDialogParams = {
    val __obj = js.Dynamic.literal(business_id = business_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (canvas_id != null) __obj.updateDynamic("canvas_id")(canvas_id.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
}

