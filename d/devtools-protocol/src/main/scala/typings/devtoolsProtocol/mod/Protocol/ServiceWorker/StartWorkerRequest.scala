package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkerRequest extends StObject {
  
  var scopeURL: String
}
object StartWorkerRequest {
  
  inline def apply(scopeURL: String): StartWorkerRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartWorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
