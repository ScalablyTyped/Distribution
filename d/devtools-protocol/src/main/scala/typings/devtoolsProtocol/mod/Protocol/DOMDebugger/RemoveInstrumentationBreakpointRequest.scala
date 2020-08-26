package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveInstrumentationBreakpointRequest extends js.Object {
  /**
    * Instrumentation name to stop on.
    */
  var eventName: String = js.native
}

object RemoveInstrumentationBreakpointRequest {
  @scala.inline
  def apply(eventName: String): RemoveInstrumentationBreakpointRequest = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveInstrumentationBreakpointRequest]
  }
  @scala.inline
  implicit class RemoveInstrumentationBreakpointRequestOps[Self <: RemoveInstrumentationBreakpointRequest] (val x: Self) extends AnyVal {
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
  }
  
}

