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
    * For example: eligible percentage or co-payment percentage.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * For example may indicate that the funds for this benefit type have been exhausted.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
}
object ClaimResponseItemAdjudication {
  
  inline def apply(category: CodeableConcept): ClaimResponseItemAdjudication = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemAdjudication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseItemAdjudication] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
