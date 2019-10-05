package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWorkspaceId extends js.Object {
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API's CreateWorkspace method.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The ID of the repo containing the workspace. */
  var repoId: js.UndefOr[RepoId] = js.undefined
}

object CloudWorkspaceId {
  @scala.inline
  def apply(name: String = null, repoId: RepoId = null): CloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (repoId != null) __obj.updateDynamic("repoId")(repoId)
    __obj.asInstanceOf[CloudWorkspaceId]
  }
}

