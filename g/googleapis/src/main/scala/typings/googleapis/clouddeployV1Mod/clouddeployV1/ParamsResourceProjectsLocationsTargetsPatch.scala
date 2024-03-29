package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTargetsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. If set to true, updating a `Target` that does not exist will result in the creation of a new `Target`.
    */
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Name of the `Target`. Format is projects/{project\}/locations/{location\}/targets/a-z{0,62\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTarget] = js.undefined
  
  /**
    * Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Field mask is used to specify the fields to be overwritten in the Target resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsTargetsPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsTargetsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTargetsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTargetsPatch](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaTarget): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
