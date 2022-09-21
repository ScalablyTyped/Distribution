package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateGitHubEnterpriseConfigOperationMetadata extends StObject {
  
  /**
    * Time the operation was completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the GitHubEnterprise to be created. Format: `projects/{project\}/locations/{location\}/githubEnterpriseConfigs/{id\}`.
    */
  var githubEnterpriseConfig: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateGitHubEnterpriseConfigOperationMetadata {
  
  inline def apply(): SchemaCreateGitHubEnterpriseConfigOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateGitHubEnterpriseConfigOperationMetadata]
  }
  
  extension [Self <: SchemaCreateGitHubEnterpriseConfigOperationMetadata](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setGithubEnterpriseConfig(value: String): Self = StObject.set(x, "githubEnterpriseConfig", value.asInstanceOf[js.Any])
    
    inline def setGithubEnterpriseConfigNull: Self = StObject.set(x, "githubEnterpriseConfig", null)
    
    inline def setGithubEnterpriseConfigUndefined: Self = StObject.set(x, "githubEnterpriseConfig", js.undefined)
  }
}
