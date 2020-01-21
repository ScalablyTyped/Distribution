package typings.ejWebAll.ej.Kanban

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
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement.asInstanceOf[js.Any])
    if (draggedParent != null) __obj.updateDynamic("draggedParent")(draggedParent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDropEventArgs]
  }
}

