package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.fail
import typings.fhir.fhirStrings.pass
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _result: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _testScript: js.UndefOr[Element] = js.undefined
  
  var _tester: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifier for the TestReport assigned for external purposes outside the context of FHIR.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Additional specific dates may be added as extensions.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Not expected to be globally unique.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A participant in the test execution, either the execution engine, a client, or a server.
    */
  var participant: js.UndefOr[js.Array[TestReportParticipant]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_TestReport: typings.fhir.fhirStrings.TestReport
  
  /**
    * The pass and fail result represents a completed test script execution. The pending result represents a test script execution that has not yet started or is currently in progress.
    */
  var result: pass | fail | pending
  
  /**
    * The final score (percentage of tests passed) resulting from the execution of the TestScript.
    */
  var score: js.UndefOr[Double] = js.undefined
  
  /**
    * The results of the series of required setup operations before the tests were executed.
    */
  var setup: js.UndefOr[TestReportSetup] = js.undefined
  
  /**
    * The status represents where the execution is currently within the test script execution life cycle.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: completed | `in-progress` | waiting | stopped | `entered-in-error`
  
  /**
    * The results of the series of operations required to clean up after all the tests were executed (successfully or otherwise).
    */
  var teardown: js.UndefOr[TestReportTeardown] = js.undefined
  
  /**
    * A test executed from the test script.
    */
  var test: js.UndefOr[js.Array[TestReportTest]] = js.undefined
  
  /**
    * Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`.
    */
  var testScript: String
  
  /**
    * Usually an organization, but may be an individual. This item SHOULD be populated unless the information is available from context.
    */
  var tester: js.UndefOr[String] = js.undefined
}
object TestReport {
  
  inline def apply(
    result: pass | fail | pending,
    status: completed | `in-progress` | waiting | stopped | `entered-in-error`,
    testScript: String
  ): TestReport = {
    val __obj = js.Dynamic.literal(resourceType = "TestReport", result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testScript = testScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReport] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParticipant(value: js.Array[TestReportParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: TestReportParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.TestReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResult(value: pass | fail | pending): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSetup(value: TestReportSetup): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setStatus(value: completed | `in-progress` | waiting | stopped | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTeardown(value: TestReportTeardown): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
    
    inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    
    inline def setTest(value: js.Array[TestReportTest]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestScript(value: String): Self = StObject.set(x, "testScript", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: TestReportTest*): Self = StObject.set(x, "test", js.Array(value*))
    
    inline def setTester(value: String): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
    
    inline def setTesterUndefined: Self = StObject.set(x, "tester", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_result(value: Element): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
    
    inline def set_resultUndefined: Self = StObject.set(x, "_result", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_testScript(value: Element): Self = StObject.set(x, "_testScript", value.asInstanceOf[js.Any])
    
    inline def set_testScriptUndefined: Self = StObject.set(x, "_testScript", js.undefined)
    
    inline def set_tester(value: Element): Self = StObject.set(x, "_tester", value.asInstanceOf[js.Any])
    
    inline def set_testerUndefined: Self = StObject.set(x, "_tester", js.undefined)
  }
}
