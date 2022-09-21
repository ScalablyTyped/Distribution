package typings.googleapis.cloudfunctionsV1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFunctionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project and location in which the function should be created, specified in the format `projects/x/locations/x`
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCloudFunction] = js.undefined
}
object ParamsResourceProjectsLocationsFunctionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsFunctionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFunctionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFunctionsCreate](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequestBody(value: SchemaCloudFunction): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
