package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBuildsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the build.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the `Build` to retrieve. Format: `projects/{project\}/locations/{location\}/builds/{build\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBuildsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsBuildsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBuildsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBuildsGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
