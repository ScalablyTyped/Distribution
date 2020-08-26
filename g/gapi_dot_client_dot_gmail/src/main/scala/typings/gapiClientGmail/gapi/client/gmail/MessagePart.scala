package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePart extends js.Object {
  /** The message part body for this part, which may be empty for container MIME message parts. */
  var body: js.UndefOr[MessagePartBody] = js.native
  /** The filename of the attachment. Only present if this message part represents an attachment. */
  var filename: js.UndefOr[String] = js.native
  /**
    * List of headers on this message part. For the top-level message part, representing the entire message payload, it will contain the standard RFC 2822
    * email headers such as To, From, and Subject.
    */
  var headers: js.UndefOr[js.Array[MessagePartHeader]] = js.native
  /** The MIME type of the message part. */
  var mimeType: js.UndefOr[String] = js.native
  /** The immutable ID of the message part. */
  var partId: js.UndefOr[String] = js.native
  /**
    * The child MIME message parts of this part. This only applies to container MIME message parts, for example multipart/&#42;. For non- container MIME message
    * part types, such as text/plain, this field is empty. For more information, see RFC 1521.
    */
  var parts: js.UndefOr[js.Array[MessagePart]] = js.native
}

object MessagePart {
  @scala.inline
  def apply(): MessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePart]
  }
  @scala.inline
  implicit class MessagePartOps[Self <: MessagePart] (val x: Self) extends AnyVal {
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
    def setBody(value: MessagePartBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: MessagePartHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[MessagePartHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setPartId(value: String): Self = this.set("partId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartId: Self = this.set("partId", js.undefined)
    @scala.inline
    def setPartsVarargs(value: MessagePart*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[MessagePart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
  }
  
}

