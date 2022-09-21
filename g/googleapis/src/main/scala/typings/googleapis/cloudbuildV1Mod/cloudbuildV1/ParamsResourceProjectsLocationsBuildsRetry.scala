package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBuildsRetry
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the `Build` to retry. Format: `projects/{project\}/locations/{location\}/builds/{build\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRetryBuildRequest] = js.undefined
}
object ParamsResourceProjectsLocationsBuildsRetry {
  
  inline def apply(): ParamsResourceProjectsLocationsBuildsRetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBuildsRetry]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBuildsRetry](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRetryBuildRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
