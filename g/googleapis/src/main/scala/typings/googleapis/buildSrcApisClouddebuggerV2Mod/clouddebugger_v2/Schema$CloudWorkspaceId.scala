package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudWorkspaceId is a unique identifier for a cloud workspace. A cloud
  * workspace is a place associated with a repo where modified files can be
  * stored before they are committed.
  */
@js.native
trait Schema$CloudWorkspaceId extends js.Object {
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API&#39;s CreateWorkspace method.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the repo containing the workspace.
    */
  var repoId: js.UndefOr[Schema$RepoId] = js.native
}

object Schema$CloudWorkspaceId {
  @scala.inline
  def apply(name: String = null, repoId: Schema$RepoId = null): Schema$CloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (repoId != null) __obj.updateDynamic("repoId")(repoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudWorkspaceId]
  }
}

