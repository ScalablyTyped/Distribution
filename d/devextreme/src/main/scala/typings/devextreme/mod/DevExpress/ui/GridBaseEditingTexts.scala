package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseEditingTexts extends js.Object {
  /** @name GridBase.Options.editing.texts.addRow */
  var addRow: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.cancelAllChanges */
  var cancelAllChanges: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.cancelRowChanges */
  var cancelRowChanges: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.confirmDeleteMessage */
  var confirmDeleteMessage: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.confirmDeleteTitle */
  var confirmDeleteTitle: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.deleteRow */
  var deleteRow: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.editRow */
  var editRow: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.saveAllChanges */
  var saveAllChanges: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.saveRowChanges */
  var saveRowChanges: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.undeleteRow */
  var undeleteRow: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing.texts.validationCancelChanges */
  var validationCancelChanges: js.UndefOr[String] = js.undefined
}

object GridBaseEditingTexts {
  @scala.inline
  def apply(
    addRow: String = null,
    cancelAllChanges: String = null,
    cancelRowChanges: String = null,
    confirmDeleteMessage: String = null,
    confirmDeleteTitle: String = null,
    deleteRow: String = null,
    editRow: String = null,
    saveAllChanges: String = null,
    saveRowChanges: String = null,
    undeleteRow: String = null,
    validationCancelChanges: String = null
  ): GridBaseEditingTexts = {
    val __obj = js.Dynamic.literal()
    if (addRow != null) __obj.updateDynamic("addRow")(addRow.asInstanceOf[js.Any])
    if (cancelAllChanges != null) __obj.updateDynamic("cancelAllChanges")(cancelAllChanges.asInstanceOf[js.Any])
    if (cancelRowChanges != null) __obj.updateDynamic("cancelRowChanges")(cancelRowChanges.asInstanceOf[js.Any])
    if (confirmDeleteMessage != null) __obj.updateDynamic("confirmDeleteMessage")(confirmDeleteMessage.asInstanceOf[js.Any])
    if (confirmDeleteTitle != null) __obj.updateDynamic("confirmDeleteTitle")(confirmDeleteTitle.asInstanceOf[js.Any])
    if (deleteRow != null) __obj.updateDynamic("deleteRow")(deleteRow.asInstanceOf[js.Any])
    if (editRow != null) __obj.updateDynamic("editRow")(editRow.asInstanceOf[js.Any])
    if (saveAllChanges != null) __obj.updateDynamic("saveAllChanges")(saveAllChanges.asInstanceOf[js.Any])
    if (saveRowChanges != null) __obj.updateDynamic("saveRowChanges")(saveRowChanges.asInstanceOf[js.Any])
    if (undeleteRow != null) __obj.updateDynamic("undeleteRow")(undeleteRow.asInstanceOf[js.Any])
    if (validationCancelChanges != null) __obj.updateDynamic("validationCancelChanges")(validationCancelChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseEditingTexts]
  }
}

