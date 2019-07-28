package typings.ejDotWebDotAll.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDroppedEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the original drop target
    */
  var dropTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the current dropped TreeView node
    */
  var droppedElement: js.UndefOr[js.Any] = js.undefined
  /** returns the current dropped TreeView node details
    */
  var droppedElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.TreeViewNs.Model] = js.undefined
  /** returns the drop position such as before, after or over
    */
  var position: js.UndefOr[String] = js.undefined
  /** returns the current parent element of the dropped node
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
    */
  var targetElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeDroppedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    dropTarget: js.Any = null,
    droppedElement: js.Any = null,
    droppedElementData: js.Any = null,
    event: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.TreeViewNs.Model = null,
    position: String = null,
    target: js.Any = null,
    targetElementData: js.Any = null,
    `type`: String = null
  ): NodeDroppedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (droppedElement != null) __obj.updateDynamic("droppedElement")(droppedElement)
    if (droppedElementData != null) __obj.updateDynamic("droppedElementData")(droppedElementData)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (position != null) __obj.updateDynamic("position")(position)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetElementData != null) __obj.updateDynamic("targetElementData")(targetElementData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeDroppedEventArgs]
  }
}

