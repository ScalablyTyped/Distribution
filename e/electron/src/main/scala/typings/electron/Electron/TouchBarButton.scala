package typings.electron.Electron

import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarButton extends StObject {
  
  var accessibilityLabel: String = js.native
  
  var backgroundColor: String = js.native
  
  var enabled: Boolean = js.native
  
  var icon: NativeImage_ = js.native
  
  var iconPosition: left | right | overlay = js.native
  
  var label: String = js.native
}
object TouchBarButton {
  
  @scala.inline
  def apply(
    accessibilityLabel: String,
    backgroundColor: String,
    enabled: Boolean,
    icon: NativeImage_,
    iconPosition: left | right | overlay,
    label: String
  ): TouchBarButton = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconPosition = iconPosition.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarButton]
  }
  
  @scala.inline
  implicit class TouchBarButtonMutableBuilder[Self <: TouchBarButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPosition(value: left | right | overlay): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
