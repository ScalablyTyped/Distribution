package typings.devtoolsProtocol.mod.Protocol.Preload

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefetchStatusUpdatedEvent extends StObject {
  
  /**
    * The frame id of the frame initiating prefetch.
    */
  var initiatingFrameId: FrameId
  
  var key: PreloadingAttemptKey
  
  var prefetchStatus: PrefetchStatus
  
  var prefetchUrl: String
  
  var status: PreloadingStatus
}
object PrefetchStatusUpdatedEvent {
  
  inline def apply(
    initiatingFrameId: FrameId,
    key: PreloadingAttemptKey,
    prefetchStatus: PrefetchStatus,
    prefetchUrl: String,
    status: PreloadingStatus
  ): PrefetchStatusUpdatedEvent = {
    val __obj = js.Dynamic.literal(initiatingFrameId = initiatingFrameId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prefetchStatus = prefetchStatus.asInstanceOf[js.Any], prefetchUrl = prefetchUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchStatusUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrefetchStatusUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setInitiatingFrameId(value: FrameId): Self = StObject.set(x, "initiatingFrameId", value.asInstanceOf[js.Any])
    
    inline def setKey(value: PreloadingAttemptKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrefetchStatus(value: PrefetchStatus): Self = StObject.set(x, "prefetchStatus", value.asInstanceOf[js.Any])
    
    inline def setPrefetchUrl(value: String): Self = StObject.set(x, "prefetchUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PreloadingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
