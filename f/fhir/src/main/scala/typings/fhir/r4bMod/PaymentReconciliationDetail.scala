package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentReconciliationDetail
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * The monetary amount allocated from the total payment to the payable.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * The date from the response resource containing a commitment to pay.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for the current payment item for the referenced payable.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The party which is receiving the payment.
    */
  var payee: js.UndefOr[Reference] = js.undefined
  
  /**
    * Unique identifier for the prior payment item for the referenced payable.
    */
  var predecessor: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A resource, such as a Claim, the evaluation of which could lead to payment.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * A resource, such as a ClaimResponse, which contains a commitment to payment.
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to the individual who is responsible for inquiries regarding the response and its payment.
    */
  var responsible: js.UndefOr[Reference] = js.undefined
  
  /**
    * The party which submitted the claim or financial transaction.
    */
  var submitter: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example: payment, adjustment, funds advance, etc.
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
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPayee(value: Reference): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPredecessor(value: Identifier): Self = StObject.set(x, "predecessor", value.asInstanceOf[js.Any])
    
    inline def setPredecessorUndefined: Self = StObject.set(x, "predecessor", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setSubmitter(value: Reference): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
    
    inline def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
