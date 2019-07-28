package typings.facebookDashJsDashSdk.facebookNs

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.canvas_preview
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesPreviewDialogParams extends DialogParams {
  var canvas_id: String
  @JSName("display")
  var display_InstantExperiencesPreviewDialogParams: popup
  var method: canvas_preview
}

object InstantExperiencesPreviewDialogParams {
  @scala.inline
  def apply(
    canvas_id: String,
    display: popup,
    method: canvas_preview,
    app_id: String = null,
    redirect_uri: String = null
  ): InstantExperiencesPreviewDialogParams = {
    val __obj = js.Dynamic.literal(canvas_id = canvas_id, display = display, method = method)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
}

