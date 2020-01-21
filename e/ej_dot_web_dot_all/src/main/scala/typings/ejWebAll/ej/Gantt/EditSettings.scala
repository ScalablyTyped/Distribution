package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettings extends js.Object {
  /** Enables or disables add record icon in Gantt toolbar
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables delete icon in Gantt toolbar
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.undefined
  /** Specifies the option for enabling or disabling editing in Gantt grid part
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** Specifies the option for enabling or disabling indent action in Gantt.
    * @Default {false}
    */
  var allowIndent: js.UndefOr[Boolean] = js.undefined
  /** Specifies the mouse action whether single click or double click to begin the editing
    * @Default {ej.Gantt.BeginEditAction.DblClick}
    */
  var beginEditAction: js.UndefOr[BeginEditAction | String] = js.undefined
  /** Specifies the edit mode in Gantt, &quot;normal&quot; is for dialog editing ,&quot;cellEditing&quot; is for cell type editing
    * @Default {normal}
    */
  var editMode: js.UndefOr[String] = js.undefined
  /** Specifies the position where the new row has to be added.
    * @Default {ej.Gantt.RowPosition.BelowSelectedRow}
    */
  var rowPosition: js.UndefOr[RowPosition | String] = js.undefined
  /** Enable or disable the confirmation dialog while deleting the record.
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined
}

object EditSettings {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowDeleting: js.UndefOr[Boolean] = js.undefined,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowIndent: js.UndefOr[Boolean] = js.undefined,
    beginEditAction: BeginEditAction | String = null,
    editMode: String = null,
    rowPosition: RowPosition | String = null,
    showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined
  ): EditSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleting)) __obj.updateDynamic("allowDeleting")(allowDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowIndent)) __obj.updateDynamic("allowIndent")(allowIndent.asInstanceOf[js.Any])
    if (beginEditAction != null) __obj.updateDynamic("beginEditAction")(beginEditAction.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (rowPosition != null) __obj.updateDynamic("rowPosition")(rowPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleteConfirmDialog)) __obj.updateDynamic("showDeleteConfirmDialog")(showDeleteConfirmDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSettings]
  }
}

