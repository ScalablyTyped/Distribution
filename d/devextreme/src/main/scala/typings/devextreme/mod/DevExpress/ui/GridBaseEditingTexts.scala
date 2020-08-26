package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseEditingTexts extends js.Object {
  /** @name GridBase.Options.editing.texts.addRow */
  var addRow: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.cancelAllChanges */
  var cancelAllChanges: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.cancelRowChanges */
  var cancelRowChanges: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.confirmDeleteMessage */
  var confirmDeleteMessage: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.confirmDeleteTitle */
  var confirmDeleteTitle: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.deleteRow */
  var deleteRow: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.editRow */
  var editRow: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.saveAllChanges */
  var saveAllChanges: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.saveRowChanges */
  var saveRowChanges: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.undeleteRow */
  var undeleteRow: js.UndefOr[String] = js.native
  /** @name GridBase.Options.editing.texts.validationCancelChanges */
  var validationCancelChanges: js.UndefOr[String] = js.native
}

object GridBaseEditingTexts {
  @scala.inline
  def apply(): GridBaseEditingTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseEditingTexts]
  }
  @scala.inline
  implicit class GridBaseEditingTextsOps[Self <: GridBaseEditingTexts] (val x: Self) extends AnyVal {
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
    def setAddRow(value: String): Self = this.set("addRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddRow: Self = this.set("addRow", js.undefined)
    @scala.inline
    def setCancelAllChanges(value: String): Self = this.set("cancelAllChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelAllChanges: Self = this.set("cancelAllChanges", js.undefined)
    @scala.inline
    def setCancelRowChanges(value: String): Self = this.set("cancelRowChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelRowChanges: Self = this.set("cancelRowChanges", js.undefined)
    @scala.inline
    def setConfirmDeleteMessage(value: String): Self = this.set("confirmDeleteMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmDeleteMessage: Self = this.set("confirmDeleteMessage", js.undefined)
    @scala.inline
    def setConfirmDeleteTitle(value: String): Self = this.set("confirmDeleteTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmDeleteTitle: Self = this.set("confirmDeleteTitle", js.undefined)
    @scala.inline
    def setDeleteRow(value: String): Self = this.set("deleteRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRow: Self = this.set("deleteRow", js.undefined)
    @scala.inline
    def setEditRow(value: String): Self = this.set("editRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditRow: Self = this.set("editRow", js.undefined)
    @scala.inline
    def setSaveAllChanges(value: String): Self = this.set("saveAllChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveAllChanges: Self = this.set("saveAllChanges", js.undefined)
    @scala.inline
    def setSaveRowChanges(value: String): Self = this.set("saveRowChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveRowChanges: Self = this.set("saveRowChanges", js.undefined)
    @scala.inline
    def setUndeleteRow(value: String): Self = this.set("undeleteRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndeleteRow: Self = this.set("undeleteRow", js.undefined)
    @scala.inline
    def setValidationCancelChanges(value: String): Self = this.set("validationCancelChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationCancelChanges: Self = this.set("validationCancelChanges", js.undefined)
  }
  
}

