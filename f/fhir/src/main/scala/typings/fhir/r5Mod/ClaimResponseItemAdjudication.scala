package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItemAdjudication
  extends StObject
     with BackboneElement {
  
  /**
    * For example: amount submitted, eligible amount, co-payment, and benefit payable.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * For example codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
    */
  var category: CodeableConcept
  
  /**
    * For example may indicate that the funds for this benefit type have been exhausted.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example: eligible percentage or co-payment percentage.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ClaimResponseItemAdjudication {
  
  inline def apply(category: CodeableConcept): ClaimResponseItemAdjudication = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemAdjudication]
  }
  
  extension [Self <: ClaimResponseItemAdjudication](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
