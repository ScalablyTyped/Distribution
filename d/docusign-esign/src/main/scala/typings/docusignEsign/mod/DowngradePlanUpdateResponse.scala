package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DowngradePlanUpdateResponse extends js.Object {
  
  /**
    * The type of payment method used for the account. Valid values are:
    *
    * - `credit_card`
    * -
    */
  var accountPaymentMethod: js.UndefOr[String] = js.native
  
  var downgradeEffectiveDate: js.UndefOr[String] = js.native
  
  var downgradePaymentCycle: js.UndefOr[String] = js.native
  
  var downgradePlanId: js.UndefOr[String] = js.native
  
  var downgradePlanName: js.UndefOr[String] = js.native
  
  var downgradeRequestStatus: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object DowngradePlanUpdateResponse {
  
  @scala.inline
  def apply(): DowngradePlanUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DowngradePlanUpdateResponse]
  }
  
  @scala.inline
  implicit class DowngradePlanUpdateResponseOps[Self <: DowngradePlanUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountPaymentMethod(value: String): Self = this.set("accountPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountPaymentMethod: Self = this.set("accountPaymentMethod", js.undefined)
    
    @scala.inline
    def setDowngradeEffectiveDate(value: String): Self = this.set("downgradeEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradeEffectiveDate: Self = this.set("downgradeEffectiveDate", js.undefined)
    
    @scala.inline
    def setDowngradePaymentCycle(value: String): Self = this.set("downgradePaymentCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradePaymentCycle: Self = this.set("downgradePaymentCycle", js.undefined)
    
    @scala.inline
    def setDowngradePlanId(value: String): Self = this.set("downgradePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradePlanId: Self = this.set("downgradePlanId", js.undefined)
    
    @scala.inline
    def setDowngradePlanName(value: String): Self = this.set("downgradePlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradePlanName: Self = this.set("downgradePlanName", js.undefined)
    
    @scala.inline
    def setDowngradeRequestStatus(value: String): Self = this.set("downgradeRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradeRequestStatus: Self = this.set("downgradeRequestStatus", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
