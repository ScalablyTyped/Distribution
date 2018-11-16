package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragLeaveEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node or connector that is dragged outside of the diagram
               */
  var element: js.UndefOr[js.Any] = js.undefined
}

