package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of settlements
  */
trait PaymentReconciliationDetail
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Amount being paid
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * Invoice date
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.undefined
  
  /**
    * Organization which is receiving the payment
    */
  var payee: js.UndefOr[Reference] = js.undefined
  
  /**
    * Claim
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Claim Response
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * Organization which submitted the claim
    */
  var submitter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type code
    */
  var `type`: CodeableConcept
}
object PaymentReconciliationDetail {
  
  inline def apply(`type`: CodeableConcept): PaymentReconciliationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentReconciliationDetail]
  }
  
  extension [Self <: PaymentReconciliationDetail](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
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
