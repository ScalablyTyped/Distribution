package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
@js.native
trait SchemaSourceContext extends js.Object {
  /**
    * A SourceContext referring to a revision in a cloud repo.
    */
  var cloudRepo: js.UndefOr[SchemaCloudRepoSourceContext] = js.native
  /**
    * A SourceContext referring to a snapshot in a cloud workspace.
    */
  var cloudWorkspace: js.UndefOr[SchemaCloudWorkspaceSourceContext] = js.native
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGerritSourceContext] = js.native
  /**
    * A SourceContext referring to any third party Git repo (e.g. GitHub).
    */
  var git: js.UndefOr[SchemaGitSourceContext] = js.native
}

object SchemaSourceContext {
  @scala.inline
  def apply(
    cloudRepo: SchemaCloudRepoSourceContext = null,
    cloudWorkspace: SchemaCloudWorkspaceSourceContext = null,
    gerrit: SchemaGerritSourceContext = null,
    git: SchemaGitSourceContext = null
  ): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    if (cloudRepo != null) __obj.updateDynamic("cloudRepo")(cloudRepo.asInstanceOf[js.Any])
    if (cloudWorkspace != null) __obj.updateDynamic("cloudWorkspace")(cloudWorkspace.asInstanceOf[js.Any])
    if (gerrit != null) __obj.updateDynamic("gerrit")(gerrit.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceContext]
  }
}

