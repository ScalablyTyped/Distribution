package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesTask extends js.Object {
  /** To set whether the task is a global task or not
    * @Default {false}
    */
  var call: js.UndefOr[Boolean] = js.undefined
  /** Sets whether the task is triggered as a compensation of another specific activity
    * @Default {false}
    */
  var compensation: js.UndefOr[Boolean] = js.undefined
  /** Defines the collection of events that need to be appended with BPMN tasks
    */
  var events: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the loop type of a BPMN task.
    * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
    */
  var loop: js.UndefOr[BPMNLoops | String] = js.undefined
  /** Sets the type of the BPMN task.
    * @Default {ej.datavisualization.Diagram.BPMNTasks.None}
    */
  var `type`: js.UndefOr[BPMNTasks | String] = js.undefined
}

object NodesTask {
  @scala.inline
  def apply(
    call: js.UndefOr[Boolean] = js.undefined,
    compensation: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[_] = null,
    loop: BPMNLoops | String = null,
    `type`: BPMNTasks | String = null
  ): NodesTask = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call)
    if (!js.isUndefined(compensation)) __obj.updateDynamic("compensation")(compensation)
    if (events != null) __obj.updateDynamic("events")(events)
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesTask]
  }
}

