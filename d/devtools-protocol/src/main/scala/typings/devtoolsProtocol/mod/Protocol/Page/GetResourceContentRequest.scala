package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceContentRequest extends js.Object {
  /**
    * Frame id to get resource for.
    */
  var frameId: FrameId = js.native
  /**
    * URL of the resource to get content for.
    */
  var url: String = js.native
}

object GetResourceContentRequest {
  @scala.inline
  def apply(frameId: FrameId, url: String): GetResourceContentRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceContentRequest]
  }
  @scala.inline
  implicit class GetResourceContentRequestOps[Self <: GetResourceContentRequest] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

