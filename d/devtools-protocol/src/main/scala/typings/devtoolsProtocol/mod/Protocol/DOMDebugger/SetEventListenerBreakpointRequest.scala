package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetEventListenerBreakpointRequest extends js.Object {
  /**
    * DOM Event name to stop on (any DOM event will do).
    */
  var eventName: String = js.native
  /**
    * EventTarget interface name to stop on. If equal to `"*"` or not provided, will stop on any
    * EventTarget.
    */
  var targetName: js.UndefOr[String] = js.native
}

object SetEventListenerBreakpointRequest {
  @scala.inline
  def apply(eventName: String): SetEventListenerBreakpointRequest = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEventListenerBreakpointRequest]
  }
  @scala.inline
  implicit class SetEventListenerBreakpointRequestOps[Self <: SetEventListenerBreakpointRequest] (val x: Self) extends AnyVal {
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

