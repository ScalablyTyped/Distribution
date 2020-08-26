package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.ContinueToLocationRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnType extends js.Object {
  var paramsType: js.Array[ContinueToLocationRequest] = js.native
  var returnType: Unit = js.native
}

object ReturnType {
  @scala.inline
  def apply(paramsType: js.Array[ContinueToLocationRequest], returnType: Unit): ReturnType = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnType]
  }
  @scala.inline
  implicit class ReturnTypeOps[Self <: ReturnType] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ContinueToLocationRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ContinueToLocationRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

