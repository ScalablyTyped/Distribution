package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarButton extends js.Object {
  var accessibilityLabel: String = js.native
  var backgroundColor: String = js.native
  var enabled: Boolean = js.native
  var icon: NativeImage_ = js.native
  var label: String = js.native
}

object TouchBarButton {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    backgroundColor: String,
    enabled: Boolean,
    icon: NativeImage_,
    label: String
  ): TouchBarButton = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarButton]
  }
  @scala.inline
  implicit class TouchBarButtonOps[Self <: TouchBarButton] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

