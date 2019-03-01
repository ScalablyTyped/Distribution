package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskbarEditingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the field values of record being edited.
    */
  var editingFields: js.UndefOr[js.Any] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns duration value will be round-off or not.
    */
  var roundOffDuration: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row object being edited.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TaskbarEditingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    editingFields: js.Any = null,
    model: js.Any = null,
    roundOffDuration: js.UndefOr[scala.Boolean] = js.undefined,
    rowData: js.Any = null,
    `type`: java.lang.String = null
  ): TaskbarEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (editingFields != null) __obj.updateDynamic("editingFields")(editingFields)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(roundOffDuration)) __obj.updateDynamic("roundOffDuration")(roundOffDuration)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskbarEditingEventArgs]
  }
}

