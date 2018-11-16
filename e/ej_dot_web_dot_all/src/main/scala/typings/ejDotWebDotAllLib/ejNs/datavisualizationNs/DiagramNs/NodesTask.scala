package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodesTask extends js.Object {
  /** To set whether the task is a global task or not
               * @Default {false}
               */
  var call: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the task is triggered as a compensation of another specific activity
               * @Default {false}
               */
  var compensation: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the collection of events that need to be appended with BPMN tasks
               */
  var events: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the loop type of a BPMN task.
               * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
               */
  var loop: js.UndefOr[BPMNLoops | java.lang.String] = js.undefined
  /** Sets the type of the BPMN task.
               * @Default {ej.datavisualization.Diagram.BPMNTasks.None}
               */
  var `type`: js.UndefOr[BPMNTasks | java.lang.String] = js.undefined
}

