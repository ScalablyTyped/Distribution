package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudRepoSourceContext extends js.Object {
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.undefined
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the repo. */
  var repoId: js.UndefOr[RepoId] = js.undefined
  /** A revision ID. */
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
}

object CloudRepoSourceContext {
  @scala.inline
  def apply(
    aliasContext: AliasContext = null,
    aliasName: java.lang.String = null,
    repoId: RepoId = null,
    revisionId: java.lang.String = null
  ): CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext)
    if (aliasName != null) __obj.updateDynamic("aliasName")(aliasName)
    if (repoId != null) __obj.updateDynamic("repoId")(repoId)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    __obj.asInstanceOf[CloudRepoSourceContext]
  }
}

