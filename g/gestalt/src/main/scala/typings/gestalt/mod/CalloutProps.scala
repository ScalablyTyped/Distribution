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
  
  inline def apply(iconAccessibilityLabel: String, message: String, `type`: error | info | warning): CalloutProps = {
    val __obj = js.Dynamic.literal(iconAccessibilityLabel = iconAccessibilityLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  
  extension [Self <: CalloutProps](x: Self) {
    
    inline def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    inline def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLink(value: LinkData): Self = StObject.set(x, "primaryLink", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLinkUndefined: Self = StObject.set(x, "primaryLink", js.undefined)
    
    inline def setSecondaryLink(value: LinkData): Self = StObject.set(x, "secondaryLink", value.asInstanceOf[js.Any])
    
    inline def setSecondaryLinkUndefined: Self = StObject.set(x, "secondaryLink", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: error | info | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
