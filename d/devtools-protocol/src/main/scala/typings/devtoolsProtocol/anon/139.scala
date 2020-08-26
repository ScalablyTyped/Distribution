package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnLoadRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `139` extends js.Object {
  var paramsType: js.Array[RemoveScriptToEvaluateOnLoadRequest] = js.native
  var returnType: Unit = js.native
}

object `139` {
  @scala.inline
  def apply(paramsType: js.Array[RemoveScriptToEvaluateOnLoadRequest], returnType: Unit): `139` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`139`]
  }
  @scala.inline
  implicit class `139Ops`[Self <: `139`] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: RemoveScriptToEvaluateOnLoadRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[RemoveScriptToEvaluateOnLoadRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

