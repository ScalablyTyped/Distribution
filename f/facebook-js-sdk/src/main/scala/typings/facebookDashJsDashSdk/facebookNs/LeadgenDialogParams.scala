package typings.facebookDashJsDashSdk.facebookNs

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.lead_gen
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadgenDialogParams extends DialogParams {
  var account_id: String
  @JSName("display")
  var display_LeadgenDialogParams: popup
  var method: lead_gen
  var page_id: String
}

object LeadgenDialogParams {
  @scala.inline
  def apply(
    account_id: String,
    display: popup,
    method: lead_gen,
    page_id: String,
    app_id: String = null,
    redirect_uri: String = null
  ): LeadgenDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id, display = display, method = method, page_id = page_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[LeadgenDialogParams]
  }
}

