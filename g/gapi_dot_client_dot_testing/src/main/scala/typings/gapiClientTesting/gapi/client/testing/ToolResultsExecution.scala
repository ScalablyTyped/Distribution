package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolResultsExecution extends js.Object {
  /**
    * A tool results execution ID.
    * @OutputOnly
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * A tool results history ID.
    * @OutputOnly
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the tool results execution.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.native
}

object ToolResultsExecution {
  @scala.inline
  def apply(): ToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolResultsExecution]
  }
  @scala.inline
  implicit class ToolResultsExecutionOps[Self <: ToolResultsExecution] (val x: Self) extends AnyVal {
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
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

