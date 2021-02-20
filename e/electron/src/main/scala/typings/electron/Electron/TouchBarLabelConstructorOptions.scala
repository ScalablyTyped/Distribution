package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarLabelConstructorOptions extends StObject {
  
  /**
    * A short description of the button for use by screenreaders like VoiceOver.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  /**
    * Text to display.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Hex color of text, i.e `#ABCDEF`.
    */
  var textColor: js.UndefOr[String] = js.native
}
object TouchBarLabelConstructorOptions {
  
  @scala.inline
  def apply(): TouchBarLabelConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarLabelConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarLabelConstructorOptionsMutableBuilder[Self <: TouchBarLabelConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
