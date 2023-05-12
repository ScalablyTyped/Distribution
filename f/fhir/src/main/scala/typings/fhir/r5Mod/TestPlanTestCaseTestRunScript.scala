package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanTestCaseTestRunScript
  extends StObject
     with BackboneElement {
  
  var _sourceString: js.UndefOr[Element] = js.undefined
  
  /**
    * The language for the test cases e.g. 'gherkin', 'testscript'.
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The actual content of the cases - references to TestScripts or externally defined content.
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The actual content of the cases - references to TestScripts or externally defined content.
    */
  var sourceString: js.UndefOr[String] = js.undefined
}
object TestPlanTestCaseTestRunScript {
  
  inline def apply(): TestPlanTestCaseTestRunScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPlanTestCaseTestRunScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanTestCaseTestRunScript] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setSourceString(value: String): Self = StObject.set(x, "sourceString", value.asInstanceOf[js.Any])
    
    inline def setSourceStringUndefined: Self = StObject.set(x, "sourceString", js.undefined)
    
    inline def set_sourceString(value: Element): Self = StObject.set(x, "_sourceString", value.asInstanceOf[js.Any])
    
    inline def set_sourceStringUndefined: Self = StObject.set(x, "_sourceString", js.undefined)
  }
}
