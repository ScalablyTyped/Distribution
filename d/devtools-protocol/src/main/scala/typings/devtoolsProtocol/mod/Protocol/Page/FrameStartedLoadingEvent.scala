package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameStartedLoadingEvent extends StObject {
  
  /**
    * Id of the frame that has started loading.
    */
  var frameId: FrameId
}
object FrameStartedLoadingEvent {
  
  inline def apply(frameId: FrameId): FrameStartedLoadingEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameStartedLoadingEvent]
  }
  
  extension [Self <: FrameStartedLoadingEvent](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
