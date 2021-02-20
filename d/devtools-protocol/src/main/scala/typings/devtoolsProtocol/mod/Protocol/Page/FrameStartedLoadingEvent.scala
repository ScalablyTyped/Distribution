package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameStartedLoadingEvent extends StObject {
  
  /**
    * Id of the frame that has started loading.
    */
  var frameId: FrameId = js.native
}
object FrameStartedLoadingEvent {
  
  @scala.inline
  def apply(frameId: FrameId): FrameStartedLoadingEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameStartedLoadingEvent]
  }
  
  @scala.inline
  implicit class FrameStartedLoadingEventMutableBuilder[Self <: FrameStartedLoadingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
