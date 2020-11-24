package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DowngradRequestBillingInfoResponse extends js.Object {
  
  var downgradePlanInformation: js.UndefOr[DowngradePlanUpdateResponse] = js.native
  
  /**
    * The payment method used for the billing plan. Valid values are:
    *
    * - `NotSupported`
    * - `CreditCard`
    * - `PurchaseOrder`
    * - `Premium`
    * - `Freemium`
    * - `FreeTrial`
    * - `AppStore`
    * - `DigitalExternal`
    * - `DirectDebit`
    */
  var paymentMethod: js.UndefOr[String] = js.native
}
object DowngradRequestBillingInfoResponse {
  
  @scala.inline
  def apply(): DowngradRequestBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DowngradRequestBillingInfoResponse]
  }
  
  @scala.inline
  implicit class DowngradRequestBillingInfoResponseOps[Self <: DowngradRequestBillingInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setDowngradePlanInformation(value: DowngradePlanUpdateResponse): Self = this.set("downgradePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradePlanInformation: Self = this.set("downgradePlanInformation", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
  }
}
