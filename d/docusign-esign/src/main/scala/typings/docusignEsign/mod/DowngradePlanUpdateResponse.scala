package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DowngradePlanUpdateResponse extends StObject {
  
  /**
    * The type of payment method used for the account. Valid values are:
    *
    * - `credit_card`
    * -
    */
  var accountPaymentMethod: js.UndefOr[String] = js.undefined
  
  var downgradeEffectiveDate: js.UndefOr[String] = js.undefined
  
  var downgradePaymentCycle: js.UndefOr[String] = js.undefined
  
  var downgradePlanId: js.UndefOr[String] = js.undefined
  
  var downgradePlanName: js.UndefOr[String] = js.undefined
  
  var downgradeRequestStatus: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object DowngradePlanUpdateResponse {
  
  inline def apply(): DowngradePlanUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DowngradePlanUpdateResponse]
  }
  
  extension [Self <: DowngradePlanUpdateResponse](x: Self) {
    
    inline def setAccountPaymentMethod(value: String): Self = StObject.set(x, "accountPaymentMethod", value.asInstanceOf[js.Any])
    
    inline def setAccountPaymentMethodUndefined: Self = StObject.set(x, "accountPaymentMethod", js.undefined)
    
    inline def setDowngradeEffectiveDate(value: String): Self = StObject.set(x, "downgradeEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setDowngradeEffectiveDateUndefined: Self = StObject.set(x, "downgradeEffectiveDate", js.undefined)
    
    inline def setDowngradePaymentCycle(value: String): Self = StObject.set(x, "downgradePaymentCycle", value.asInstanceOf[js.Any])
    
    inline def setDowngradePaymentCycleUndefined: Self = StObject.set(x, "downgradePaymentCycle", js.undefined)
    
    inline def setDowngradePlanId(value: String): Self = StObject.set(x, "downgradePlanId", value.asInstanceOf[js.Any])
    
    inline def setDowngradePlanIdUndefined: Self = StObject.set(x, "downgradePlanId", js.undefined)
    
    inline def setDowngradePlanName(value: String): Self = StObject.set(x, "downgradePlanName", value.asInstanceOf[js.Any])
    
    inline def setDowngradePlanNameUndefined: Self = StObject.set(x, "downgradePlanName", js.undefined)
    
    inline def setDowngradeRequestStatus(value: String): Self = StObject.set(x, "downgradeRequestStatus", value.asInstanceOf[js.Any])
    
    inline def setDowngradeRequestStatusUndefined: Self = StObject.set(x, "downgradeRequestStatus", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
