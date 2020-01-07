package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting folder changes in a workspace.
  */
@js.native
trait Schema$RevertFolderResponse extends js.Object {
  /**
    * Folder as it appears in the latest container version since the last
    * workspace synchronization operation. If no folder is present, that means
    * the folder was deleted in the latest container version.
    */
  var folder: js.UndefOr[Schema$Folder] = js.native
}

object Schema$RevertFolderResponse {
  @scala.inline
  def apply(folder: Schema$Folder = null): Schema$RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevertFolderResponse]
  }
}

