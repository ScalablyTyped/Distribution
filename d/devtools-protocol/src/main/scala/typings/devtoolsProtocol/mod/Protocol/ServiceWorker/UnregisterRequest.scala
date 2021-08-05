package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnregisterRequest extends StObject {
  
  var scopeURL: String
}
object UnregisterRequest {
  
  inline def apply(scopeURL: String): UnregisterRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisterRequest]
  }
  
  extension [Self <: UnregisterRequest](x: Self) {
    
    inline def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
