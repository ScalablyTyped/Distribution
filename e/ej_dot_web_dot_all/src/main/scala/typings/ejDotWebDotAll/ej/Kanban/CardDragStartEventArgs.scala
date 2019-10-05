package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardDragStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns card drag start data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns dragged element.
    */
  var draggedElement: js.UndefOr[js.Any] = js.undefined
  /** Returns drag start element.
    */
  var dragtarget: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CardDragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    draggedElement: js.Any = null,
    dragtarget: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): CardDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement)
    if (dragtarget != null) __obj.updateDynamic("dragtarget")(dragtarget)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CardDragStartEventArgs]
  }
}

