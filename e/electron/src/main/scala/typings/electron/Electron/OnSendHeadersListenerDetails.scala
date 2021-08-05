package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSendHeadersListenerDetails extends StObject {
  
  var id: Double
  
  var method: String
  
  var referrer: String
  
  var requestHeaders: Record[String, String]
  
  var resourceType: String
  
  var timestamp: Double
  
  var url: String
  
  var webContentsId: js.UndefOr[Double] = js.undefined
}
object OnSendHeadersListenerDetails {
  
  inline def apply(
    id: Double,
    method: String,
    referrer: String,
    requestHeaders: Record[String, String],
    resourceType: String,
    timestamp: Double,
    url: String
  ): OnSendHeadersListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSendHeadersListenerDetails]
  }
  
  extension [Self <: OnSendHeadersListenerDetails](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaders(value: Record[String, String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWebContentsId(value: Double): Self = StObject.set(x, "webContentsId", value.asInstanceOf[js.Any])
    
    inline def setWebContentsIdUndefined: Self = StObject.set(x, "webContentsId", js.undefined)
  }
}
