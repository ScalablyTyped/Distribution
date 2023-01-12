package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameNavigatedEvent extends StObject {
  
  /**
    * Frame object.
    */
  var frame: Frame
  
  var `type`: NavigationType
}
object FrameNavigatedEvent {
  
  inline def apply(frame: Frame, `type`: NavigationType): FrameNavigatedEvent = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameNavigatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameNavigatedEvent] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setType(value: NavigationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
