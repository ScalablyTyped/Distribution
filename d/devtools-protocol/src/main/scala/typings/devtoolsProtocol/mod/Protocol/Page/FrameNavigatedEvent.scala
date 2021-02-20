package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameNavigatedEvent extends StObject {
  
  /**
    * Frame object.
    */
  var frame: Frame = js.native
}
object FrameNavigatedEvent {
  
  @scala.inline
  def apply(frame: Frame): FrameNavigatedEvent = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameNavigatedEvent]
  }
  
  @scala.inline
  implicit class FrameNavigatedEventMutableBuilder[Self <: FrameNavigatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
