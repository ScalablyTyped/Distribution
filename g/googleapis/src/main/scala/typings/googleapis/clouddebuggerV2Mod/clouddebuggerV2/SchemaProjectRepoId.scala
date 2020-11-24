package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Selects a repo using a Google Cloud Platform project ID (e.g.
  * winged-cargo-31) and a repo name within that project.
  */
@js.native
trait SchemaProjectRepoId extends js.Object {
  
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String] = js.native
}
object SchemaProjectRepoId {
  
  @scala.inline
  def apply(): SchemaProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectRepoId]
  }
  
  @scala.inline
  implicit class SchemaProjectRepoIdOps[Self <: SchemaProjectRepoId] (val x: Self) extends AnyVal {
    
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
