package typings.electron.Electron

import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarButtonConstructorOptions extends StObject {
  
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
  implicit class TouchBarButtonConstructorOptionsMutableBuilder[Self <: TouchBarButtonConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPosition(value: left | right | overlay): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
