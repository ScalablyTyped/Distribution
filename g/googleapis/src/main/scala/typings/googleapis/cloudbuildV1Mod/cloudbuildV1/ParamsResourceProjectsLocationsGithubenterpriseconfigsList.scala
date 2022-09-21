package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGithubenterpriseconfigsList
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the parent project. For example: projects/{$project_number\} or projects/{$project_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGithubenterpriseconfigsList {
  
  inline def apply(): ParamsResourceProjectsLocationsGithubenterpriseconfigsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGithubenterpriseconfigsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGithubenterpriseconfigsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
