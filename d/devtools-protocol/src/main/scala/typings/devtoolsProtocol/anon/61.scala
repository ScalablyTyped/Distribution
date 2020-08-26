package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveInstrumentationBreakpointRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `61` extends js.Object {
  var paramsType: js.Array[RemoveInstrumentationBreakpointRequest] = js.native
  var returnType: Unit = js.native
}

object `61` {
  @scala.inline
  def apply(paramsType: js.Array[RemoveInstrumentationBreakpointRequest], returnType: Unit): `61` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`61`]
  }
  @scala.inline
  implicit class `61Ops`[Self <: `61`] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: RemoveInstrumentationBreakpointRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[RemoveInstrumentationBreakpointRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

