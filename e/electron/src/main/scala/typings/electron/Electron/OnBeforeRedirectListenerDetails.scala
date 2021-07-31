package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeRedirectListenerDetails extends StObject {
  
  var fromCache: Boolean
  
  var id: Double
  
  /**
    * The server IP address that the request was actually sent to.
    */
  var ip: js.UndefOr[String] = js.undefined
  
  var method: String
  
  var redirectURL: String
  
  var referrer: String
  
  var resourceType: String
  
  var responseHeaders: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  var statusCode: Double
  
  var statusLine: String
  
  var timestamp: Double
  
  var url: String
  
  var webContentsId: js.UndefOr[Double] = js.undefined
}
object OnBeforeRedirectListenerDetails {
  
  @scala.inline
  def apply(
    fromCache: Boolean,
    id: Double,
    method: String,
    redirectURL: String,
    referrer: String,
    resourceType: String,
    statusCode: Double,
    statusLine: String,
    timestamp: Double,
    url: String
  ): OnBeforeRedirectListenerDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRedirectListenerDetails]
  }
  
  @scala.inline
  implicit class OnBeforeRedirectListenerDetailsMutableBuilder[Self <: OnBeforeRedirectListenerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: Record[String, js.Array[String]]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLine(value: String): Self = StObject.set(x, "statusLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContentsId(value: Double): Self = StObject.set(x, "webContentsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContentsIdUndefined: Self = StObject.set(x, "webContentsId", js.undefined)
  }
}
