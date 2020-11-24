package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameAttachedEvent extends js.Object {
  
  /**
    * Id of the frame that has been attached.
    */
  var frameId: FrameId = js.native
  
  /**
    * Parent frame identifier.
    */
  var parentFrameId: FrameId = js.native
  
  /**
    * JavaScript stack trace of when frame was attached, only set if frame initiated from script.
    */
  var stack: js.UndefOr[StackTrace] = js.native
}
object FrameAttachedEvent {
  
  @scala.inline
  def apply(frameId: FrameId, parentFrameId: FrameId): FrameAttachedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameAttachedEvent]
  }
  
  @scala.inline
  implicit class FrameAttachedEventOps[Self <: FrameAttachedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFrameId(value: FrameId): Self = this.set("parentFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: StackTrace): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
