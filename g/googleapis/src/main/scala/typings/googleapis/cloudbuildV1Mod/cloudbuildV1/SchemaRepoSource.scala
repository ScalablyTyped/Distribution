package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of the source in a Google Cloud Source Repository.
  */
@js.native
trait SchemaRepoSource extends StObject {
  
  /**
    * Name of the branch to build.
    */
  var branchName: js.UndefOr[String] = js.native
  
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String] = js.native
  
  /**
    * Directory, relative to the source root, in which to run the build.  This
    * must be a relative path. If a step&#39;s `dir` is specified and is an
    * absolute path, this value is ignored for that step&#39;s execution.
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * ID of the project that owns the Cloud Source Repository. If omitted, the
    * project ID requesting the build is assumed.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Name of the Cloud Source Repository. If omitted, the name
    * &quot;default&quot; is assumed.
    */
  var repoName: js.UndefOr[String] = js.native
  
  /**
    * Name of the tag to build.
    */
  var tagName: js.UndefOr[String] = js.native
}
object SchemaRepoSource {
  
  @scala.inline
  def apply(): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoSource]
  }
  
  @scala.inline
  implicit class SchemaRepoSourceMutableBuilder[Self <: SchemaRepoSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    @scala.inline
    def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitShaUndefined: Self = StObject.set(x, "commitSha", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
