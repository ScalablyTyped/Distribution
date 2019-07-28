package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskbarEditedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of edited record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns 'true' if taskbar is dragged.
    */
  var dragging: js.UndefOr[Boolean] = js.undefined
  /** Returns the field values of record being edited.
    */
  var editingFields: js.UndefOr[js.Any] = js.undefined
  /** Returns 'true' if taskbar is left resized.
    */
  var leftResizing: js.UndefOr[Boolean] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous data value of edited record.
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns 'true' if taskbar is progress resized.
    */
  var progressResizing: js.UndefOr[Boolean] = js.undefined
  /** Returns 'true' if taskbar is right resized.
    */
  var rightResizing: js.UndefOr[Boolean] = js.undefined
}

object TaskbarEditedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    editingFields: js.Any = null,
    leftResizing: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    previousData: js.Any = null,
    progressResizing: js.UndefOr[Boolean] = js.undefined,
    rightResizing: js.UndefOr[Boolean] = js.undefined
  ): TaskbarEditedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (editingFields != null) __obj.updateDynamic("editingFields")(editingFields)
    if (!js.isUndefined(leftResizing)) __obj.updateDynamic("leftResizing")(leftResizing)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousData != null) __obj.updateDynamic("previousData")(previousData)
    if (!js.isUndefined(progressResizing)) __obj.updateDynamic("progressResizing")(progressResizing)
    if (!js.isUndefined(rightResizing)) __obj.updateDynamic("rightResizing")(rightResizing)
    __obj.asInstanceOf[TaskbarEditedEventArgs]
  }
}

