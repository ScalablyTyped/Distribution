package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitTotal
  extends StObject
     with BackboneElement {
  
  /**
    * Monetary total amount associated with the category.
    */
  var amount: Money
  
  /**
    * For example, codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
    */
  var category: CodeableConcept
}
object ExplanationOfBenefitTotal {
  
  inline def apply(amount: Money, category: CodeableConcept): ExplanationOfBenefitTotal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitTotal]
  }
  
  extension [Self <: ExplanationOfBenefitTotal](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
