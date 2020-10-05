package typings.electron.Electron

import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * A short description of the button for use by screenreaders like VoiceOver.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  /**
    * Button background color in hex format, i.e `#ABCDEF`.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Whether the button is in an enabled state.  Default is `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  /**
    * Can be `left`, `right` or `overlay`. Defaults to `overlay`.
    */
  var iconPosition: js.UndefOr[left | right | overlay] = js.native
  /**
    * Button text.
    */
  var label: js.UndefOr[String] = js.native
}

object TouchBarButtonConstructorOptions {
  @scala.inline
  def apply(): TouchBarButtonConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarButtonConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarButtonConstructorOptionsOps[Self <: TouchBarButtonConstructorOptions] (val x: Self) extends AnyVal {
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconPosition(value: left | right | overlay): Self = this.set("iconPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPosition: Self = this.set("iconPosition", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

