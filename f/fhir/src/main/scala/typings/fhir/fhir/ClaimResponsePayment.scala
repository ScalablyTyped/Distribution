package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment details, if paid
  */
@js.native
trait ClaimResponsePayment extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Payment adjustment for non-Claim issues
    */
  var adjustment: js.UndefOr[Money] = js.native
  
  /**
    * Explanation for the non-claim adjustment
    */
  var adjustmentReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Payable amount after adjustment
    */
  var amount: js.UndefOr[Money] = js.native
  
  /**
    * Expected data of Payment
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.native
  
  /**
    * Identifier of the payment instrument
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Partial or Complete
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object ClaimResponsePayment {
  
  @scala.inline
  def apply(): ClaimResponsePayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponsePayment]
  }
  
  @scala.inline
  implicit class ClaimResponsePaymentMutableBuilder[Self <: ClaimResponsePayment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustment(value: Money): Self = StObject.set(x, "adjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentReason(value: CodeableConcept): Self = StObject.set(x, "adjustmentReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentReasonUndefined: Self = StObject.set(x, "adjustmentReason", js.undefined)
    
    @scala.inline
    def setAdjustmentUndefined: Self = StObject.set(x, "adjustment", js.undefined)
    
    @scala.inline
    def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
