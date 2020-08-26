package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOffset extends js.Object {
  var endOffset: Double = js.native
  var endTextNodePos: Double = js.native
  var framePos: Double = js.native
  var startOffset: Double = js.native
  var startTextNodePos: Double = js.native
}

object EndOffset {
  @scala.inline
  def apply(
    endOffset: Double,
    endTextNodePos: Double,
    framePos: Double,
    startOffset: Double,
    startTextNodePos: Double
  ): EndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], endTextNodePos = endTextNodePos.asInstanceOf[js.Any], framePos = framePos.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTextNodePos = startTextNodePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOffset]
  }
  @scala.inline
  implicit class EndOffsetOps[Self <: EndOffset] (val x: Self) extends AnyVal {
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
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTextNodePos(value: Double): Self = this.set("endTextNodePos", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramePos(value: Double): Self = this.set("framePos", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTextNodePos(value: Double): Self = this.set("startTextNodePos", value.asInstanceOf[js.Any])
  }
  
}

