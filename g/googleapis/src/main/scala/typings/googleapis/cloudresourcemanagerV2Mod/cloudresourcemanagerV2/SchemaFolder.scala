package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Folder in an Organization&#39;s resource hierarchy, used to organize that
  * Organization&#39;s resources.
  */
@js.native
trait SchemaFolder extends js.Object {
  /**
    * Output only. Timestamp when the Folder was created. Assigned by the
    * server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The folder’s display name. A folder’s display name must be unique amongst
    * its siblings, e.g. no two folders with the same parent can share the same
    * display name. The display name must start and end with a letter or digit,
    * may contain letters, digits, spaces, hyphens and underscores and can be
    * no longer than 30 characters. This is captured by the regular expression:
    * [\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only.  The lifecycle state of the folder. Updates to the
    * lifecycle_state must be performed via DeleteFolder and UndeleteFolder.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the Folder. Its format is
    * `folders/{folder_id}`, for example: &quot;folders/1234&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Folder’s parent&#39;s resource name. Updates to the folder&#39;s
    * parent must be performed via MoveFolder.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaFolder {
  @scala.inline
  def apply(
    createTime: String = null,
    displayName: String = null,
    lifecycleState: String = null,
    name: String = null,
    parent: String = null
  ): SchemaFolder = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (lifecycleState != null) __obj.updateDynamic("lifecycleState")(lifecycleState.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFolder]
  }
}

