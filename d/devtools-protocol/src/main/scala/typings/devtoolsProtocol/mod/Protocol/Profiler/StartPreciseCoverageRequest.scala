package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPreciseCoverageRequest extends StObject {
  
  /**
    * Allow the backend to send updates on its own initiative
    */
  var allowTriggeredUpdates: js.UndefOr[Boolean] = js.native
  
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.native
  
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.native
}
object StartPreciseCoverageRequest {
  
  @scala.inline
  def apply(): StartPreciseCoverageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPreciseCoverageRequest]
  }
  
  @scala.inline
  implicit class StartPreciseCoverageRequestMutableBuilder[Self <: StartPreciseCoverageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTriggeredUpdates(value: Boolean): Self = StObject.set(x, "allowTriggeredUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTriggeredUpdatesUndefined: Self = StObject.set(x, "allowTriggeredUpdates", js.undefined)
    
    @scala.inline
    def setCallCount(value: Boolean): Self = StObject.set(x, "callCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallCountUndefined: Self = StObject.set(x, "callCount", js.undefined)
    
    @scala.inline
    def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
  }
}
