package typings.electron.Electron

import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarButton extends StObject {
  
  /**
    * A `string` representing the description of the button to be read by a screen
    * reader. Will only be read by screen readers if no label is set.
    */
  var accessibilityLabel: String
  
  /**
    * A `string` hex code representing the button's current background color. Changing
    * this value immediately updates the button in the touch bar.
    */
  var backgroundColor: String
  
  /**
    * A `boolean` representing whether the button is in an enabled state.
    */
  var enabled: Boolean
  
  /**
    * A `NativeImage` representing the button's current icon. Changing this value
    * immediately updates the button in the touch bar.
    */
  var icon: NativeImage_
  
  /**
    * A `string` - Can be `left`, `right` or `overlay`.  Defaults to `overlay`.
    */
  var iconPosition: left | right | overlay
  
  /**
    * A `string` representing the button's current text. Changing this value
    * immediately updates the button in the touch bar.
    */
  var label: String
}
object TouchBarButton {
  
  inline def apply(
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
  
  extension [Self <: TouchBarButton](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconPosition(value: left | right | overlay): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
