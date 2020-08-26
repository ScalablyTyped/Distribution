package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetInstrumentationBreakpointResponse extends js.Object {
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId = js.native
}

object SetInstrumentationBreakpointResponse {
  @scala.inline
  def apply(breakpointId: BreakpointId): SetInstrumentationBreakpointResponse = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstrumentationBreakpointResponse]
  }
  @scala.inline
  implicit class SetInstrumentationBreakpointResponseOps[Self <: SetInstrumentationBreakpointResponse] (val x: Self) extends AnyVal {
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
    def setBreakpointId(value: BreakpointId): Self = this.set("breakpointId", value.asInstanceOf[js.Any])
  }
  
}

