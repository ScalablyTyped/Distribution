package typings.electron.ElectronNs

import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * Button background color in hex format, i.e #ABCDEF.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
    * Can be left, right or overlay.
    */
  var iconPosition: js.UndefOr[left | right | overlay] = js.undefined
  /**
    * Button text.
    */
  var label: js.UndefOr[String] = js.undefined
}

object TouchBarButtonConstructorOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    click: () => Unit = null,
    icon: NativeImage = null,
    iconPosition: left | right | overlay = null,
    label: String = null
  ): TouchBarButtonConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[TouchBarButtonConstructorOptions]
  }
}

