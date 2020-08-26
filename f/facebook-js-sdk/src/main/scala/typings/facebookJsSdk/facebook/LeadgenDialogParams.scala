package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.lead_gen
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeadgenDialogParams extends DialogParams {
  var account_id: String = js.native
  @JSName("display")
  var display_LeadgenDialogParams: popup = js.native
  var method: lead_gen = js.native
  var page_id: String = js.native
}

object LeadgenDialogParams {
  @scala.inline
  def apply(account_id: String, display: popup, method: lead_gen, page_id: String): LeadgenDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadgenDialogParams]
  }
  @scala.inline
  implicit class LeadgenDialogParamsOps[Self <: LeadgenDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount_id(value: String): Self = this.set("account_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: popup): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: lead_gen): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage_id(value: String): Self = this.set("page_id", value.asInstanceOf[js.Any])
  }
  
}

