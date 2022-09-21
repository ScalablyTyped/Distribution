package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitItemAdjudication
  extends StObject
     with BackboneElement {
  
  /**
    * Monitory amount associated with the code.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * Code indicating: Co-Pay, deductable, elegible, benefit, tax, etc.
    */
  var category: CodeableConcept
  
  /**
    * Adjudication reason such as limit reached.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ExplanationOfBenefitItemAdjudication {
  
  inline def apply(category: CodeableConcept): ExplanationOfBenefitItemAdjudication = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitItemAdjudication]
  }
  
  extension [Self <: ExplanationOfBenefitItemAdjudication](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
