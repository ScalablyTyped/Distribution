package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnregisterRequest extends StObject {
  
  var scopeURL: String = js.native
}
object UnregisterRequest {
  
  @scala.inline
  def apply(scopeURL: String): UnregisterRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisterRequest]
  }
  
  @scala.inline
  implicit class UnregisterRequestMutableBuilder[Self <: UnregisterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
