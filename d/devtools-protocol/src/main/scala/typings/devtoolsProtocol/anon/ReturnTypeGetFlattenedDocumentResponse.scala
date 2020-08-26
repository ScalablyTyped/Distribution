package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetFlattenedDocumentResponse extends js.Object {
  var paramsType: js.Array[js.UndefOr[GetFlattenedDocumentRequest]] = js.native
  var returnType: GetFlattenedDocumentResponse = js.native
}

object ReturnTypeGetFlattenedDocumentResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[GetFlattenedDocumentRequest]],
    returnType: GetFlattenedDocumentResponse
  ): ReturnTypeGetFlattenedDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFlattenedDocumentResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetFlattenedDocumentResponseOps[Self <: ReturnTypeGetFlattenedDocumentResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: js.UndefOr[GetFlattenedDocumentRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetFlattenedDocumentRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetFlattenedDocumentResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

