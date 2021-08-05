package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPreciseCoverageRequest extends StObject {
  
  /**
    * Allow the backend to send updates on its own initiative
    */
  var allowTriggeredUpdates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.undefined
}
object StartPreciseCoverageRequest {
  
  inline def apply(): StartPreciseCoverageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPreciseCoverageRequest]
  }
  
  extension [Self <: StartPreciseCoverageRequest](x: Self) {
    
    inline def setAllowTriggeredUpdates(value: Boolean): Self = StObject.set(x, "allowTriggeredUpdates", value.asInstanceOf[js.Any])
    
    inline def setAllowTriggeredUpdatesUndefined: Self = StObject.set(x, "allowTriggeredUpdates", js.undefined)
    
    inline def setCallCount(value: Boolean): Self = StObject.set(x, "callCount", value.asInstanceOf[js.Any])
    
    inline def setCallCountUndefined: Self = StObject.set(x, "callCount", js.undefined)
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
  }
}
