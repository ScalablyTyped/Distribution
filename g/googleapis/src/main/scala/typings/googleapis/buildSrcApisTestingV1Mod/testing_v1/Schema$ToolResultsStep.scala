package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a tool results step resource.  This has the results of a
  * TestExecution.
  */
@js.native
trait Schema$ToolResultsStep extends js.Object {
  /**
    * Output only. A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Output only. A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Output only. The cloud project that owns the tool results step.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Output only. A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object Schema$ToolResultsStep {
  @scala.inline
  def apply(
    executionId: String = null,
    historyId: String = null,
    projectId: String = null,
    stepId: String = null
  ): Schema$ToolResultsStep = {
    val __obj = js.Dynamic.literal()
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ToolResultsStep]
  }
}

