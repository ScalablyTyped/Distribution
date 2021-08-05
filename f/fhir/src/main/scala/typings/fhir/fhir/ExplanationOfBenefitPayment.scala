package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment (if paid)
  */
trait ExplanationOfBenefitPayment
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Payment adjustment for non-Claim issues
    */
  var adjustment: js.UndefOr[Money] = js.undefined
  
  /**
    * Explanation for the non-claim adjustment
    */
  var adjustmentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Payable amount after adjustment
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * Expected date of Payment
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.undefined
  
  /**
    * Identifier of the payment instrument
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Partial or Complete
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitPayment {
  
  inline def apply(): ExplanationOfBenefitPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitPayment]
  }
  
  extension [Self <: ExplanationOfBenefitPayment](x: Self) {
    
    inline def setAdjustment(value: Money): Self = StObject.set(x, "adjustment", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentReason(value: CodeableConcept): Self = StObject.set(x, "adjustmentReason", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentReasonUndefined: Self = StObject.set(x, "adjustmentReason", js.undefined)
    
    inline def setAdjustmentUndefined: Self = StObject.set(x, "adjustment", js.undefined)
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
