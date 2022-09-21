package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGithubenterpriseconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Unique identifier of the `GitHubEnterpriseConfig`
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * This field should contain the name of the enterprise config resource. For example: "projects/{$project_id\}/githubEnterpriseConfigs/{$config_id\}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGithubenterpriseconfigsGet {
  
  inline def apply(): ParamsResourceProjectsGithubenterpriseconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGithubenterpriseconfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsGithubenterpriseconfigsGet](x: Self) {
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
