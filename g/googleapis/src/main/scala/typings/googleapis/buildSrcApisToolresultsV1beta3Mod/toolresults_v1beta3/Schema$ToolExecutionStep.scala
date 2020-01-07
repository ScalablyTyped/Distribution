package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic tool step to be used for binaries we do not explicitly support. For
  * example: running cp to copy artifacts from one location to another.
  */
@js.native
trait Schema$ToolExecutionStep extends js.Object {
  /**
    * A Tool execution.  - In response: present if set by create/update request
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[Schema$ToolExecution] = js.native
}

object Schema$ToolExecutionStep {
  @scala.inline
  def apply(toolExecution: Schema$ToolExecution = null): Schema$ToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    if (toolExecution != null) __obj.updateDynamic("toolExecution")(toolExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ToolExecutionStep]
  }
}

