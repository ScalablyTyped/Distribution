package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketResponse extends StObject {
  
  /**
    * HTTP response headers.
    */
  var headers: Headers
  
  /**
    * HTTP response headers text.
    */
  var headersText: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP request headers.
    */
  var requestHeaders: js.UndefOr[Headers] = js.undefined
  
  /**
    * HTTP request headers text.
    */
  var requestHeadersText: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP response status code.
    */
  var status: integer
  
  /**
    * HTTP response status text.
    */
  var statusText: String
}
object WebSocketResponse {
  
  @scala.inline
  def apply(headers: Headers, status: integer, statusText: String): WebSocketResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketResponse]
  }
  
  @scala.inline
  implicit class WebSocketResponseMutableBuilder[Self <: WebSocketResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersText(value: String): Self = StObject.set(x, "headersText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersTextUndefined: Self = StObject.set(x, "headersText", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: Headers): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersText(value: String): Self = StObject.set(x, "requestHeadersText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersTextUndefined: Self = StObject.set(x, "requestHeadersText", js.undefined)
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
