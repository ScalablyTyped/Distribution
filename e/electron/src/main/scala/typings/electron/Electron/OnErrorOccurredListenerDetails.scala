package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnErrorOccurredListenerDetails extends StObject {
  
  /**
    * The error description.
    */
  var error: String
  
  var fromCache: Boolean
  
  var id: Double
  
  var method: String
  
  var referrer: String
  
  var resourceType: String
  
  var timestamp: Double
  
  var url: String
  
  var webContentsId: js.UndefOr[Double] = js.undefined
}
object OnErrorOccurredListenerDetails {
  
  @scala.inline
  def apply(
    error: String,
    fromCache: Boolean,
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    timestamp: Double,
    url: String
  ): OnErrorOccurredListenerDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorOccurredListenerDetails]
  }
  
  @scala.inline
  implicit class OnErrorOccurredListenerDetailsMutableBuilder[Self <: OnErrorOccurredListenerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
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
