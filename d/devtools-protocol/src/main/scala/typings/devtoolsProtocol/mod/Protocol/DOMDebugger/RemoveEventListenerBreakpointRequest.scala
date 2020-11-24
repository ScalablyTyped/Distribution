package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveEventListenerBreakpointRequest extends js.Object {
  
  /**
    * Event name.
    */
  var eventName: String = js.native
  
  /**
    * EventTarget interface name.
    */
  var targetName: js.UndefOr[String] = js.native
}
object RemoveEventListenerBreakpointRequest {
  
  @scala.inline
  def apply(eventName: String): RemoveEventListenerBreakpointRequest = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveEventListenerBreakpointRequest]
  }
  
  @scala.inline
  implicit class RemoveEventListenerBreakpointRequestOps[Self <: RemoveEventListenerBreakpointRequest] (val x: Self) extends AnyVal {
    
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
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetName(value: String): Self = this.set("targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetName: Self = this.set("targetName", js.undefined)
  }
}
