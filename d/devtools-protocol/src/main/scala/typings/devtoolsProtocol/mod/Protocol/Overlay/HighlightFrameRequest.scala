package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightFrameRequest extends js.Object {
  /**
    * The content box highlight fill color (default: transparent).
    */
  var contentColor: js.UndefOr[RGBA] = js.native
  /**
    * The content box highlight outline color (default: transparent).
    */
  var contentOutlineColor: js.UndefOr[RGBA] = js.native
  /**
    * Identifier of the frame to highlight.
    */
  var frameId: FrameId = js.native
}

object HighlightFrameRequest {
  @scala.inline
  def apply(frameId: FrameId): HighlightFrameRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightFrameRequest]
  }
  @scala.inline
  implicit class HighlightFrameRequestOps[Self <: HighlightFrameRequest] (val x: Self) extends AnyVal {
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
    def setContentColor(value: RGBA): Self = this.set("contentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentColor: Self = this.set("contentColor", js.undefined)
    @scala.inline
    def setContentOutlineColor(value: RGBA): Self = this.set("contentOutlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOutlineColor: Self = this.set("contentOutlineColor", js.undefined)
  }
  
}

