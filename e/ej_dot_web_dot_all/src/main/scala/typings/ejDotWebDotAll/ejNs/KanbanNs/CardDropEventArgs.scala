package typings.ejDotWebDotAll.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns dragged data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns dragged element.
    */
  var draggedElement: js.UndefOr[js.Any] = js.undefined
  /** Returns previous parent of dragged element
    */
  var draggedParent: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns drop element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CardDropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    draggedElement: js.Any = null,
    draggedParent: js.Any = null,
    model: js.Any = null,
    target: js.Any = null,
    `type`: String = null
  ): CardDropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement)
    if (draggedParent != null) __obj.updateDynamic("draggedParent")(draggedParent)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CardDropEventArgs]
  }
}

