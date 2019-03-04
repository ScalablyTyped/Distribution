package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesPreviewDialogParams extends DialogParams {
  var canvas_id: java.lang.String
  @JSName("display")
  var display_InstantExperiencesPreviewDialogParams: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.canvas_preview
}

object InstantExperiencesPreviewDialogParams {
  @scala.inline
  def apply(
    canvas_id: java.lang.String,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.canvas_preview,
    app_id: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): InstantExperiencesPreviewDialogParams = {
    val __obj = js.Dynamic.literal(canvas_id = canvas_id, display = display, method = method)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
}

