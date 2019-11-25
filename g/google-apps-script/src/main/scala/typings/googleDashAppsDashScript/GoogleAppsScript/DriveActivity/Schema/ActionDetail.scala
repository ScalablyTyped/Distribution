package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDetail extends js.Object {
  var comment: js.UndefOr[Comment] = js.undefined
  var create: js.UndefOr[Create] = js.undefined
  var delete: js.UndefOr[Delete] = js.undefined
  var dlpChange: js.UndefOr[DataLeakPreventionChange] = js.undefined
  var edit: js.UndefOr[js.Any] = js.undefined
  var move: js.UndefOr[Move] = js.undefined
  var permissionChange: js.UndefOr[PermissionChange] = js.undefined
  var reference: js.UndefOr[ApplicationReference] = js.undefined
  var rename: js.UndefOr[Rename] = js.undefined
  var restore: js.UndefOr[Restore] = js.undefined
  var settingsChange: js.UndefOr[SettingsChange] = js.undefined
}

object ActionDetail {
  @scala.inline
  def apply(
    comment: Comment = null,
    create: Create = null,
    delete: Delete = null,
    dlpChange: DataLeakPreventionChange = null,
    edit: js.Any = null,
    move: Move = null,
    permissionChange: PermissionChange = null,
    reference: ApplicationReference = null,
    rename: Rename = null,
    restore: Restore = null,
    settingsChange: SettingsChange = null
  ): ActionDetail = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (dlpChange != null) __obj.updateDynamic("dlpChange")(dlpChange.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (permissionChange != null) __obj.updateDynamic("permissionChange")(permissionChange.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (restore != null) __obj.updateDynamic("restore")(restore.asInstanceOf[js.Any])
    if (settingsChange != null) __obj.updateDynamic("settingsChange")(settingsChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDetail]
  }
}

