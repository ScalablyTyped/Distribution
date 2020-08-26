package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexWindowId extends js.Object {
  /** The position to move the window to. -1 will place the tab at the end of the window. */
  var index: Double = js.native
  /** Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[Double] = js.native
}

object IndexWindowId {
  @scala.inline
  def apply(index: Double): IndexWindowId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexWindowId]
  }
  @scala.inline
  implicit class IndexWindowIdOps[Self <: IndexWindowId] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

