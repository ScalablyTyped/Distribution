package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDragEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the original drag target
    */
  var dragTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the target node
    */
  var draggedElement: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
    */
  var draggedElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current target TreeView node
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the current target details
    */
  var targetElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NodeDragEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    dragTarget: js.Any = null,
    draggedElement: js.Any = null,
    draggedElementData: js.Any = null,
    event: js.Any = null,
    model: Model = null,
    target: js.Any = null,
    targetElementData: js.Any = null,
    `type`: java.lang.String = null
  ): NodeDragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (dragTarget != null) __obj.updateDynamic("dragTarget")(dragTarget)
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement)
    if (draggedElementData != null) __obj.updateDynamic("draggedElementData")(draggedElementData)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetElementData != null) __obj.updateDynamic("targetElementData")(targetElementData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeDragEventArgs]
  }
}

