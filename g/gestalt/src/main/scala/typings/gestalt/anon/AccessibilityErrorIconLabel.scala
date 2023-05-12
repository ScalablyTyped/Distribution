package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityErrorIconLabel extends StObject {
  
  var accessibilityErrorIconLabel: String
  
  var accessibilityRemoveIconLabel: String
  
  var accessibilityWarningIconLabel: String
}
object AccessibilityErrorIconLabel {
  
  inline def apply(
    accessibilityErrorIconLabel: String,
    accessibilityRemoveIconLabel: String,
    accessibilityWarningIconLabel: String
  ): AccessibilityErrorIconLabel = {
    val __obj = js.Dynamic.literal(accessibilityErrorIconLabel = accessibilityErrorIconLabel.asInstanceOf[js.Any], accessibilityRemoveIconLabel = accessibilityRemoveIconLabel.asInstanceOf[js.Any], accessibilityWarningIconLabel = accessibilityWarningIconLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityErrorIconLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityErrorIconLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityErrorIconLabel(value: String): Self = StObject.set(x, "accessibilityErrorIconLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRemoveIconLabel(value: String): Self = StObject.set(x, "accessibilityRemoveIconLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityWarningIconLabel(value: String): Self = StObject.set(x, "accessibilityWarningIconLabel", value.asInstanceOf[js.Any])
  }
}
