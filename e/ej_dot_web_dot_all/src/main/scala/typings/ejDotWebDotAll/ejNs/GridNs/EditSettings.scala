package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable insert action in the editing mode.
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the delete action in the editing mode.
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the editing action while double click on the record
    * @Default {true}
    */
  var allowEditOnDblClick: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the edit action in the editing mode.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Dialog Box
    * @Default {null}
    */
  var dialogEditorTemplateID: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to define the mode of editing See editMode
    * @Default {ej.Grid.EditMode.Normal}
    */
  var editMode: js.UndefOr[EditMode | String] = js.undefined
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the External edit form
    * @Default {null}
    */
  var externalFormTemplateID: js.UndefOr[String] = js.undefined
  /** This specifies to set the position of an External edit form either in the top-right or bottom-left of the grid. See formPosition
    * @Default {ej.Grid.FormPosition.BottomLeft}
    */
  var formPosition: js.UndefOr[FormPosition | String] = js.undefined
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Inline edit form
    * @Default {null}
    */
  var inlineFormTemplateID: js.UndefOr[String] = js.undefined
  /** This specifies to set the position of an adding new row either in the top or bottom of the grid. See rowPosition
    * @Default {ej.Grid.RowPosition.Top}
    */
  var rowPosition: js.UndefOr[RowPosition | String] = js.undefined
  /** Gets or sets a value that indicates whether to display the add new form by default in the grid.
    * @Default {false}
    */
  var showAddNewRow: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while saving or discarding the batch changes
    * @Default {true}
    */
  var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while deleting record
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the title for edit form is different from the primarykey column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[String] = js.undefined
}

object EditSettings {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowDeleting: js.UndefOr[Boolean] = js.undefined,
    allowEditOnDblClick: js.UndefOr[Boolean] = js.undefined,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    dialogEditorTemplateID: String = null,
    editMode: EditMode | String = null,
    externalFormTemplateID: String = null,
    formPosition: FormPosition | String = null,
    inlineFormTemplateID: String = null,
    rowPosition: RowPosition | String = null,
    showAddNewRow: js.UndefOr[Boolean] = js.undefined,
    showConfirmDialog: js.UndefOr[Boolean] = js.undefined,
    showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined,
    titleColumn: String = null
  ): EditSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding)
    if (!js.isUndefined(allowDeleting)) __obj.updateDynamic("allowDeleting")(allowDeleting)
    if (!js.isUndefined(allowEditOnDblClick)) __obj.updateDynamic("allowEditOnDblClick")(allowEditOnDblClick)
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing)
    if (dialogEditorTemplateID != null) __obj.updateDynamic("dialogEditorTemplateID")(dialogEditorTemplateID)
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (externalFormTemplateID != null) __obj.updateDynamic("externalFormTemplateID")(externalFormTemplateID)
    if (formPosition != null) __obj.updateDynamic("formPosition")(formPosition.asInstanceOf[js.Any])
    if (inlineFormTemplateID != null) __obj.updateDynamic("inlineFormTemplateID")(inlineFormTemplateID)
    if (rowPosition != null) __obj.updateDynamic("rowPosition")(rowPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddNewRow)) __obj.updateDynamic("showAddNewRow")(showAddNewRow)
    if (!js.isUndefined(showConfirmDialog)) __obj.updateDynamic("showConfirmDialog")(showConfirmDialog)
    if (!js.isUndefined(showDeleteConfirmDialog)) __obj.updateDynamic("showDeleteConfirmDialog")(showDeleteConfirmDialog)
    if (titleColumn != null) __obj.updateDynamic("titleColumn")(titleColumn)
    __obj.asInstanceOf[EditSettings]
  }
}

