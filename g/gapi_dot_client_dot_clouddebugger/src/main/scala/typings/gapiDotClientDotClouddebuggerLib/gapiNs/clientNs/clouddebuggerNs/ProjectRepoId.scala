package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectRepoId extends js.Object {
  /** The ID of the project. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the repo. Leave empty for the default repo. */
  var repoName: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectRepoId {
  @scala.inline
  def apply(projectId: java.lang.String = null, repoName: java.lang.String = null): ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (repoName != null) __obj.updateDynamic("repoName")(repoName)
    __obj.asInstanceOf[ProjectRepoId]
  }
}

