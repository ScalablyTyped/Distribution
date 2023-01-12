package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameScheduledNavigationEvent extends StObject {
  
  /**
    * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not
    * guaranteed to start.
    */
  var delay: Double
  
  /**
    * Id of the frame that has scheduled a navigation.
    */
  var frameId: FrameId
  
  /**
    * The reason for the navigation.
    */
  var reason: ClientNavigationReason
  
  /**
    * The destination URL for the scheduled navigation.
    */
  var url: String
}
object FrameScheduledNavigationEvent {
  
  inline def apply(delay: Double, frameId: FrameId, reason: ClientNavigationReason, url: String): FrameScheduledNavigationEvent = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameScheduledNavigationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameScheduledNavigationEvent] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: ClientNavigationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
