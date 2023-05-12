package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseError
  extends StObject
     with BackboneElement {
  
  var _expression: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * An error code, from a specified code system, which details why the claim could not be adjudicated.
    */
  var code: CodeableConcept
  
  /**
    * The sequence number of the detail within the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
    */
  var detailSequence: js.UndefOr[Double] = js.undefined
  
  /**
    * The root of the FHIRPath is the resource or bundle that generated OperationOutcome.  Each FHIRPath SHALL resolve to a single node.
    */
  var expression: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The sequence number of the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
    */
  var itemSequence: js.UndefOr[Double] = js.undefined
  
  /**
    * The sequence number of the sub-detail within the detail within the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
    */
  var subDetailSequence: js.UndefOr[Double] = js.undefined
}
object ClaimResponseError {
  
  inline def apply(code: CodeableConcept): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetailSequence(value: Double): Self = StObject.set(x, "detailSequence", value.asInstanceOf[js.Any])
    
    inline def setDetailSequenceUndefined: Self = StObject.set(x, "detailSequence", js.undefined)
    
    inline def setExpression(value: js.Array[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setExpressionVarargs(value: String*): Self = StObject.set(x, "expression", js.Array(value*))
    
    inline def setItemSequence(value: Double): Self = StObject.set(x, "itemSequence", value.asInstanceOf[js.Any])
    
    inline def setItemSequenceUndefined: Self = StObject.set(x, "itemSequence", js.undefined)
    
    inline def setSubDetailSequence(value: Double): Self = StObject.set(x, "subDetailSequence", value.asInstanceOf[js.Any])
    
    inline def setSubDetailSequenceUndefined: Self = StObject.set(x, "subDetailSequence", js.undefined)
    
    inline def set_expression(value: js.Array[Element]): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_expressionVarargs(value: Element*): Self = StObject.set(x, "_expression", js.Array(value*))
  }
}
