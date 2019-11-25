package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMatrix extends js.Object {
  /**
    * Information about the client which invoked the test.
    * Optional
    */
  var clientInfo: js.UndefOr[ClientInfo] = js.undefined
  /**
    * How the host machine(s) are configured.
    * Required
    */
  var environmentMatrix: js.UndefOr[EnvironmentMatrix] = js.undefined
  /**
    * Describes why the matrix is considered invalid.
    * Only useful for matrices in the INVALID state.
    * @OutputOnly
    */
  var invalidMatrixDetails: js.UndefOr[String] = js.undefined
  /**
    * The cloud project that owns the test matrix.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * Where the results for the matrix are written.
    * Required
    */
  var resultStorage: js.UndefOr[ResultStorage] = js.undefined
  /**
    * Indicates the current progress of the test matrix (e.g., FINISHED)
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * The list of test executions that the service creates for this matrix.
    * @OutputOnly
    */
  var testExecutions: js.UndefOr[js.Array[TestExecution]] = js.undefined
  /**
    * Unique id set by the service.
    * @OutputOnly
    */
  var testMatrixId: js.UndefOr[String] = js.undefined
  /**
    * How to run the test.
    * Required
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.undefined
  /**
    * The time this test matrix was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[String] = js.undefined
}

object TestMatrix {
  @scala.inline
  def apply(
    clientInfo: ClientInfo = null,
    environmentMatrix: EnvironmentMatrix = null,
    invalidMatrixDetails: String = null,
    projectId: String = null,
    resultStorage: ResultStorage = null,
    state: String = null,
    testExecutions: js.Array[TestExecution] = null,
    testMatrixId: String = null,
    testSpecification: TestSpecification = null,
    timestamp: String = null
  ): TestMatrix = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo.asInstanceOf[js.Any])
    if (environmentMatrix != null) __obj.updateDynamic("environmentMatrix")(environmentMatrix.asInstanceOf[js.Any])
    if (invalidMatrixDetails != null) __obj.updateDynamic("invalidMatrixDetails")(invalidMatrixDetails.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (resultStorage != null) __obj.updateDynamic("resultStorage")(resultStorage.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (testExecutions != null) __obj.updateDynamic("testExecutions")(testExecutions.asInstanceOf[js.Any])
    if (testMatrixId != null) __obj.updateDynamic("testMatrixId")(testMatrixId.asInstanceOf[js.Any])
    if (testSpecification != null) __obj.updateDynamic("testSpecification")(testSpecification.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMatrix]
  }
}

