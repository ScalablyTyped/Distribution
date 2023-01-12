package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  var ENDPOINT_API_D3S: String
  
  var ENDPOINT_API_DERIVATIVE_SERVICE_V2: String
  
  var ENDPOINT_API_DERIVATIVE_STREAMING: String
  
  var ENDPOINT_API_FLUENT: String
  
  var ENDPOINT_API_MODEL_DERIVATIVE_V2: String
  
  def getApiEndpoint(): String
  
  def getEndpointAndApi(): String
  
  def setEndpointAndApi(endpoint: String, api: String): Unit
}
object Endpoint {
  
  inline def apply(
    ENDPOINT_API_D3S: String,
    ENDPOINT_API_DERIVATIVE_SERVICE_V2: String,
    ENDPOINT_API_DERIVATIVE_STREAMING: String,
    ENDPOINT_API_FLUENT: String,
    ENDPOINT_API_MODEL_DERIVATIVE_V2: String,
    getApiEndpoint: () => String,
    getEndpointAndApi: () => String,
    setEndpointAndApi: (String, String) => Unit
  ): Endpoint = {
    val __obj = js.Dynamic.literal(ENDPOINT_API_D3S = ENDPOINT_API_D3S.asInstanceOf[js.Any], ENDPOINT_API_DERIVATIVE_SERVICE_V2 = ENDPOINT_API_DERIVATIVE_SERVICE_V2.asInstanceOf[js.Any], ENDPOINT_API_DERIVATIVE_STREAMING = ENDPOINT_API_DERIVATIVE_STREAMING.asInstanceOf[js.Any], ENDPOINT_API_FLUENT = ENDPOINT_API_FLUENT.asInstanceOf[js.Any], ENDPOINT_API_MODEL_DERIVATIVE_V2 = ENDPOINT_API_MODEL_DERIVATIVE_V2.asInstanceOf[js.Any], getApiEndpoint = js.Any.fromFunction0(getApiEndpoint), getEndpointAndApi = js.Any.fromFunction0(getEndpointAndApi), setEndpointAndApi = js.Any.fromFunction2(setEndpointAndApi))
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    inline def setENDPOINT_API_D3S(value: String): Self = StObject.set(x, "ENDPOINT_API_D3S", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_DERIVATIVE_SERVICE_V2(value: String): Self = StObject.set(x, "ENDPOINT_API_DERIVATIVE_SERVICE_V2", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_DERIVATIVE_STREAMING(value: String): Self = StObject.set(x, "ENDPOINT_API_DERIVATIVE_STREAMING", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_FLUENT(value: String): Self = StObject.set(x, "ENDPOINT_API_FLUENT", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_MODEL_DERIVATIVE_V2(value: String): Self = StObject.set(x, "ENDPOINT_API_MODEL_DERIVATIVE_V2", value.asInstanceOf[js.Any])
    
    inline def setGetApiEndpoint(value: () => String): Self = StObject.set(x, "getApiEndpoint", js.Any.fromFunction0(value))
    
    inline def setGetEndpointAndApi(value: () => String): Self = StObject.set(x, "getEndpointAndApi", js.Any.fromFunction0(value))
    
    inline def setSetEndpointAndApi(value: (String, String) => Unit): Self = StObject.set(x, "setEndpointAndApi", js.Any.fromFunction2(value))
  }
}
