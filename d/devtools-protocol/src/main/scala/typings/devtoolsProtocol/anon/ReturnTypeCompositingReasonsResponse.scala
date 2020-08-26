package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeCompositingReasonsResponse extends js.Object {
  var paramsType: js.Array[CompositingReasonsRequest] = js.native
  var returnType: CompositingReasonsResponse = js.native
}

object ReturnTypeCompositingReasonsResponse {
  @scala.inline
  def apply(paramsType: js.Array[CompositingReasonsRequest], returnType: CompositingReasonsResponse): ReturnTypeCompositingReasonsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCompositingReasonsResponse]
  }
  @scala.inline
  implicit class ReturnTypeCompositingReasonsResponseOps[Self <: ReturnTypeCompositingReasonsResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: CompositingReasonsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[CompositingReasonsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: CompositingReasonsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

