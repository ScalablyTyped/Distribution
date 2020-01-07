package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Execution represents a collection of Steps. For instance, it could
  * represent: - a mobile test executed across a range of device configurations
  * - a jenkins job with a build step followed by a test step  The maximum size
  * of an execution message is 1 MiB.  An Execution can be updated until its
  * state is set to COMPLETE at which point it becomes immutable.
  */
@js.native
trait Schema$Execution extends js.Object {
  /**
    * The time when the Execution status transitioned to COMPLETE.  This value
    * will be set automatically when state transitions to COMPLETE.  - In
    * response: set if the execution state is COMPLETE. - In create/update
    * request: never set
    */
  var completionTime: js.UndefOr[Schema$Timestamp] = js.native
  /**
    * The time when the Execution was created.  This value will be set
    * automatically when CreateExecution is called.  - In response: always set
    * - In create/update request: never set
    */
  var creationTime: js.UndefOr[Schema$Timestamp] = js.native
  /**
    * A unique identifier within a History for this Execution.  Returns
    * INVALID_ARGUMENT if this field is set or overwritten by the caller.  - In
    * response always set - In create/update request: never set
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Classify the result, for example into SUCCESS or FAILURE  - In response:
    * present if set by create/update request - In create/update request:
    * optional
    */
  var outcome: js.UndefOr[Schema$Outcome] = js.native
  /**
    * Lightweight information about execution request.  - In response: present
    * if set by create - In create: optional - In update: optional
    */
  var specification: js.UndefOr[Schema$Specification] = js.native
  /**
    * The initial state is IN_PROGRESS.  The only legal state transitions is
    * from IN_PROGRESS to COMPLETE.  A PRECONDITION_FAILED will be returned if
    * an invalid transition is requested.  The state can only be set to
    * COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set
    * to COMPLETE multiple times.  If the state is set to COMPLETE, all the
    * in-progress steps within the execution will be set as COMPLETE. If the
    * outcome of the step is not set, the outcome will be set to INCONCLUSIVE.
    * - In response always set - In create/update request: optional
    */
  var state: js.UndefOr[String] = js.native
  /**
    * TestExecution Matrix ID that the TestExecutionService uses.  - In
    * response: present if set by create - In create: optional - In update:
    * never set
    */
  var testExecutionMatrixId: js.UndefOr[String] = js.native
}

object Schema$Execution {
  @scala.inline
  def apply(
    completionTime: Schema$Timestamp = null,
    creationTime: Schema$Timestamp = null,
    executionId: String = null,
    outcome: Schema$Outcome = null,
    specification: Schema$Specification = null,
    state: String = null,
    testExecutionMatrixId: String = null
  ): Schema$Execution = {
    val __obj = js.Dynamic.literal()
    if (completionTime != null) __obj.updateDynamic("completionTime")(completionTime.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (specification != null) __obj.updateDynamic("specification")(specification.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (testExecutionMatrixId != null) __obj.updateDynamic("testExecutionMatrixId")(testExecutionMatrixId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Execution]
  }
}

