package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGithubenterpriseconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The ID to use for the GithubEnterpriseConfig, which will become the final component of the GithubEnterpriseConfig's resource name. ghe_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character
    */
  var gheConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the parent project. For example: projects/{$project_number\} or projects/{$project_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGitHubEnterpriseConfig] = js.undefined
}
object ParamsResourceProjectsGithubenterpriseconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsGithubenterpriseconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGithubenterpriseconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsGithubenterpriseconfigsCreate](x: Self) {
    
    inline def setGheConfigId(value: String): Self = StObject.set(x, "gheConfigId", value.asInstanceOf[js.Any])
    
    inline def setGheConfigIdUndefined: Self = StObject.set(x, "gheConfigId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaGitHubEnterpriseConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
