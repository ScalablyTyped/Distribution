package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDocumentContentRequest extends js.Object {
  /**
    * Frame id to set HTML for.
    */
  var frameId: FrameId = js.native
  /**
    * HTML content to set.
    */
  var html: String = js.native
}

object SetDocumentContentRequest {
  @scala.inline
  def apply(frameId: FrameId, html: String): SetDocumentContentRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDocumentContentRequest]
  }
  @scala.inline
  implicit class SetDocumentContentRequestOps[Self <: SetDocumentContentRequest] (val x: Self) extends AnyVal {
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
  }
  
}

