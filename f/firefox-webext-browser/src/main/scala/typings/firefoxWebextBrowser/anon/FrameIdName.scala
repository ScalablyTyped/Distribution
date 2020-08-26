package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameIdName extends js.Object {
  /** Open a port to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.native
  /** Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}

object FrameIdName {
  @scala.inline
  def apply(): FrameIdName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameIdName]
  }
  @scala.inline
  implicit class FrameIdNameOps[Self <: FrameIdName] (val x: Self) extends AnyVal {
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
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

