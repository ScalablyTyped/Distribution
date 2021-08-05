package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the results of a TestScript execution
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait TestReport
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'score'.
    */
  var _score: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'tester'.
    */
  var _tester: js.UndefOr[Element] = js.undefined
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When the TestScript was executed and this TestReport was generated
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Informal name of the executed TestScript
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A participant in the test execution, either the execution engine, a client, or a server
    */
  var participant: js.UndefOr[js.Array[TestReportParticipant]] = js.undefined
  
  /**
    * pass | fail | pending
    */
  var result: code
  
  /**
    * The final score (percentage of tests passed) resulting from the execution of the TestScript
    */
  var score: js.UndefOr[decimal] = js.undefined
  
  /**
    * The results of the series of required setup operations before the tests were executed
    */
  var setup: js.UndefOr[TestReportSetup] = js.undefined
  
  /**
    * completed | in-progress | waiting | stopped | entered-in-error
    */
  var status: code
  
  /**
    * The results of running the series of required clean up steps
    */
  var teardown: js.UndefOr[TestReportTeardown] = js.undefined
  
  /**
    * A test executed from the test script
    */
  var test: js.UndefOr[js.Array[TestReportTest]] = js.undefined
  
  /**
    * Reference to the  version-specific TestScript that was executed to produce this TestReport
    */
  var testScript: Reference
  
  /**
    * Name of the tester producing this report (Organization or individual)
    */
  var tester: js.UndefOr[String] = js.undefined
}
object TestReport {
  
  inline def apply(result: code, status: code, testScript: Reference): TestReport = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testScript = testScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReport]
  }
  
  extension [Self <: TestReport](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIssued(value: dateTime): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParticipant(value: js.Array[TestReportParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: TestReportParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    inline def setResult(value: code): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setScore(value: decimal): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSetup(value: TestReportSetup): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTeardown(value: TestReportTeardown): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
    
    inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    
    inline def setTest(value: js.Array[TestReportTest]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestScript(value: Reference): Self = StObject.set(x, "testScript", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: TestReportTest*): Self = StObject.set(x, "test", js.Array(value :_*))
    
    inline def setTester(value: String): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
    
    inline def setTesterUndefined: Self = StObject.set(x, "tester", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_result(value: Element): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
    
    inline def set_resultUndefined: Self = StObject.set(x, "_result", js.undefined)
    
    inline def set_score(value: Element): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
    
    inline def set_scoreUndefined: Self = StObject.set(x, "_score", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_tester(value: Element): Self = StObject.set(x, "_tester", value.asInstanceOf[js.Any])
    
    inline def set_testerUndefined: Self = StObject.set(x, "_tester", js.undefined)
  }
}
