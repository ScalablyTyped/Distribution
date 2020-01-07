package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of workspaces in a container.
  */
@js.native
trait Schema$ListWorkspacesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All Workspaces of a GTM Container.
    */
  var workspace: js.UndefOr[js.Array[Schema$Workspace]] = js.native
}

object Schema$ListWorkspacesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, workspace: js.Array[Schema$Workspace] = null): Schema$ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListWorkspacesResponse]
  }
}

