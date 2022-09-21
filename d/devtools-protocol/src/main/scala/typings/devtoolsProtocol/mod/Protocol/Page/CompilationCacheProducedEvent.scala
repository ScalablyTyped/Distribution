package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationCacheProducedEvent extends StObject {
  
  /**
    * Base64-encoded data (Encoded as a base64 string when passed over JSON)
    */
  var data: String
  
  var url: String
}
object CompilationCacheProducedEvent {
  
  inline def apply(data: String, url: String): CompilationCacheProducedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationCacheProducedEvent]
  }
  
  extension [Self <: CompilationCacheProducedEvent](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
