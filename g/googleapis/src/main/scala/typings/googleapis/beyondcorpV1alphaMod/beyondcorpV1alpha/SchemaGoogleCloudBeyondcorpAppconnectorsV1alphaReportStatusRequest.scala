package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaReportStatusRequest extends StObject {
  
  /**
    * Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Resource info of the connector.
    */
  var resourceInfo: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResourceInfo] = js.undefined
  
  /**
    * Optional. If set, validates request by executing a dry-run which would not alter the resource in any way.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaReportStatusRequest {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaReportStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaReportStatusRequest]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaReportStatusRequest](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setResourceInfo(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResourceInfo): Self = StObject.set(x, "resourceInfo", value.asInstanceOf[js.Any])
    
    inline def setResourceInfoUndefined: Self = StObject.set(x, "resourceInfo", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
