package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGitFileSource extends StObject {
  
  /**
    * The full resource name of the bitbucket server config. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{id\}`.
    */
  var bitbucketServerConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of the github enterprise config. Format: `projects/{project\}/locations/{location\}/githubEnterpriseConfigs/{id\}`. `projects/{project\}/githubEnterpriseConfigs/{id\}`.
    */
  var githubEnterpriseConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path of the file, with the repo root as the root of the path.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See RepoType above.
    */
  var repoType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
    */
  var revision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the repo. Either uri or repository can be specified. If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGitFileSource {
  
  inline def apply(): SchemaGitFileSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitFileSource]
  }
  
  extension [Self <: SchemaGitFileSource](x: Self) {
    
    inline def setBitbucketServerConfig(value: String): Self = StObject.set(x, "bitbucketServerConfig", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigNull: Self = StObject.set(x, "bitbucketServerConfig", null)
    
    inline def setBitbucketServerConfigUndefined: Self = StObject.set(x, "bitbucketServerConfig", js.undefined)
    
    inline def setGithubEnterpriseConfig(value: String): Self = StObject.set(x, "githubEnterpriseConfig", value.asInstanceOf[js.Any])
    
    inline def setGithubEnterpriseConfigNull: Self = StObject.set(x, "githubEnterpriseConfig", null)
    
    inline def setGithubEnterpriseConfigUndefined: Self = StObject.set(x, "githubEnterpriseConfig", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRepoType(value: String): Self = StObject.set(x, "repoType", value.asInstanceOf[js.Any])
    
    inline def setRepoTypeNull: Self = StObject.set(x, "repoType", null)
    
    inline def setRepoTypeUndefined: Self = StObject.set(x, "repoType", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
