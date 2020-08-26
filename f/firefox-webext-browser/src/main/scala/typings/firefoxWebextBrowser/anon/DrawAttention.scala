package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.windows.WindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawAttention extends js.Object {
  /**
    * If true, causes the window to be displayed in a manner that draws the user's attention to the window,
    * without changing the focused window. The effect lasts until the user changes focus to the window. This
    * option has no effect if the window already has focus. Set to false to cancel a previous draw attention
    * request.
    */
  var drawAttention: js.UndefOr[Boolean] = js.native
  /**
    * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
    */
  var focused: js.UndefOr[Boolean] = js.native
  /** The height to resize the window to in pixels. This value is ignored for panels. */
  var height: js.UndefOr[Double] = js.native
  /**
    * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for
    * panels.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with
    * 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[WindowState] = js.native
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[String] = js.native
  /**
    * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
    */
  var top: js.UndefOr[Double] = js.native
  /** The width to resize the window to in pixels. This value is ignored for panels. */
  var width: js.UndefOr[Double] = js.native
}

object DrawAttention {
  @scala.inline
  def apply(): DrawAttention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawAttention]
  }
  @scala.inline
  implicit class DrawAttentionOps[Self <: DrawAttention] (val x: Self) extends AnyVal {
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
    def setDrawAttention(value: Boolean): Self = this.set("drawAttention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawAttention: Self = this.set("drawAttention", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setState(value: WindowState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTitlePreface(value: String): Self = this.set("titlePreface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePreface: Self = this.set("titlePreface", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

