package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectRepoId extends js.Object {
  /** The ID of the project. */
  var projectId: js.UndefOr[String] = js.native
  /** The name of the repo. Leave empty for the default repo. */
  var repoName: js.UndefOr[String] = js.native
}

object ProjectRepoId {
  @scala.inline
  def apply(): ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectRepoId]
  }
  @scala.inline
  implicit class ProjectRepoIdOps[Self <: ProjectRepoId] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRepoName(value: String): Self = this.set("repoName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepoName: Self = this.set("repoName", js.undefined)
  }
  
}

