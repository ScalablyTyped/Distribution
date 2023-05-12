package typings.devtoolsProtocol.mod.Protocol.Preload

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderStatusUpdatedEvent extends StObject {
  
  /**
    * The frame id of the frame initiating prerender.
    */
  var initiatingFrameId: FrameId
  
  var key: PreloadingAttemptKey
  
  var prerenderingUrl: String
  
  var status: PreloadingStatus
}
object PrerenderStatusUpdatedEvent {
  
  inline def apply(
    initiatingFrameId: FrameId,
    key: PreloadingAttemptKey,
    prerenderingUrl: String,
    status: PreloadingStatus
  ): PrerenderStatusUpdatedEvent = {
    val __obj = js.Dynamic.literal(initiatingFrameId = initiatingFrameId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prerenderingUrl = prerenderingUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderStatusUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrerenderStatusUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setInitiatingFrameId(value: FrameId): Self = StObject.set(x, "initiatingFrameId", value.asInstanceOf[js.Any])
    
    inline def setKey(value: PreloadingAttemptKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrerenderingUrl(value: String): Self = StObject.set(x, "prerenderingUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PreloadingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
