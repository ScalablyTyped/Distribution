package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameAttachedEvent extends StObject {
  
  /**
    * Id of the frame that has been attached.
    */
  var frameId: FrameId
  
  /**
    * Parent frame identifier.
    */
  var parentFrameId: FrameId
  
  /**
    * JavaScript stack trace of when frame was attached, only set if frame initiated from script.
    */
  var stack: js.UndefOr[StackTrace] = js.undefined
}
object FrameAttachedEvent {
  
  inline def apply(frameId: FrameId, parentFrameId: FrameId): FrameAttachedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameAttachedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameAttachedEvent] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setParentFrameId(value: FrameId): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    inline def setStack(value: StackTrace): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
