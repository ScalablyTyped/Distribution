package typings.gestalt.mod

import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapAreaButtonProps
  extends StObject
     with CommonTapAreaProps
     with TapAreaProps {
  
  var accessibilityChecked: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[button | switch] = js.undefined
}
object TapAreaButtonProps {
  
  inline def apply(): TapAreaButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapAreaButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapAreaButtonProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityChecked(value: Boolean): Self = StObject.set(x, "accessibilityChecked", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityCheckedUndefined: Self = StObject.set(x, "accessibilityChecked", js.undefined)
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setRole(value: button | switch): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
