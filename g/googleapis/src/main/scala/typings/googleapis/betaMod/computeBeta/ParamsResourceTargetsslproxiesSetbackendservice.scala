package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetsslproxiesSetbackendservice
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTargetSslProxiesSetBackendServiceRequest] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetSslProxy resource whose BackendService resource is to be set.
    */
  var targetSslProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetsslproxiesSetbackendservice {
  
  inline def apply(): ParamsResourceTargetsslproxiesSetbackendservice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetsslproxiesSetbackendservice]
  }
  
  extension [Self <: ParamsResourceTargetsslproxiesSetbackendservice](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaTargetSslProxiesSetBackendServiceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTargetSslProxy(value: String): Self = StObject.set(x, "targetSslProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetSslProxyUndefined: Self = StObject.set(x, "targetSslProxy", js.undefined)
  }
}
