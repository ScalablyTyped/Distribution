package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragOverEventArgs extends js.Object {
  /** parameter defines whether the symbol can be dropped at the current mouse position
               */
  var allowDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns whether or not to cancel the dragOver event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node or connector that is dragged over diagram
               */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new position of the node/connector
               */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous position of the node/connector
               */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the node/connector over which the symbol is dragged
               */
  var target: js.UndefOr[js.Any] = js.undefined
}

