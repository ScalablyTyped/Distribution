package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.remove
import typings.devtoolsProtocol.devtoolsProtocolStrings.swap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameDetachedEvent extends StObject {
  
  /**
    * Id of the frame that has been detached.
    */
  var frameId: FrameId
  
  /**
    *  (FrameDetachedEventReason enum)
    */
  var reason: remove | swap
}
object FrameDetachedEvent {
  
  inline def apply(frameId: FrameId, reason: remove | swap): FrameDetachedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameDetachedEvent]
  }
  
  extension [Self <: FrameDetachedEvent](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: remove | swap): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
