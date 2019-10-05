package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestExecution extends js.Object {
  /**
    * How the host machine(s) are configured.
    * @OutputOnly
    */
  var environment: js.UndefOr[Environment] = js.undefined
  /**
    * Unique id set by the backend.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Id of the containing TestMatrix.
    * @OutputOnly
    */
  var matrixId: js.UndefOr[String] = js.undefined
  /**
    * The cloud project that owns the test execution.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * Indicates the current progress of the test execution (e.g., FINISHED).
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * Additional details about the running test.
    * @OutputOnly
    */
  var testDetails: js.UndefOr[TestDetails] = js.undefined
  /**
    * How to run the test.
    * @OutputOnly
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.undefined
  /**
    * The time this test execution was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[String] = js.undefined
  /**
    * Where the results for this execution are written.
    * @OutputOnly
    */
  var toolResultsStep: js.UndefOr[ToolResultsStep] = js.undefined
}

object TestExecution {
  @scala.inline
  def apply(
    environment: Environment = null,
    id: String = null,
    matrixId: String = null,
    projectId: String = null,
    state: String = null,
    testDetails: TestDetails = null,
    testSpecification: TestSpecification = null,
    timestamp: String = null,
    toolResultsStep: ToolResultsStep = null
  ): TestExecution = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (id != null) __obj.updateDynamic("id")(id)
    if (matrixId != null) __obj.updateDynamic("matrixId")(matrixId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (state != null) __obj.updateDynamic("state")(state)
    if (testDetails != null) __obj.updateDynamic("testDetails")(testDetails)
    if (testSpecification != null) __obj.updateDynamic("testSpecification")(testSpecification)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (toolResultsStep != null) __obj.updateDynamic("toolResultsStep")(toolResultsStep)
    __obj.asInstanceOf[TestExecution]
  }
}

