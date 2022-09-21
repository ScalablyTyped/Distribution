package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGatewaysCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Identifier to assign to the Gateway. Must be unique within scope of the parent resource.
    */
  var gatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of the Gateway, of the form: `projects/x/locations/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApigatewayGateway] = js.undefined
}
object ParamsResourceProjectsLocationsGatewaysCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsGatewaysCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGatewaysCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGatewaysCreate](x: Self) {
    
    inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaApigatewayGateway): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
