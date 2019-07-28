package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolResultsStep extends js.Object {
  /**
    * A tool results execution ID.
    * @OutputOnly
    */
  var executionId: js.UndefOr[String] = js.undefined
  /**
    * A tool results history ID.
    * @OutputOnly
    */
  var historyId: js.UndefOr[String] = js.undefined
  /**
    * The cloud project that owns the tool results step.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * A tool results step ID.
    * @OutputOnly
    */
  var stepId: js.UndefOr[String] = js.undefined
}

object ToolResultsStep {
  @scala.inline
  def apply(
    executionId: String = null,
    historyId: String = null,
    projectId: String = null,
    stepId: String = null
  ): ToolResultsStep = {
    val __obj = js.Dynamic.literal()
    if (executionId != null) __obj.updateDynamic("executionId")(executionId)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (stepId != null) __obj.updateDynamic("stepId")(stepId)
    __obj.asInstanceOf[ToolResultsStep]
  }
}

