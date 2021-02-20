package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of settlements
  */
@js.native
trait PaymentReconciliationDetail extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Amount being paid
    */
  var amount: js.UndefOr[Money] = js.native
  
  /**
    * Invoice date
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.native
  
  /**
    * Organization which is receiving the payment
    */
  var payee: js.UndefOr[Reference] = js.native
  
  /**
    * Claim
    */
  var request: js.UndefOr[Reference] = js.native
  
  /**
    * Claim Response
    */
  var response: js.UndefOr[Reference] = js.native
  
  /**
    * Organization which submitted the claim
    */
  var submitter: js.UndefOr[Reference] = js.native
  
  /**
    * Type code
    */
  var `type`: CodeableConcept = js.native
}
object PaymentReconciliationDetail {
  
  @scala.inline
  def apply(`type`: CodeableConcept): PaymentReconciliationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentReconciliationDetail]
  }
  
  @scala.inline
  implicit class PaymentReconciliationDetailMutableBuilder[Self <: PaymentReconciliationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setPayee(value: Reference): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    @scala.inline
    def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSubmitter(value: Reference): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
