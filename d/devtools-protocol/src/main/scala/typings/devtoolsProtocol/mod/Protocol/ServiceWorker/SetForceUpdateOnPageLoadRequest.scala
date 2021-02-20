package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetForceUpdateOnPageLoadRequest extends StObject {
  
  var forceUpdateOnPageLoad: Boolean = js.native
}
object SetForceUpdateOnPageLoadRequest {
  
  @scala.inline
  def apply(forceUpdateOnPageLoad: Boolean): SetForceUpdateOnPageLoadRequest = {
    val __obj = js.Dynamic.literal(forceUpdateOnPageLoad = forceUpdateOnPageLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetForceUpdateOnPageLoadRequest]
  }
  
  @scala.inline
  implicit class SetForceUpdateOnPageLoadRequestMutableBuilder[Self <: SetForceUpdateOnPageLoadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceUpdateOnPageLoad(value: Boolean): Self = StObject.set(x, "forceUpdateOnPageLoad", value.asInstanceOf[js.Any])
  }
}
