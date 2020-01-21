package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeChangeEventArgs extends js.Object {
  /** parameter to cancel the size change
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the direction of the node is resized
    */
  var direction: js.UndefOr[String] = js.undefined
  /** parameter returns node that was resized
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new width, height, offsetX and offsetY values of the element that is being resized
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the difference between new and old value
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous width,height,offsetX and offsetY values of the element that is being resized
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the state of resizing(starting,resizing,completed)
    */
  var resizeState: js.UndefOr[String] = js.undefined
}

object SizeChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    direction: String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    offset: js.Any = null,
    oldValue: js.Any = null,
    resizeState: String = null
  ): SizeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (resizeState != null) __obj.updateDynamic("resizeState")(resizeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeChangeEventArgs]
  }
}

