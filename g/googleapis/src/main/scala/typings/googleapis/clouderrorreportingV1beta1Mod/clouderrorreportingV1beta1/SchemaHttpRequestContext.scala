package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRequestContext extends StObject {
  
  /**
    * The type of HTTP request, such as `GET`, `POST`, etc.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The referrer information that is provided with the request.
    */
  var referrer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is derived from the IP address, depending on the data that has been provided in the error report.
    */
  var remoteIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP response status code for the request.
    */
  var responseStatusCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL of the request.
    */
  var url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user agent information that is provided with the request.
    */
  var userAgent: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRequestContext {
  
  inline def apply(): SchemaHttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRequestContext]
  }
  
  extension [Self <: SchemaHttpRequestContext](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerNull: Self = StObject.set(x, "referrer", null)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpNull: Self = StObject.set(x, "remoteIp", null)
    
    inline def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    inline def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusCodeNull: Self = StObject.set(x, "responseStatusCode", null)
    
    inline def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
