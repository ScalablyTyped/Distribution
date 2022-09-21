package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Identifier to assign to the API. Must be unique within scope of the parent resource.
    */
  var apiId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of the API, of the form: `projects/x/locations/global`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApigatewayApi] = js.undefined
}
object ParamsResourceProjectsLocationsApisCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsApisCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisCreate](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaApigatewayApi): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
