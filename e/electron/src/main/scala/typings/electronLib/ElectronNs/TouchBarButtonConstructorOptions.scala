package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * Button background color in hex format, i.e #ABCDEF.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
    * Can be left, right or overlay.
    */
  var iconPosition: js.UndefOr[
    electronLib.electronLibStrings.left | electronLib.electronLibStrings.right | electronLib.electronLibStrings.overlay
  ] = js.undefined
  /**
    * Button text.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object TouchBarButtonConstructorOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    click: () => scala.Unit = null,
    icon: NativeImage = null,
    iconPosition: electronLib.electronLibStrings.left | electronLib.electronLibStrings.right | electronLib.electronLibStrings.overlay = null,
    label: java.lang.String = null
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

