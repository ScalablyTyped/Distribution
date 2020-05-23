package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoResizeOptions extends js.Object {
  /**
    * If `true`, the view's height will grow and shrink together with the window.
    * `false` by default.
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the view's x position and width will grow and shrink proportionally
    * with the window. `false` by default.
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the view's y position and height will grow and shrink proportionally
    * with the window. `false` by default.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the view's width will grow and shrink together with the window.
    * `false` by default.
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object AutoResizeOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): AutoResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoResizeOptions]
  }
}

