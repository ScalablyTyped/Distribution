package typings.devtoolsProtocol.mod.Protocol.Preload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderStatusUpdatedEvent extends StObject {
  
  var key: PreloadingAttemptKey
  
  var prerenderStatus: js.UndefOr[PrerenderFinalStatus] = js.undefined
  
  var status: PreloadingStatus
}
object PrerenderStatusUpdatedEvent {
  
  inline def apply(key: PreloadingAttemptKey, status: PreloadingStatus): PrerenderStatusUpdatedEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderStatusUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrerenderStatusUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setKey(value: PreloadingAttemptKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrerenderStatus(value: PrerenderFinalStatus): Self = StObject.set(x, "prerenderStatus", value.asInstanceOf[js.Any])
    
    inline def setPrerenderStatusUndefined: Self = StObject.set(x, "prerenderStatus", js.undefined)
    
    inline def setStatus(value: PreloadingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
