package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDragStopEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the current dragged TreeView node
    */
  var draggedElement: js.UndefOr[js.Any] = js.undefined
  /** returns the current dragged TreeView node details
    */
  var draggedElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the original drop target
    */
  var dropTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TreeView.Model] = js.undefined
  /** returns the drop position such as before, after or over
    */
  var position: js.UndefOr[String] = js.undefined
  /** if it is true, the parent node will be prevented from auto expanding; otherwise, it work's usually
    */
  var preventTargetExpand: js.UndefOr[Boolean] = js.undefined
  /** returns the current parent element of the dragged node
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
    */
  var targetElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeDragStopEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedElement: js.Any = null,
    draggedElementData: js.Any = null,
    dropTarget: js.Any = null,
    event: js.Any = null,
    model: typings.ejDotWebDotAll.ej.TreeView.Model = null,
    position: String = null,
    preventTargetExpand: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null,
    targetElementData: js.Any = null,
    `type`: String = null
  ): NodeDragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement)
    if (draggedElementData != null) __obj.updateDynamic("draggedElementData")(draggedElementData)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(preventTargetExpand)) __obj.updateDynamic("preventTargetExpand")(preventTargetExpand)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetElementData != null) __obj.updateDynamic("targetElementData")(targetElementData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeDragStopEventArgs]
  }
}

