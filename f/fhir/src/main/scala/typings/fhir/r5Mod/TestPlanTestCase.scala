package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanTestCase
  extends StObject
     with BackboneElement {
  
  /**
    * The test assertions - the expectations of test results from the execution of the test case.
    */
  var assertion: js.UndefOr[js.Array[TestPlanTestCaseAssertion]] = js.undefined
  
  /**
    * The required criteria to execute the test case - e.g. preconditions, previous tests.
    */
  var dependency: js.UndefOr[js.Array[TestPlanTestCaseDependency]] = js.undefined
  
  /**
    * The scope or artifact covered by the case, when the individual test case is associated with a testable artifact.
    */
  var scope: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Sequence of test case - an ordinal number that indicates the order for the present test case in the test plan.
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * The test data used in the test case.
    */
  var testData: js.UndefOr[js.Array[TestPlanTestCaseTestData]] = js.undefined
  
  /**
    * The actual test to be executed.
    */
  var testRun: js.UndefOr[js.Array[TestPlanTestCaseTestRun]] = js.undefined
}
object TestPlanTestCase {
  
  inline def apply(): TestPlanTestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPlanTestCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanTestCase] (val x: Self) extends AnyVal {
    
    inline def setAssertion(value: js.Array[TestPlanTestCaseAssertion]): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
    
    inline def setAssertionUndefined: Self = StObject.set(x, "assertion", js.undefined)
    
    inline def setAssertionVarargs(value: TestPlanTestCaseAssertion*): Self = StObject.set(x, "assertion", js.Array(value*))
    
    inline def setDependency(value: js.Array[TestPlanTestCaseDependency]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependencyVarargs(value: TestPlanTestCaseDependency*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setScope(value: js.Array[Reference]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: Reference*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setTestData(value: js.Array[TestPlanTestCaseTestData]): Self = StObject.set(x, "testData", value.asInstanceOf[js.Any])
    
    inline def setTestDataUndefined: Self = StObject.set(x, "testData", js.undefined)
    
    inline def setTestDataVarargs(value: TestPlanTestCaseTestData*): Self = StObject.set(x, "testData", js.Array(value*))
    
    inline def setTestRun(value: js.Array[TestPlanTestCaseTestRun]): Self = StObject.set(x, "testRun", value.asInstanceOf[js.Any])
    
    inline def setTestRunUndefined: Self = StObject.set(x, "testRun", js.undefined)
    
    inline def setTestRunVarargs(value: TestPlanTestCaseTestRun*): Self = StObject.set(x, "testRun", js.Array(value*))
  }
}
