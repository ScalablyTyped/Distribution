package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityGrabberLabel extends StObject {
  
  var accessibilityDismissButtonLabel: String
  
  var accessibilityGrabberLabel: String
  
  var accessibilityLabel: String
}
object AccessibilityGrabberLabel {
  
  inline def apply(
    accessibilityDismissButtonLabel: String,
    accessibilityGrabberLabel: String,
    accessibilityLabel: String
  ): AccessibilityGrabberLabel = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any], accessibilityGrabberLabel = accessibilityGrabberLabel.asInstanceOf[js.Any], accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityGrabberLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityGrabberLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityGrabberLabel(value: String): Self = StObject.set(x, "accessibilityGrabberLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
  }
}
