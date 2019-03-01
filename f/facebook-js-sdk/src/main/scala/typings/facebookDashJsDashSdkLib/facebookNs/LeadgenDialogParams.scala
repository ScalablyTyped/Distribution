package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadgenDialogParams extends DialogParams {
  var account_id: java.lang.String
  @JSName("display")
  var display_LeadgenDialogParams: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.lead_gen
  var page_id: java.lang.String
}

object LeadgenDialogParams {
  @scala.inline
  def apply(
    account_id: java.lang.String,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.lead_gen,
    page_id: java.lang.String,
    app_id: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): LeadgenDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_id")(account_id)
    __obj.updateDynamic("display")(display)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("page_id")(page_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[LeadgenDialogParams]
  }
}

