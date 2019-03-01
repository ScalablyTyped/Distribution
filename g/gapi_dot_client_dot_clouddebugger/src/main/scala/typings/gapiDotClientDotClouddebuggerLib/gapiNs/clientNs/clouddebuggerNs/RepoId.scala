package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoId extends js.Object {
  /** A combination of a project ID and a repo name. */
  var projectRepoId: js.UndefOr[ProjectRepoId] = js.undefined
  /** A server-assigned, globally unique identifier. */
  var uid: js.UndefOr[java.lang.String] = js.undefined
}

object RepoId {
  @scala.inline
  def apply(projectRepoId: ProjectRepoId = null, uid: java.lang.String = null): RepoId = {
    val __obj = js.Dynamic.literal()
    if (projectRepoId != null) __obj.updateDynamic("projectRepoId")(projectRepoId)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[RepoId]
  }
}

