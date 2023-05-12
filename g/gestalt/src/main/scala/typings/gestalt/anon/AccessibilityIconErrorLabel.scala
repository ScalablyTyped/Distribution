package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityIconErrorLabel extends StObject {
  
  var accessibilityDismissButtonLabel: String
  
  var accessibilityIconErrorLabel: String
  
  var accessibilityIconSuccessLabel: String
  
  var accessibilityProcessingLabel: String
}
object AccessibilityIconErrorLabel {
  
  inline def apply(
    accessibilityDismissButtonLabel: String,
    accessibilityIconErrorLabel: String,
    accessibilityIconSuccessLabel: String,
    accessibilityProcessingLabel: String
  ): AccessibilityIconErrorLabel = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any], accessibilityIconErrorLabel = accessibilityIconErrorLabel.asInstanceOf[js.Any], accessibilityIconSuccessLabel = accessibilityIconSuccessLabel.asInstanceOf[js.Any], accessibilityProcessingLabel = accessibilityProcessingLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityIconErrorLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityIconErrorLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIconErrorLabel(value: String): Self = StObject.set(x, "accessibilityIconErrorLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIconSuccessLabel(value: String): Self = StObject.set(x, "accessibilityIconSuccessLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityProcessingLabel(value: String): Self = StObject.set(x, "accessibilityProcessingLabel", value.asInstanceOf[js.Any])
  }
}
