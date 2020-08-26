package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWorkspaceId extends js.Object {
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API's CreateWorkspace method.
    */
  var name: js.UndefOr[String] = js.native
  /** The ID of the repo containing the workspace. */
  var repoId: js.UndefOr[RepoId] = js.native
}

object CloudWorkspaceId {
  @scala.inline
  def apply(): CloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceId]
  }
  @scala.inline
  implicit class CloudWorkspaceIdOps[Self <: CloudWorkspaceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRepoId(value: RepoId): Self = this.set("repoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepoId: Self = this.set("repoId", js.undefined)
  }
  
}

