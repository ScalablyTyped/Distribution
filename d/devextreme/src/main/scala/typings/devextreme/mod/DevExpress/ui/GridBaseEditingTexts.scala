package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseEditingTexts extends js.Object {
  /** Specifies text for a hint that appears when a user pauses on the global "Add" button. Applies only if editing.allowAdding is true. */
  var addRow: js.UndefOr[String] = js.undefined
  /** Specifies text for a hint that appears when a user pauses on the "Discard" button. Applies only if editing.mode is "batch". */
  var cancelAllChanges: js.UndefOr[String] = js.undefined
  /** Specifies text for a button that cancels changes in a row. Applies only if editing.allowUpdating is true and editing.mode is "row". */
  var cancelRowChanges: js.UndefOr[String] = js.undefined
  /** Specifies a message that prompts a user to confirm deletion. */
  var confirmDeleteMessage: js.UndefOr[String] = js.undefined
  /** Specifies a title for the window that asks a user to confirm deletion. */
  var confirmDeleteTitle: js.UndefOr[String] = js.undefined
  /** Specifies text for buttons that delete rows. Applies only if allowDeleting is true. */
  var deleteRow: js.UndefOr[String] = js.undefined
  /** Specifies text for buttons that switch rows into the editing state. Applies only if allowUpdating is true. */
  var editRow: js.UndefOr[String] = js.undefined
  /** Specifies text for a hint that appears when a user pauses on the global "Save" button. Applies only if editing.mode is "batch". */
  var saveAllChanges: js.UndefOr[String] = js.undefined
  /** Specifies text for a button that saves changes made in a row. Applies only if allowUpdating is true. */
  var saveRowChanges: js.UndefOr[String] = js.undefined
  /** Specifies text for buttons that recover deleted rows. Applies only if allowDeleting is true and editing.mode is "batch". */
  var undeleteRow: js.UndefOr[String] = js.undefined
  /** Specifies text for a hint appearing when a user pauses on the button that cancels changes in a cell. Applies only if editing.mode is "cell" and data validation is enabled. */
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

