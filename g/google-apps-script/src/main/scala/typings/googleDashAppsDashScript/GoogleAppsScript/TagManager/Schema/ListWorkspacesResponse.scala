package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkspacesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var workspace: js.UndefOr[js.Array[Workspace]] = js.undefined
}

object ListWorkspacesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, workspace: js.Array[Workspace] = null): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
}

