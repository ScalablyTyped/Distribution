package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentReconciliationAllocation
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _targetItemString: js.UndefOr[Element] = js.undefined
  
  /**
    * The Account to which this payment applies, may be completed by the receiver, used for search.
    */
  var account: js.UndefOr[Reference] = js.undefined
  
  /**
    * The monetary amount allocated from the total payment to the payable.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * The date from the response resource containing a commitment to pay.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The Encounter to which this payment applies, may be completed by the receiver, used for search.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
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
    * Specific resource to which the payment/adjustment/advance applies.
    */
  var target: js.UndefOr[Reference] = js.undefined
  
  /**
    *  Identifies the claim line item, encounter or other sub-element being paid. Note payment may be partial, that is not match the then outstanding balance or amount incurred.
    */
  var targetItemIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    *  Identifies the claim line item, encounter or other sub-element being paid. Note payment may be partial, that is not match the then outstanding balance or amount incurred.
    */
  var targetItemPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    *  Identifies the claim line item, encounter or other sub-element being paid. Note payment may be partial, that is not match the then outstanding balance or amount incurred.
    */
  var targetItemString: js.UndefOr[String] = js.undefined
  
  /**
    * For example: payment, adjustment, funds advance, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object PaymentReconciliationAllocation {
  
  inline def apply(): PaymentReconciliationAllocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentReconciliationAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentReconciliationAllocation] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Reference): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPayee(value: Reference): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPredecessor(value: Identifier): Self = StObject.set(x, "predecessor", value.asInstanceOf[js.Any])
    
    inline def setPredecessorUndefined: Self = StObject.set(x, "predecessor", js.undefined)
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setSubmitter(value: Reference): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
    
    inline def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetItemIdentifier(value: Identifier): Self = StObject.set(x, "targetItemIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetItemIdentifierUndefined: Self = StObject.set(x, "targetItemIdentifier", js.undefined)
    
    inline def setTargetItemPositiveInt(value: Double): Self = StObject.set(x, "targetItemPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setTargetItemPositiveIntUndefined: Self = StObject.set(x, "targetItemPositiveInt", js.undefined)
    
    inline def setTargetItemString(value: String): Self = StObject.set(x, "targetItemString", value.asInstanceOf[js.Any])
    
    inline def setTargetItemStringUndefined: Self = StObject.set(x, "targetItemString", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_targetItemString(value: Element): Self = StObject.set(x, "_targetItemString", value.asInstanceOf[js.Any])
    
    inline def set_targetItemStringUndefined: Self = StObject.set(x, "_targetItemString", js.undefined)
  }
}
