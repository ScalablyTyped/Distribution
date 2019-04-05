package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertFolderResponse extends js.Object {
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

