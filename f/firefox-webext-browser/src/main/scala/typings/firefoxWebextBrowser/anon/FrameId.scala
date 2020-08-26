package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameId extends js.Object {
  /** The ID of the frame in the given tab. */
  var frameId: Double = js.native
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[Double] = js.native
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
}

object FrameId {
  @scala.inline
  def apply(frameId: Double, tabId: Double): FrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameId]
  }
  @scala.inline
  implicit class FrameIdOps[Self <: FrameId] (val x: Self) extends AnyVal {
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
  }
  
}

