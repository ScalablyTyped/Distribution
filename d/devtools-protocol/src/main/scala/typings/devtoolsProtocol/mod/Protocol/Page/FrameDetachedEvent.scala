package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameDetachedEvent extends StObject {
  
  /**
    * Id of the frame that has been detached.
    */
  var frameId: FrameId
}
object FrameDetachedEvent {
  
  @scala.inline
  def apply(frameId: FrameId): FrameDetachedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameDetachedEvent]
  }
  
  @scala.inline
  implicit class FrameDetachedEventMutableBuilder[Self <: FrameDetachedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
