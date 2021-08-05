package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetProduceCompilationCacheRequest extends StObject {
  
  var enabled: Boolean
}
object SetProduceCompilationCacheRequest {
  
  inline def apply(enabled: Boolean): SetProduceCompilationCacheRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetProduceCompilationCacheRequest]
  }
  
  extension [Self <: SetProduceCompilationCacheRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
