package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetForceUpdateOnPageLoadRequest extends StObject {
  
  var forceUpdateOnPageLoad: Boolean
}
object SetForceUpdateOnPageLoadRequest {
  
  inline def apply(forceUpdateOnPageLoad: Boolean): SetForceUpdateOnPageLoadRequest = {
    val __obj = js.Dynamic.literal(forceUpdateOnPageLoad = forceUpdateOnPageLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetForceUpdateOnPageLoadRequest]
  }
  
  extension [Self <: SetForceUpdateOnPageLoadRequest](x: Self) {
    
    inline def setForceUpdateOnPageLoad(value: Boolean): Self = StObject.set(x, "forceUpdateOnPageLoad", value.asInstanceOf[js.Any])
  }
}
