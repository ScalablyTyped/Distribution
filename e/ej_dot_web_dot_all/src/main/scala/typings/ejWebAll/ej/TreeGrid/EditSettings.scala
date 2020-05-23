package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettings extends js.Object {
  /** Enables or disables the button to add new row in context menu as well as in toolbar.
    * @Default {true}
    */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the button to delete the selected row in context menu as well as in toolbar.
    * @Default {true}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to edit a row or cell.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** specifies the batch edit mode in TreeGrid.
    */
  var batchEditSettings: js.UndefOr[EditSettingsBatchEditSettings] = js.undefined
  /** Specifies the mouse action whether single click or double click to begin the editing
    * @Default {ej.TreeGrid.BeginEditAction.DblClick}
    */
  var beginEditAction: js.UndefOr[BeginEditAction | String] = js.undefined
  /** Specifies the template ID for the custom dialog.
    * @Default {null}
    */
  var dialogEditorTemplateID: js.UndefOr[String] = js.undefined
  /** specifies the edit mode in TreeGrid , &quot;cellEditing&quot; is for cell type editing and &quot;rowEditing&quot; is for entire row.
    * @Default {ej.TreeGrid.EditMode.CellEditing}
    */
  var editMode: js.UndefOr[EditMode | String] = js.undefined
  /** Specifies the position where the new row has to be added.
    * @Default {ej.TreeGrid.RowPosition.Top}
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
    batchEditSettings: EditSettingsBatchEditSettings = null,
    beginEditAction: BeginEditAction | String = null,
    dialogEditorTemplateID: String = null,
    editMode: EditMode | String = null,
    rowPosition: RowPosition | String = null,
    showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined
  ): EditSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleting)) __obj.updateDynamic("allowDeleting")(allowDeleting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.get.asInstanceOf[js.Any])
    if (batchEditSettings != null) __obj.updateDynamic("batchEditSettings")(batchEditSettings.asInstanceOf[js.Any])
    if (beginEditAction != null) __obj.updateDynamic("beginEditAction")(beginEditAction.asInstanceOf[js.Any])
    if (dialogEditorTemplateID != null) __obj.updateDynamic("dialogEditorTemplateID")(dialogEditorTemplateID.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (rowPosition != null) __obj.updateDynamic("rowPosition")(rowPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleteConfirmDialog)) __obj.updateDynamic("showDeleteConfirmDialog")(showDeleteConfirmDialog.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSettings]
  }
}

