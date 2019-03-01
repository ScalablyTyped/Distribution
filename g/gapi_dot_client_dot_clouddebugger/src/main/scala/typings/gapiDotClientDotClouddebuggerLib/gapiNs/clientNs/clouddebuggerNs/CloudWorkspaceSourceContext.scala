package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWorkspaceSourceContext extends js.Object {
  /**
    * The ID of the snapshot.
    * An empty snapshot_id refers to the most recent snapshot.
    */
  var snapshotId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the workspace. */
  var workspaceId: js.UndefOr[CloudWorkspaceId] = js.undefined
}

object CloudWorkspaceSourceContext {
  @scala.inline
  def apply(snapshotId: java.lang.String = null, workspaceId: CloudWorkspaceId = null): CloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[CloudWorkspaceSourceContext]
  }
}

