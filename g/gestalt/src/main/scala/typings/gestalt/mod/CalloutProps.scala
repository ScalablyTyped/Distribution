package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutProps extends StObject {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.undefined
  
  var iconAccessibilityLabel: String
  
  var message: String
  
  var primaryLink: js.UndefOr[LinkData] = js.undefined
  
  var secondaryLink: js.UndefOr[LinkData] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: error | info | warning
}
object CalloutProps {
  
  @scala.inline
  def apply(iconAccessibilityLabel: String, message: String, `type`: error | info | warning): CalloutProps = {
    val __obj = js.Dynamic.literal(iconAccessibilityLabel = iconAccessibilityLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  
  @scala.inline
  implicit class CalloutPropsMutableBuilder[Self <: CalloutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    @scala.inline
    def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLink(value: LinkData): Self = StObject.set(x, "primaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLinkUndefined: Self = StObject.set(x, "primaryLink", js.undefined)
    
    @scala.inline
    def setSecondaryLink(value: LinkData): Self = StObject.set(x, "secondaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLinkUndefined: Self = StObject.set(x, "secondaryLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: error | info | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
