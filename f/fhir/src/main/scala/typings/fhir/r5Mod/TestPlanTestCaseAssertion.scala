package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanTestCaseAssertion
  extends StObject
     with BackboneElement {
  
  /**
    * The focus or object of the assertion i.e. a resource.
    */
  var `object`: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The test assertion - the expected outcome from the test case execution.
    */
  var result: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The test assertion type - this can be used to group assertions as 'required' or 'optional', or can be used for other classification of the assertion.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object TestPlanTestCaseAssertion {
  
  inline def apply(): TestPlanTestCaseAssertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPlanTestCaseAssertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanTestCaseAssertion] (val x: Self) extends AnyVal {
    
    inline def setObject(value: js.Array[CodeableReference]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setObjectVarargs(value: CodeableReference*): Self = StObject.set(x, "object", js.Array(value*))
    
    inline def setResult(value: js.Array[CodeableReference]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResultVarargs(value: CodeableReference*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
