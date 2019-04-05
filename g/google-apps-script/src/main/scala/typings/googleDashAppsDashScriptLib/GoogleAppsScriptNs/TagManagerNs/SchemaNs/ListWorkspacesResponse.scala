package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkspacesResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var workspace: js.UndefOr[js.Array[Workspace]] = js.undefined
}

object ListWorkspacesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, workspace: js.Array[Workspace] = null): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
}

