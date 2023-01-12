package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentReconciliationDetail
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Amount paid for this detail.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * The date of the invoice or financial resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The organization which is receiving the payment.
    */
  var payee: js.UndefOr[Reference] = js.undefined
  
  /**
    * The claim or financial resource.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * The claim response resource.
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * The Organization which submitted the claim or financial transaction.
    */
  var submitter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Code to indicate the nature of the payment, adjustment, funds advance, etc.
    */
  var `type`: CodeableConcept
}
object PaymentReconciliationDetail {
  
  inline def apply(`type`: CodeableConcept): PaymentReconciliationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentReconciliationDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentReconciliationDetail] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setPayee(value: Reference): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSubmitter(value: Reference): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
    
    inline def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
