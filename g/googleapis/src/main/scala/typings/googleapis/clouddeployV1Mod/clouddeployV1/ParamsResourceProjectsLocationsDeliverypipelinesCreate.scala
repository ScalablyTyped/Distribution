package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDeliverypipelinesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the `DeliveryPipeline`.
    */
  var deliveryPipelineId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent collection in which the `DeliveryPipeline` should be created. Format should be projects/{project_id\}/locations/{location_name\}.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeliveryPipeline] = js.undefined
  
  /**
    * Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If set to true, the request is validated and the user is provided with an expected result, but no actual change is made.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsDeliverypipelinesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDeliverypipelinesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDeliverypipelinesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDeliverypipelinesCreate](x: Self) {
    
    inline def setDeliveryPipelineId(value: String): Self = StObject.set(x, "deliveryPipelineId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPipelineIdUndefined: Self = StObject.set(x, "deliveryPipelineId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDeliveryPipeline): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
