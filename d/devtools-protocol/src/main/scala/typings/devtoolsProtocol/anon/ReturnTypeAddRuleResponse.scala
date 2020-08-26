package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeAddRuleResponse extends js.Object {
  var paramsType: js.Array[AddRuleRequest] = js.native
  var returnType: AddRuleResponse = js.native
}

object ReturnTypeAddRuleResponse {
  @scala.inline
  def apply(paramsType: js.Array[AddRuleRequest], returnType: AddRuleResponse): ReturnTypeAddRuleResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddRuleResponse]
  }
  @scala.inline
  implicit class ReturnTypeAddRuleResponseOps[Self <: ReturnTypeAddRuleResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: AddRuleRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[AddRuleRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: AddRuleResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

