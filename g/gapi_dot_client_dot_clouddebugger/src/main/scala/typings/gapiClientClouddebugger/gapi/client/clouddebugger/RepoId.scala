package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoId extends js.Object {
  /** A combination of a project ID and a repo name. */
  var projectRepoId: js.UndefOr[ProjectRepoId] = js.undefined
  /** A server-assigned, globally unique identifier. */
  var uid: js.UndefOr[String] = js.undefined
}

object RepoId {
  @scala.inline
  def apply(projectRepoId: ProjectRepoId = null, uid: String = null): RepoId = {
    val __obj = js.Dynamic.literal()
    if (projectRepoId != null) __obj.updateDynamic("projectRepoId")(projectRepoId.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoId]
  }
}

