package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DowngradRequestBillingInfoResponse extends StObject {
  
  var downgradePlanInformation: js.UndefOr[DowngradePlanUpdateResponse] = js.undefined
  
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
  var paymentMethod: js.UndefOr[String] = js.undefined
}
object DowngradRequestBillingInfoResponse {
  
  @scala.inline
  def apply(): DowngradRequestBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DowngradRequestBillingInfoResponse]
  }
  
  @scala.inline
  implicit class DowngradRequestBillingInfoResponseMutableBuilder[Self <: DowngradRequestBillingInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDowngradePlanInformation(value: DowngradePlanUpdateResponse): Self = StObject.set(x, "downgradePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradePlanInformationUndefined: Self = StObject.set(x, "downgradePlanInformation", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
  }
}
