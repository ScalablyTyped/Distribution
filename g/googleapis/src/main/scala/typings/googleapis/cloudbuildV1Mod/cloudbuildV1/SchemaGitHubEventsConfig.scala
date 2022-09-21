package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGitHubEventsConfig extends StObject {
  
  /**
    * Optional. The resource name of the github enterprise config that should be applied to this installation. For example: "projects/{$project_id\}/githubEnterpriseConfigs/{$config_id\}"
    */
  var enterpriseConfigResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The installationID that emits the GitHub event.
    */
  var installationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is "cloud-builders".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform".
    */
  var owner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * filter to match changes in pull requests.
    */
  var pullRequest: js.UndefOr[SchemaPullRequestFilter] = js.undefined
  
  /**
    * filter to match changes in refs like branches, tags.
    */
  var push: js.UndefOr[SchemaPushFilter] = js.undefined
}
object SchemaGitHubEventsConfig {
  
  inline def apply(): SchemaGitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitHubEventsConfig]
  }
  
  extension [Self <: SchemaGitHubEventsConfig](x: Self) {
    
    inline def setEnterpriseConfigResourceName(value: String): Self = StObject.set(x, "enterpriseConfigResourceName", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseConfigResourceNameNull: Self = StObject.set(x, "enterpriseConfigResourceName", null)
    
    inline def setEnterpriseConfigResourceNameUndefined: Self = StObject.set(x, "enterpriseConfigResourceName", js.undefined)
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setInstallationIdNull: Self = StObject.set(x, "installationId", null)
    
    inline def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPullRequest(value: SchemaPullRequestFilter): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    
    inline def setPush(value: SchemaPushFilter): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}
