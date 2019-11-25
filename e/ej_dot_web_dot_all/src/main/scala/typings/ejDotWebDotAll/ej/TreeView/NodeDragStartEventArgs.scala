package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDragStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the original drag target
    */
  var dragTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TreeView.Model] = js.undefined
  /** returns the current dragging parent TreeView node
    */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the current dragging parent TreeView node details
    */
  var parentElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the dragging node
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
    */
  var targetElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeDragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    dragTarget: js.Any = null,
    event: js.Any = null,
    model: typings.ejDotWebDotAll.ej.TreeView.Model = null,
    parentElement: js.Any = null,
    parentElementData: js.Any = null,
    target: js.Any = null,
    targetElementData: js.Any = null,
    `type`: String = null
  ): NodeDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (dragTarget != null) __obj.updateDynamic("dragTarget")(dragTarget.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentElementData != null) __obj.updateDynamic("parentElementData")(parentElementData.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetElementData != null) __obj.updateDynamic("targetElementData")(targetElementData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDragStartEventArgs]
  }
}

