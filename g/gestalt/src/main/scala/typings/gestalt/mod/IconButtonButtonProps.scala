package typings.gestalt.mod

import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconButtonButtonProps
  extends StObject
     with CommonIconButtonProps
     with IconButtonProps {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityPopupRole: js.UndefOr[menu | dialog] = js.undefined
  
  var role: js.UndefOr[button] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[button] = js.undefined
}
object IconButtonButtonProps {
  
  inline def apply(accessibilityLabel: String): IconButtonButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconButtonButtonProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setAccessibilityPopupRole(value: menu | dialog): Self = StObject.set(x, "accessibilityPopupRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPopupRoleUndefined: Self = StObject.set(x, "accessibilityPopupRole", js.undefined)
    
    inline def setRole(value: button): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setType(value: button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
