package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitPayment
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Insurers will deduct amounts owing from the provider (adjustment), such as a prior overpayment, from the amount owing to the provider (benefits payable) when payment is made to the provider.
    */
  var adjustment: js.UndefOr[Money] = js.undefined
  
  /**
    * Reason for the payment adjustment.
    */
  var adjustmentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Benefits payable less any payment adjustment.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * Estimated date the payment will be issued or the actual issue date of payment.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * For example: EFT number or check number.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Whether this represents partial or complete payment of the benefits payable.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitPayment {
  
  inline def apply(): ExplanationOfBenefitPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitPayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitPayment] (val x: Self) extends AnyVal {
    
    inline def setAdjustment(value: Money): Self = StObject.set(x, "adjustment", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentReason(value: CodeableConcept): Self = StObject.set(x, "adjustmentReason", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentReasonUndefined: Self = StObject.set(x, "adjustmentReason", js.undefined)
    
    inline def setAdjustmentUndefined: Self = StObject.set(x, "adjustment", js.undefined)
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
