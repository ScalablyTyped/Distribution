package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanTestCaseTestRun
  extends StObject
     with BackboneElement {
  
  var _narrative: js.UndefOr[Element] = js.undefined
  
  /**
    * The narrative description of the tests.
    */
  var narrative: js.UndefOr[String] = js.undefined
  
  /**
    * The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript.
    */
  var script: js.UndefOr[TestPlanTestCaseTestRunScript] = js.undefined
}
object TestPlanTestCaseTestRun {
  
  inline def apply(): TestPlanTestCaseTestRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPlanTestCaseTestRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanTestCaseTestRun] (val x: Self) extends AnyVal {
    
    inline def setNarrative(value: String): Self = StObject.set(x, "narrative", value.asInstanceOf[js.Any])
    
    inline def setNarrativeUndefined: Self = StObject.set(x, "narrative", js.undefined)
    
    inline def setScript(value: TestPlanTestCaseTestRunScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def set_narrative(value: Element): Self = StObject.set(x, "_narrative", value.asInstanceOf[js.Any])
    
    inline def set_narrativeUndefined: Self = StObject.set(x, "_narrative", js.undefined)
  }
}
