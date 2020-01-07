package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudWorkspaceSourceContext denotes a workspace at a particular snapshot.
  */
@js.native
trait Schema$CloudWorkspaceSourceContext extends js.Object {
  /**
    * The ID of the snapshot. An empty snapshot_id refers to the most recent
    * snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.native
  /**
    * The ID of the workspace.
    */
  var workspaceId: js.UndefOr[Schema$CloudWorkspaceId] = js.native
}

object Schema$CloudWorkspaceSourceContext {
  @scala.inline
  def apply(snapshotId: String = null, workspaceId: Schema$CloudWorkspaceId = null): Schema$CloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudWorkspaceSourceContext]
  }
}

