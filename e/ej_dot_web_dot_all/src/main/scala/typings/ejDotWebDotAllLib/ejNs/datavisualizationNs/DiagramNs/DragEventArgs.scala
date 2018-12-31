package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the drag event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the state of drag event (Starting, dragging, completed)
    */
  var dragState: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node or connector that is being dragged
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new position of the node/connector
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the offset of the selected items
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous position of the node/connector
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
}

