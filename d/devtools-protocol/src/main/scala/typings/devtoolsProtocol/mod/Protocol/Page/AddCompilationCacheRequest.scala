package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCompilationCacheRequest extends StObject {
  
  /**
    * Base64-encoded data
    */
  var data: String
  
  var url: String
}
object AddCompilationCacheRequest {
  
  inline def apply(data: String, url: String): AddCompilationCacheRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCompilationCacheRequest]
  }
  
  extension [Self <: AddCompilationCacheRequest](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
