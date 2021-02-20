package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipWaitingRequest extends StObject {
  
  var scopeURL: String = js.native
}
object SkipWaitingRequest {
  
  @scala.inline
  def apply(scopeURL: String): SkipWaitingRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipWaitingRequest]
  }
  
  @scala.inline
  implicit class SkipWaitingRequestMutableBuilder[Self <: SkipWaitingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
