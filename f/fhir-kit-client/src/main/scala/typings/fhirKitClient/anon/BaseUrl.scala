package typings.fhirKitClient.anon

import typings.std.HeadersInit
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  var baseUrl: String
  
  var bearerToken: js.UndefOr[String] = js.undefined
  
  var customHeaders: js.UndefOr[HeadersInit] = js.undefined
  
  var requestOptions: js.UndefOr[RequestInit] = js.undefined
  
  var requestSigner: js.UndefOr[
    js.Function2[/* url */ String, /* requestOptions */ RequestInit, js.UndefOr[Unit]]
  ] = js.undefined
}
object BaseUrl {
  
  inline def apply(baseUrl: String): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBearerToken(value: String): Self = StObject.set(x, "bearerToken", value.asInstanceOf[js.Any])
    
    inline def setBearerTokenUndefined: Self = StObject.set(x, "bearerToken", js.undefined)
    
    inline def setCustomHeaders(value: HeadersInit): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setCustomHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "customHeaders", js.Array(value*))
    
    inline def setRequestOptions(value: RequestInit): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setRequestSigner(value: (/* url */ String, /* requestOptions */ RequestInit) => js.UndefOr[Unit]): Self = StObject.set(x, "requestSigner", js.Any.fromFunction2(value))
    
    inline def setRequestSignerUndefined: Self = StObject.set(x, "requestSigner", js.undefined)
  }
}
