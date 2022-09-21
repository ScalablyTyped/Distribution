package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisConfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Identifier to assign to the API Config. Must be unique within scope of the parent resource.
    */
  var apiConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of the API Config, of the form: `projects/x/locations/global/apis/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApigatewayApiConfig] = js.undefined
}
object ParamsResourceProjectsLocationsApisConfigsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsApisConfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisConfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisConfigsCreate](x: Self) {
    
    inline def setApiConfigId(value: String): Self = StObject.set(x, "apiConfigId", value.asInstanceOf[js.Any])
    
    inline def setApiConfigIdUndefined: Self = StObject.set(x, "apiConfigId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaApigatewayApiConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
