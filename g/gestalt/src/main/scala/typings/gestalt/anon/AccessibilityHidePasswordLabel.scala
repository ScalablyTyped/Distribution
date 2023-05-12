package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityHidePasswordLabel extends StObject {
  
  var accessibilityHidePasswordLabel: String
  
  var accessibilityShowPasswordLabel: String
}
object AccessibilityHidePasswordLabel {
  
  inline def apply(accessibilityHidePasswordLabel: String, accessibilityShowPasswordLabel: String): AccessibilityHidePasswordLabel = {
    val __obj = js.Dynamic.literal(accessibilityHidePasswordLabel = accessibilityHidePasswordLabel.asInstanceOf[js.Any], accessibilityShowPasswordLabel = accessibilityShowPasswordLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityHidePasswordLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityHidePasswordLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityHidePasswordLabel(value: String): Self = StObject.set(x, "accessibilityHidePasswordLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityShowPasswordLabel(value: String): Self = StObject.set(x, "accessibilityShowPasswordLabel", value.asInstanceOf[js.Any])
  }
}
