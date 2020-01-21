package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWorkspaceSourceContext extends js.Object {
  /**
    * The ID of the snapshot.
    * An empty snapshot_id refers to the most recent snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.undefined
  /** The ID of the workspace. */
  var workspaceId: js.UndefOr[CloudWorkspaceId] = js.undefined
}

object CloudWorkspaceSourceContext {
  @scala.inline
  def apply(snapshotId: String = null, workspaceId: CloudWorkspaceId = null): CloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWorkspaceSourceContext]
  }
}

