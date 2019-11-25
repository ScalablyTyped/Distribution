package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudRepoSourceContext extends js.Object {
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.undefined
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[String] = js.undefined
  /** The ID of the repo. */
  var repoId: js.UndefOr[RepoId] = js.undefined
  /** A revision ID. */
  var revisionId: js.UndefOr[String] = js.undefined
}

object CloudRepoSourceContext {
  @scala.inline
  def apply(
    aliasContext: AliasContext = null,
    aliasName: String = null,
    repoId: RepoId = null,
    revisionId: String = null
  ): CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext.asInstanceOf[js.Any])
    if (aliasName != null) __obj.updateDynamic("aliasName")(aliasName.asInstanceOf[js.Any])
    if (repoId != null) __obj.updateDynamic("repoId")(repoId.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudRepoSourceContext]
  }
}

