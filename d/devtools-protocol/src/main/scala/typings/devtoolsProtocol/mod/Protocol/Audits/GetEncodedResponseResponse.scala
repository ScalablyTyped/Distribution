package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEncodedResponseResponse extends js.Object {
  /**
    * The encoded body as a base64 string. Omitted if sizeOnly is true.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Size after re-encoding.
    */
  var encodedSize: integer = js.native
  /**
    * Size before re-encoding.
    */
  var originalSize: integer = js.native
}

object GetEncodedResponseResponse {
  @scala.inline
  def apply(encodedSize: integer, originalSize: integer): GetEncodedResponseResponse = {
    val __obj = js.Dynamic.literal(encodedSize = encodedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncodedResponseResponse]
  }
  @scala.inline
  implicit class GetEncodedResponseResponseOps[Self <: GetEncodedResponseResponse] (val x: Self) extends AnyVal {
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
    def setEncodedSize(value: integer): Self = this.set("encodedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalSize(value: integer): Self = this.set("originalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

