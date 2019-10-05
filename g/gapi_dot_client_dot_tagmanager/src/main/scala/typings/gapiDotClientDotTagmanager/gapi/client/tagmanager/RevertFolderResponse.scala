package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertFolderResponse extends js.Object {
  /**
    * Folder as it appears in the latest container version since the last workspace synchronization operation. If no folder is present, that means the folder
    * was deleted in the latest container version.
    */
  var folder: js.UndefOr[Folder] = js.undefined
}

object RevertFolderResponse {
  @scala.inline
  def apply(folder: Folder = null): RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder)
    __obj.asInstanceOf[RevertFolderResponse]
  }
}

