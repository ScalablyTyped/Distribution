package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolExecutionStep extends js.Object {
  /**
    * A Tool execution.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var toolExecution: js.UndefOr[ToolExecution] = js.native
}

object ToolExecutionStep {
  @scala.inline
  def apply(): ToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExecutionStep]
  }
  @scala.inline
  implicit class ToolExecutionStepOps[Self <: ToolExecutionStep] (val x: Self) extends AnyVal {
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
    def setToolExecution(value: ToolExecution): Self = this.set("toolExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolExecution: Self = this.set("toolExecution", js.undefined)
  }
  
}

