package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeCreateStyleSheetResponse extends js.Object {
  var paramsType: js.Array[CreateStyleSheetRequest] = js.native
  var returnType: CreateStyleSheetResponse = js.native
}

object ReturnTypeCreateStyleSheetResponse {
  @scala.inline
  def apply(paramsType: js.Array[CreateStyleSheetRequest], returnType: CreateStyleSheetResponse): ReturnTypeCreateStyleSheetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateStyleSheetResponse]
  }
  @scala.inline
  implicit class ReturnTypeCreateStyleSheetResponseOps[Self <: ReturnTypeCreateStyleSheetResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: CreateStyleSheetRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[CreateStyleSheetRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: CreateStyleSheetResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

