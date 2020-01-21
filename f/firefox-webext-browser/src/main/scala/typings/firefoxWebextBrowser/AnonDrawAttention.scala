package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.windows.WindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDrawAttention extends js.Object {
  /**
    * If true, causes the window to be displayed in a manner that draws the user's attention to the window,
    * without changing the focused window. The effect lasts until the user changes focus to the window. This
    * option has no effect if the window already has focus. Set to false to cancel a previous draw attention
    * request.
    */
  var drawAttention: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** The height to resize the window to in pixels. This value is ignored for panels. */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for
    * panels.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with
    * 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[WindowState] = js.undefined
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[String] = js.undefined
  /**
    * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
    */
  var top: js.UndefOr[Double] = js.undefined
  /** The width to resize the window to in pixels. This value is ignored for panels. */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonDrawAttention {
  @scala.inline
  def apply(
    drawAttention: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    left: Int | Double = null,
    state: WindowState = null,
    titlePreface: String = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): AnonDrawAttention = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawAttention)) __obj.updateDynamic("drawAttention")(drawAttention.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (titlePreface != null) __obj.updateDynamic("titlePreface")(titlePreface.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawAttention]
  }
}

