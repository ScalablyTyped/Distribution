package typings.googleapis.cloudfunctionsV2Mod.cloudfunctionsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepoSource extends StObject {
  
  /**
    * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
    */
  var branchName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for that step's execution. eg. helloworld (no leading slash allowed)
    */
  var dir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only trigger a build if the revision regex does NOT match the revision regex.
    */
  var invertRegex: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the Cloud Source Repository.
    */
  var repoName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
    */
  var tagName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepoSource {
  
  inline def apply(): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoSource]
  }
  
  extension [Self <: SchemaRepoSource](x: Self) {
    
    inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameNull: Self = StObject.set(x, "branchName", null)
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
    
    inline def setCommitShaNull: Self = StObject.set(x, "commitSha", null)
    
    inline def setCommitShaUndefined: Self = StObject.set(x, "commitSha", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirNull: Self = StObject.set(x, "dir", null)
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    inline def setInvertRegexNull: Self = StObject.set(x, "invertRegex", null)
    
    inline def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    inline def setRepoNameNull: Self = StObject.set(x, "repoName", null)
    
    inline def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameNull: Self = StObject.set(x, "tagName", null)
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
