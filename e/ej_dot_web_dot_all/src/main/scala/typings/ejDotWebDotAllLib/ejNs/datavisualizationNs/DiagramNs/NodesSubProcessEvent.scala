package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodesSubProcessEvent extends js.Object {
  /** Sets the type of the event by which the sub-process will be triggered
               * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
               */
  var event: js.UndefOr[BPMNEvents | java.lang.String] = js.undefined
  /** A collection of objects where each object represents a label
               * @Default {[]}
               */
  var labels: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the name of the BPMN event shape.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the fraction/ratio(relative to parent) that defines the position of the event shape
               * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
               */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** An array of objects where each object represents a port
               * @Default {[]}
               */
  var ports: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the type of the event trigger
               * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
               */
  var trigger: js.UndefOr[BPMNTriggers | java.lang.String] = js.undefined
}

