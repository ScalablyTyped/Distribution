package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionStageState extends js.Object {
  /** The time at which the stage transitioned to this state. */
  var currentStateTime: js.UndefOr[String] = js.native
  /** The name of the execution stage. */
  var executionStageName: js.UndefOr[String] = js.native
  /** Executions stage states allow the same set of values as JobState. */
  var executionStageState: js.UndefOr[String] = js.native
}

object ExecutionStageState {
  @scala.inline
  def apply(): ExecutionStageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageState]
  }
  @scala.inline
  implicit class ExecutionStageStateOps[Self <: ExecutionStageState] (val x: Self) extends AnyVal {
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
    def setCurrentStateTime(value: String): Self = this.set("currentStateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentStateTime: Self = this.set("currentStateTime", js.undefined)
    @scala.inline
    def setExecutionStageName(value: String): Self = this.set("executionStageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStageName: Self = this.set("executionStageName", js.undefined)
    @scala.inline
    def setExecutionStageState(value: String): Self = this.set("executionStageState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStageState: Self = this.set("executionStageState", js.undefined)
  }
  
}

