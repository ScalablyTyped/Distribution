package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/string-protocol-response
  /**
    * Charset of the response.
    */
  var charset: js.UndefOr[String] = js.native
  /**
    * A string representing the response body.
    */
  var data: String | Null = js.native
  /**
    * MIME type of the response.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object StringProtocolResponse {
  @scala.inline
  def apply(): StringProtocolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringProtocolResponse]
  }
  @scala.inline
  implicit class StringProtocolResponseOps[Self <: StringProtocolResponse] (val x: Self) extends AnyVal {
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
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
  
}

