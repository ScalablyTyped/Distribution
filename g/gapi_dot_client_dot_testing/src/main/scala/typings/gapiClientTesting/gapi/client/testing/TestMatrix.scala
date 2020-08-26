package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMatrix extends js.Object {
  /**
    * Information about the client which invoked the test.
    * Optional
    */
  var clientInfo: js.UndefOr[ClientInfo] = js.native
  /**
    * How the host machine(s) are configured.
    * Required
    */
  var environmentMatrix: js.UndefOr[EnvironmentMatrix] = js.native
  /**
    * Describes why the matrix is considered invalid.
    * Only useful for matrices in the INVALID state.
    * @OutputOnly
    */
  var invalidMatrixDetails: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the test matrix.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Where the results for the matrix are written.
    * Required
    */
  var resultStorage: js.UndefOr[ResultStorage] = js.native
  /**
    * Indicates the current progress of the test matrix (e.g., FINISHED)
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The list of test executions that the service creates for this matrix.
    * @OutputOnly
    */
  var testExecutions: js.UndefOr[js.Array[TestExecution]] = js.native
  /**
    * Unique id set by the service.
    * @OutputOnly
    */
  var testMatrixId: js.UndefOr[String] = js.native
  /**
    * How to run the test.
    * Required
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.native
  /**
    * The time this test matrix was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[String] = js.native
}

object TestMatrix {
  @scala.inline
  def apply(): TestMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMatrix]
  }
  @scala.inline
  implicit class TestMatrixOps[Self <: TestMatrix] (val x: Self) extends AnyVal {
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
    def setClientInfo(value: ClientInfo): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    @scala.inline
    def setEnvironmentMatrix(value: EnvironmentMatrix): Self = this.set("environmentMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentMatrix: Self = this.set("environmentMatrix", js.undefined)
    @scala.inline
    def setInvalidMatrixDetails(value: String): Self = this.set("invalidMatrixDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidMatrixDetails: Self = this.set("invalidMatrixDetails", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setResultStorage(value: ResultStorage): Self = this.set("resultStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultStorage: Self = this.set("resultStorage", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTestExecutionsVarargs(value: TestExecution*): Self = this.set("testExecutions", js.Array(value :_*))
    @scala.inline
    def setTestExecutions(value: js.Array[TestExecution]): Self = this.set("testExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestExecutions: Self = this.set("testExecutions", js.undefined)
    @scala.inline
    def setTestMatrixId(value: String): Self = this.set("testMatrixId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestMatrixId: Self = this.set("testMatrixId", js.undefined)
    @scala.inline
    def setTestSpecification(value: TestSpecification): Self = this.set("testSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSpecification: Self = this.set("testSpecification", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

