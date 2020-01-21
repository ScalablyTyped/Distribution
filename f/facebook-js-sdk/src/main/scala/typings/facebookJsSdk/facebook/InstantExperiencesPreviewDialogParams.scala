package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_preview
import typings.facebookJsSdk.facebookJsSdkStrings.popup
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
    val __obj = js.Dynamic.literal(canvas_id = canvas_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
}

