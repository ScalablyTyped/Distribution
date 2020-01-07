package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data describing the type and additional information of an action.
  */
@js.native
trait Schema$ActionDetail extends js.Object {
  /**
    * A change about comments was made.
    */
  var comment: js.UndefOr[Schema$Comment] = js.native
  /**
    * An object was created.
    */
  var create: js.UndefOr[Schema$Create] = js.native
  /**
    * An object was deleted.
    */
  var delete: js.UndefOr[Schema$Delete] = js.native
  /**
    * A change happened in data leak prevention status.
    */
  var dlpChange: js.UndefOr[Schema$DataLeakPreventionChange] = js.native
  /**
    * An object was edited.
    */
  var edit: js.UndefOr[Schema$Edit] = js.native
  /**
    * An object was moved.
    */
  var move: js.UndefOr[Schema$Move] = js.native
  /**
    * The permission on an object was changed.
    */
  var permissionChange: js.UndefOr[Schema$PermissionChange] = js.native
  /**
    * An object was referenced in an application outside of Drive/Docs.
    */
  var reference: js.UndefOr[Schema$ApplicationReference] = js.native
  /**
    * An object was renamed.
    */
  var rename: js.UndefOr[Schema$Rename] = js.native
  /**
    * A deleted object was restored.
    */
  var restore: js.UndefOr[Schema$Restore] = js.native
  /**
    * Settings were changed.
    */
  var settingsChange: js.UndefOr[Schema$SettingsChange] = js.native
}

object Schema$ActionDetail {
  @scala.inline
  def apply(
    comment: Schema$Comment = null,
    create: Schema$Create = null,
    delete: Schema$Delete = null,
    dlpChange: Schema$DataLeakPreventionChange = null,
    edit: Schema$Edit = null,
    move: Schema$Move = null,
    permissionChange: Schema$PermissionChange = null,
    reference: Schema$ApplicationReference = null,
    rename: Schema$Rename = null,
    restore: Schema$Restore = null,
    settingsChange: Schema$SettingsChange = null
  ): Schema$ActionDetail = {
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
    __obj.asInstanceOf[Schema$ActionDetail]
  }
}

