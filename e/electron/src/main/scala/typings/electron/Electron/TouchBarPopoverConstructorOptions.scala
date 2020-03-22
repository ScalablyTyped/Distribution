package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarPopoverConstructorOptions extends js.Object {
  /**
    * Popover button icon.
    */
  var icon: js.UndefOr[NativeImage_] = js.undefined
  /**
    * Items to display in the popover.
    */
  var items: TouchBar
  /**
    * Popover button text.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * `true` to display a close button on the left of the popover, `false` to not show
    * it. Default is `true`.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
}

object TouchBarPopoverConstructorOptions {
  @scala.inline
  def apply(
    items: TouchBar,
    icon: NativeImage_ = null,
    label: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined
  ): TouchBarPopoverConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarPopoverConstructorOptions]
  }
}

