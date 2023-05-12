package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityResponseError
  extends StObject
     with BackboneElement {
  
  var _expression: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * An error code,from a specified code system, which details why the eligibility check could not be performed.
    */
  var code: CodeableConcept
  
  /**
    * The root of the FHIRPath is the resource or bundle that generated OperationOutcome.  Each FHIRPath SHALL resolve to a single node.
    */
  var expression: js.UndefOr[js.Array[String]] = js.undefined
}
object CoverageEligibilityResponseError {
  
  inline def apply(code: CodeableConcept): CoverageEligibilityResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityResponseError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEligibilityResponseError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: js.Array[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setExpressionVarargs(value: String*): Self = StObject.set(x, "expression", js.Array(value*))
    
    inline def set_expression(value: js.Array[Element]): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_expressionVarargs(value: Element*): Self = StObject.set(x, "_expression", js.Array(value*))
  }
}
