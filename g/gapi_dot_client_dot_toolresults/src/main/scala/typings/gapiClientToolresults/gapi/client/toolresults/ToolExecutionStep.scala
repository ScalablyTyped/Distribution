package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolExecutionStep extends js.Object {
  /**
    * A Tool execution.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var toolExecution: js.UndefOr[ToolExecution] = js.undefined
}

object ToolExecutionStep {
  @scala.inline
  def apply(toolExecution: ToolExecution = null): ToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    if (toolExecution != null) __obj.updateDynamic("toolExecution")(toolExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolExecutionStep]
  }
}

