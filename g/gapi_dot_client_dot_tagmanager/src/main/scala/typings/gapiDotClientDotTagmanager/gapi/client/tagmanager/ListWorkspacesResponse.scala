package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkspacesResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** All Workspaces of a GTM Container. */
  var workspace: js.UndefOr[js.Array[Workspace]] = js.undefined
}

object ListWorkspacesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, workspace: js.Array[Workspace] = null): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
}

