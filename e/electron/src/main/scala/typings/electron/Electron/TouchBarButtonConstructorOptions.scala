package typings.electron.Electron

import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * A short description of the button for use by screenreaders like VoiceOver.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  /**
    * Button background color in hex format, i.e `#ABCDEF`.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  /**
    * Can be `left`, `right` or `overlay`. Defaults to `overlay`.
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
    accessibilityLabel: String = null,
    backgroundColor: String = null,
    click: () => Unit = null,
    icon: NativeImage_ | String = null,
    iconPosition: left | right | overlay = null,
    label: String = null
  ): TouchBarButtonConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarButtonConstructorOptions]
  }
}

