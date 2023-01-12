package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseTotal
  extends StObject
     with BackboneElement {
  
  /**
    * Monetary total amount associated with the category.
    */
  var amount: Money
  
  /**
    * For example codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
    */
  var category: CodeableConcept
}
object ClaimResponseTotal {
  
  inline def apply(amount: Money, category: CodeableConcept): ClaimResponseTotal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseTotal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseTotal] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
