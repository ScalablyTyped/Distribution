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

object DragEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    diagramId: java.lang.String = null,
    dragState: java.lang.String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    offset: js.Any = null,
    oldValue: js.Any = null
  ): DragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (dragState != null) __obj.updateDynamic("dragState")(dragState)
    if (element != null) __obj.updateDynamic("element")(element)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[DragEventArgs]
  }
}

