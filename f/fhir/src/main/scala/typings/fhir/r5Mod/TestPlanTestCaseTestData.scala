package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanTestCaseTestData
  extends StObject
     with BackboneElement {
  
  var _sourceString: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual test resources when they exist.
    */
  var content: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pointer to a definition of test resources - narrative or structured e.g. synthetic data generation, etc.
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pointer to a definition of test resources - narrative or structured e.g. synthetic data generation, etc.
    */
  var sourceString: js.UndefOr[String] = js.undefined
  
  /**
    * The type of test data description, e.g. 'synthea'.
    */
  var `type`: Coding
}
object TestPlanTestCaseTestData {
  
  inline def apply(`type`: Coding): TestPlanTestCaseTestData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanTestCaseTestData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanTestCaseTestData] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Reference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setSourceString(value: String): Self = StObject.set(x, "sourceString", value.asInstanceOf[js.Any])
    
    inline def setSourceStringUndefined: Self = StObject.set(x, "sourceString", js.undefined)
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_sourceString(value: Element): Self = StObject.set(x, "_sourceString", value.asInstanceOf[js.Any])
    
    inline def set_sourceStringUndefined: Self = StObject.set(x, "_sourceString", js.undefined)
  }
}
