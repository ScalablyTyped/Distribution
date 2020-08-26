package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyleSheetRequest extends js.Object {
  /**
    * Identifier of the frame where "via-inspector" stylesheet should be created.
    */
  var frameId: FrameId = js.native
}

object CreateStyleSheetRequest {
  @scala.inline
  def apply(frameId: FrameId): CreateStyleSheetRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStyleSheetRequest]
  }
  @scala.inline
  implicit class CreateStyleSheetRequestOps[Self <: CreateStyleSheetRequest] (val x: Self) extends AnyVal {
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
  }
  
}

