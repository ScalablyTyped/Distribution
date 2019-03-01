package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesSubProcess extends js.Object {
  /** Defines the children for BPMN's SubProcess
    * @Default {[]}
    */
  var Processes: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines whether the BPMN sub process is without any prescribed order or not
    * @Default {false}
    */
  var adhoc: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the boundary of the BPMN process
    * @Default {ej.datavisualization.Diagram.BPMNBoundary.Default}
    */
  var boundary: js.UndefOr[BPMNBoundary | java.lang.String] = js.undefined
  /** Sets whether the BPMN subprocess is triggered as a collapsed of a specific activity
    * @Default {true}
    */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the BPMN subprocess is triggered as a compensation of a specific activity
    * @Default {false}
    */
  var compensation: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the type of the event by which the sub-process will be triggered
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | java.lang.String] = js.undefined
  /** Defines the collection of events that need to be appended with BPMN Sub-Process
    */
  var events: js.UndefOr[js.Array[NodesSubProcessEvent]] = js.undefined
  /** Defines the loop type of a sub process.
    * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
    */
  var loop: js.UndefOr[BPMNLoops | java.lang.String] = js.undefined
  /** Defines the type of the event trigger
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
    */
  var trigger: js.UndefOr[BPMNTriggers | java.lang.String] = js.undefined
  /** Defines the type of a sub process
    * @Default {ej.datavisualization.Diagram.BPMNSubProcessTypes.None}
    */
  var `type`: js.UndefOr[BPMNSubProcessTypes | java.lang.String] = js.undefined
}

object NodesSubProcess {
  @scala.inline
  def apply(
    Processes: js.Array[_] = null,
    adhoc: js.UndefOr[scala.Boolean] = js.undefined,
    boundary: BPMNBoundary | java.lang.String = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    compensation: js.UndefOr[scala.Boolean] = js.undefined,
    event: BPMNEvents | java.lang.String = null,
    events: js.Array[NodesSubProcessEvent] = null,
    loop: BPMNLoops | java.lang.String = null,
    trigger: BPMNTriggers | java.lang.String = null,
    `type`: BPMNSubProcessTypes | java.lang.String = null
  ): NodesSubProcess = {
    val __obj = js.Dynamic.literal()
    if (Processes != null) __obj.updateDynamic("Processes")(Processes)
    if (!js.isUndefined(adhoc)) __obj.updateDynamic("adhoc")(adhoc)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(compensation)) __obj.updateDynamic("compensation")(compensation)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesSubProcess]
  }
}

