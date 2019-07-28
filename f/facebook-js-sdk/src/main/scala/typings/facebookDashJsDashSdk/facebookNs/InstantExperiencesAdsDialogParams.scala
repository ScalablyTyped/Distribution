package typings.facebookDashJsDashSdk.facebookNs

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.canvas_editor
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
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
    val __obj = js.Dynamic.literal(business_id = business_id, display = display, method = method, page_id = page_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (canvas_id != null) __obj.updateDynamic("canvas_id")(canvas_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
}

