package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTP request data that is related to a reported error. This data should be
  * provided by the application when reporting an error, unless the error
  * report has been generated automatically from Google App Engine logs.
  */
trait SchemaHttpRequestContext extends StObject {
  
  /**
    * The type of HTTP request, such as `GET`, `POST`, etc.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The referrer information that is provided with the request.
    */
  var referrer: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address from which the request originated. This can be IPv4, IPv6,
    * or a token which is derived from the IP address, depending on the data
    * that has been provided in the error report.
    */
  var remoteIp: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP response status code for the request.
    */
  var responseStatusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL of the request.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The user agent information that is provided with the request.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}
object SchemaHttpRequestContext {
  
  @scala.inline
  def apply(): SchemaHttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRequestContext]
  }
  
  @scala.inline
  implicit class SchemaHttpRequestContextMutableBuilder[Self <: SchemaHttpRequestContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    @scala.inline
    def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
