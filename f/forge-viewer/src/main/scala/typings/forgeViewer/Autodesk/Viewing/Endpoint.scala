package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  def getApiEndpoint(): String
  
  def getEndpointAndApi(): String
  
  def setEndpointAndApi(endpoint: String, api: String): Unit
}
object Endpoint {
  
  inline def apply(
    getApiEndpoint: () => String,
    getEndpointAndApi: () => String,
    setEndpointAndApi: (String, String) => Unit
  ): Endpoint = {
    val __obj = js.Dynamic.literal(getApiEndpoint = js.Any.fromFunction0(getApiEndpoint), getEndpointAndApi = js.Any.fromFunction0(getEndpointAndApi), setEndpointAndApi = js.Any.fromFunction2(setEndpointAndApi))
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setGetApiEndpoint(value: () => String): Self = StObject.set(x, "getApiEndpoint", js.Any.fromFunction0(value))
    
    inline def setGetEndpointAndApi(value: () => String): Self = StObject.set(x, "getEndpointAndApi", js.Any.fromFunction0(value))
    
    inline def setSetEndpointAndApi(value: (String, String) => Unit): Self = StObject.set(x, "setEndpointAndApi", js.Any.fromFunction2(value))
  }
}
