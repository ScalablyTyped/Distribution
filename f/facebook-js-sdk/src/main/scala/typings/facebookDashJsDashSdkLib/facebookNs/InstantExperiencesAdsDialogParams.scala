package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesAdsDialogParams extends DialogParams {
  var business_id: java.lang.String
  var canvas_id: js.UndefOr[java.lang.String] = js.undefined
  @JSName("display")
  var display_InstantExperiencesAdsDialogParams: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.canvas_editor
  var page_id: java.lang.String
}

object InstantExperiencesAdsDialogParams {
  @scala.inline
  def apply(
    business_id: java.lang.String,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.canvas_editor,
    page_id: java.lang.String,
    app_id: java.lang.String = null,
    canvas_id: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): InstantExperiencesAdsDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("business_id")(business_id)
    __obj.updateDynamic("display")(display)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("page_id")(page_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (canvas_id != null) __obj.updateDynamic("canvas_id")(canvas_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
}

