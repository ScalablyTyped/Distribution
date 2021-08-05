package typings.devtoolsProtocol.mod.Protocol.Fetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableRequest extends StObject {
  
  /**
    * If true, authRequired events will be issued and requests will be paused
    * expecting a call to continueWithAuth.
    */
  var handleAuthRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified, only requests matching any of these patterns will produce
    * fetchRequested event and will be paused until clients response. If not set,
    * all requests will be affected.
    */
  var patterns: js.UndefOr[js.Array[RequestPattern]] = js.undefined
}
object EnableRequest {
  
  inline def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  extension [Self <: EnableRequest](x: Self) {
    
    inline def setHandleAuthRequests(value: Boolean): Self = StObject.set(x, "handleAuthRequests", value.asInstanceOf[js.Any])
    
    inline def setHandleAuthRequestsUndefined: Self = StObject.set(x, "handleAuthRequests", js.undefined)
    
    inline def setPatterns(value: js.Array[RequestPattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setPatternsVarargs(value: RequestPattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
  }
}
