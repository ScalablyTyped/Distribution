package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarButton extends js.Object {
  var accessibilityLabel: String
  var backgroundColor: String
  var icon: NativeImage_
  var label: String
}

object TouchBarButton {
  @scala.inline
  def apply(accessibilityLabel: String, backgroundColor: String, icon: NativeImage_, label: String): TouchBarButton = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarButton]
  }
}

