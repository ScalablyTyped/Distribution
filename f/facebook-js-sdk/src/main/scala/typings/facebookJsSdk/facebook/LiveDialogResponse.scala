package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveDialogResponse
  extends StObject
     with DialogResponse {
  
  var id: String
  
  var secure_stream_url: String
  
  var status: String
  
  var stream_url: String
}
object LiveDialogResponse {
  
  inline def apply(id: String, secure_stream_url: String, status: String, stream_url: String): LiveDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secure_stream_url = secure_stream_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogResponse]
  }
  
  extension [Self <: LiveDialogResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSecure_stream_url(value: String): Self = StObject.set(x, "secure_stream_url", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStream_url(value: String): Self = StObject.set(x, "stream_url", value.asInstanceOf[js.Any])
  }
}
