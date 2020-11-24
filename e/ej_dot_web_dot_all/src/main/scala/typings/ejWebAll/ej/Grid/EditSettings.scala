package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditSettings extends js.Object {
  
  /** Gets or sets a value that indicates whether to enable insert action in the editing mode.
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable the delete action in the editing mode.
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable the editing action while double click on the record
    * @Default {true}
    */
  var allowEditOnDblClick: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable the edit action in the editing mode.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Dialog Box
    * @Default {null}
    */
  var dialogEditorTemplateID: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates whether to define the mode of editing See editMode
    * @Default {ej.Grid.EditMode.Normal}
    */
  var editMode: js.UndefOr[EditMode | String] = js.native
  
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the External edit form
    * @Default {null}
    */
  var externalFormTemplateID: js.UndefOr[String] = js.native
  
  /** This specifies to set the position of an External edit form either in the top-right or bottom-left of the grid. See formPosition
    * @Default {ej.Grid.FormPosition.BottomLeft}
    */
  var formPosition: js.UndefOr[FormPosition | String] = js.native
  
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Inline edit form
    * @Default {null}
    */
  var inlineFormTemplateID: js.UndefOr[String] = js.native
  
  /** This specifies to set the position of an adding new row either in the top or bottom of the grid. See rowPosition
    * @Default {ej.Grid.RowPosition.Top}
    */
  var rowPosition: js.UndefOr[RowPosition | String] = js.native
  
  /** Gets or sets a value that indicates whether to display the add new form by default in the grid.
    * @Default {false}
    */
  var showAddNewRow: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while saving or discarding the batch changes
    * @Default {true}
    */
  var showConfirmDialog: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while deleting record
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether the title for edit form is different from the primarykey column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[String] = js.native
}
object EditSettings {
  
  @scala.inline
  def apply(): EditSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSettings]
  }
  
  @scala.inline
  implicit class EditSettingsOps[Self <: EditSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAdding(value: Boolean): Self = this.set("allowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdding: Self = this.set("allowAdding", js.undefined)
    
    @scala.inline
    def setAllowDeleting(value: Boolean): Self = this.set("allowDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleting: Self = this.set("allowDeleting", js.undefined)
    
    @scala.inline
    def setAllowEditOnDblClick(value: Boolean): Self = this.set("allowEditOnDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEditOnDblClick: Self = this.set("allowEditOnDblClick", js.undefined)
    
    @scala.inline
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    
    @scala.inline
    def setDialogEditorTemplateID(value: String): Self = this.set("dialogEditorTemplateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogEditorTemplateID: Self = this.set("dialogEditorTemplateID", js.undefined)
    
    @scala.inline
    def setEditMode(value: EditMode | String): Self = this.set("editMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    
    @scala.inline
    def setExternalFormTemplateID(value: String): Self = this.set("externalFormTemplateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalFormTemplateID: Self = this.set("externalFormTemplateID", js.undefined)
    
    @scala.inline
    def setFormPosition(value: FormPosition | String): Self = this.set("formPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormPosition: Self = this.set("formPosition", js.undefined)
    
    @scala.inline
    def setInlineFormTemplateID(value: String): Self = this.set("inlineFormTemplateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineFormTemplateID: Self = this.set("inlineFormTemplateID", js.undefined)
    
    @scala.inline
    def setRowPosition(value: RowPosition | String): Self = this.set("rowPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowPosition: Self = this.set("rowPosition", js.undefined)
    
    @scala.inline
    def setShowAddNewRow(value: Boolean): Self = this.set("showAddNewRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAddNewRow: Self = this.set("showAddNewRow", js.undefined)
    
    @scala.inline
    def setShowConfirmDialog(value: Boolean): Self = this.set("showConfirmDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConfirmDialog: Self = this.set("showConfirmDialog", js.undefined)
    
    @scala.inline
    def setShowDeleteConfirmDialog(value: Boolean): Self = this.set("showDeleteConfirmDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeleteConfirmDialog: Self = this.set("showDeleteConfirmDialog", js.undefined)
    
    @scala.inline
    def setTitleColumn(value: String): Self = this.set("titleColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleColumn: Self = this.set("titleColumn", js.undefined)
  }
}
