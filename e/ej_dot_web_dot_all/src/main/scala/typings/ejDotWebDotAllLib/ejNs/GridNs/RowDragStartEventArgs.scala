package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns drag start element cell.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** Returns the JSON data of dragged rows.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns draggable element type.
    */
  var draggableType: js.UndefOr[js.Any] = js.undefined
  /** Returns the JSON data of dragged rows.
    */
  var draggedRecords: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the draggable row object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RowDragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentTarget: js.Any = null,
    data: js.Any = null,
    draggableType: js.Any = null,
    draggedRecords: js.Any = null,
    model: js.Any = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): RowDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (data != null) __obj.updateDynamic("data")(data)
    if (draggableType != null) __obj.updateDynamic("draggableType")(draggableType)
    if (draggedRecords != null) __obj.updateDynamic("draggedRecords")(draggedRecords)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDragStartEventArgs]
  }
}

