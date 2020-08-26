package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettings extends js.Object {
  /** Enables or disables add record icon in Gantt toolbar
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.native
  /** Enables or disables delete icon in Gantt toolbar
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.native
  /** Specifies the option for enabling or disabling editing in Gantt grid part
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Specifies the option for enabling or disabling indent action in Gantt.
    * @Default {false}
    */
  var allowIndent: js.UndefOr[Boolean] = js.native
  /** Specifies the mouse action whether single click or double click to begin the editing
    * @Default {ej.Gantt.BeginEditAction.DblClick}
    */
  var beginEditAction: js.UndefOr[BeginEditAction | String] = js.native
  /** Specifies the edit mode in Gantt, &quot;normal&quot; is for dialog editing ,&quot;cellEditing&quot; is for cell type editing
    * @Default {normal}
    */
  var editMode: js.UndefOr[String] = js.native
  /** Specifies the position where the new row has to be added.
    * @Default {ej.Gantt.RowPosition.BelowSelectedRow}
    */
  var rowPosition: js.UndefOr[RowPosition | String] = js.native
  /** Enable or disable the confirmation dialog while deleting the record.
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.native
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
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAllowIndent(value: Boolean): Self = this.set("allowIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowIndent: Self = this.set("allowIndent", js.undefined)
    @scala.inline
    def setBeginEditAction(value: BeginEditAction | String): Self = this.set("beginEditAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginEditAction: Self = this.set("beginEditAction", js.undefined)
    @scala.inline
    def setEditMode(value: String): Self = this.set("editMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    @scala.inline
    def setRowPosition(value: RowPosition | String): Self = this.set("rowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowPosition: Self = this.set("rowPosition", js.undefined)
    @scala.inline
    def setShowDeleteConfirmDialog(value: Boolean): Self = this.set("showDeleteConfirmDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleteConfirmDialog: Self = this.set("showDeleteConfirmDialog", js.undefined)
  }
  
}

