package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceContentResponse extends js.Object {
  /**
    * True, if content was served as base64.
    */
  var base64Encoded: Boolean = js.native
  /**
    * Resource content.
    */
  var content: String = js.native
}

object GetResourceContentResponse {
  @scala.inline
  def apply(base64Encoded: Boolean, content: String): GetResourceContentResponse = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceContentResponse]
  }
  @scala.inline
  implicit class GetResourceContentResponseOps[Self <: GetResourceContentResponse] (val x: Self) extends AnyVal {
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
    def setBase64Encoded(value: Boolean): Self = this.set("base64Encoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

