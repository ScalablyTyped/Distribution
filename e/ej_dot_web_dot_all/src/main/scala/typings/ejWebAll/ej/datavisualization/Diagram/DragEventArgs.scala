package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the drag event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the state of drag event (Starting, dragging, completed)
    */
  var dragState: js.UndefOr[String] = js.undefined
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
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    dragState: String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    offset: js.Any = null,
    oldValue: js.Any = null
  ): DragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (dragState != null) __obj.updateDynamic("dragState")(dragState.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEventArgs]
  }
}

