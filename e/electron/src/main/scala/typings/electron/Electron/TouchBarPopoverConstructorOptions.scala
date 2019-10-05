package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarPopoverConstructorOptions extends js.Object {
  /**
    * Popover button icon.
    */
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
    * Items to display in the popover.
    */
  var items: js.UndefOr[TouchBar] = js.undefined
  /**
    * Popover button text.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * true to display a close button on the left of the popover, false to not show it.
    * Default is true.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
}

object TouchBarPopoverConstructorOptions {
  @scala.inline
  def apply(
    icon: NativeImage = null,
    items: TouchBar = null,
    label: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined
  ): TouchBarPopoverConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (items != null) __obj.updateDynamic("items")(items)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    __obj.asInstanceOf[TouchBarPopoverConstructorOptions]
  }
}

