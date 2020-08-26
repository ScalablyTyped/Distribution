package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesTask extends js.Object {
  /** To set whether the task is a global task or not
    * @Default {false}
    */
  var call: js.UndefOr[Boolean] = js.native
  /** Sets whether the task is triggered as a compensation of another specific activity
    * @Default {false}
    */
  var compensation: js.UndefOr[Boolean] = js.native
  /** Defines the collection of events that need to be appended with BPMN tasks
    */
  var events: js.UndefOr[js.Array[_]] = js.native
  /** Sets the loop type of a BPMN task.
    * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
    */
  var loop: js.UndefOr[BPMNLoops | String] = js.native
  /** Sets the type of the BPMN task.
    * @Default {ej.datavisualization.Diagram.BPMNTasks.None}
    */
  var `type`: js.UndefOr[BPMNTasks | String] = js.native
}

object NodesTask {
  @scala.inline
  def apply(): NodesTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesTask]
  }
  @scala.inline
  implicit class NodesTaskOps[Self <: NodesTask] (val x: Self) extends AnyVal {
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
    def setCall(value: Boolean): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCall: Self = this.set("call", js.undefined)
    @scala.inline
    def setCompensation(value: Boolean): Self = this.set("compensation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompensation: Self = this.set("compensation", js.undefined)
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setLoop(value: BPMNLoops | String): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setType(value: BPMNTasks | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

