package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the results of a TestScript execution
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait TestReport extends DomainResource {
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'score'.
    */
  var _score: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'tester'.
    */
  var _tester: js.UndefOr[Element] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * When the TestScript was executed and this TestReport was generated
    */
  var issued: js.UndefOr[dateTime] = js.native
  /**
    * Informal name of the executed TestScript
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A participant in the test execution, either the execution engine, a client, or a server
    */
  var participant: js.UndefOr[js.Array[TestReportParticipant]] = js.native
  /**
    * pass | fail | pending
    */
  var result: code = js.native
  /**
    * The final score (percentage of tests passed) resulting from the execution of the TestScript
    */
  var score: js.UndefOr[decimal] = js.native
  /**
    * The results of the series of required setup operations before the tests were executed
    */
  var setup: js.UndefOr[TestReportSetup] = js.native
  /**
    * completed | in-progress | waiting | stopped | entered-in-error
    */
  var status: code = js.native
  /**
    * The results of running the series of required clean up steps
    */
  var teardown: js.UndefOr[TestReportTeardown] = js.native
  /**
    * A test executed from the test script
    */
  var test: js.UndefOr[js.Array[TestReportTest]] = js.native
  /**
    * Reference to the  version-specific TestScript that was executed to produce this TestReport
    */
  var testScript: Reference = js.native
  /**
    * Name of the tester producing this report (Organization or individual)
    */
  var tester: js.UndefOr[String] = js.native
}

object TestReport {
  @scala.inline
  def apply(result: code, status: code, testScript: Reference): TestReport = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testScript = testScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReport]
  }
  @scala.inline
  implicit class TestReportOps[Self <: TestReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: code): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestScript(value: Reference): Self = this.set("testScript", value.asInstanceOf[js.Any])
    @scala.inline
    def set_issued(value: Element): Self = this.set("_issued", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_issued: Self = this.set("_issued", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_result(value: Element): Self = this.set("_result", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_result: Self = this.set("_result", js.undefined)
    @scala.inline
    def set_score(value: Element): Self = this.set("_score", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_score: Self = this.set("_score", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_tester(value: Element): Self = this.set("_tester", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_tester: Self = this.set("_tester", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIssued(value: dateTime): Self = this.set("issued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssued: Self = this.set("issued", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParticipantVarargs(value: TestReportParticipant*): Self = this.set("participant", js.Array(value :_*))
    @scala.inline
    def setParticipant(value: js.Array[TestReportParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    @scala.inline
    def setScore(value: decimal): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    @scala.inline
    def setSetup(value: TestReportSetup): Self = this.set("setup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setTeardown(value: TestReportTeardown): Self = this.set("teardown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    @scala.inline
    def setTestVarargs(value: TestReportTest*): Self = this.set("test", js.Array(value :_*))
    @scala.inline
    def setTest(value: js.Array[TestReportTest]): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setTester(value: String): Self = this.set("tester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTester: Self = this.set("tester", js.undefined)
  }
  
}

