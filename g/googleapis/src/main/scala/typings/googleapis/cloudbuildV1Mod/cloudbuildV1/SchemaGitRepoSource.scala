package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGitRepoSource extends StObject {
  
  /**
    * The full resource name of the bitbucket server config. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{id\}`.
    */
  var bitbucketServerConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of the github enterprise config. Format: `projects/{project\}/locations/{location\}/githubEnterpriseConfigs/{id\}`. `projects/{project\}/githubEnterpriseConfigs/{id\}`.
    */
  var githubEnterpriseConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The branch or tag to use. Must start with "refs/" (required).
    */
  var ref: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See RepoType below.
    */
  var repoType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the repo. Either uri or repository can be specified and is required.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGitRepoSource {
  
  inline def apply(): SchemaGitRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitRepoSource]
  }
  
  extension [Self <: SchemaGitRepoSource](x: Self) {
    
    inline def setBitbucketServerConfig(value: String): Self = StObject.set(x, "bitbucketServerConfig", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigNull: Self = StObject.set(x, "bitbucketServerConfig", null)
    
    inline def setBitbucketServerConfigUndefined: Self = StObject.set(x, "bitbucketServerConfig", js.undefined)
    
    inline def setGithubEnterpriseConfig(value: String): Self = StObject.set(x, "githubEnterpriseConfig", value.asInstanceOf[js.Any])
    
    inline def setGithubEnterpriseConfigNull: Self = StObject.set(x, "githubEnterpriseConfig", null)
    
    inline def setGithubEnterpriseConfigUndefined: Self = StObject.set(x, "githubEnterpriseConfig", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepoType(value: String): Self = StObject.set(x, "repoType", value.asInstanceOf[js.Any])
    
    inline def setRepoTypeNull: Self = StObject.set(x, "repoType", null)
    
    inline def setRepoTypeUndefined: Self = StObject.set(x, "repoType", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
