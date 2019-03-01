package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceContext extends js.Object {
  /** A SourceContext referring to a revision in a cloud repo. */
  var cloudRepo: js.UndefOr[CloudRepoSourceContext] = js.undefined
  /** A SourceContext referring to a snapshot in a cloud workspace. */
  var cloudWorkspace: js.UndefOr[CloudWorkspaceSourceContext] = js.undefined
  /** A SourceContext referring to a Gerrit project. */
  var gerrit: js.UndefOr[GerritSourceContext] = js.undefined
  /** A SourceContext referring to any third party Git repo (e.g. GitHub). */
  var git: js.UndefOr[GitSourceContext] = js.undefined
}

object SourceContext {
  @scala.inline
  def apply(
    cloudRepo: CloudRepoSourceContext = null,
    cloudWorkspace: CloudWorkspaceSourceContext = null,
    gerrit: GerritSourceContext = null,
    git: GitSourceContext = null
  ): SourceContext = {
    val __obj = js.Dynamic.literal()
    if (cloudRepo != null) __obj.updateDynamic("cloudRepo")(cloudRepo)
    if (cloudWorkspace != null) __obj.updateDynamic("cloudWorkspace")(cloudWorkspace)
    if (gerrit != null) __obj.updateDynamic("gerrit")(gerrit)
    if (git != null) __obj.updateDynamic("git")(git)
    __obj.asInstanceOf[SourceContext]
  }
}

