package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable the adding action in cards behavior on Kanban.
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the editing action in cards of Kanban.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** This specifies the id of the template which is require to be edited using the Dialog Box.
    * @Default {null}
    */
  var dialogTemplate: js.UndefOr[String] = js.native
  /** Get or sets an object that indicates whether to customize the editing fields of Kanban card.
    * @Default {Array}
    */
  var editItems: js.UndefOr[js.Array[EditSettingsEditItem]] = js.native
  /** Get or sets an object that indicates whether to customize the editMode of the Kanban.
    * @Default {ej.Kanban.EditMode.Dialog}
    */
  var editMode: js.UndefOr[EditMode | String] = js.native
  /** This specifies the id of the template which is require to be edited using the External edit form.
    * @Default {null}
    */
  var externalFormTemplate: js.UndefOr[String] = js.native
  /** This specifies to set the position of an External edit form either in the right or bottom of the Kanban.
    * @Default {ej.Kanban.FormPosition.Bottom}
    */
  var formPosition: js.UndefOr[FormPosition | String] = js.native
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
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setDialogTemplate(value: String): Self = this.set("dialogTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogTemplate: Self = this.set("dialogTemplate", js.undefined)
    @scala.inline
    def setEditItemsVarargs(value: EditSettingsEditItem*): Self = this.set("editItems", js.Array(value :_*))
    @scala.inline
    def setEditItems(value: js.Array[EditSettingsEditItem]): Self = this.set("editItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditItems: Self = this.set("editItems", js.undefined)
    @scala.inline
    def setEditMode(value: EditMode | String): Self = this.set("editMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    @scala.inline
    def setExternalFormTemplate(value: String): Self = this.set("externalFormTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalFormTemplate: Self = this.set("externalFormTemplate", js.undefined)
    @scala.inline
    def setFormPosition(value: FormPosition | String): Self = this.set("formPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormPosition: Self = this.set("formPosition", js.undefined)
  }
  
}

