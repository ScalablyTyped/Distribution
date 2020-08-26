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
  def apply(): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceContext]
  }
  @scala.inline
  implicit class SchemaSourceContextOps[Self <: SchemaSourceContext] (val x: Self) extends AnyVal {
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
    def setCloudRepo(value: SchemaCloudRepoSourceContext): Self = this.set("cloudRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudRepo: Self = this.set("cloudRepo", js.undefined)
    @scala.inline
    def setCloudWorkspace(value: SchemaCloudWorkspaceSourceContext): Self = this.set("cloudWorkspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWorkspace: Self = this.set("cloudWorkspace", js.undefined)
    @scala.inline
    def setGerrit(value: SchemaGerritSourceContext): Self = this.set("gerrit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGerrit: Self = this.set("gerrit", js.undefined)
    @scala.inline
    def setGit(value: SchemaGitSourceContext): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
  }
  
}

