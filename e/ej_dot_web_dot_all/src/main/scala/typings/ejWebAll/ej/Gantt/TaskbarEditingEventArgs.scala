package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskbarEditingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the field values of record being edited.
    */
  var editingFields: js.UndefOr[js.Any] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns duration value will be round-off or not.
    */
  var roundOffDuration: js.UndefOr[Boolean] = js.undefined
  /** Returns the row object being edited.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TaskbarEditingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    editingFields: js.Any = null,
    model: js.Any = null,
    roundOffDuration: js.UndefOr[Boolean] = js.undefined,
    rowData: js.Any = null,
    `type`: String = null
  ): TaskbarEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (editingFields != null) __obj.updateDynamic("editingFields")(editingFields.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(roundOffDuration)) __obj.updateDynamic("roundOffDuration")(roundOffDuration.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskbarEditingEventArgs]
  }
}

