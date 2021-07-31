package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
trait SchemaSourceContext extends StObject {
  
  /**
    * A SourceContext referring to a revision in a cloud repo.
    */
  var cloudRepo: js.UndefOr[SchemaCloudRepoSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to a snapshot in a cloud workspace.
    */
  var cloudWorkspace: js.UndefOr[SchemaCloudWorkspaceSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGerritSourceContext] = js.undefined
  
  /**
    * A SourceContext referring to any third party Git repo (e.g. GitHub).
    */
  var git: js.UndefOr[SchemaGitSourceContext] = js.undefined
}
object SchemaSourceContext {
  
  @scala.inline
  def apply(): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceContext]
  }
  
  @scala.inline
  implicit class SchemaSourceContextMutableBuilder[Self <: SchemaSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudRepo(value: SchemaCloudRepoSourceContext): Self = StObject.set(x, "cloudRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRepoUndefined: Self = StObject.set(x, "cloudRepo", js.undefined)
    
    @scala.inline
    def setCloudWorkspace(value: SchemaCloudWorkspaceSourceContext): Self = StObject.set(x, "cloudWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWorkspaceUndefined: Self = StObject.set(x, "cloudWorkspace", js.undefined)
    
    @scala.inline
    def setGerrit(value: SchemaGerritSourceContext): Self = StObject.set(x, "gerrit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGerritUndefined: Self = StObject.set(x, "gerrit", js.undefined)
    
    @scala.inline
    def setGit(value: SchemaGitSourceContext): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
  }
}
