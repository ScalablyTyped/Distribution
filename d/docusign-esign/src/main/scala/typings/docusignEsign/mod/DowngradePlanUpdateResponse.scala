package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DowngradePlanUpdateResponse extends StObject {
  
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
  implicit class DowngradePlanUpdateResponseMutableBuilder[Self <: DowngradePlanUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPaymentMethod(value: String): Self = StObject.set(x, "accountPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountPaymentMethodUndefined: Self = StObject.set(x, "accountPaymentMethod", js.undefined)
    
    @scala.inline
    def setDowngradeEffectiveDate(value: String): Self = StObject.set(x, "downgradeEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradeEffectiveDateUndefined: Self = StObject.set(x, "downgradeEffectiveDate", js.undefined)
    
    @scala.inline
    def setDowngradePaymentCycle(value: String): Self = StObject.set(x, "downgradePaymentCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradePaymentCycleUndefined: Self = StObject.set(x, "downgradePaymentCycle", js.undefined)
    
    @scala.inline
    def setDowngradePlanId(value: String): Self = StObject.set(x, "downgradePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradePlanIdUndefined: Self = StObject.set(x, "downgradePlanId", js.undefined)
    
    @scala.inline
    def setDowngradePlanName(value: String): Self = StObject.set(x, "downgradePlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradePlanNameUndefined: Self = StObject.set(x, "downgradePlanName", js.undefined)
    
    @scala.inline
    def setDowngradeRequestStatus(value: String): Self = StObject.set(x, "downgradeRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradeRequestStatusUndefined: Self = StObject.set(x, "downgradeRequestStatus", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
