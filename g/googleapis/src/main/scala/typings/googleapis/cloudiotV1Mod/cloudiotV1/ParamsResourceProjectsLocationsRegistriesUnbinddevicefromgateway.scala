package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUnbindDeviceFromGatewayRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaUnbindDeviceFromGatewayRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
