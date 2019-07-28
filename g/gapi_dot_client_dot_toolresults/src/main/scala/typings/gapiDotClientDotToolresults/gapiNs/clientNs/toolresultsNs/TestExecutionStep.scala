package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestExecutionStep extends js.Object {
  /**
    * Issues observed during the test execution.
    *
    * For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist
    * debugging.
    *
    * - In response: present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[TestIssue]] = js.undefined
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be
    * called when test suites are fully parsed or uploaded.
    *
    * The maximum allowed number of test suite overviews per step is 1000.
    *
    * - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[TestSuiteOverview]] = js.undefined
  /**
    * The timing break down of the test execution.
    *
    * - In response: present if set by create or update - In create/update request: optional
    */
  var testTiming: js.UndefOr[TestTiming] = js.undefined
  /**
    * Represents the execution of the test runner.
    *
    * The exit code of this tool will be used to determine if the test passed.
    *
    * - In response: always set - In create/update request: optional
    */
  var toolExecution: js.UndefOr[ToolExecution] = js.undefined
}

object TestExecutionStep {
  @scala.inline
  def apply(
    testIssues: js.Array[TestIssue] = null,
    testSuiteOverviews: js.Array[TestSuiteOverview] = null,
    testTiming: TestTiming = null,
    toolExecution: ToolExecution = null
  ): TestExecutionStep = {
    val __obj = js.Dynamic.literal()
    if (testIssues != null) __obj.updateDynamic("testIssues")(testIssues)
    if (testSuiteOverviews != null) __obj.updateDynamic("testSuiteOverviews")(testSuiteOverviews)
    if (testTiming != null) __obj.updateDynamic("testTiming")(testTiming)
    if (toolExecution != null) __obj.updateDynamic("toolExecution")(toolExecution)
    __obj.asInstanceOf[TestExecutionStep]
  }
}

